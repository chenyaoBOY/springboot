package org.study.ssm.druid.entity;

import java.io.Serializable;

/**
 * active_rule_parameters
 * @author 
 */
public class ActiveRuleParameters implements Serializable {
    private Integer id;

    private Integer activeRuleId;

    private Integer rulesParameterId;

    private String value;

    private String rulesParameterKey;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActiveRuleId() {
        return activeRuleId;
    }

    public void setActiveRuleId(Integer activeRuleId) {
        this.activeRuleId = activeRuleId;
    }

    public Integer getRulesParameterId() {
        return rulesParameterId;
    }

    public void setRulesParameterId(Integer rulesParameterId) {
        this.rulesParameterId = rulesParameterId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRulesParameterKey() {
        return rulesParameterKey;
    }

    public void setRulesParameterKey(String rulesParameterKey) {
        this.rulesParameterKey = rulesParameterKey;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ActiveRuleParameters other = (ActiveRuleParameters) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActiveRuleId() == null ? other.getActiveRuleId() == null : this.getActiveRuleId().equals(other.getActiveRuleId()))
            && (this.getRulesParameterId() == null ? other.getRulesParameterId() == null : this.getRulesParameterId().equals(other.getRulesParameterId()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getRulesParameterKey() == null ? other.getRulesParameterKey() == null : this.getRulesParameterKey().equals(other.getRulesParameterKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActiveRuleId() == null) ? 0 : getActiveRuleId().hashCode());
        result = prime * result + ((getRulesParameterId() == null) ? 0 : getRulesParameterId().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getRulesParameterKey() == null) ? 0 : getRulesParameterKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activeRuleId=").append(activeRuleId);
        sb.append(", rulesParameterId=").append(rulesParameterId);
        sb.append(", value=").append(value);
        sb.append(", rulesParameterKey=").append(rulesParameterKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}