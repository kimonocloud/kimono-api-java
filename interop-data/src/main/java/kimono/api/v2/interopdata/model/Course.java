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
import kimono.api.v2.interopdata.model.SysType;

/**
 * Course
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-04T14:46:16.451-06:00[America/Denver]")
public class Course extends ObjectType {
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

  public static final String SERIALIZED_NAME_$_ORGS = "$orgs";
  @SerializedName(SERIALIZED_NAME_$_ORGS)
  private java.util.List<OrgSysType> $orgs = null;

  public static final String SERIALIZED_NAME_$_SECTIONS = "$sections";
  @SerializedName(SERIALIZED_NAME_$_SECTIONS)
  private java.util.List<SysType> $sections = null;

  public Course $sys(SysType $sys) {
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
   * Get $orgs
   * @return $orgs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<OrgSysType> get$Orgs() {
    return $orgs;
  }

   /**
   * Get $sections
   * @return $sections
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SysType> get$Sections() {
    return $sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.$sys, course.$sys) &&
        Objects.equals(this.localId, course.localId) &&
        Objects.equals(this.title, course.title) &&
        Objects.equals(this.description, course.description) &&
        Objects.equals(this.$orgs, course.$orgs) &&
        Objects.equals(this.$sections, course.$sections) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys, localId, title, description, $orgs, $sections, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    $orgs: ").append(toIndentedString($orgs)).append("\n");
    sb.append("    $sections: ").append(toIndentedString($sections)).append("\n");
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

