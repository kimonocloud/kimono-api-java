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
 * EnrollmentsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-09T11:13:46.150-06:00[America/Denver]")
public class EnrollmentsResponse {
  public static final String SERIALIZED_NAME_ENROLLMENTS = "enrollments";
  @SerializedName(SERIALIZED_NAME_ENROLLMENTS)
  private java.util.List<Enrollment> enrollments = null;

  public EnrollmentsResponse enrollments(java.util.List<Enrollment> enrollments) {
    this.enrollments = enrollments;
    return this;
  }

  public EnrollmentsResponse addEnrollmentsItem(Enrollment enrollmentsItem) {
    if (this.enrollments == null) {
      this.enrollments = new java.util.ArrayList<>();
    }
    this.enrollments.add(enrollmentsItem);
    return this;
  }

   /**
   * Get enrollments
   * @return enrollments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Enrollment> getEnrollments() {
    return enrollments;
  }

  public void setEnrollments(java.util.List<Enrollment> enrollments) {
    this.enrollments = enrollments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentsResponse enrollmentsResponse = (EnrollmentsResponse) o;
    return Objects.equals(this.enrollments, enrollmentsResponse.enrollments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentsResponse {\n");
    
    sb.append("    enrollments: ").append(toIndentedString(enrollments)).append("\n");
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

