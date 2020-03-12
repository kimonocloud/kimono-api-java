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
import kimono.api.v2.grades.model.ExchangeQueryConditions;

/**
 * ExchangeQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-12T13:22:44.738-06:00[America/Denver]")
public class ExchangeQuery {
  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ASSIGNMENT_SCORES("assignment_scores"),
    
    SUMMARY("summary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private java.util.List<ExchangeQueryConditions> conditions = null;

  public ExchangeQuery type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ExchangeQuery conditions(java.util.List<ExchangeQueryConditions> conditions) {
    this.conditions = conditions;
    return this;
  }

  public ExchangeQuery addConditionsItem(ExchangeQueryConditions conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new java.util.ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ExchangeQueryConditions> getConditions() {
    return conditions;
  }

  public void setConditions(java.util.List<ExchangeQueryConditions> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeQuery exchangeQuery = (ExchangeQuery) o;
    return Objects.equals(this.type, exchangeQuery.type) &&
        Objects.equals(this.conditions, exchangeQuery.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, conditions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeQuery {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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
