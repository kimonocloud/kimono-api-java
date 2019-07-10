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
import kimono.api.v2.interop.model.BaseAccountResourceType;
import kimono.api.v2.interop.model.ReleaseState;

/**
 * IntegrationVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-09T16:37:25.539-06:00[America/Denver]")
public class IntegrationVersion extends BaseAccountResourceType {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RELEASE_STATE = "release_state";
  @SerializedName(SERIALIZED_NAME_RELEASE_STATE)
  private ReleaseState releaseState = null;

  public IntegrationVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public IntegrationVersion title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public IntegrationVersion releaseState(ReleaseState releaseState) {
    this.releaseState = releaseState;
    return this;
  }

   /**
   * Get releaseState
   * @return releaseState
  **/
  @ApiModelProperty(value = "")
  public ReleaseState getReleaseState() {
    return releaseState;
  }

  public void setReleaseState(ReleaseState releaseState) {
    this.releaseState = releaseState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationVersion integrationVersion = (IntegrationVersion) o;
    return Objects.equals(this.version, integrationVersion.version) &&
        Objects.equals(this.title, integrationVersion.title) &&
        Objects.equals(this.releaseState, integrationVersion.releaseState) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, title, releaseState, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationVersion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    releaseState: ").append(toIndentedString(releaseState)).append("\n");
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

