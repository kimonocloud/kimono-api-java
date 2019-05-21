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
 * ModelClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-20T19:48:48.622-06:00[America/Denver]")
public class ModelClass extends Base {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CLASS_CODE = "classCode";
  @SerializedName(SERIALIZED_NAME_CLASS_CODE)
  private String classCode;

  public static final String SERIALIZED_NAME_CLASS_TYPE = "classType";
  @SerializedName(SERIALIZED_NAME_CLASS_TYPE)
  private String classType;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_GRADES = "grades";
  @SerializedName(SERIALIZED_NAME_GRADES)
  private java.util.List<String> grades = null;

  public static final String SERIALIZED_NAME_SUBJECTS = "subjects";
  @SerializedName(SERIALIZED_NAME_SUBJECTS)
  private java.util.List<String> subjects = null;

  public static final String SERIALIZED_NAME_COURSE = "course";
  @SerializedName(SERIALIZED_NAME_COURSE)
  private GUIDRef course = null;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private GUIDRef school = null;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private java.util.List<GUIDRef> terms = null;

  public static final String SERIALIZED_NAME_SUBJECT_CODES = "subjectCodes";
  @SerializedName(SERIALIZED_NAME_SUBJECT_CODES)
  private java.util.List<String> subjectCodes = null;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private java.util.List<String> periods = null;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private java.util.List<GUIDRef> resources = null;

  public ModelClass title(String title) {
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

  public ModelClass classCode(String classCode) {
    this.classCode = classCode;
    return this;
  }

   /**
   * Get classCode
   * @return classCode
  **/
  @ApiModelProperty(value = "")
  public String getClassCode() {
    return classCode;
  }

  public void setClassCode(String classCode) {
    this.classCode = classCode;
  }

  public ModelClass classType(String classType) {
    this.classType = classType;
    return this;
  }

   /**
   * Get classType
   * @return classType
  **/
  @ApiModelProperty(value = "")
  public String getClassType() {
    return classType;
  }

  public void setClassType(String classType) {
    this.classType = classType;
  }

  public ModelClass location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ModelClass grades(java.util.List<String> grades) {
    this.grades = grades;
    return this;
  }

  public ModelClass addGradesItem(String gradesItem) {
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

  public ModelClass subjects(java.util.List<String> subjects) {
    this.subjects = subjects;
    return this;
  }

  public ModelClass addSubjectsItem(String subjectsItem) {
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

  public ModelClass course(GUIDRef course) {
    this.course = course;
    return this;
  }

   /**
   * Get course
   * @return course
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getCourse() {
    return course;
  }

  public void setCourse(GUIDRef course) {
    this.course = course;
  }

  public ModelClass school(GUIDRef school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public GUIDRef getSchool() {
    return school;
  }

  public void setSchool(GUIDRef school) {
    this.school = school;
  }

  public ModelClass terms(java.util.List<GUIDRef> terms) {
    this.terms = terms;
    return this;
  }

  public ModelClass addTermsItem(GUIDRef termsItem) {
    if (this.terms == null) {
      this.terms = new java.util.ArrayList<>();
    }
    this.terms.add(termsItem);
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GUIDRef> getTerms() {
    return terms;
  }

  public void setTerms(java.util.List<GUIDRef> terms) {
    this.terms = terms;
  }

  public ModelClass subjectCodes(java.util.List<String> subjectCodes) {
    this.subjectCodes = subjectCodes;
    return this;
  }

  public ModelClass addSubjectCodesItem(String subjectCodesItem) {
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

  public ModelClass periods(java.util.List<String> periods) {
    this.periods = periods;
    return this;
  }

  public ModelClass addPeriodsItem(String periodsItem) {
    if (this.periods == null) {
      this.periods = new java.util.ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Get periods
   * @return periods
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getPeriods() {
    return periods;
  }

  public void setPeriods(java.util.List<String> periods) {
    this.periods = periods;
  }

  public ModelClass resources(java.util.List<GUIDRef> resources) {
    this.resources = resources;
    return this;
  }

  public ModelClass addResourcesItem(GUIDRef resourcesItem) {
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
    ModelClass propertyClass = (ModelClass) o;
    return Objects.equals(this.title, propertyClass.title) &&
        Objects.equals(this.classCode, propertyClass.classCode) &&
        Objects.equals(this.classType, propertyClass.classType) &&
        Objects.equals(this.location, propertyClass.location) &&
        Objects.equals(this.grades, propertyClass.grades) &&
        Objects.equals(this.subjects, propertyClass.subjects) &&
        Objects.equals(this.course, propertyClass.course) &&
        Objects.equals(this.school, propertyClass.school) &&
        Objects.equals(this.terms, propertyClass.terms) &&
        Objects.equals(this.subjectCodes, propertyClass.subjectCodes) &&
        Objects.equals(this.periods, propertyClass.periods) &&
        Objects.equals(this.resources, propertyClass.resources) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, classCode, classType, location, grades, subjects, course, school, terms, subjectCodes, periods, resources, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    classCode: ").append(toIndentedString(classCode)).append("\n");
    sb.append("    classType: ").append(toIndentedString(classType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    grades: ").append(toIndentedString(grades)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    course: ").append(toIndentedString(course)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    subjectCodes: ").append(toIndentedString(subjectCodes)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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

