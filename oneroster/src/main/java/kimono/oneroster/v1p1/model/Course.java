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
import java.time.OffsetDateTime;
import kimono.oneroster.v1p1.model.Base;
import kimono.oneroster.v1p1.model.GUIDRef;

/**
 * Course
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-10T00:08:41.832-06:00[America/Denver]")
public class Course extends Base {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SCHOOL_YEAR = "schoolYear";
  @SerializedName(SERIALIZED_NAME_SCHOOL_YEAR)
  private GUIDRef schoolYear = null;

  public static final String SERIALIZED_NAME_COURSE_CODE = "courseCode";
  @SerializedName(SERIALIZED_NAME_COURSE_CODE)
  private String courseCode;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private java.util.List<String> grades = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private java.util.List<String> subjects = null;

  public static final String SERIALIZED_NAME_SUBJECT_CODES = "subjectCodes";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CODES)
  private java.util.List<String> subjectCodes = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private java.util.List<GUIDRef> resources = null;

  public Course title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Course schoolYear(GUIDRef schoolYear) {
    this.schoolYear = schoolYear;
    return this;
  }

   /**
   * Get schoolYear
   * @return schoolYear
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getSchoolYear() {
    return schoolYear;
  }

  public void setSchoolYear(GUIDRef schoolYear) {
    this.schoolYear = schoolYear;
  }

  public Course courseCode(String courseCode) {
    this.courseCode = courseCode;
    return this;
  }

   /**
   * Get courseCode
   * @return courseCode
  **/
  @ApiModelProperty(value = "")
  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public Course grades(java.util.List<String> grades) {
    this.grades = grades;
    return this;
  }

  public Course addGradesItem(String gradesItem) {
    if (this.grades == null) {
      this.grades = new java.util.ArrayList<>();
    }
    this.grades.add(gradesItem);
    return this;
  }

   /**
   * Get grades
   * @return grades
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getGrades() {
    return grades;
  }

  public void setGrades(java.util.List<String> grades) {
    this.grades = grades;
  }

  public Course subjects(java.util.List<String> subjects) {
    this.subjects = subjects;
    return this;
  }

  public Course addSubjectsItem(String subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new java.util.ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Get subjects
   * @return subjects
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSubjects() {
    return subjects;
  }

  public void setSubjects(java.util.List<String> subjects) {
    this.subjects = subjects;
  }

  public Course subjectCodes(java.util.List<String> subjectCodes) {
    this.subjectCodes = subjectCodes;
    return this;
  }

  public Course addSubjectCodesItem(String subjectCodesItem) {
    if (this.subjectCodes == null) {
      this.subjectCodes = new java.util.ArrayList<>();
    }
    this.subjectCodes.add(subjectCodesItem);
    return this;
  }

   /**
   * Get subjectCodes
   * @return subjectCodes
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSubjectCodes() {
    return subjectCodes;
  }

  public void setSubjectCodes(java.util.List<String> subjectCodes) {
    this.subjectCodes = subjectCodes;
  }

  public Course resources(java.util.List<GUIDRef> resources) {
    this.resources = resources;
    return this;
  }

  public Course addResourcesItem(GUIDRef resourcesItem) {
    if (this.resources == null) {
      this.resources = new java.util.ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GUIDRef> getResources() {
    return resources;
  }

  public void setResources(java.util.List<GUIDRef> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return Objects.equals(this.title, course.title) &&
        Objects.equals(this.schoolYear, course.schoolYear) &&
        Objects.equals(this.courseCode, course.courseCode) &&
        Objects.equals(this.grades, course.grades) &&
        Objects.equals(this.subjects, course.subjects) &&
        Objects.equals(this.subjectCodes, course.subjectCodes) &&
        Objects.equals(this.resources, course.resources) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, schoolYear, courseCode, grades, subjects, subjectCodes, resources, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Course {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    schoolYear: ").append(toIndentedString(schoolYear)).append("\n");
    sb.append("    courseCode: ").append(toIndentedString(courseCode)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    subjectCodes: ").append(toIndentedString(subjectCodes)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

