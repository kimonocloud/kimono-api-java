/*
 * Grades Exchange API
 * Use the Grades Exchange APIs to implement a Grades Producer or Grades Consumer client application and to manage Exchanges between producers and consumers.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.grades.model;

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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import kimono.api.v2.grades.model.GradesRefType;

/**
 * AssignmentScore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-12T13:22:44.738-06:00[America/Denver]")
public class AssignmentScore {
  public static final String SERIALIZED_NAME_$_PERSON = "$person";
  @SerializedName(SERIALIZED_NAME_$_PERSON)
  private GradesRefType $person = null;

  public static final String SERIALIZED_NAME_$_GRADER = "$grader";
  @SerializedName(SERIALIZED_NAME_$_GRADER)
  private GradesRefType $grader = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_LATE = "late";
  @SerializedName(SERIALIZED_NAME_LATE)
  private Boolean late;

  public static final String SERIALIZED_NAME_EXCUSED = "excused";
  @SerializedName(SERIALIZED_NAME_EXCUSED)
  private Boolean excused;

  public static final String SERIALIZED_NAME_SUBMITTED_AT = "submitted_at";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_AT)
  private OffsetDateTime submittedAt;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl;

  public static final String SERIALIZED_NAME_$_EXT = "$ext";
  @SerializedName(SERIALIZED_NAME_$_EXT)
  private java.util.Map<String, String> $ext = null;

  public AssignmentScore $person(GradesRefType $person) {
    this.$person = $person;
    return this;
  }

   /**
   * Get $person
   * @return $person
  **/
  @ApiModelProperty(value = "")
  public GradesRefType get$Person() {
    return $person;
  }

  public void set$Person(GradesRefType $person) {
    this.$person = $person;
  }

  public AssignmentScore $grader(GradesRefType $grader) {
    this.$grader = $grader;
    return this;
  }

   /**
   * Get $grader
   * @return $grader
  **/
  @ApiModelProperty(value = "")
  public GradesRefType get$Grader() {
    return $grader;
  }

  public void set$Grader(GradesRefType $grader) {
    this.$grader = $grader;
  }

  public AssignmentScore score(BigDecimal score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public AssignmentScore grade(String grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public AssignmentScore late(Boolean late) {
    this.late = late;
    return this;
  }

   /**
   * Get late
   * @return late
  **/
  @ApiModelProperty(value = "")
  public Boolean getLate() {
    return late;
  }

  public void setLate(Boolean late) {
    this.late = late;
  }

  public AssignmentScore excused(Boolean excused) {
    this.excused = excused;
    return this;
  }

   /**
   * Get excused
   * @return excused
  **/
  @ApiModelProperty(value = "")
  public Boolean getExcused() {
    return excused;
  }

  public void setExcused(Boolean excused) {
    this.excused = excused;
  }

  public AssignmentScore submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public AssignmentScore previewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Get previewUrl
   * @return previewUrl
  **/
  @ApiModelProperty(value = "")
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  public AssignmentScore $ext(java.util.Map<String, String> $ext) {
    this.$ext = $ext;
    return this;
  }

  public AssignmentScore put$ExtItem(String key, String $extItem) {
    if (this.$ext == null) {
      this.$ext = new java.util.HashMap<>();
    }
    this.$ext.put(key, $extItem);
    return this;
  }

   /**
   * Get $ext
   * @return $ext
  **/
  @ApiModelProperty(value = "")
  public java.util.Map<String, String> get$Ext() {
    return $ext;
  }

  public void set$Ext(java.util.Map<String, String> $ext) {
    this.$ext = $ext;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentScore assignmentScore = (AssignmentScore) o;
    return Objects.equals(this.$person, assignmentScore.$person) &&
        Objects.equals(this.$grader, assignmentScore.$grader) &&
        Objects.equals(this.score, assignmentScore.score) &&
        Objects.equals(this.grade, assignmentScore.grade) &&
        Objects.equals(this.late, assignmentScore.late) &&
        Objects.equals(this.excused, assignmentScore.excused) &&
        Objects.equals(this.submittedAt, assignmentScore.submittedAt) &&
        Objects.equals(this.previewUrl, assignmentScore.previewUrl) &&
        Objects.equals(this.$ext, assignmentScore.$ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash($person, $grader, score, grade, late, excused, submittedAt, previewUrl, $ext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentScore {\n");
    
    sb.append("    $person: ").append(toIndentedString($person)).append("\n");
    sb.append("    $grader: ").append(toIndentedString($grader)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    late: ").append(toIndentedString(late)).append("\n");
    sb.append("    excused: ").append(toIndentedString(excused)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    $ext: ").append(toIndentedString($ext)).append("\n");
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
