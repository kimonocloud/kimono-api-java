/*
 * Interop Data API
 * Interop Data APIs provide access to the data objects and events from Interop Cloud repositories and Integration repositories
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interopdata.model;

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
import kimono.api.v2.interopdata.model.ObjectType;
import kimono.api.v2.interopdata.model.OrgRefType;
import kimono.api.v2.interopdata.model.PersonMembershipRefType;
import kimono.api.v2.interopdata.model.RefType;
import kimono.api.v2.interopdata.model.SysType;
import kimono.api.v2.interopdata.model.TermRefType;

/**
 * Section
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-09T14:17:25.210-06:00[America/Denver]")
public class Section extends ObjectType {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private SysType $sys = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_$_TERMS = "$terms";
  @SerializedName(SERIALIZED_NAME_$_TERMS)
  private java.util.List<TermRefType> $terms = null;

  public static final String SERIALIZED_NAME_$_COURSE = "$course";
  @SerializedName(SERIALIZED_NAME_$_COURSE)
  private RefType $course = null;

  public static final String SERIALIZED_NAME_$_ORG = "$org";
  @SerializedName(SERIALIZED_NAME_$_ORG)
  private OrgRefType $org = null;

  public static final String SERIALIZED_NAME_$_TEACHERS = "$teachers";
  @SerializedName(SERIALIZED_NAME_$_TEACHERS)
  private java.util.List<PersonMembershipRefType> $teachers = null;

  public static final String SERIALIZED_NAME_$_STUDENTS = "$students";
  @SerializedName(SERIALIZED_NAME_$_STUDENTS)
  private java.util.List<PersonMembershipRefType> $students = null;

  public Section $sys(SysType $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public SysType get$Sys() {
    return $sys;
  }

  public void set$Sys(SysType $sys) {
    this.$sys = $sys;
  }

   /**
   * Get localId
   * @return localId
  **/
  @ApiModelProperty(value = "")
  public String getLocalId() {
    return localId;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get $terms
   * @return $terms
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TermRefType> get$Terms() {
    return $terms;
  }

  public Section $course(RefType $course) {
    this.$course = $course;
    return this;
  }

   /**
   * Get $course
   * @return $course
  **/
  @ApiModelProperty(value = "")
  public RefType get$Course() {
    return $course;
  }

  public void set$Course(RefType $course) {
    this.$course = $course;
  }

  public Section $org(OrgRefType $org) {
    this.$org = $org;
    return this;
  }

   /**
   * Get $org
   * @return $org
  **/
  @ApiModelProperty(value = "")
  public OrgRefType get$Org() {
    return $org;
  }

  public void set$Org(OrgRefType $org) {
    this.$org = $org;
  }

   /**
   * Get $teachers
   * @return $teachers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PersonMembershipRefType> get$Teachers() {
    return $teachers;
  }

   /**
   * Get $students
   * @return $students
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PersonMembershipRefType> get$Students() {
    return $students;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Section section = (Section) o;
    return Objects.equals(this.$sys, section.$sys) &&
        Objects.equals(this.localId, section.localId) &&
        Objects.equals(this.title, section.title) &&
        Objects.equals(this.description, section.description) &&
        Objects.equals(this.$terms, section.$terms) &&
        Objects.equals(this.$course, section.$course) &&
        Objects.equals(this.$org, section.$org) &&
        Objects.equals(this.$teachers, section.$teachers) &&
        Objects.equals(this.$students, section.$students) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys, localId, title, description, $terms, $course, $org, $teachers, $students, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Section {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    $terms: ").append(toIndentedString($terms)).append("\n");
    sb.append("    $course: ").append(toIndentedString($course)).append("\n");
    sb.append("    $org: ").append(toIndentedString($org)).append("\n");
    sb.append("    $teachers: ").append(toIndentedString($teachers)).append("\n");
    sb.append("    $students: ").append(toIndentedString($students)).append("\n");
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
