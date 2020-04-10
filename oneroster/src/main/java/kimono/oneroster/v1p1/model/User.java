/*
 * OneRoster 1.1
 * OneRoster 1.1. API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.oneroster.v1p1.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import kimono.oneroster.v1p1.model.Base;
import kimono.oneroster.v1p1.model.GUIDRef;
import kimono.oneroster.v1p1.model.UserId;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class User extends Base {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_USER_IDS = "userIds";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private java.util.List<UserId> userIds = null;

  public static final String SERIALIZED_NAME_ENABLED_USER = "enabledUser";
  @SerializedName(SERIALIZED_NAME_ENABLED_USER)
  private Boolean enabledUser;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_SMS = "sms";
  @SerializedName(SERIALIZED_NAME_SMS)
  private String sms;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_AGENTS = "agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private java.util.List<GUIDRef> agents = null;

  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  private java.util.List<GUIDRef> orgs = null;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private java.util.List<String> grades = null;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User userIds(java.util.List<UserId> userIds) {
    this.userIds = userIds;
    return this;
  }

  public User addUserIdsItem(UserId userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new java.util.ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserId> getUserIds() {
    return userIds;
  }

  public void setUserIds(java.util.List<UserId> userIds) {
    this.userIds = userIds;
  }

  public User enabledUser(Boolean enabledUser) {
    this.enabledUser = enabledUser;
    return this;
  }

   /**
   * Get enabledUser
   * @return enabledUser
  **/
  @ApiModelProperty(value = "")
  public Boolean getEnabledUser() {
    return enabledUser;
  }

  public void setEnabledUser(Boolean enabledUser) {
    this.enabledUser = enabledUser;
  }

  public User givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public User familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public User middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @ApiModelProperty(value = "")
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public User role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public User identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @ApiModelProperty(value = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User sms(String sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @ApiModelProperty(value = "")
  public String getSms() {
    return sms;
  }

  public void setSms(String sms) {
    this.sms = sms;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User agents(java.util.List<GUIDRef> agents) {
    this.agents = agents;
    return this;
  }

  public User addAgentsItem(GUIDRef agentsItem) {
    if (this.agents == null) {
      this.agents = new java.util.ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GUIDRef> getAgents() {
    return agents;
  }

  public void setAgents(java.util.List<GUIDRef> agents) {
    this.agents = agents;
  }

  public User orgs(java.util.List<GUIDRef> orgs) {
    this.orgs = orgs;
    return this;
  }

  public User addOrgsItem(GUIDRef orgsItem) {
    if (this.orgs == null) {
      this.orgs = new java.util.ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * Get orgs
   * @return orgs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GUIDRef> getOrgs() {
    return orgs;
  }

  public void setOrgs(java.util.List<GUIDRef> orgs) {
    this.orgs = orgs;
  }

  public User grades(java.util.List<String> grades) {
    this.grades = grades;
    return this;
  }

  public User addGradesItem(String gradesItem) {
    if (this.grades == null) {
      this.grades = new java.util.ArrayList<>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getGrades() {
    return grades;
  }

  public void setGrades(java.util.List<String> grades) {
    this.grades = grades;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.userIds, user.userIds) &&
        Objects.equals(this.enabledUser, user.enabledUser) &&
        Objects.equals(this.givenName, user.givenName) &&
        Objects.equals(this.familyName, user.familyName) &&
        Objects.equals(this.middleName, user.middleName) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.identifier, user.identifier) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.sms, user.sms) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.agents, user.agents) &&
        Objects.equals(this.orgs, user.orgs) &&
        Objects.equals(this.grades, user.grades) &&
        Objects.equals(this.password, user.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, userIds, enabledUser, givenName, familyName, middleName, role, identifier, email, sms, phone, agents, orgs, grades, password, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
    sb.append("    enabledUser: ").append(toIndentedString(enabledUser)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

