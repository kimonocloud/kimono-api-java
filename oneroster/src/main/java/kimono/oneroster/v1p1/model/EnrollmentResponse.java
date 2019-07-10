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
import kimono.oneroster.v1p1.model.Enrollment;

/**
 * EnrollmentResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-10T00:08:41.832-06:00[America/Denver]")
public class EnrollmentResponse {
  public static final String SERIALIZED_NAME_ENROLLMENT = "enrollment";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT)
  private Enrollment enrollment = null;

  public EnrollmentResponse enrollment(Enrollment enrollment) {
    this.enrollment = enrollment;
    return this;
  }

   /**
   * Get enrollment
   * @return enrollment
  **/
  @ApiModelProperty(value = "")
  public Enrollment getEnrollment() {
    return enrollment;
  }

  public void setEnrollment(Enrollment enrollment) {
    this.enrollment = enrollment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentResponse enrollmentResponse = (EnrollmentResponse) o;
    return Objects.equals(this.enrollment, enrollmentResponse.enrollment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentResponse {\n");
    
    sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
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

