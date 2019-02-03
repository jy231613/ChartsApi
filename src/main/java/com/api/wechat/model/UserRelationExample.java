package com.api.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRelationExample() {
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

        public Criteria andComeidIsNull() {
            addCriterion("comeid is null");
            return (Criteria) this;
        }

        public Criteria andComeidIsNotNull() {
            addCriterion("comeid is not null");
            return (Criteria) this;
        }

        public Criteria andComeidEqualTo(Integer value) {
            addCriterion("comeid =", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidNotEqualTo(Integer value) {
            addCriterion("comeid <>", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidGreaterThan(Integer value) {
            addCriterion("comeid >", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comeid >=", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidLessThan(Integer value) {
            addCriterion("comeid <", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidLessThanOrEqualTo(Integer value) {
            addCriterion("comeid <=", value, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidIn(List<Integer> values) {
            addCriterion("comeid in", values, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidNotIn(List<Integer> values) {
            addCriterion("comeid not in", values, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidBetween(Integer value1, Integer value2) {
            addCriterion("comeid between", value1, value2, "comeid");
            return (Criteria) this;
        }

        public Criteria andComeidNotBetween(Integer value1, Integer value2) {
            addCriterion("comeid not between", value1, value2, "comeid");
            return (Criteria) this;
        }

        public Criteria andHeadforidIsNull() {
            addCriterion("headforid is null");
            return (Criteria) this;
        }

        public Criteria andHeadforidIsNotNull() {
            addCriterion("headforid is not null");
            return (Criteria) this;
        }

        public Criteria andHeadforidEqualTo(Integer value) {
            addCriterion("headforid =", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidNotEqualTo(Integer value) {
            addCriterion("headforid <>", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidGreaterThan(Integer value) {
            addCriterion("headforid >", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidGreaterThanOrEqualTo(Integer value) {
            addCriterion("headforid >=", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidLessThan(Integer value) {
            addCriterion("headforid <", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidLessThanOrEqualTo(Integer value) {
            addCriterion("headforid <=", value, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidIn(List<Integer> values) {
            addCriterion("headforid in", values, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidNotIn(List<Integer> values) {
            addCriterion("headforid not in", values, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidBetween(Integer value1, Integer value2) {
            addCriterion("headforid between", value1, value2, "headforid");
            return (Criteria) this;
        }

        public Criteria andHeadforidNotBetween(Integer value1, Integer value2) {
            addCriterion("headforid not between", value1, value2, "headforid");
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

        public Criteria andHappentimeIsNull() {
            addCriterion("happentime is null");
            return (Criteria) this;
        }

        public Criteria andHappentimeIsNotNull() {
            addCriterion("happentime is not null");
            return (Criteria) this;
        }

        public Criteria andHappentimeEqualTo(Date value) {
            addCriterion("happentime =", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotEqualTo(Date value) {
            addCriterion("happentime <>", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeGreaterThan(Date value) {
            addCriterion("happentime >", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("happentime >=", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeLessThan(Date value) {
            addCriterion("happentime <", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeLessThanOrEqualTo(Date value) {
            addCriterion("happentime <=", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeIn(List<Date> values) {
            addCriterion("happentime in", values, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotIn(List<Date> values) {
            addCriterion("happentime not in", values, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeBetween(Date value1, Date value2) {
            addCriterion("happentime between", value1, value2, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotBetween(Date value1, Date value2) {
            addCriterion("happentime not between", value1, value2, "happentime");
            return (Criteria) this;
        }

        public Criteria andComenameIsNull() {
            addCriterion("comename is null");
            return (Criteria) this;
        }

        public Criteria andComenameIsNotNull() {
            addCriterion("comename is not null");
            return (Criteria) this;
        }

        public Criteria andComenameEqualTo(String value) {
            addCriterion("comename =", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameNotEqualTo(String value) {
            addCriterion("comename <>", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameGreaterThan(String value) {
            addCriterion("comename >", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameGreaterThanOrEqualTo(String value) {
            addCriterion("comename >=", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameLessThan(String value) {
            addCriterion("comename <", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameLessThanOrEqualTo(String value) {
            addCriterion("comename <=", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameLike(String value) {
            addCriterion("comename like", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameNotLike(String value) {
            addCriterion("comename not like", value, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameIn(List<String> values) {
            addCriterion("comename in", values, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameNotIn(List<String> values) {
            addCriterion("comename not in", values, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameBetween(String value1, String value2) {
            addCriterion("comename between", value1, value2, "comename");
            return (Criteria) this;
        }

        public Criteria andComenameNotBetween(String value1, String value2) {
            addCriterion("comename not between", value1, value2, "comename");
            return (Criteria) this;
        }

        public Criteria andHeadfornameIsNull() {
            addCriterion("headforname is null");
            return (Criteria) this;
        }

        public Criteria andHeadfornameIsNotNull() {
            addCriterion("headforname is not null");
            return (Criteria) this;
        }

        public Criteria andHeadfornameEqualTo(String value) {
            addCriterion("headforname =", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameNotEqualTo(String value) {
            addCriterion("headforname <>", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameGreaterThan(String value) {
            addCriterion("headforname >", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameGreaterThanOrEqualTo(String value) {
            addCriterion("headforname >=", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameLessThan(String value) {
            addCriterion("headforname <", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameLessThanOrEqualTo(String value) {
            addCriterion("headforname <=", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameLike(String value) {
            addCriterion("headforname like", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameNotLike(String value) {
            addCriterion("headforname not like", value, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameIn(List<String> values) {
            addCriterion("headforname in", values, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameNotIn(List<String> values) {
            addCriterion("headforname not in", values, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameBetween(String value1, String value2) {
            addCriterion("headforname between", value1, value2, "headforname");
            return (Criteria) this;
        }

        public Criteria andHeadfornameNotBetween(String value1, String value2) {
            addCriterion("headforname not between", value1, value2, "headforname");
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