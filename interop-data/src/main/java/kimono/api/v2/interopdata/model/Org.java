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
import kimono.api.v2.interopdata.model.OrgSysType;
import kimono.api.v2.interopdata.model.PersonSysType;

/**
 * Org
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-29T19:12:27.329-06:00[America/Denver]")
public class Org extends ObjectType {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private OrgSysType $sys = null;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_$_PARENT = "$parent";
  @SerializedName(SERIALIZED_NAME_$_PARENT)
  private OrgSysType $parent = null;

  public static final String SERIALIZED_NAME_$_CHILDREN = "$children";
  @SerializedName(SERIALIZED_NAME_$_CHILDREN)
  private java.util.List<OrgSysType> $children = null;

  public static final String SERIALIZED_NAME_$_STUDENTS = "$students";
  @SerializedName(SERIALIZED_NAME_$_STUDENTS)
  private java.util.List<PersonSysType> $students = null;

  public static final String SERIALIZED_NAME_$_TEACHERS = "$teachers";
  @SerializedName(SERIALIZED_NAME_$_TEACHERS)
  private java.util.List<PersonSysType> $teachers = null;

  public Org $sys(OrgSysType $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public OrgSysType get$Sys() {
    return $sys;
  }

  public void set$Sys(OrgSysType $sys) {
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
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public Org $parent(OrgSysType $parent) {
    this.$parent = $parent;
    return this;
  }

   /**
   * Get $parent
   * @return $parent
  **/
  @ApiModelProperty(value = "")
  public OrgSysType get$Parent() {
    return $parent;
  }

  public void set$Parent(OrgSysType $parent) {
    this.$parent = $parent;
  }

   /**
   * Get $children
   * @return $children
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrgSysType> get$Children() {
    return $children;
  }

   /**
   * Get $students
   * @return $students
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PersonSysType> get$Students() {
    return $students;
  }

   /**
   * Get $teachers
   * @return $teachers
  **/
  @ApiModelProperty(value = "")
  public java.util.List<PersonSysType> get$Teachers() {
    return $teachers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Org org = (Org) o;
    return Objects.equals(this.$sys, org.$sys) &&
        Objects.equals(this.localId, org.localId) &&
        Objects.equals(this.name, org.name) &&
        Objects.equals(this.$parent, org.$parent) &&
        Objects.equals(this.$children, org.$children) &&
        Objects.equals(this.$students, org.$students) &&
        Objects.equals(this.$teachers, org.$teachers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys, localId, name, $parent, $children, $students, $teachers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Org {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    $parent: ").append(toIndentedString($parent)).append("\n");
    sb.append("    $children: ").append(toIndentedString($children)).append("\n");
    sb.append("    $students: ").append(toIndentedString($students)).append("\n");
    sb.append("    $teachers: ").append(toIndentedString($teachers)).append("\n");
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

