/*
 * SIF Cloud API
 * SIF Cloud APIs provide access to SIF Cloud provisioning resources.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.sifcloud.model;

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
 * ErrorType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-10-09T14:17:25.887-06:00[America/Denver]")
public class ErrorType {
  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_EXT_MESSAGE = "ext_message";
  @SerializedName(SERIALIZED_NAME_EXT_MESSAGE)
  private String extMessage;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public ErrorType status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Transport-layer status code
   * @return status
  **/
  @ApiModelProperty(value = "Transport-layer status code")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Application-layer error code
   * @return code
  **/
  @ApiModelProperty(value = "Application-layer error code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorType message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @ApiModelProperty(value = "Error message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorType extMessage(String extMessage) {
    this.extMessage = extMessage;
    return this;
  }

   /**
   * Extended error message
   * @return extMessage
  **/
  @ApiModelProperty(value = "Extended error message")
  public String getExtMessage() {
    return extMessage;
  }

  public void setExtMessage(String extMessage) {
    this.extMessage = extMessage;
  }

  public ErrorType details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Details that may assist in diagnosing this error
   * @return details
  **/
  @ApiModelProperty(value = "Details that may assist in diagnosing this error")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorType errorType = (ErrorType) o;
    return Objects.equals(this.status, errorType.status) &&
        Objects.equals(this.code, errorType.code) &&
        Objects.equals(this.message, errorType.message) &&
        Objects.equals(this.extMessage, errorType.extMessage) &&
        Objects.equals(this.details, errorType.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, code, message, extMessage, details);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorType {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    extMessage: ").append(toIndentedString(extMessage)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

