/*
 * Grades Exchange API
 * Use the Grades Exchange APIs to implement a Grades Producer or Grades Consumer client application and to manage Exchanges between producers and consumers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.grades.model;

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
import kimono.api.v2.grades.model.GradesRefTypeSys;

/**
 * GradesRefType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:28.234-06:00[America/Denver]")
public class GradesRefType {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private GradesRefTypeSys $sys = null;

  public GradesRefType $sys(GradesRefTypeSys $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public GradesRefTypeSys get$Sys() {
    return $sys;
  }

  public void set$Sys(GradesRefTypeSys $sys) {
    this.$sys = $sys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GradesRefType gradesRefType = (GradesRefType) o;
    return Objects.equals(this.$sys, gradesRefType.$sys);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradesRefType {\n");
    
    sb.append("    $sys: ").append(toIndentedString($sys)).append("\n");
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

