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
import kimono.api.v2.interopdata.model.RefType;

/**
 * RefSys
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class RefSys {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private RefType $sys = null;

  public RefSys $sys(RefType $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public RefType get$Sys() {
    return $sys;
  }

  public void set$Sys(RefType $sys) {
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
    RefSys refSys = (RefSys) o;
    return Objects.equals(this.$sys, refSys.$sys);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefSys {\n");
    
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

