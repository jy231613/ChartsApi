package com.api.wechat.util;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
@SuppressWarnings("unchecked")
public class RedisUtils {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private ValueOperations valueOperations;
    private HashOperations hashOperations;
    private ListOperations listOperations;
    private SetOperations setOperations;
    private ZSetOperations<String, Object> zSetOperations;

    @PostConstruct
    public void initOperations() {
        this.valueOperations = redisTemplate.opsForValue();
        this.hashOperations = redisTemplate.opsForHash();
        this.listOperations = redisTemplate.opsForList();
        this.setOperations = redisTemplate.opsForSet();
        this.zSetOperations = redisTemplate.opsForZSet();
    }

    /**
     * Hash 存/取值
     *
     * @param bigKey   大key
     * @param smallKey 小key
     * @param value    值
     * @param timeout  失效时间
     */
    public void putToHash(String bigKey, String smallKey, Object value, Integer timeout) {
        hashOperations.put(bigKey, smallKey, value);
        setKeyTimeOut(bigKey, timeout);
    }

    public void putToHash(String bigKey, String smallKey, Object value) {
        putToHash(bigKey, smallKey, value, null);
    }

    public Object getValueFromHash(String bigKey, String smallKey) {
        return hashOperations.get(bigKey, smallKey);
    }

    public Set<String> getKeysFromHash(String bigKey) {
        return hashOperations.keys(bigKey);
    }

    public List<Object> getListValuesFromHash(String bigKey) {
        return redisTemplate.boundHashOps(bigKey).values();
    }

    public Map<String, Object> getMapValuesFromHash(String bigKey) {
        return hashOperations.entries(bigKey);
    }


    /**
     * zSet 存/取值
     */
    public void addToZSet(String key, Object value, Double score) {
        zSetOperations.add(key, value, score);
//        zSetOperations.score(key,);
    }

    public void addAllToZSet(String key, Set<TypedTuple<Object>> values) {
        zSetOperations.add(key, values);
    }

    public Object getValueFromZSet(String key, Integer start) {
        Set<Object> range = zSetOperations.range(key, start, start);
        if (range != null) {
            Iterator<Object> iterator = range.iterator();
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        return null;
    }

    public Set<Object> getValuesFromZSet(String key, Integer start, Integer end) {
        return zSetOperations.range(key, start, end);
    }

    public Long zRem(String key, Object... value) {
        return zSetOperations.remove(key, value);
    }


    /**
     * List 存/取值
     *
     * @param key     key
     * @param value   值
     * @param timeout 失效时间
     */
    public void leftPushToList(String key, Object value, Integer timeout) {
        listOperations.leftPush(key, value);
        setKeyTimeOut(key, timeout);
    }

    public void leftPushToList(String key, Object value) {
        leftPushToList(key, value, null);
    }

    public List getValueFromList(String key, int startIndex, int endIndex) {
        return listOperations.range(key, startIndex, endIndex);
    }

    public Object getValuesFromList(String key) {
        return listOperations.range(key, 0, -1);
    }


    /**
     * String 存/取值
     *
     * @param key     key
     * @param value   value
     * @param timeout 失效时间（分钟）
     */
    public void addToRedis(String key, Object value, Integer timeout) {
        valueOperations.set(key, value);
        setKeyTimeOut(key, timeout);
    }

    public void addToRedis(String key, Object value) {
        addToRedis(key, value, null);
    }

    public Object getFromRedis(String key) {
        return valueOperations.get(key);
    }


    /**
     * Set 存/取值
     *
     * @param key     key
     * @param value   value
     * @param timeout 失效时间
     */
    public void addToSet(String key, Object value, Integer timeout) {
        setOperations.add(key, value);
        setKeyTimeOut(key, timeout);
    }

    public void addToSet(String key, Object value) {
        addToSet(key, value, null);
    }

    public Set<Object> getKeysFromSet(String key) {
        return setOperations.members(key);
    }

    public Object getValueFromSet(String key, int startIndex) {
        return setOperations.pop(key, startIndex);
    }


    /**
     * 设置key的有效时间
     */
    private void setKeyTimeOut(String key, Integer timeout) {
        redisTemplate.expire(key, timeout == null ? 30 : timeout, TimeUnit.MINUTES);
    }

    public long getExpireTime(String key) {
        return redisTemplate.getExpire(key);
    }

    /**
     * 删除key下的所有数据
     */
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    public void delete(String key, String smallKey) {
        redisTemplate.boundHashOps(key).delete(smallKey);
    }

    public void delete(String key, Object[] smallKeys) {
        redisTemplate.boundHashOps(key).delete(smallKeys);
    }

    /**
     * 刷新redis数据库
     */
//    public Object flushDb() {
//        return redisTemplate.execute(new RedisCallback() {
//            public Object doInRedis(RedisConnection connection) {
//                connection.flushDb();
//                return "ok";
//            }
//        });
//    }

}
