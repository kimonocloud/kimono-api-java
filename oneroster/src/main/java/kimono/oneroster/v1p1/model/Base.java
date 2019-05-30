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

/**
 * Base
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-29T19:12:27.902-06:00[America/Denver]")
public class Base {
  public static final String SERIALIZED_NAME_SOURCED_ID = "sourcedId";
  @SerializedName(SERIALIZED_NAME_SOURCED_ID)
  private String sourcedId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_DATE_LAST_MODIFIED = "dateLastModified";
  @SerializedName(SERIALIZED_NAME_DATE_LAST_MODIFIED)
  private OffsetDateTime dateLastModified;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public Base sourcedId(String sourcedId) {
    this.sourcedId = sourcedId;
    return this;
  }

   /**
   * Get sourcedId
   * @return sourcedId
  **/
  @ApiModelProperty(value = "")
  public String getSourcedId() {
    return sourcedId;
  }

  public void setSourcedId(String sourcedId) {
    this.sourcedId = sourcedId;
  }

  public Base status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Base dateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
    return this;
  }

   /**
   * Get dateLastModified
   * @return dateLastModified
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDateLastModified() {
    return dateLastModified;
  }

  public void setDateLastModified(OffsetDateTime dateLastModified) {
    this.dateLastModified = dateLastModified;
  }

  public Base metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base base = (Base) o;
    return Objects.equals(this.sourcedId, base.sourcedId) &&
        Objects.equals(this.status, base.status) &&
        Objects.equals(this.dateLastModified, base.dateLastModified) &&
        Objects.equals(this.metadata, base.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourcedId, status, dateLastModified, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base {\n");
    
    sb.append("    sourcedId: ").append(toIndentedString(sourcedId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateLastModified: ").append(toIndentedString(dateLastModified)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

