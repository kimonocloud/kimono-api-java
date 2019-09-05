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
import java.time.LocalDate;
import kimono.api.v2.interopdata.model.ObjectType;
import kimono.api.v2.interopdata.model.TermSysType;

/**
 * Term
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-04T14:46:16.451-06:00[America/Denver]")
public class Term extends ObjectType {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private TermSysType $sys = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_$_PARENT = "$parent";
  @SerializedName(SERIALIZED_NAME_$_PARENT)
  private TermSysType $parent = null;

  public static final String SERIALIZED_NAME_$_CHILDREN = "$children";
  @SerializedName(SERIALIZED_NAME_$_CHILDREN)
  private java.util.List<TermSysType> $children = null;

  public Term $sys(TermSysType $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public TermSysType get$Sys() {
    return $sys;
  }

  public void set$Sys(TermSysType $sys) {
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

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getStartDate() {
    return startDate;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getEndDate() {
    return endDate;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public Term $parent(TermSysType $parent) {
    this.$parent = $parent;
    return this;
  }

   /**
   * Get $parent
   * @return $parent
  **/
  @ApiModelProperty(value = "")
  public TermSysType get$Parent() {
    return $parent;
  }

  public void set$Parent(TermSysType $parent) {
    this.$parent = $parent;
  }

   /**
   * Get $children
   * @return $children
  **/
  @ApiModelProperty(value = "")
  public java.util.List<TermSysType> get$Children() {
    return $children;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Term term = (Term) o;
    return Objects.equals(this.$sys, term.$sys) &&
        Objects.equals(this.name, term.name) &&
        Objects.equals(this.description, term.description) &&
        Objects.equals(this.startDate, term.startDate) &&
        Objects.equals(this.endDate, term.endDate) &&
        Objects.equals(this.status, term.status) &&
        Objects.equals(this.$parent, term.$parent) &&
        Objects.equals(this.$children, term.$children) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys, name, description, startDate, endDate, status, $parent, $children, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Term {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    $parent: ").append(toIndentedString($parent)).append("\n");
    sb.append("    $children: ").append(toIndentedString($children)).append("\n");
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

