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
import kimono.api.v2.interopdata.model.ErrorType;

/**
 * TaskAck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.757-06:00[America/Denver]")
public class TaskAck {
  /**
   * Task processing status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("success"),
    
    ERROR("error"),
    
    RETRY("retry"),
    
    REAUTHENTICATE("reauthenticate");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private ErrorType error = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private java.util.Map<String, String> params = null;

  public TaskAck status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Task processing status
   * @return status
  **/
  @ApiModelProperty(value = "Task processing status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskAck message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Optional message to record and display in Kimono.
   * @return message
  **/
  @ApiModelProperty(value = "Optional message to record and display in Kimono.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskAck error(ErrorType error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public ErrorType getError() {
    return error;
  }

  public void setError(ErrorType error) {
    this.error = error;
  }

  public TaskAck params(java.util.Map<String, String> params) {
    this.params = params;
    return this;
  }

  public TaskAck putParamsItem(String key, String paramsItem) {
    if (this.params == null) {
      this.params = new java.util.HashMap<>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Optional key/value pairs to record in Kimono. Some Task types prescribe parameters be returned when a Task is acknowledged.
   * @return params
  **/
  @ApiModelProperty(value = "Optional key/value pairs to record in Kimono. Some Task types prescribe parameters be returned when a Task is acknowledged.")
  public java.util.Map<String, String> getParams() {
    return params;
  }

  public void setParams(java.util.Map<String, String> params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskAck taskAck = (TaskAck) o;
    return Objects.equals(this.status, taskAck.status) &&
        Objects.equals(this.message, taskAck.message) &&
        Objects.equals(this.error, taskAck.error) &&
        Objects.equals(this.params, taskAck.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, error, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskAck {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

