/*
 * OneRoster 1.1
 * OneRoster 1.1. API
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.oneroster.v1p1.model;

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
import kimono.oneroster.v1p1.model.Org;

/**
 * OrgsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class OrgsResponse {
  public static final String SERIALIZED_NAME_ORGS = "orgs";
  @SerializedName(SERIALIZED_NAME_ORGS)
  private java.util.List<Org> orgs = null;

  public OrgsResponse orgs(java.util.List<Org> orgs) {
    this.orgs = orgs;
    return this;
  }

  public OrgsResponse addOrgsItem(Org orgsItem) {
    if (this.orgs == null) {
      this.orgs = new java.util.ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * Get orgs
   * @return orgs
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Org> getOrgs() {
    return orgs;
  }

  public void setOrgs(java.util.List<Org> orgs) {
    this.orgs = orgs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgsResponse orgsResponse = (OrgsResponse) o;
    return Objects.equals(this.orgs, orgsResponse.orgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgsResponse {\n");
    
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
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

