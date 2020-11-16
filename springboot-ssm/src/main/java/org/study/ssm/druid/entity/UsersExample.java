package org.study.ssm.druid.entity;

import java.util.ArrayList;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UsersExample() {
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

        public Criteria andLoginIsNull() {
            addCriterion("`login` is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("`login` is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("`login` =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("`login` <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("`login` >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("`login` >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("`login` <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("`login` <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("`login` like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("`login` not like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("`login` in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("`login` not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("`login` between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("`login` not between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordIsNull() {
            addCriterion("crypted_password is null");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordIsNotNull() {
            addCriterion("crypted_password is not null");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordEqualTo(String value) {
            addCriterion("crypted_password =", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordNotEqualTo(String value) {
            addCriterion("crypted_password <>", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordGreaterThan(String value) {
            addCriterion("crypted_password >", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("crypted_password >=", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordLessThan(String value) {
            addCriterion("crypted_password <", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordLessThanOrEqualTo(String value) {
            addCriterion("crypted_password <=", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordLike(String value) {
            addCriterion("crypted_password like", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordNotLike(String value) {
            addCriterion("crypted_password not like", value, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordIn(List<String> values) {
            addCriterion("crypted_password in", values, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordNotIn(List<String> values) {
            addCriterion("crypted_password not in", values, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordBetween(String value1, String value2) {
            addCriterion("crypted_password between", value1, value2, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andCryptedPasswordNotBetween(String value1, String value2) {
            addCriterion("crypted_password not between", value1, value2, "cryptedPassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Long value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Long value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Long value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Long value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Long value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Long> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Long> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Long value1, Long value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Long value1, Long value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Long value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Long value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Long value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Long value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Long value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Long> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Long> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Long value1, Long value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Long value1, Long value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andScmAccountsIsNull() {
            addCriterion("scm_accounts is null");
            return (Criteria) this;
        }

        public Criteria andScmAccountsIsNotNull() {
            addCriterion("scm_accounts is not null");
            return (Criteria) this;
        }

        public Criteria andScmAccountsEqualTo(String value) {
            addCriterion("scm_accounts =", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsNotEqualTo(String value) {
            addCriterion("scm_accounts <>", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsGreaterThan(String value) {
            addCriterion("scm_accounts >", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsGreaterThanOrEqualTo(String value) {
            addCriterion("scm_accounts >=", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsLessThan(String value) {
            addCriterion("scm_accounts <", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsLessThanOrEqualTo(String value) {
            addCriterion("scm_accounts <=", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsLike(String value) {
            addCriterion("scm_accounts like", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsNotLike(String value) {
            addCriterion("scm_accounts not like", value, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsIn(List<String> values) {
            addCriterion("scm_accounts in", values, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsNotIn(List<String> values) {
            addCriterion("scm_accounts not in", values, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsBetween(String value1, String value2) {
            addCriterion("scm_accounts between", value1, value2, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andScmAccountsNotBetween(String value1, String value2) {
            addCriterion("scm_accounts not between", value1, value2, "scmAccounts");
            return (Criteria) this;
        }

        public Criteria andExternalLoginIsNull() {
            addCriterion("external_login is null");
            return (Criteria) this;
        }

        public Criteria andExternalLoginIsNotNull() {
            addCriterion("external_login is not null");
            return (Criteria) this;
        }

        public Criteria andExternalLoginEqualTo(String value) {
            addCriterion("external_login =", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginNotEqualTo(String value) {
            addCriterion("external_login <>", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginGreaterThan(String value) {
            addCriterion("external_login >", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginGreaterThanOrEqualTo(String value) {
            addCriterion("external_login >=", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginLessThan(String value) {
            addCriterion("external_login <", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginLessThanOrEqualTo(String value) {
            addCriterion("external_login <=", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginLike(String value) {
            addCriterion("external_login like", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginNotLike(String value) {
            addCriterion("external_login not like", value, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginIn(List<String> values) {
            addCriterion("external_login in", values, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginNotIn(List<String> values) {
            addCriterion("external_login not in", values, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginBetween(String value1, String value2) {
            addCriterion("external_login between", value1, value2, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalLoginNotBetween(String value1, String value2) {
            addCriterion("external_login not between", value1, value2, "externalLogin");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderIsNull() {
            addCriterion("external_identity_provider is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderIsNotNull() {
            addCriterion("external_identity_provider is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderEqualTo(String value) {
            addCriterion("external_identity_provider =", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderNotEqualTo(String value) {
            addCriterion("external_identity_provider <>", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderGreaterThan(String value) {
            addCriterion("external_identity_provider >", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderGreaterThanOrEqualTo(String value) {
            addCriterion("external_identity_provider >=", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderLessThan(String value) {
            addCriterion("external_identity_provider <", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderLessThanOrEqualTo(String value) {
            addCriterion("external_identity_provider <=", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderLike(String value) {
            addCriterion("external_identity_provider like", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderNotLike(String value) {
            addCriterion("external_identity_provider not like", value, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderIn(List<String> values) {
            addCriterion("external_identity_provider in", values, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderNotIn(List<String> values) {
            addCriterion("external_identity_provider not in", values, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderBetween(String value1, String value2) {
            addCriterion("external_identity_provider between", value1, value2, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andExternalIdentityProviderNotBetween(String value1, String value2) {
            addCriterion("external_identity_provider not between", value1, value2, "externalIdentityProvider");
            return (Criteria) this;
        }

        public Criteria andUserLocalIsNull() {
            addCriterion("user_local is null");
            return (Criteria) this;
        }

        public Criteria andUserLocalIsNotNull() {
            addCriterion("user_local is not null");
            return (Criteria) this;
        }

        public Criteria andUserLocalEqualTo(Boolean value) {
            addCriterion("user_local =", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalNotEqualTo(Boolean value) {
            addCriterion("user_local <>", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalGreaterThan(Boolean value) {
            addCriterion("user_local >", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_local >=", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalLessThan(Boolean value) {
            addCriterion("user_local <", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalLessThanOrEqualTo(Boolean value) {
            addCriterion("user_local <=", value, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalIn(List<Boolean> values) {
            addCriterion("user_local in", values, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalNotIn(List<Boolean> values) {
            addCriterion("user_local not in", values, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalBetween(Boolean value1, Boolean value2) {
            addCriterion("user_local between", value1, value2, "userLocal");
            return (Criteria) this;
        }

        public Criteria andUserLocalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_local not between", value1, value2, "userLocal");
            return (Criteria) this;
        }

        public Criteria andIsRootIsNull() {
            addCriterion("is_root is null");
            return (Criteria) this;
        }

        public Criteria andIsRootIsNotNull() {
            addCriterion("is_root is not null");
            return (Criteria) this;
        }

        public Criteria andIsRootEqualTo(Boolean value) {
            addCriterion("is_root =", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootNotEqualTo(Boolean value) {
            addCriterion("is_root <>", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootGreaterThan(Boolean value) {
            addCriterion("is_root >", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_root >=", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootLessThan(Boolean value) {
            addCriterion("is_root <", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootLessThanOrEqualTo(Boolean value) {
            addCriterion("is_root <=", value, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootIn(List<Boolean> values) {
            addCriterion("is_root in", values, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootNotIn(List<Boolean> values) {
            addCriterion("is_root not in", values, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootBetween(Boolean value1, Boolean value2) {
            addCriterion("is_root between", value1, value2, "isRoot");
            return (Criteria) this;
        }

        public Criteria andIsRootNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_root not between", value1, value2, "isRoot");
            return (Criteria) this;
        }

        public Criteria andOnboardedIsNull() {
            addCriterion("onboarded is null");
            return (Criteria) this;
        }

        public Criteria andOnboardedIsNotNull() {
            addCriterion("onboarded is not null");
            return (Criteria) this;
        }

        public Criteria andOnboardedEqualTo(Boolean value) {
            addCriterion("onboarded =", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedNotEqualTo(Boolean value) {
            addCriterion("onboarded <>", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedGreaterThan(Boolean value) {
            addCriterion("onboarded >", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("onboarded >=", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedLessThan(Boolean value) {
            addCriterion("onboarded <", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedLessThanOrEqualTo(Boolean value) {
            addCriterion("onboarded <=", value, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedIn(List<Boolean> values) {
            addCriterion("onboarded in", values, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedNotIn(List<Boolean> values) {
            addCriterion("onboarded not in", values, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedBetween(Boolean value1, Boolean value2) {
            addCriterion("onboarded between", value1, value2, "onboarded");
            return (Criteria) this;
        }

        public Criteria andOnboardedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("onboarded not between", value1, value2, "onboarded");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeIsNull() {
            addCriterion("homepage_type is null");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeIsNotNull() {
            addCriterion("homepage_type is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeEqualTo(String value) {
            addCriterion("homepage_type =", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeNotEqualTo(String value) {
            addCriterion("homepage_type <>", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeGreaterThan(String value) {
            addCriterion("homepage_type >", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("homepage_type >=", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeLessThan(String value) {
            addCriterion("homepage_type <", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeLessThanOrEqualTo(String value) {
            addCriterion("homepage_type <=", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeLike(String value) {
            addCriterion("homepage_type like", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeNotLike(String value) {
            addCriterion("homepage_type not like", value, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeIn(List<String> values) {
            addCriterion("homepage_type in", values, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeNotIn(List<String> values) {
            addCriterion("homepage_type not in", values, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeBetween(String value1, String value2) {
            addCriterion("homepage_type between", value1, value2, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageTypeNotBetween(String value1, String value2) {
            addCriterion("homepage_type not between", value1, value2, "homepageType");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterIsNull() {
            addCriterion("homepage_parameter is null");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterIsNotNull() {
            addCriterion("homepage_parameter is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterEqualTo(String value) {
            addCriterion("homepage_parameter =", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterNotEqualTo(String value) {
            addCriterion("homepage_parameter <>", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterGreaterThan(String value) {
            addCriterion("homepage_parameter >", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterGreaterThanOrEqualTo(String value) {
            addCriterion("homepage_parameter >=", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterLessThan(String value) {
            addCriterion("homepage_parameter <", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterLessThanOrEqualTo(String value) {
            addCriterion("homepage_parameter <=", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterLike(String value) {
            addCriterion("homepage_parameter like", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterNotLike(String value) {
            addCriterion("homepage_parameter not like", value, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterIn(List<String> values) {
            addCriterion("homepage_parameter in", values, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterNotIn(List<String> values) {
            addCriterion("homepage_parameter not in", values, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterBetween(String value1, String value2) {
            addCriterion("homepage_parameter between", value1, value2, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHomepageParameterNotBetween(String value1, String value2) {
            addCriterion("homepage_parameter not between", value1, value2, "homepageParameter");
            return (Criteria) this;
        }

        public Criteria andHashMethodIsNull() {
            addCriterion("hash_method is null");
            return (Criteria) this;
        }

        public Criteria andHashMethodIsNotNull() {
            addCriterion("hash_method is not null");
            return (Criteria) this;
        }

        public Criteria andHashMethodEqualTo(String value) {
            addCriterion("hash_method =", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodNotEqualTo(String value) {
            addCriterion("hash_method <>", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodGreaterThan(String value) {
            addCriterion("hash_method >", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodGreaterThanOrEqualTo(String value) {
            addCriterion("hash_method >=", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodLessThan(String value) {
            addCriterion("hash_method <", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodLessThanOrEqualTo(String value) {
            addCriterion("hash_method <=", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodLike(String value) {
            addCriterion("hash_method like", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodNotLike(String value) {
            addCriterion("hash_method not like", value, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodIn(List<String> values) {
            addCriterion("hash_method in", values, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodNotIn(List<String> values) {
            addCriterion("hash_method not in", values, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodBetween(String value1, String value2) {
            addCriterion("hash_method between", value1, value2, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andHashMethodNotBetween(String value1, String value2) {
            addCriterion("hash_method not between", value1, value2, "hashMethod");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andExternalIdIsNull() {
            addCriterion("external_id is null");
            return (Criteria) this;
        }

        public Criteria andExternalIdIsNotNull() {
            addCriterion("external_id is not null");
            return (Criteria) this;
        }

        public Criteria andExternalIdEqualTo(String value) {
            addCriterion("external_id =", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotEqualTo(String value) {
            addCriterion("external_id <>", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThan(String value) {
            addCriterion("external_id >", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdGreaterThanOrEqualTo(String value) {
            addCriterion("external_id >=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThan(String value) {
            addCriterion("external_id <", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLessThanOrEqualTo(String value) {
            addCriterion("external_id <=", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdLike(String value) {
            addCriterion("external_id like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotLike(String value) {
            addCriterion("external_id not like", value, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdIn(List<String> values) {
            addCriterion("external_id in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotIn(List<String> values) {
            addCriterion("external_id not in", values, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdBetween(String value1, String value2) {
            addCriterion("external_id between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andExternalIdNotBetween(String value1, String value2) {
            addCriterion("external_id not between", value1, value2, "externalId");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidIsNull() {
            addCriterion("organization_uuid is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidIsNotNull() {
            addCriterion("organization_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidEqualTo(String value) {
            addCriterion("organization_uuid =", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidNotEqualTo(String value) {
            addCriterion("organization_uuid <>", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidGreaterThan(String value) {
            addCriterion("organization_uuid >", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidGreaterThanOrEqualTo(String value) {
            addCriterion("organization_uuid >=", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidLessThan(String value) {
            addCriterion("organization_uuid <", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidLessThanOrEqualTo(String value) {
            addCriterion("organization_uuid <=", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidLike(String value) {
            addCriterion("organization_uuid like", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidNotLike(String value) {
            addCriterion("organization_uuid not like", value, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidIn(List<String> values) {
            addCriterion("organization_uuid in", values, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidNotIn(List<String> values) {
            addCriterion("organization_uuid not in", values, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidBetween(String value1, String value2) {
            addCriterion("organization_uuid between", value1, value2, "organizationUuid");
            return (Criteria) this;
        }

        public Criteria andOrganizationUuidNotBetween(String value1, String value2) {
            addCriterion("organization_uuid not between", value1, value2, "organizationUuid");
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