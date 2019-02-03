package com.api.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDynamicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWithuserIsNull() {
            addCriterion("withuser is null");
            return (Criteria) this;
        }

        public Criteria andWithuserIsNotNull() {
            addCriterion("withuser is not null");
            return (Criteria) this;
        }

        public Criteria andWithuserEqualTo(Integer value) {
            addCriterion("withuser =", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserNotEqualTo(Integer value) {
            addCriterion("withuser <>", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserGreaterThan(Integer value) {
            addCriterion("withuser >", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("withuser >=", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserLessThan(Integer value) {
            addCriterion("withuser <", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserLessThanOrEqualTo(Integer value) {
            addCriterion("withuser <=", value, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserIn(List<Integer> values) {
            addCriterion("withuser in", values, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserNotIn(List<Integer> values) {
            addCriterion("withuser not in", values, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserBetween(Integer value1, Integer value2) {
            addCriterion("withuser between", value1, value2, "withuser");
            return (Criteria) this;
        }

        public Criteria andWithuserNotBetween(Integer value1, Integer value2) {
            addCriterion("withuser not between", value1, value2, "withuser");
            return (Criteria) this;
        }

        public Criteria andDynamictextIsNull() {
            addCriterion("dynamictext is null");
            return (Criteria) this;
        }

        public Criteria andDynamictextIsNotNull() {
            addCriterion("dynamictext is not null");
            return (Criteria) this;
        }

        public Criteria andDynamictextEqualTo(String value) {
            addCriterion("dynamictext =", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotEqualTo(String value) {
            addCriterion("dynamictext <>", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextGreaterThan(String value) {
            addCriterion("dynamictext >", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextGreaterThanOrEqualTo(String value) {
            addCriterion("dynamictext >=", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLessThan(String value) {
            addCriterion("dynamictext <", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLessThanOrEqualTo(String value) {
            addCriterion("dynamictext <=", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextLike(String value) {
            addCriterion("dynamictext like", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotLike(String value) {
            addCriterion("dynamictext not like", value, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextIn(List<String> values) {
            addCriterion("dynamictext in", values, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotIn(List<String> values) {
            addCriterion("dynamictext not in", values, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextBetween(String value1, String value2) {
            addCriterion("dynamictext between", value1, value2, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamictextNotBetween(String value1, String value2) {
            addCriterion("dynamictext not between", value1, value2, "dynamictext");
            return (Criteria) this;
        }

        public Criteria andDynamicpicIsNull() {
            addCriterion("dynamicpic is null");
            return (Criteria) this;
        }

        public Criteria andDynamicpicIsNotNull() {
            addCriterion("dynamicpic is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicpicEqualTo(String value) {
            addCriterion("dynamicpic =", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicNotEqualTo(String value) {
            addCriterion("dynamicpic <>", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicGreaterThan(String value) {
            addCriterion("dynamicpic >", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicpic >=", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicLessThan(String value) {
            addCriterion("dynamicpic <", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicLessThanOrEqualTo(String value) {
            addCriterion("dynamicpic <=", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicLike(String value) {
            addCriterion("dynamicpic like", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicNotLike(String value) {
            addCriterion("dynamicpic not like", value, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicIn(List<String> values) {
            addCriterion("dynamicpic in", values, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicNotIn(List<String> values) {
            addCriterion("dynamicpic not in", values, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicBetween(String value1, String value2) {
            addCriterion("dynamicpic between", value1, value2, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicpicNotBetween(String value1, String value2) {
            addCriterion("dynamicpic not between", value1, value2, "dynamicpic");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoIsNull() {
            addCriterion("dynamicvideo is null");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoIsNotNull() {
            addCriterion("dynamicvideo is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoEqualTo(String value) {
            addCriterion("dynamicvideo =", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoNotEqualTo(String value) {
            addCriterion("dynamicvideo <>", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoGreaterThan(String value) {
            addCriterion("dynamicvideo >", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicvideo >=", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoLessThan(String value) {
            addCriterion("dynamicvideo <", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoLessThanOrEqualTo(String value) {
            addCriterion("dynamicvideo <=", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoLike(String value) {
            addCriterion("dynamicvideo like", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoNotLike(String value) {
            addCriterion("dynamicvideo not like", value, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoIn(List<String> values) {
            addCriterion("dynamicvideo in", values, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoNotIn(List<String> values) {
            addCriterion("dynamicvideo not in", values, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoBetween(String value1, String value2) {
            addCriterion("dynamicvideo between", value1, value2, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamicvideoNotBetween(String value1, String value2) {
            addCriterion("dynamicvideo not between", value1, value2, "dynamicvideo");
            return (Criteria) this;
        }

        public Criteria andDynamiceventIsNull() {
            addCriterion("dynamicevent is null");
            return (Criteria) this;
        }

        public Criteria andDynamiceventIsNotNull() {
            addCriterion("dynamicevent is not null");
            return (Criteria) this;
        }

        public Criteria andDynamiceventEqualTo(String value) {
            addCriterion("dynamicevent =", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventNotEqualTo(String value) {
            addCriterion("dynamicevent <>", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventGreaterThan(String value) {
            addCriterion("dynamicevent >", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventGreaterThanOrEqualTo(String value) {
            addCriterion("dynamicevent >=", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventLessThan(String value) {
            addCriterion("dynamicevent <", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventLessThanOrEqualTo(String value) {
            addCriterion("dynamicevent <=", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventLike(String value) {
            addCriterion("dynamicevent like", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventNotLike(String value) {
            addCriterion("dynamicevent not like", value, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventIn(List<String> values) {
            addCriterion("dynamicevent in", values, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventNotIn(List<String> values) {
            addCriterion("dynamicevent not in", values, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventBetween(String value1, String value2) {
            addCriterion("dynamicevent between", value1, value2, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andDynamiceventNotBetween(String value1, String value2) {
            addCriterion("dynamicevent not between", value1, value2, "dynamicevent");
            return (Criteria) this;
        }

        public Criteria andPushtimeIsNull() {
            addCriterion("pushtime is null");
            return (Criteria) this;
        }

        public Criteria andPushtimeIsNotNull() {
            addCriterion("pushtime is not null");
            return (Criteria) this;
        }

        public Criteria andPushtimeEqualTo(Date value) {
            addCriterion("pushtime =", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotEqualTo(Date value) {
            addCriterion("pushtime <>", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeGreaterThan(Date value) {
            addCriterion("pushtime >", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pushtime >=", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeLessThan(Date value) {
            addCriterion("pushtime <", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeLessThanOrEqualTo(Date value) {
            addCriterion("pushtime <=", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeIn(List<Date> values) {
            addCriterion("pushtime in", values, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotIn(List<Date> values) {
            addCriterion("pushtime not in", values, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeBetween(Date value1, Date value2) {
            addCriterion("pushtime between", value1, value2, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotBetween(Date value1, Date value2) {
            addCriterion("pushtime not between", value1, value2, "pushtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDynamictypeIsNull() {
            addCriterion("dynamictype is null");
            return (Criteria) this;
        }

        public Criteria andDynamictypeIsNotNull() {
            addCriterion("dynamictype is not null");
            return (Criteria) this;
        }

        public Criteria andDynamictypeEqualTo(Integer value) {
            addCriterion("dynamictype =", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeNotEqualTo(Integer value) {
            addCriterion("dynamictype <>", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeGreaterThan(Integer value) {
            addCriterion("dynamictype >", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamictype >=", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeLessThan(Integer value) {
            addCriterion("dynamictype <", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeLessThanOrEqualTo(Integer value) {
            addCriterion("dynamictype <=", value, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeIn(List<Integer> values) {
            addCriterion("dynamictype in", values, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeNotIn(List<Integer> values) {
            addCriterion("dynamictype not in", values, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeBetween(Integer value1, Integer value2) {
            addCriterion("dynamictype between", value1, value2, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andDynamictypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamictype not between", value1, value2, "dynamictype");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkIsNull() {
            addCriterion("dynamiclink is null");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkIsNotNull() {
            addCriterion("dynamiclink is not null");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkEqualTo(String value) {
            addCriterion("dynamiclink =", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkNotEqualTo(String value) {
            addCriterion("dynamiclink <>", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkGreaterThan(String value) {
            addCriterion("dynamiclink >", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkGreaterThanOrEqualTo(String value) {
            addCriterion("dynamiclink >=", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkLessThan(String value) {
            addCriterion("dynamiclink <", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkLessThanOrEqualTo(String value) {
            addCriterion("dynamiclink <=", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkLike(String value) {
            addCriterion("dynamiclink like", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkNotLike(String value) {
            addCriterion("dynamiclink not like", value, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkIn(List<String> values) {
            addCriterion("dynamiclink in", values, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkNotIn(List<String> values) {
            addCriterion("dynamiclink not in", values, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkBetween(String value1, String value2) {
            addCriterion("dynamiclink between", value1, value2, "dynamiclink");
            return (Criteria) this;
        }

        public Criteria andDynamiclinkNotBetween(String value1, String value2) {
            addCriterion("dynamiclink not between", value1, value2, "dynamiclink");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}