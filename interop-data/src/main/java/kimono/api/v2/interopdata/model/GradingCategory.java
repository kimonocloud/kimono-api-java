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
import kimono.api.v2.interopdata.model.OrgMembershipSys;
import kimono.api.v2.interopdata.model.SectionSys;
import kimono.api.v2.interopdata.model.SysType;
import kimono.api.v2.interopdata.model.TermSys;

/**
 * GradingCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class GradingCategory extends ObjectType {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private SysType $sys = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_$_TERM = "$term";
  @SerializedName(SERIALIZED_NAME_$_TERM)
  private TermSys $term = null;

  public static final String SERIALIZED_NAME_$_SECTION = "$section";
  @SerializedName(SERIALIZED_NAME_$_SECTION)
  private SectionSys $section = null;

  public static final String SERIALIZED_NAME_$_SCHOOLS = "$schools";
  @SerializedName(SERIALIZED_NAME_$_SCHOOLS)
  private OrgMembershipSys $schools = null;

  public GradingCategory $sys(SysType $sys) {
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
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public GradingCategory $term(TermSys $term) {
    this.$term = $term;
    return this;
  }

   /**
   * Get $term
   * @return $term
  **/
  @ApiModelProperty(value = "")
  public TermSys get$Term() {
    return $term;
  }

  public void set$Term(TermSys $term) {
    this.$term = $term;
  }

  public GradingCategory $section(SectionSys $section) {
    this.$section = $section;
    return this;
  }

   /**
   * Get $section
   * @return $section
  **/
  @ApiModelProperty(value = "")
  public SectionSys get$Section() {
    return $section;
  }

  public void set$Section(SectionSys $section) {
    this.$section = $section;
  }

  public GradingCategory $schools(OrgMembershipSys $schools) {
    this.$schools = $schools;
    return this;
  }

   /**
   * Get $schools
   * @return $schools
  **/
  @ApiModelProperty(value = "")
  public OrgMembershipSys get$Schools() {
    return $schools;
  }

  public void set$Schools(OrgMembershipSys $schools) {
    this.$schools = $schools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradingCategory gradingCategory = (GradingCategory) o;
    return Objects.equals(this.$sys, gradingCategory.$sys) &&
        Objects.equals(this.name, gradingCategory.name) &&
        Objects.equals(this.$term, gradingCategory.$term) &&
        Objects.equals(this.$section, gradingCategory.$section) &&
        Objects.equals(this.$schools, gradingCategory.$schools) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys, name, $term, $section, $schools, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradingCategory {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    $term: ").append(toIndentedString($term)).append("\n");
    sb.append("    $section: ").append(toIndentedString($section)).append("\n");
    sb.append("    $schools: ").append(toIndentedString($schools)).append("\n");
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

