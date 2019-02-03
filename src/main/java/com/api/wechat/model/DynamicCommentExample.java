package com.api.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicCommentExample() {
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

        public Criteria andWithdynamicIsNull() {
            addCriterion("withdynamic is null");
            return (Criteria) this;
        }

        public Criteria andWithdynamicIsNotNull() {
            addCriterion("withdynamic is not null");
            return (Criteria) this;
        }

        public Criteria andWithdynamicEqualTo(Integer value) {
            addCriterion("withdynamic =", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicNotEqualTo(Integer value) {
            addCriterion("withdynamic <>", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicGreaterThan(Integer value) {
            addCriterion("withdynamic >", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdynamic >=", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicLessThan(Integer value) {
            addCriterion("withdynamic <", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicLessThanOrEqualTo(Integer value) {
            addCriterion("withdynamic <=", value, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicIn(List<Integer> values) {
            addCriterion("withdynamic in", values, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicNotIn(List<Integer> values) {
            addCriterion("withdynamic not in", values, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicBetween(Integer value1, Integer value2) {
            addCriterion("withdynamic between", value1, value2, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithdynamicNotBetween(Integer value1, Integer value2) {
            addCriterion("withdynamic not between", value1, value2, "withdynamic");
            return (Criteria) this;
        }

        public Criteria andWithcommentIsNull() {
            addCriterion("withcomment is null");
            return (Criteria) this;
        }

        public Criteria andWithcommentIsNotNull() {
            addCriterion("withcomment is not null");
            return (Criteria) this;
        }

        public Criteria andWithcommentEqualTo(Integer value) {
            addCriterion("withcomment =", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentNotEqualTo(Integer value) {
            addCriterion("withcomment <>", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentGreaterThan(Integer value) {
            addCriterion("withcomment >", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("withcomment >=", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentLessThan(Integer value) {
            addCriterion("withcomment <", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentLessThanOrEqualTo(Integer value) {
            addCriterion("withcomment <=", value, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentIn(List<Integer> values) {
            addCriterion("withcomment in", values, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentNotIn(List<Integer> values) {
            addCriterion("withcomment not in", values, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentBetween(Integer value1, Integer value2) {
            addCriterion("withcomment between", value1, value2, "withcomment");
            return (Criteria) this;
        }

        public Criteria andWithcommentNotBetween(Integer value1, Integer value2) {
            addCriterion("withcomment not between", value1, value2, "withcomment");
            return (Criteria) this;
        }

        public Criteria andCommenttextIsNull() {
            addCriterion("commenttext is null");
            return (Criteria) this;
        }

        public Criteria andCommenttextIsNotNull() {
            addCriterion("commenttext is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttextEqualTo(String value) {
            addCriterion("commenttext =", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotEqualTo(String value) {
            addCriterion("commenttext <>", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThan(String value) {
            addCriterion("commenttext >", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextGreaterThanOrEqualTo(String value) {
            addCriterion("commenttext >=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThan(String value) {
            addCriterion("commenttext <", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLessThanOrEqualTo(String value) {
            addCriterion("commenttext <=", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextLike(String value) {
            addCriterion("commenttext like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotLike(String value) {
            addCriterion("commenttext not like", value, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextIn(List<String> values) {
            addCriterion("commenttext in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotIn(List<String> values) {
            addCriterion("commenttext not in", values, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextBetween(String value1, String value2) {
            addCriterion("commenttext between", value1, value2, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttextNotBetween(String value1, String value2) {
            addCriterion("commenttext not between", value1, value2, "commenttext");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNull() {
            addCriterion("commenttime is null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIsNotNull() {
            addCriterion("commenttime is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttimeEqualTo(Date value) {
            addCriterion("commenttime =", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotEqualTo(Date value) {
            addCriterion("commenttime <>", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThan(Date value) {
            addCriterion("commenttime >", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("commenttime >=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThan(Date value) {
            addCriterion("commenttime <", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeLessThanOrEqualTo(Date value) {
            addCriterion("commenttime <=", value, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeIn(List<Date> values) {
            addCriterion("commenttime in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotIn(List<Date> values) {
            addCriterion("commenttime not in", values, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeBetween(Date value1, Date value2) {
            addCriterion("commenttime between", value1, value2, "commenttime");
            return (Criteria) this;
        }

        public Criteria andCommenttimeNotBetween(Date value1, Date value2) {
            addCriterion("commenttime not between", value1, value2, "commenttime");
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

        public Criteria andPrivatecommentIsNull() {
            addCriterion("privatecomment is null");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentIsNotNull() {
            addCriterion("privatecomment is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentEqualTo(Integer value) {
            addCriterion("privatecomment =", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentNotEqualTo(Integer value) {
            addCriterion("privatecomment <>", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentGreaterThan(Integer value) {
            addCriterion("privatecomment >", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("privatecomment >=", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentLessThan(Integer value) {
            addCriterion("privatecomment <", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentLessThanOrEqualTo(Integer value) {
            addCriterion("privatecomment <=", value, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentIn(List<Integer> values) {
            addCriterion("privatecomment in", values, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentNotIn(List<Integer> values) {
            addCriterion("privatecomment not in", values, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentBetween(Integer value1, Integer value2) {
            addCriterion("privatecomment between", value1, value2, "privatecomment");
            return (Criteria) this;
        }

        public Criteria andPrivatecommentNotBetween(Integer value1, Integer value2) {
            addCriterion("privatecomment not between", value1, value2, "privatecomment");
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