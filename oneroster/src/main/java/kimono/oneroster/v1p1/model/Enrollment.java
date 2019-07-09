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
import java.time.LocalDate;
import java.time.OffsetDateTime;
import kimono.oneroster.v1p1.model.Base;
import kimono.oneroster.v1p1.model.GUIDRef;

/**
 * Enrollment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-09T11:13:46.150-06:00[America/Denver]")
public class Enrollment extends Base {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private GUIDRef user = null;

  public static final String SERIALIZED_NAME_PROPERTY_CLASS = "class";
  @SerializedName(SERIALIZED_NAME_PROPERTY_CLASS)
  private GUIDRef propertyClass = null;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private GUIDRef school = null;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private Boolean primary;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "beginDate";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private LocalDate beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public Enrollment user(GUIDRef user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getUser() {
    return user;
  }

  public void setUser(GUIDRef user) {
    this.user = user;
  }

  public Enrollment propertyClass(GUIDRef propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

   /**
   * Get propertyClass
   * @return propertyClass
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(GUIDRef propertyClass) {
    this.propertyClass = propertyClass;
  }

  public Enrollment school(GUIDRef school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getSchool() {
    return school;
  }

  public void setSchool(GUIDRef school) {
    this.school = school;
  }

  public Enrollment role(String role) {
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

  public Enrollment primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")
  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Enrollment beginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
    return this;
  }

   /**
   * Get beginDate
   * @return beginDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(LocalDate beginDate) {
    this.beginDate = beginDate;
  }

  public Enrollment endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Enrollment enrollment = (Enrollment) o;
    return Objects.equals(this.user, enrollment.user) &&
        Objects.equals(this.propertyClass, enrollment.propertyClass) &&
        Objects.equals(this.school, enrollment.school) &&
        Objects.equals(this.role, enrollment.role) &&
        Objects.equals(this.primary, enrollment.primary) &&
        Objects.equals(this.beginDate, enrollment.beginDate) &&
        Objects.equals(this.endDate, enrollment.endDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, propertyClass, school, role, primary, beginDate, endDate, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Enrollment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

