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
 * AcademicSession
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class AcademicSession extends Base {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private GUIDRef parent = null;

  public static final String SERIALIZED_NAME_CHILDREN = "children";
  @SerializedName(SERIALIZED_NAME_CHILDREN)
  private java.util.List<GUIDRef> children = null;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR = "schoolYear";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR)
  private String schoolYear;

  public AcademicSession title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AcademicSession startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public AcademicSession endDate(LocalDate endDate) {
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

  public AcademicSession type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AcademicSession parent(GUIDRef parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getParent() {
    return parent;
  }

  public void setParent(GUIDRef parent) {
    this.parent = parent;
  }

  public AcademicSession children(java.util.List<GUIDRef> children) {
    this.children = children;
    return this;
  }

  public AcademicSession addChildrenItem(GUIDRef childrenItem) {
    if (this.children == null) {
      this.children = new java.util.ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GUIDRef> getChildren() {
    return children;
  }

  public void setChildren(java.util.List<GUIDRef> children) {
    this.children = children;
  }

  public AcademicSession schoolYear(String schoolYear) {
    this.schoolYear = schoolYear;
    return this;
  }

   /**
   * Get schoolYear
   * @return schoolYear
  **/
  @ApiModelProperty(value = "")
  public String getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(String schoolYear) {
    this.schoolYear = schoolYear;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicSession academicSession = (AcademicSession) o;
    return Objects.equals(this.title, academicSession.title) &&
        Objects.equals(this.startDate, academicSession.startDate) &&
        Objects.equals(this.endDate, academicSession.endDate) &&
        Objects.equals(this.type, academicSession.type) &&
        Objects.equals(this.parent, academicSession.parent) &&
        Objects.equals(this.children, academicSession.children) &&
        Objects.equals(this.schoolYear, academicSession.schoolYear) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, startDate, endDate, type, parent, children, schoolYear, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicSession {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    schoolYear: ").append(toIndentedString(schoolYear)).append("\n");
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

