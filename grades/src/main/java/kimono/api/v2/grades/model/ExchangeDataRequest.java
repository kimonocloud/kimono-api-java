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
import kimono.api.v2.grades.model.Assignment;
import kimono.api.v2.grades.model.Summary;

/**
 * ExchangeDataRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T14:18:38.018-06:00[America/Denver]")
public class ExchangeDataRequest {
  public static final String SERIALIZED_NAME_ASSIGNMENTS = "assignments";
  @SerializedName(SERIALIZED_NAME_ASSIGNMENTS)
  private java.util.List<Assignment> assignments = null;

  public static final String SERIALIZED_NAME_SUMMARIES = "summaries";
  @SerializedName(SERIALIZED_NAME_SUMMARIES)
  private java.util.List<Summary> summaries = null;

  public static final String SERIALIZED_NAME_FINAL = "final";
  @SerializedName(SERIALIZED_NAME_FINAL)
  private Boolean _final;

  public ExchangeDataRequest assignments(java.util.List<Assignment> assignments) {
    this.assignments = assignments;
    return this;
  }

  public ExchangeDataRequest addAssignmentsItem(Assignment assignmentsItem) {
    if (this.assignments == null) {
      this.assignments = new java.util.ArrayList<>();
    }
    this.assignments.add(assignmentsItem);
    return this;
  }

   /**
   * Get assignments
   * @return assignments
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Assignment> getAssignments() {
    return assignments;
  }

  public void setAssignments(java.util.List<Assignment> assignments) {
    this.assignments = assignments;
  }

  public ExchangeDataRequest summaries(java.util.List<Summary> summaries) {
    this.summaries = summaries;
    return this;
  }

  public ExchangeDataRequest addSummariesItem(Summary summariesItem) {
    if (this.summaries == null) {
      this.summaries = new java.util.ArrayList<>();
    }
    this.summaries.add(summariesItem);
    return this;
  }

   /**
   * Get summaries
   * @return summaries
  **/
  @ApiModelProperty(value = "")
  public java.util.List<Summary> getSummaries() {
    return summaries;
  }

  public void setSummaries(java.util.List<Summary> summaries) {
    this.summaries = summaries;
  }

  public ExchangeDataRequest _final(Boolean _final) {
    this._final = _final;
    return this;
  }

   /**
   * Get _final
   * @return _final
  **/
  @ApiModelProperty(value = "")
  public Boolean getFinal() {
    return _final;
  }

  public void setFinal(Boolean _final) {
    this._final = _final;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExchangeDataRequest exchangeDataRequest = (ExchangeDataRequest) o;
    return Objects.equals(this.assignments, exchangeDataRequest.assignments) &&
        Objects.equals(this.summaries, exchangeDataRequest.summaries) &&
        Objects.equals(this._final, exchangeDataRequest._final);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignments, summaries, _final);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExchangeDataRequest {\n");
    
    sb.append("    assignments: ").append(toIndentedString(assignments)).append("\n");
    sb.append("    summaries: ").append(toIndentedString(summaries)).append("\n");
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
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

