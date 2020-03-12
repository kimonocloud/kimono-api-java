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
import java.time.OffsetDateTime;
import kimono.api.v2.grades.model.GradesRefType;

/**
 * ExchangeQueryConditions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-12T13:22:44.738-06:00[America/Denver]")
public class ExchangeQueryConditions {
  /**
   * Gets or Sets scope
   */
  @JsonAdapter(ScopeEnum.Adapter.class)
  public enum ScopeEnum {
    COURSE("course"),
    
    SECTION("section");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ScopeEnum scope;

  /**
   * Gets or Sets scopeBy
   */
  @JsonAdapter(ScopeByEnum.Adapter.class)
  public enum ScopeByEnum {
    ID("id"),
    
    ALL("all");

    private String value;

    ScopeByEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopeByEnum fromValue(String text) {
      for (ScopeByEnum b : ScopeByEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<ScopeByEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopeByEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopeByEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ScopeByEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SCOPE_BY = "scope_by";
  @SerializedName(SERIALIZED_NAME_SCOPE_BY)
  private ScopeByEnum scopeBy;

  public static final String SERIALIZED_NAME_SCOPE_ID = "scope_id";
  @SerializedName(SERIALIZED_NAME_SCOPE_ID)
  private GradesRefType scopeId = null;

  public static final String SERIALIZED_NAME_GRADED_AFTER = "graded_after";
  @SerializedName(SERIALIZED_NAME_GRADED_AFTER)
  private OffsetDateTime gradedAfter;

  /**
   * Gets or Sets summaryType
   */
  @JsonAdapter(SummaryTypeEnum.Adapter.class)
  public enum SummaryTypeEnum {
    FINAL("final"),
    
    MIDTERM("midterm");

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

  public ExchangeQueryConditions scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @ApiModelProperty(value = "")
  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public ExchangeQueryConditions scopeBy(ScopeByEnum scopeBy) {
    this.scopeBy = scopeBy;
    return this;
  }

   /**
   * Get scopeBy
   * @return scopeBy
  **/
  @ApiModelProperty(value = "")
  public ScopeByEnum getScopeBy() {
    return scopeBy;
  }

  public void setScopeBy(ScopeByEnum scopeBy) {
    this.scopeBy = scopeBy;
  }

  public ExchangeQueryConditions scopeId(GradesRefType scopeId) {
    this.scopeId = scopeId;
    return this;
  }

   /**
   * Get scopeId
   * @return scopeId
  **/
  @ApiModelProperty(value = "")
  public GradesRefType getScopeId() {
    return scopeId;
  }

  public void setScopeId(GradesRefType scopeId) {
    this.scopeId = scopeId;
  }

  public ExchangeQueryConditions gradedAfter(OffsetDateTime gradedAfter) {
    this.gradedAfter = gradedAfter;
    return this;
  }

   /**
   * Get gradedAfter
   * @return gradedAfter
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getGradedAfter() {
    return gradedAfter;
  }

  public void setGradedAfter(OffsetDateTime gradedAfter) {
    this.gradedAfter = gradedAfter;
  }

  public ExchangeQueryConditions summaryType(SummaryTypeEnum summaryType) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeQueryConditions exchangeQueryConditions = (ExchangeQueryConditions) o;
    return Objects.equals(this.scope, exchangeQueryConditions.scope) &&
        Objects.equals(this.scopeBy, exchangeQueryConditions.scopeBy) &&
        Objects.equals(this.scopeId, exchangeQueryConditions.scopeId) &&
        Objects.equals(this.gradedAfter, exchangeQueryConditions.gradedAfter) &&
        Objects.equals(this.summaryType, exchangeQueryConditions.summaryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, scopeBy, scopeId, gradedAfter, summaryType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeQueryConditions {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeBy: ").append(toIndentedString(scopeBy)).append("\n");
    sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
    sb.append("    gradedAfter: ").append(toIndentedString(gradedAfter)).append("\n");
    sb.append("    summaryType: ").append(toIndentedString(summaryType)).append("\n");
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
