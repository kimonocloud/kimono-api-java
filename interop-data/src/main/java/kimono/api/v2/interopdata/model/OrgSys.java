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
import kimono.api.v2.interopdata.model.OrgRefType;

/**
 * OrgSys
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class OrgSys {
  public static final String SERIALIZED_NAME_$_SYS = "$sys";
  @SerializedName(SERIALIZED_NAME_$_SYS)
  private OrgRefType $sys = null;

  public OrgSys $sys(OrgRefType $sys) {
    this.$sys = $sys;
    return this;
  }

   /**
   * Get $sys
   * @return $sys
  **/
  @ApiModelProperty(value = "")
  public OrgRefType get$Sys() {
    return $sys;
  }

  public void set$Sys(OrgRefType $sys) {
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
    OrgSys orgSys = (OrgSys) o;
    return Objects.equals(this.$sys, orgSys.$sys);
  }

  @Override
  public int hashCode() {
    return Objects.hash($sys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgSys {\n");
    
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

