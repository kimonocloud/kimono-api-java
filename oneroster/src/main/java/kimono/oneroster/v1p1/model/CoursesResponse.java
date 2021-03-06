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
import kimono.oneroster.v1p1.model.Course;

/**
 * CoursesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.309-06:00[America/Denver]")
public class CoursesResponse {
  public static final String SERIALIZED_NAME_COURSES = "courses";
  @SerializedName(SERIALIZED_NAME_COURSES)
  private java.util.List<Course> courses = null;

  public CoursesResponse courses(java.util.List<Course> courses) {
    this.courses = courses;
    return this;
  }

  public CoursesResponse addCoursesItem(Course coursesItem) {
    if (this.courses == null) {
      this.courses = new java.util.ArrayList<>();
    }
    this.courses.add(coursesItem);
    return this;
  }

   /**
   * Get courses
   * @return courses
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Course> getCourses() {
    return courses;
  }

  public void setCourses(java.util.List<Course> courses) {
    this.courses = courses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoursesResponse coursesResponse = (CoursesResponse) o;
    return Objects.equals(this.courses, coursesResponse.courses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoursesResponse {\n");
    
    sb.append("    courses: ").append(toIndentedString(courses)).append("\n");
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

