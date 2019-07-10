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
 * AcademicSessionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-09T16:37:33.132-06:00[America/Denver]")
public class AcademicSessionResponse {
  public static final String SERIALIZED_NAME_ACADEMIC_SESSION = "academicSession";
  @SerializedName(SERIALIZED_NAME_ACADEMIC_SESSION)
  private AcademicSession academicSession = null;

  public AcademicSessionResponse academicSession(AcademicSession academicSession) {
    this.academicSession = academicSession;
    return this;
  }

   /**
   * Get academicSession
   * @return academicSession
  **/
  @ApiModelProperty(value = "")
  public AcademicSession getAcademicSession() {
    return academicSession;
  }

  public void setAcademicSession(AcademicSession academicSession) {
    this.academicSession = academicSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcademicSessionResponse academicSessionResponse = (AcademicSessionResponse) o;
    return Objects.equals(this.academicSession, academicSessionResponse.academicSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(academicSession);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcademicSessionResponse {\n");
    
    sb.append("    academicSession: ").append(toIndentedString(academicSession)).append("\n");
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

