package org.study.ssm.domain;

import java.io.Serializable;

/**
 * users
 * @author 
 */
public class Users implements Serializable {
    private Integer id;

    private String login;

    private String name;

    private String email;

    private String cryptedPassword;

    private String salt;

    private Boolean active;

    private Long createdAt;

    private Long updatedAt;

    private String scmAccounts;

    private String externalLogin;

    private String externalIdentityProvider;

    private Boolean userLocal;

    private Boolean isRoot;

    private Boolean onboarded;

    private String homepageType;

    private String homepageParameter;

    private String hashMethod;

    private String uuid;

    private String externalId;

    private String organizationUuid;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCryptedPassword() {
        return cryptedPassword;
    }

    public void setCryptedPassword(String cryptedPassword) {
        this.cryptedPassword = cryptedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getScmAccounts() {
        return scmAccounts;
    }

    public void setScmAccounts(String scmAccounts) {
        this.scmAccounts = scmAccounts;
    }

    public String getExternalLogin() {
        return externalLogin;
    }

    public void setExternalLogin(String externalLogin) {
        this.externalLogin = externalLogin;
    }

    public String getExternalIdentityProvider() {
        return externalIdentityProvider;
    }

    public void setExternalIdentityProvider(String externalIdentityProvider) {
        this.externalIdentityProvider = externalIdentityProvider;
    }

    public Boolean getUserLocal() {
        return userLocal;
    }

    public void setUserLocal(Boolean userLocal) {
        this.userLocal = userLocal;
    }

    public Boolean getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
    }

    public Boolean getOnboarded() {
        return onboarded;
    }

    public void setOnboarded(Boolean onboarded) {
        this.onboarded = onboarded;
    }

    public String getHomepageType() {
        return homepageType;
    }

    public void setHomepageType(String homepageType) {
        this.homepageType = homepageType;
    }

    public String getHomepageParameter() {
        return homepageParameter;
    }

    public void setHomepageParameter(String homepageParameter) {
        this.homepageParameter = homepageParameter;
    }

    public String getHashMethod() {
        return hashMethod;
    }

    public void setHashMethod(String hashMethod) {
        this.hashMethod = hashMethod;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getOrganizationUuid() {
        return organizationUuid;
    }

    public void setOrganizationUuid(String organizationUuid) {
        this.organizationUuid = organizationUuid;
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
        Users other = (Users) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLogin() == null ? other.getLogin() == null : this.getLogin().equals(other.getLogin()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getCryptedPassword() == null ? other.getCryptedPassword() == null : this.getCryptedPassword().equals(other.getCryptedPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getScmAccounts() == null ? other.getScmAccounts() == null : this.getScmAccounts().equals(other.getScmAccounts()))
            && (this.getExternalLogin() == null ? other.getExternalLogin() == null : this.getExternalLogin().equals(other.getExternalLogin()))
            && (this.getExternalIdentityProvider() == null ? other.getExternalIdentityProvider() == null : this.getExternalIdentityProvider().equals(other.getExternalIdentityProvider()))
            && (this.getUserLocal() == null ? other.getUserLocal() == null : this.getUserLocal().equals(other.getUserLocal()))
            && (this.getIsRoot() == null ? other.getIsRoot() == null : this.getIsRoot().equals(other.getIsRoot()))
            && (this.getOnboarded() == null ? other.getOnboarded() == null : this.getOnboarded().equals(other.getOnboarded()))
            && (this.getHomepageType() == null ? other.getHomepageType() == null : this.getHomepageType().equals(other.getHomepageType()))
            && (this.getHomepageParameter() == null ? other.getHomepageParameter() == null : this.getHomepageParameter().equals(other.getHomepageParameter()))
            && (this.getHashMethod() == null ? other.getHashMethod() == null : this.getHashMethod().equals(other.getHashMethod()))
            && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getExternalId() == null ? other.getExternalId() == null : this.getExternalId().equals(other.getExternalId()))
            && (this.getOrganizationUuid() == null ? other.getOrganizationUuid() == null : this.getOrganizationUuid().equals(other.getOrganizationUuid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLogin() == null) ? 0 : getLogin().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getCryptedPassword() == null) ? 0 : getCryptedPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getScmAccounts() == null) ? 0 : getScmAccounts().hashCode());
        result = prime * result + ((getExternalLogin() == null) ? 0 : getExternalLogin().hashCode());
        result = prime * result + ((getExternalIdentityProvider() == null) ? 0 : getExternalIdentityProvider().hashCode());
        result = prime * result + ((getUserLocal() == null) ? 0 : getUserLocal().hashCode());
        result = prime * result + ((getIsRoot() == null) ? 0 : getIsRoot().hashCode());
        result = prime * result + ((getOnboarded() == null) ? 0 : getOnboarded().hashCode());
        result = prime * result + ((getHomepageType() == null) ? 0 : getHomepageType().hashCode());
        result = prime * result + ((getHomepageParameter() == null) ? 0 : getHomepageParameter().hashCode());
        result = prime * result + ((getHashMethod() == null) ? 0 : getHashMethod().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        result = prime * result + ((getOrganizationUuid() == null) ? 0 : getOrganizationUuid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", login=").append(login);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", cryptedPassword=").append(cryptedPassword);
        sb.append(", salt=").append(salt);
        sb.append(", active=").append(active);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", scmAccounts=").append(scmAccounts);
        sb.append(", externalLogin=").append(externalLogin);
        sb.append(", externalIdentityProvider=").append(externalIdentityProvider);
        sb.append(", userLocal=").append(userLocal);
        sb.append(", isRoot=").append(isRoot);
        sb.append(", onboarded=").append(onboarded);
        sb.append(", homepageType=").append(homepageType);
        sb.append(", homepageParameter=").append(homepageParameter);
        sb.append(", hashMethod=").append(hashMethod);
        sb.append(", uuid=").append(uuid);
        sb.append(", externalId=").append(externalId);
        sb.append(", organizationUuid=").append(organizationUuid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}