/*
 * Interop Data API
 * Interop Data APIs provide access to the data objects and events from Interop Cloud repositories and Integration repositories
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interopdata.model;

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

/**
 * NameType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class NameType {
  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private String last;

  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private String first;

  public static final String SERIALIZED_NAME_MIDDLE = "middle";
  @SerializedName(SERIALIZED_NAME_MIDDLE)
  private String middle;

  public NameType last(String last) {
    this.last = last;
    return this;
  }

   /**
   * Get last
   * @return last
  **/
  @ApiModelProperty(value = "")
  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }

  public NameType first(String first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @ApiModelProperty(value = "")
  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public NameType middle(String middle) {
    this.middle = middle;
    return this;
  }

   /**
   * Get middle
   * @return middle
  **/
  @ApiModelProperty(value = "")
  public String getMiddle() {
    return middle;
  }

  public void setMiddle(String middle) {
    this.middle = middle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameType nameType = (NameType) o;
    return Objects.equals(this.last, nameType.last) &&
        Objects.equals(this.first, nameType.first) &&
        Objects.equals(this.middle, nameType.middle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(last, first, middle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameType {\n");
    
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    middle: ").append(toIndentedString(middle)).append("\n");
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

