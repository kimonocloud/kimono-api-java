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
import java.time.OffsetDateTime;
import kimono.api.v2.interopdata.model.BaseTenantResourceType;
import kimono.api.v2.interopdata.model.IngestionState;
import kimono.api.v2.interopdata.model.IngestionType;

/**
 * Ingestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-09-04T14:46:16.451-06:00[America/Denver]")
public class Ingestion extends BaseTenantResourceType {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenant_id";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private java.util.UUID tenantId;

  public static final String SERIALIZED_NAME_SESSION_TOKEN = "session_token";
  @SerializedName(SERIALIZED_NAME_SESSION_TOKEN)
  private String sessionToken;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private IngestionType type = null;

  public static final String SERIALIZED_NAME_TOPICS = "topics";
  @SerializedName(SERIALIZED_NAME_TOPICS)
  private java.util.List<String> topics = null;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private IngestionState state = null;

  public Ingestion tenantId(java.util.UUID tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(java.util.UUID tenantId) {
    this.tenantId = tenantId;
  }

  public Ingestion sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

   /**
   * Get sessionToken
   * @return sessionToken
  **/
  @ApiModelProperty(value = "")
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  public Ingestion type(IngestionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public IngestionType getType() {
    return type;
  }

  public void setType(IngestionType type) {
    this.type = type;
  }

  public Ingestion topics(java.util.List<String> topics) {
    this.topics = topics;
    return this;
  }

  public Ingestion addTopicsItem(String topicsItem) {
    if (this.topics == null) {
      this.topics = new java.util.ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

   /**
   * Get topics
   * @return topics
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getTopics() {
    return topics;
  }

  public void setTopics(java.util.List<String> topics) {
    this.topics = topics;
  }

  public Ingestion state(IngestionState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public IngestionState getState() {
    return state;
  }

  public void setState(IngestionState state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ingestion ingestion = (Ingestion) o;
    return Objects.equals(this.tenantId, ingestion.tenantId) &&
        Objects.equals(this.sessionToken, ingestion.sessionToken) &&
        Objects.equals(this.type, ingestion.type) &&
        Objects.equals(this.topics, ingestion.topics) &&
        Objects.equals(this.state, ingestion.state) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, sessionToken, type, topics, state, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ingestion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

