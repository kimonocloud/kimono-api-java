/*
 * Interop API
 * Interop APIs provide access to Kimono Interop Cloud resources and operations
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interop.model;

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
 * IntegrationStatusType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-10T10:16:27.262-06:00[America/Denver]")
public class IntegrationStatusType {
  public static final String SERIALIZED_NAME_OP_STATE = "op_state";
  @SerializedName(SERIALIZED_NAME_OP_STATE)
  private String opState;

  public static final String SERIALIZED_NAME_SETUP_STATE = "setup_state";
  @SerializedName(SERIALIZED_NAME_SETUP_STATE)
  private String setupState;

  public static final String SERIALIZED_NAME_LAST_SYNC_AT = "last_sync_at";
  @SerializedName(SERIALIZED_NAME_LAST_SYNC_AT)
  private OffsetDateTime lastSyncAt;

  public IntegrationStatusType opState(String opState) {
    this.opState = opState;
    return this;
  }

   /**
   * Get opState
   * @return opState
  **/
  @ApiModelProperty(value = "")
  public String getOpState() {
    return opState;
  }

  public void setOpState(String opState) {
    this.opState = opState;
  }

  public IntegrationStatusType setupState(String setupState) {
    this.setupState = setupState;
    return this;
  }

   /**
   * Get setupState
   * @return setupState
  **/
  @ApiModelProperty(value = "")
  public String getSetupState() {
    return setupState;
  }

  public void setSetupState(String setupState) {
    this.setupState = setupState;
  }

  public IntegrationStatusType lastSyncAt(OffsetDateTime lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
    return this;
  }

   /**
   * Get lastSyncAt
   * @return lastSyncAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastSyncAt() {
    return lastSyncAt;
  }

  public void setLastSyncAt(OffsetDateTime lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationStatusType integrationStatusType = (IntegrationStatusType) o;
    return Objects.equals(this.opState, integrationStatusType.opState) &&
        Objects.equals(this.setupState, integrationStatusType.setupState) &&
        Objects.equals(this.lastSyncAt, integrationStatusType.lastSyncAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opState, setupState, lastSyncAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationStatusType {\n");
    
    sb.append("    opState: ").append(toIndentedString(opState)).append("\n");
    sb.append("    setupState: ").append(toIndentedString(setupState)).append("\n");
    sb.append("    lastSyncAt: ").append(toIndentedString(lastSyncAt)).append("\n");
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

