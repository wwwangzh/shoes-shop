package com.crazyelemon.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNull() {
            addCriterion("cust_pwd is null");
            return (Criteria) this;
        }

        public Criteria andCustPwdIsNotNull() {
            addCriterion("cust_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andCustPwdEqualTo(String value) {
            addCriterion("cust_pwd =", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotEqualTo(String value) {
            addCriterion("cust_pwd <>", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThan(String value) {
            addCriterion("cust_pwd >", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_pwd >=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThan(String value) {
            addCriterion("cust_pwd <", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLessThanOrEqualTo(String value) {
            addCriterion("cust_pwd <=", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdLike(String value) {
            addCriterion("cust_pwd like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotLike(String value) {
            addCriterion("cust_pwd not like", value, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdIn(List<String> values) {
            addCriterion("cust_pwd in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotIn(List<String> values) {
            addCriterion("cust_pwd not in", values, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdBetween(String value1, String value2) {
            addCriterion("cust_pwd between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustPwdNotBetween(String value1, String value2) {
            addCriterion("cust_pwd not between", value1, value2, "custPwd");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNull() {
            addCriterion("cust_age is null");
            return (Criteria) this;
        }

        public Criteria andCustAgeIsNotNull() {
            addCriterion("cust_age is not null");
            return (Criteria) this;
        }

        public Criteria andCustAgeEqualTo(Integer value) {
            addCriterion("cust_age =", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotEqualTo(Integer value) {
            addCriterion("cust_age <>", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThan(Integer value) {
            addCriterion("cust_age >", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_age >=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThan(Integer value) {
            addCriterion("cust_age <", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeLessThanOrEqualTo(Integer value) {
            addCriterion("cust_age <=", value, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeIn(List<Integer> values) {
            addCriterion("cust_age in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotIn(List<Integer> values) {
            addCriterion("cust_age not in", values, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeBetween(Integer value1, Integer value2) {
            addCriterion("cust_age between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_age not between", value1, value2, "custAge");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneEqualTo(Integer value) {
            addCriterion("cust_phone =", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotEqualTo(Integer value) {
            addCriterion("cust_phone <>", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThan(Integer value) {
            addCriterion("cust_phone >", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_phone >=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThan(Integer value) {
            addCriterion("cust_phone <", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("cust_phone <=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIn(List<Integer> values) {
            addCriterion("cust_phone in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotIn(List<Integer> values) {
            addCriterion("cust_phone not in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneBetween(Integer value1, Integer value2) {
            addCriterion("cust_phone between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_phone not between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNull() {
            addCriterion("cust_email is null");
            return (Criteria) this;
        }

        public Criteria andCustEmailIsNotNull() {
            addCriterion("cust_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustEmailEqualTo(String value) {
            addCriterion("cust_email =", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotEqualTo(String value) {
            addCriterion("cust_email <>", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThan(String value) {
            addCriterion("cust_email >", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cust_email >=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThan(String value) {
            addCriterion("cust_email <", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLessThanOrEqualTo(String value) {
            addCriterion("cust_email <=", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailLike(String value) {
            addCriterion("cust_email like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotLike(String value) {
            addCriterion("cust_email not like", value, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailIn(List<String> values) {
            addCriterion("cust_email in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotIn(List<String> values) {
            addCriterion("cust_email not in", values, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailBetween(String value1, String value2) {
            addCriterion("cust_email between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustEmailNotBetween(String value1, String value2) {
            addCriterion("cust_email not between", value1, value2, "custEmail");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIsNull() {
            addCriterion("cust_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIsNotNull() {
            addCriterion("cust_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeEqualTo(Date value) {
            addCriterion("cust_create_time =", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotEqualTo(Date value) {
            addCriterion("cust_create_time <>", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeGreaterThan(Date value) {
            addCriterion("cust_create_time >", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cust_create_time >=", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeLessThan(Date value) {
            addCriterion("cust_create_time <", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cust_create_time <=", value, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeIn(List<Date> values) {
            addCriterion("cust_create_time in", values, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotIn(List<Date> values) {
            addCriterion("cust_create_time not in", values, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cust_create_time between", value1, value2, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cust_create_time not between", value1, value2, "custCreateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIsNull() {
            addCriterion("cust_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIsNotNull() {
            addCriterion("cust_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeEqualTo(Date value) {
            addCriterion("cust_update_time =", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotEqualTo(Date value) {
            addCriterion("cust_update_time <>", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeGreaterThan(Date value) {
            addCriterion("cust_update_time >", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cust_update_time >=", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeLessThan(Date value) {
            addCriterion("cust_update_time <", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cust_update_time <=", value, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeIn(List<Date> values) {
            addCriterion("cust_update_time in", values, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotIn(List<Date> values) {
            addCriterion("cust_update_time not in", values, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("cust_update_time between", value1, value2, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cust_update_time not between", value1, value2, "custUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCustProfileIsNull() {
            addCriterion("cust_profile is null");
            return (Criteria) this;
        }

        public Criteria andCustProfileIsNotNull() {
            addCriterion("cust_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCustProfileEqualTo(String value) {
            addCriterion("cust_profile =", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotEqualTo(String value) {
            addCriterion("cust_profile <>", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileGreaterThan(String value) {
            addCriterion("cust_profile >", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileGreaterThanOrEqualTo(String value) {
            addCriterion("cust_profile >=", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLessThan(String value) {
            addCriterion("cust_profile <", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLessThanOrEqualTo(String value) {
            addCriterion("cust_profile <=", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileLike(String value) {
            addCriterion("cust_profile like", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotLike(String value) {
            addCriterion("cust_profile not like", value, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileIn(List<String> values) {
            addCriterion("cust_profile in", values, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotIn(List<String> values) {
            addCriterion("cust_profile not in", values, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileBetween(String value1, String value2) {
            addCriterion("cust_profile between", value1, value2, "custProfile");
            return (Criteria) this;
        }

        public Criteria andCustProfileNotBetween(String value1, String value2) {
            addCriterion("cust_profile not between", value1, value2, "custProfile");
            return (Criteria) this;
        }
    }

    /**
     */
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