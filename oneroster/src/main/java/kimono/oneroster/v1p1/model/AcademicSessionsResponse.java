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
import kimono.oneroster.v1p1.model.AcademicSession;

/**
 * AcademicSessionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class AcademicSessionsResponse {
  public static final String SERIALIZED_NAME_ACADEMIC_SESSIONS = "academicSessions";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SESSIONS)
  private java.util.List<AcademicSession> academicSessions = null;

  public AcademicSessionsResponse academicSessions(java.util.List<AcademicSession> academicSessions) {
    this.academicSessions = academicSessions;
    return this;
  }

  public AcademicSessionsResponse addAcademicSessionsItem(AcademicSession academicSessionsItem) {
    if (this.academicSessions == null) {
      this.academicSessions = new java.util.ArrayList<>();
    }
    this.academicSessions.add(academicSessionsItem);
    return this;
  }

   /**
   * Get academicSessions
   * @return academicSessions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<AcademicSession> getAcademicSessions() {
    return academicSessions;
  }

  public void setAcademicSessions(java.util.List<AcademicSession> academicSessions) {
    this.academicSessions = academicSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicSessionsResponse academicSessionsResponse = (AcademicSessionsResponse) o;
    return Objects.equals(this.academicSessions, academicSessionsResponse.academicSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicSessionsResponse {\n");
    
    sb.append("    academicSessions: ").append(toIndentedString(academicSessions)).append("\n");
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

