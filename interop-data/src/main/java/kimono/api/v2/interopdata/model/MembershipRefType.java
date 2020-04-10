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
 * MembershipRefType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:37.587-06:00[America/Denver]")
public class MembershipRefType extends RefType {
  public static final String SERIALIZED_NAME_$_MEMBERSHIP = "$membership";
  @SerializedName(SERIALIZED_NAME_$_MEMBERSHIP)
  private RefType $membership = null;

  public MembershipRefType $membership(RefType $membership) {
    this.$membership = $membership;
    return this;
  }

   /**
   * Get $membership
   * @return $membership
  **/
  @ApiModelProperty(required = true, value = "")
  public RefType get$Membership() {
    return $membership;
  }

  public void set$Membership(RefType $membership) {
    this.$membership = $membership;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembershipRefType membershipRefType = (MembershipRefType) o;
    return Objects.equals(this.$membership, membershipRefType.$membership) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash($membership, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipRefType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    $membership: ").append(toIndentedString($membership)).append("\n");
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

