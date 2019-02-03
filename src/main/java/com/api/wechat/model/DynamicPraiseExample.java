package com.api.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicPraiseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicPraiseExample() {
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

        public Criteria andPraisetimeIsNull() {
            addCriterion("praisetime is null");
            return (Criteria) this;
        }

        public Criteria andPraisetimeIsNotNull() {
            addCriterion("praisetime is not null");
            return (Criteria) this;
        }

        public Criteria andPraisetimeEqualTo(Date value) {
            addCriterion("praisetime =", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotEqualTo(Date value) {
            addCriterion("praisetime <>", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeGreaterThan(Date value) {
            addCriterion("praisetime >", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("praisetime >=", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeLessThan(Date value) {
            addCriterion("praisetime <", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeLessThanOrEqualTo(Date value) {
            addCriterion("praisetime <=", value, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeIn(List<Date> values) {
            addCriterion("praisetime in", values, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotIn(List<Date> values) {
            addCriterion("praisetime not in", values, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeBetween(Date value1, Date value2) {
            addCriterion("praisetime between", value1, value2, "praisetime");
            return (Criteria) this;
        }

        public Criteria andPraisetimeNotBetween(Date value1, Date value2) {
            addCriterion("praisetime not between", value1, value2, "praisetime");
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