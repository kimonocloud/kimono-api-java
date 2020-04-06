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
 * Summary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-06T14:46:48.453-06:00[America/Denver]")
public class Summary {
  public static final String SERIALIZED_NAME_$_SECTION = "$section";
  @SerializedName(SERIALIZED_NAME_$_SECTION)
  private GradesRefType $section = null;

  public static final String SERIALIZED_NAME_$_PERSON = "$person";
  @SerializedName(SERIALIZED_NAME_$_PERSON)
  private GradesRefType $person = null;

  public static final String SERIALIZED_NAME_$_GRADER = "$grader";
  @SerializedName(SERIALIZED_NAME_$_GRADER)
  private GradesRefType $grader = null;

  /**
   * Gets or Sets summaryType
   */
  @JsonAdapter(SummaryTypeEnum.Adapter.class)
  public enum SummaryTypeEnum {
    MIDTERM("midterm"),
    
    FINAL("final");

    private String value;

    SummaryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SummaryTypeEnum fromValue(String text) {
      for (SummaryTypeEnum b : SummaryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SummaryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SummaryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SummaryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SummaryTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SUMMARY_TYPE = "summary_type";
  @SerializedName(SERIALIZED_NAME_SUMMARY_TYPE)
  private SummaryTypeEnum summaryType;

  /**
   * Gets or Sets scoreType
   */
  @JsonAdapter(ScoreTypeEnum.Adapter.class)
  public enum ScoreTypeEnum {
    RAW("raw"),
    
    PERCENTAGE("percentage");

    private String value;

    ScoreTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScoreTypeEnum fromValue(String text) {
      for (ScoreTypeEnum b : ScoreTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ScoreTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScoreTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScoreTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScoreTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SCORE_TYPE = "score_type";
  @SerializedName(SERIALIZED_NAME_SCORE_TYPE)
  private ScoreTypeEnum scoreType;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private BigDecimal score;

  public static final String SERIALIZED_NAME_GRADE = "grade";
  @SerializedName(SERIALIZED_NAME_GRADE)
  private String grade;

  public static final String SERIALIZED_NAME_LAST_ACTIVITY = "last_activity";
  @SerializedName(SERIALIZED_NAME_LAST_ACTIVITY)
  private OffsetDateTime lastActivity;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private java.util.List<String> comments = null;

  public static final String SERIALIZED_NAME_$_EXT = "$ext";
  @SerializedName(SERIALIZED_NAME_$_EXT)
  private java.util.Map<String, String> $ext = null;

  public Summary $section(GradesRefType $section) {
    this.$section = $section;
    return this;
  }

   /**
   * Get $section
   * @return $section
  **/
  @ApiModelProperty(value = "")
  public GradesRefType get$Section() {
    return $section;
  }

  public void set$Section(GradesRefType $section) {
    this.$section = $section;
  }

  public Summary $person(GradesRefType $person) {
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

  public Summary $grader(GradesRefType $grader) {
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

  public Summary summaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
    return this;
  }

   /**
   * Get summaryType
   * @return summaryType
  **/
  @ApiModelProperty(value = "")
  public SummaryTypeEnum getSummaryType() {
    return summaryType;
  }

  public void setSummaryType(SummaryTypeEnum summaryType) {
    this.summaryType = summaryType;
  }

  public Summary scoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
    return this;
  }

   /**
   * Get scoreType
   * @return scoreType
  **/
  @ApiModelProperty(value = "")
  public ScoreTypeEnum getScoreType() {
    return scoreType;
  }

  public void setScoreType(ScoreTypeEnum scoreType) {
    this.scoreType = scoreType;
  }

  public Summary score(BigDecimal score) {
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

  public Summary grade(String grade) {
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

  public Summary lastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

   /**
   * Get lastActivity
   * @return lastActivity
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(OffsetDateTime lastActivity) {
    this.lastActivity = lastActivity;
  }

  public Summary comments(java.util.List<String> comments) {
    this.comments = comments;
    return this;
  }

  public Summary addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new java.util.ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getComments() {
    return comments;
  }

  public void setComments(java.util.List<String> comments) {
    this.comments = comments;
  }

  public Summary $ext(java.util.Map<String, String> $ext) {
    this.$ext = $ext;
    return this;
  }

  public Summary put$ExtItem(String key, String $extItem) {
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
    Summary summary = (Summary) o;
    return Objects.equals(this.$section, summary.$section) &&
        Objects.equals(this.$person, summary.$person) &&
        Objects.equals(this.$grader, summary.$grader) &&
        Objects.equals(this.summaryType, summary.summaryType) &&
        Objects.equals(this.scoreType, summary.scoreType) &&
        Objects.equals(this.score, summary.score) &&
        Objects.equals(this.grade, summary.grade) &&
        Objects.equals(this.lastActivity, summary.lastActivity) &&
        Objects.equals(this.comments, summary.comments) &&
        Objects.equals(this.$ext, summary.$ext);
  }

  @Override
  public int hashCode() {
    return Objects.hash($section, $person, $grader, summaryType, scoreType, score, grade, lastActivity, comments, $ext);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Summary {\n");
    
    sb.append("    $section: ").append(toIndentedString($section)).append("\n");
    sb.append("    $person: ").append(toIndentedString($person)).append("\n");
    sb.append("    $grader: ").append(toIndentedString($grader)).append("\n");
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
    sb.append("    scoreType: ").append(toIndentedString(scoreType)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

