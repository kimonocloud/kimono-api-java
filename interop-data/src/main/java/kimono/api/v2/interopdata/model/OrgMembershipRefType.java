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
import kimono.api.v2.interopdata.model.MembershipRefType;
import kimono.api.v2.interopdata.model.RefType;

/**
 * OrgMembershipRefType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class OrgMembershipRefType extends MembershipRefType {
  public static final String SERIALIZED_NAME_ORG_TYPE = "org_type";
  @SerializedName(SERIALIZED_NAME_ORG_TYPE)
  private String orgType;

  public OrgMembershipRefType orgType(String orgType) {
    this.orgType = orgType;
    return this;
  }

   /**
   * Get orgType
   * @return orgType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrgType() {
    return orgType;
  }

  public void setOrgType(String orgType) {
    this.orgType = orgType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgMembershipRefType orgMembershipRefType = (OrgMembershipRefType) o;
    return Objects.equals(this.orgType, orgMembershipRefType.orgType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgType, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgMembershipRefType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    orgType: ").append(toIndentedString(orgType)).append("\n");
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

