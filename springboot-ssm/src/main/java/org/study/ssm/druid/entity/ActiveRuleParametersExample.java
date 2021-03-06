package org.study.ssm.druid.entity;

import java.util.ArrayList;
import java.util.List;

public class ActiveRuleParametersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ActiveRuleParametersExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andActiveRuleIdIsNull() {
            addCriterion("active_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdIsNotNull() {
            addCriterion("active_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdEqualTo(Integer value) {
            addCriterion("active_rule_id =", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdNotEqualTo(Integer value) {
            addCriterion("active_rule_id <>", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdGreaterThan(Integer value) {
            addCriterion("active_rule_id >", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_rule_id >=", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdLessThan(Integer value) {
            addCriterion("active_rule_id <", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("active_rule_id <=", value, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdIn(List<Integer> values) {
            addCriterion("active_rule_id in", values, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdNotIn(List<Integer> values) {
            addCriterion("active_rule_id not in", values, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("active_rule_id between", value1, value2, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andActiveRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("active_rule_id not between", value1, value2, "activeRuleId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdIsNull() {
            addCriterion("rules_parameter_id is null");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdIsNotNull() {
            addCriterion("rules_parameter_id is not null");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdEqualTo(Integer value) {
            addCriterion("rules_parameter_id =", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdNotEqualTo(Integer value) {
            addCriterion("rules_parameter_id <>", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdGreaterThan(Integer value) {
            addCriterion("rules_parameter_id >", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rules_parameter_id >=", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdLessThan(Integer value) {
            addCriterion("rules_parameter_id <", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdLessThanOrEqualTo(Integer value) {
            addCriterion("rules_parameter_id <=", value, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdIn(List<Integer> values) {
            addCriterion("rules_parameter_id in", values, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdNotIn(List<Integer> values) {
            addCriterion("rules_parameter_id not in", values, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdBetween(Integer value1, Integer value2) {
            addCriterion("rules_parameter_id between", value1, value2, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andRulesParameterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rules_parameter_id not between", value1, value2, "rulesParameterId");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("`value` is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("`value` is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("`value` =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("`value` <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("`value` >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("`value` >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("`value` <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("`value` <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("`value` like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("`value` not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("`value` in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("`value` not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("`value` between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("`value` not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyIsNull() {
            addCriterion("rules_parameter_key is null");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyIsNotNull() {
            addCriterion("rules_parameter_key is not null");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyEqualTo(String value) {
            addCriterion("rules_parameter_key =", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyNotEqualTo(String value) {
            addCriterion("rules_parameter_key <>", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyGreaterThan(String value) {
            addCriterion("rules_parameter_key >", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyGreaterThanOrEqualTo(String value) {
            addCriterion("rules_parameter_key >=", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyLessThan(String value) {
            addCriterion("rules_parameter_key <", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyLessThanOrEqualTo(String value) {
            addCriterion("rules_parameter_key <=", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyLike(String value) {
            addCriterion("rules_parameter_key like", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyNotLike(String value) {
            addCriterion("rules_parameter_key not like", value, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyIn(List<String> values) {
            addCriterion("rules_parameter_key in", values, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyNotIn(List<String> values) {
            addCriterion("rules_parameter_key not in", values, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyBetween(String value1, String value2) {
            addCriterion("rules_parameter_key between", value1, value2, "rulesParameterKey");
            return (Criteria) this;
        }

        public Criteria andRulesParameterKeyNotBetween(String value1, String value2) {
            addCriterion("rules_parameter_key not between", value1, value2, "rulesParameterKey");
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