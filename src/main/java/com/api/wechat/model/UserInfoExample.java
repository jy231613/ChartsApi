package com.api.wechat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpicIsNull() {
            addCriterion("userpic is null");
            return (Criteria) this;
        }

        public Criteria andUserpicIsNotNull() {
            addCriterion("userpic is not null");
            return (Criteria) this;
        }

        public Criteria andUserpicEqualTo(String value) {
            addCriterion("userpic =", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicNotEqualTo(String value) {
            addCriterion("userpic <>", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicGreaterThan(String value) {
            addCriterion("userpic >", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicGreaterThanOrEqualTo(String value) {
            addCriterion("userpic >=", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicLessThan(String value) {
            addCriterion("userpic <", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicLessThanOrEqualTo(String value) {
            addCriterion("userpic <=", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicLike(String value) {
            addCriterion("userpic like", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicNotLike(String value) {
            addCriterion("userpic not like", value, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicIn(List<String> values) {
            addCriterion("userpic in", values, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicNotIn(List<String> values) {
            addCriterion("userpic not in", values, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicBetween(String value1, String value2) {
            addCriterion("userpic between", value1, value2, "userpic");
            return (Criteria) this;
        }

        public Criteria andUserpicNotBetween(String value1, String value2) {
            addCriterion("userpic not between", value1, value2, "userpic");
            return (Criteria) this;
        }

        public Criteria andChartnIsNull() {
            addCriterion("chartn is null");
            return (Criteria) this;
        }

        public Criteria andChartnIsNotNull() {
            addCriterion("chartn is not null");
            return (Criteria) this;
        }

        public Criteria andChartnEqualTo(String value) {
            addCriterion("chartn =", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnNotEqualTo(String value) {
            addCriterion("chartn <>", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnGreaterThan(String value) {
            addCriterion("chartn >", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnGreaterThanOrEqualTo(String value) {
            addCriterion("chartn >=", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnLessThan(String value) {
            addCriterion("chartn <", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnLessThanOrEqualTo(String value) {
            addCriterion("chartn <=", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnLike(String value) {
            addCriterion("chartn like", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnNotLike(String value) {
            addCriterion("chartn not like", value, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnIn(List<String> values) {
            addCriterion("chartn in", values, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnNotIn(List<String> values) {
            addCriterion("chartn not in", values, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnBetween(String value1, String value2) {
            addCriterion("chartn between", value1, value2, "chartn");
            return (Criteria) this;
        }

        public Criteria andChartnNotBetween(String value1, String value2) {
            addCriterion("chartn not between", value1, value2, "chartn");
            return (Criteria) this;
        }

        public Criteria andMansIsNull() {
            addCriterion("mans is null");
            return (Criteria) this;
        }

        public Criteria andMansIsNotNull() {
            addCriterion("mans is not null");
            return (Criteria) this;
        }

        public Criteria andMansEqualTo(Integer value) {
            addCriterion("mans =", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansNotEqualTo(Integer value) {
            addCriterion("mans <>", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansGreaterThan(Integer value) {
            addCriterion("mans >", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansGreaterThanOrEqualTo(Integer value) {
            addCriterion("mans >=", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansLessThan(Integer value) {
            addCriterion("mans <", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansLessThanOrEqualTo(Integer value) {
            addCriterion("mans <=", value, "mans");
            return (Criteria) this;
        }

        public Criteria andMansIn(List<Integer> values) {
            addCriterion("mans in", values, "mans");
            return (Criteria) this;
        }

        public Criteria andMansNotIn(List<Integer> values) {
            addCriterion("mans not in", values, "mans");
            return (Criteria) this;
        }

        public Criteria andMansBetween(Integer value1, Integer value2) {
            addCriterion("mans between", value1, value2, "mans");
            return (Criteria) this;
        }

        public Criteria andMansNotBetween(Integer value1, Integer value2) {
            addCriterion("mans not between", value1, value2, "mans");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andWithqqIsNull() {
            addCriterion("withqq is null");
            return (Criteria) this;
        }

        public Criteria andWithqqIsNotNull() {
            addCriterion("withqq is not null");
            return (Criteria) this;
        }

        public Criteria andWithqqEqualTo(String value) {
            addCriterion("withqq =", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqNotEqualTo(String value) {
            addCriterion("withqq <>", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqGreaterThan(String value) {
            addCriterion("withqq >", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqGreaterThanOrEqualTo(String value) {
            addCriterion("withqq >=", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqLessThan(String value) {
            addCriterion("withqq <", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqLessThanOrEqualTo(String value) {
            addCriterion("withqq <=", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqLike(String value) {
            addCriterion("withqq like", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqNotLike(String value) {
            addCriterion("withqq not like", value, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqIn(List<String> values) {
            addCriterion("withqq in", values, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqNotIn(List<String> values) {
            addCriterion("withqq not in", values, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqBetween(String value1, String value2) {
            addCriterion("withqq between", value1, value2, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithqqNotBetween(String value1, String value2) {
            addCriterion("withqq not between", value1, value2, "withqq");
            return (Criteria) this;
        }

        public Criteria andWithemailIsNull() {
            addCriterion("withemail is null");
            return (Criteria) this;
        }

        public Criteria andWithemailIsNotNull() {
            addCriterion("withemail is not null");
            return (Criteria) this;
        }

        public Criteria andWithemailEqualTo(String value) {
            addCriterion("withemail =", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailNotEqualTo(String value) {
            addCriterion("withemail <>", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailGreaterThan(String value) {
            addCriterion("withemail >", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailGreaterThanOrEqualTo(String value) {
            addCriterion("withemail >=", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailLessThan(String value) {
            addCriterion("withemail <", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailLessThanOrEqualTo(String value) {
            addCriterion("withemail <=", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailLike(String value) {
            addCriterion("withemail like", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailNotLike(String value) {
            addCriterion("withemail not like", value, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailIn(List<String> values) {
            addCriterion("withemail in", values, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailNotIn(List<String> values) {
            addCriterion("withemail not in", values, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailBetween(String value1, String value2) {
            addCriterion("withemail between", value1, value2, "withemail");
            return (Criteria) this;
        }

        public Criteria andWithemailNotBetween(String value1, String value2) {
            addCriterion("withemail not between", value1, value2, "withemail");
            return (Criteria) this;
        }

        public Criteria andCountrynIsNull() {
            addCriterion("countryn is null");
            return (Criteria) this;
        }

        public Criteria andCountrynIsNotNull() {
            addCriterion("countryn is not null");
            return (Criteria) this;
        }

        public Criteria andCountrynEqualTo(Integer value) {
            addCriterion("countryn =", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynNotEqualTo(Integer value) {
            addCriterion("countryn <>", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynGreaterThan(Integer value) {
            addCriterion("countryn >", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynGreaterThanOrEqualTo(Integer value) {
            addCriterion("countryn >=", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynLessThan(Integer value) {
            addCriterion("countryn <", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynLessThanOrEqualTo(Integer value) {
            addCriterion("countryn <=", value, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynIn(List<Integer> values) {
            addCriterion("countryn in", values, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynNotIn(List<Integer> values) {
            addCriterion("countryn not in", values, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynBetween(Integer value1, Integer value2) {
            addCriterion("countryn between", value1, value2, "countryn");
            return (Criteria) this;
        }

        public Criteria andCountrynNotBetween(Integer value1, Integer value2) {
            addCriterion("countryn not between", value1, value2, "countryn");
            return (Criteria) this;
        }

        public Criteria andProvincenIsNull() {
            addCriterion("provincen is null");
            return (Criteria) this;
        }

        public Criteria andProvincenIsNotNull() {
            addCriterion("provincen is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenEqualTo(Integer value) {
            addCriterion("provincen =", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenNotEqualTo(Integer value) {
            addCriterion("provincen <>", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenGreaterThan(Integer value) {
            addCriterion("provincen >", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenGreaterThanOrEqualTo(Integer value) {
            addCriterion("provincen >=", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenLessThan(Integer value) {
            addCriterion("provincen <", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenLessThanOrEqualTo(Integer value) {
            addCriterion("provincen <=", value, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenIn(List<Integer> values) {
            addCriterion("provincen in", values, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenNotIn(List<Integer> values) {
            addCriterion("provincen not in", values, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenBetween(Integer value1, Integer value2) {
            addCriterion("provincen between", value1, value2, "provincen");
            return (Criteria) this;
        }

        public Criteria andProvincenNotBetween(Integer value1, Integer value2) {
            addCriterion("provincen not between", value1, value2, "provincen");
            return (Criteria) this;
        }

        public Criteria andCitynIsNull() {
            addCriterion("cityn is null");
            return (Criteria) this;
        }

        public Criteria andCitynIsNotNull() {
            addCriterion("cityn is not null");
            return (Criteria) this;
        }

        public Criteria andCitynEqualTo(Integer value) {
            addCriterion("cityn =", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynNotEqualTo(Integer value) {
            addCriterion("cityn <>", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynGreaterThan(Integer value) {
            addCriterion("cityn >", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynGreaterThanOrEqualTo(Integer value) {
            addCriterion("cityn >=", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynLessThan(Integer value) {
            addCriterion("cityn <", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynLessThanOrEqualTo(Integer value) {
            addCriterion("cityn <=", value, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynIn(List<Integer> values) {
            addCriterion("cityn in", values, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynNotIn(List<Integer> values) {
            addCriterion("cityn not in", values, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynBetween(Integer value1, Integer value2) {
            addCriterion("cityn between", value1, value2, "cityn");
            return (Criteria) this;
        }

        public Criteria andCitynNotBetween(Integer value1, Integer value2) {
            addCriterion("cityn not between", value1, value2, "cityn");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNull() {
            addCriterion("remake is null");
            return (Criteria) this;
        }

        public Criteria andRemakeIsNotNull() {
            addCriterion("remake is not null");
            return (Criteria) this;
        }

        public Criteria andRemakeEqualTo(String value) {
            addCriterion("remake =", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotEqualTo(String value) {
            addCriterion("remake <>", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThan(String value) {
            addCriterion("remake >", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeGreaterThanOrEqualTo(String value) {
            addCriterion("remake >=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThan(String value) {
            addCriterion("remake <", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLessThanOrEqualTo(String value) {
            addCriterion("remake <=", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeLike(String value) {
            addCriterion("remake like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotLike(String value) {
            addCriterion("remake not like", value, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeIn(List<String> values) {
            addCriterion("remake in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotIn(List<String> values) {
            addCriterion("remake not in", values, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeBetween(String value1, String value2) {
            addCriterion("remake between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andRemakeNotBetween(String value1, String value2) {
            addCriterion("remake not between", value1, value2, "remake");
            return (Criteria) this;
        }

        public Criteria andCirclepicIsNull() {
            addCriterion("circlepic is null");
            return (Criteria) this;
        }

        public Criteria andCirclepicIsNotNull() {
            addCriterion("circlepic is not null");
            return (Criteria) this;
        }

        public Criteria andCirclepicEqualTo(String value) {
            addCriterion("circlepic =", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicNotEqualTo(String value) {
            addCriterion("circlepic <>", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicGreaterThan(String value) {
            addCriterion("circlepic >", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicGreaterThanOrEqualTo(String value) {
            addCriterion("circlepic >=", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicLessThan(String value) {
            addCriterion("circlepic <", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicLessThanOrEqualTo(String value) {
            addCriterion("circlepic <=", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicLike(String value) {
            addCriterion("circlepic like", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicNotLike(String value) {
            addCriterion("circlepic not like", value, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicIn(List<String> values) {
            addCriterion("circlepic in", values, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicNotIn(List<String> values) {
            addCriterion("circlepic not in", values, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicBetween(String value1, String value2) {
            addCriterion("circlepic between", value1, value2, "circlepic");
            return (Criteria) this;
        }

        public Criteria andCirclepicNotBetween(String value1, String value2) {
            addCriterion("circlepic not between", value1, value2, "circlepic");
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

        public Criteria andViplvIsNull() {
            addCriterion("viplv is null");
            return (Criteria) this;
        }

        public Criteria andViplvIsNotNull() {
            addCriterion("viplv is not null");
            return (Criteria) this;
        }

        public Criteria andViplvEqualTo(Integer value) {
            addCriterion("viplv =", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvNotEqualTo(Integer value) {
            addCriterion("viplv <>", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvGreaterThan(Integer value) {
            addCriterion("viplv >", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvGreaterThanOrEqualTo(Integer value) {
            addCriterion("viplv >=", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvLessThan(Integer value) {
            addCriterion("viplv <", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvLessThanOrEqualTo(Integer value) {
            addCriterion("viplv <=", value, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvIn(List<Integer> values) {
            addCriterion("viplv in", values, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvNotIn(List<Integer> values) {
            addCriterion("viplv not in", values, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvBetween(Integer value1, Integer value2) {
            addCriterion("viplv between", value1, value2, "viplv");
            return (Criteria) this;
        }

        public Criteria andViplvNotBetween(Integer value1, Integer value2) {
            addCriterion("viplv not between", value1, value2, "viplv");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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

        public Criteria andBannedtimeIsNull() {
            addCriterion("bannedtime is null");
            return (Criteria) this;
        }

        public Criteria andBannedtimeIsNotNull() {
            addCriterion("bannedtime is not null");
            return (Criteria) this;
        }

        public Criteria andBannedtimeEqualTo(Date value) {
            addCriterion("bannedtime =", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeNotEqualTo(Date value) {
            addCriterion("bannedtime <>", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeGreaterThan(Date value) {
            addCriterion("bannedtime >", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bannedtime >=", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeLessThan(Date value) {
            addCriterion("bannedtime <", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeLessThanOrEqualTo(Date value) {
            addCriterion("bannedtime <=", value, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeIn(List<Date> values) {
            addCriterion("bannedtime in", values, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeNotIn(List<Date> values) {
            addCriterion("bannedtime not in", values, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeBetween(Date value1, Date value2) {
            addCriterion("bannedtime between", value1, value2, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andBannedtimeNotBetween(Date value1, Date value2) {
            addCriterion("bannedtime not between", value1, value2, "bannedtime");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNull() {
            addCriterion("standby is null");
            return (Criteria) this;
        }

        public Criteria andStandbyIsNotNull() {
            addCriterion("standby is not null");
            return (Criteria) this;
        }

        public Criteria andStandbyEqualTo(String value) {
            addCriterion("standby =", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotEqualTo(String value) {
            addCriterion("standby <>", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThan(String value) {
            addCriterion("standby >", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyGreaterThanOrEqualTo(String value) {
            addCriterion("standby >=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThan(String value) {
            addCriterion("standby <", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLessThanOrEqualTo(String value) {
            addCriterion("standby <=", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyLike(String value) {
            addCriterion("standby like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotLike(String value) {
            addCriterion("standby not like", value, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyIn(List<String> values) {
            addCriterion("standby in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotIn(List<String> values) {
            addCriterion("standby not in", values, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyBetween(String value1, String value2) {
            addCriterion("standby between", value1, value2, "standby");
            return (Criteria) this;
        }

        public Criteria andStandbyNotBetween(String value1, String value2) {
            addCriterion("standby not between", value1, value2, "standby");
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