/*
 * Interop API
 * Interop APIs provide access to Kimono Interop Cloud resources and operations
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interop.model;

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

/**
 * ScopingSchool
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-06T14:46:47.652-06:00[America/Denver]")
public class ScopingSchool {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private java.util.UUID accountId;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private java.util.UUID tenantId;

  public static final String SERIALIZED_NAME_SCHOOL_ID = "school_id";
  @SerializedName(SERIALIZED_NAME_SCHOOL_ID)
  private java.util.UUID schoolId;

  public static final String SERIALIZED_NAME_SCHOOL_REF_ID = "school_ref_id";
  @SerializedName(SERIALIZED_NAME_SCHOOL_REF_ID)
  private String schoolRefId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_KEYWORDS = "keywords";
  @SerializedName(SERIALIZED_NAME_KEYWORDS)
  private String keywords;

  public static final String SERIALIZED_NAME_SELECTED = "selected";
  @SerializedName(SERIALIZED_NAME_SELECTED)
  private Boolean selected;

  public ScopingSchool accountId(java.util.UUID accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getAccountId() {
    return accountId;
  }

  public void setAccountId(java.util.UUID accountId) {
    this.accountId = accountId;
  }

  public ScopingSchool tenantId(java.util.UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(java.util.UUID tenantId) {
    this.tenantId = tenantId;
  }

  public ScopingSchool schoolId(java.util.UUID schoolId) {
    this.schoolId = schoolId;
    return this;
  }

   /**
   * Get schoolId
   * @return schoolId
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(java.util.UUID schoolId) {
    this.schoolId = schoolId;
  }

  public ScopingSchool schoolRefId(String schoolRefId) {
    this.schoolRefId = schoolRefId;
    return this;
  }

   /**
   * Get schoolRefId
   * @return schoolRefId
  **/
  @ApiModelProperty(value = "")
  public String getSchoolRefId() {
    return schoolRefId;
  }

  public void setSchoolRefId(String schoolRefId) {
    this.schoolRefId = schoolRefId;
  }

  public ScopingSchool name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScopingSchool localId(String localId) {
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @ApiModelProperty(value = "")
  public String getLocalId() {
    return localId;
  }

  public void setLocalId(String localId) {
    this.localId = localId;
  }

  public ScopingSchool keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(value = "")
  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public ScopingSchool selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(value = "")
  public Boolean getSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopingSchool scopingSchool = (ScopingSchool) o;
    return Objects.equals(this.accountId, scopingSchool.accountId) &&
        Objects.equals(this.tenantId, scopingSchool.tenantId) &&
        Objects.equals(this.schoolId, scopingSchool.schoolId) &&
        Objects.equals(this.schoolRefId, scopingSchool.schoolRefId) &&
        Objects.equals(this.name, scopingSchool.name) &&
        Objects.equals(this.localId, scopingSchool.localId) &&
        Objects.equals(this.keywords, scopingSchool.keywords) &&
        Objects.equals(this.selected, scopingSchool.selected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, tenantId, schoolId, schoolRefId, name, localId, keywords, selected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopingSchool {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    schoolId: ").append(toIndentedString(schoolId)).append("\n");
    sb.append("    schoolRefId: ").append(toIndentedString(schoolRefId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
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

