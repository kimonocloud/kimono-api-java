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
import kimono.api.v2.interop.model.AccountRefType;
import kimono.api.v2.interop.model.AuthType;
import kimono.api.v2.interop.model.CloudRefType;
import kimono.api.v2.interop.model.IntegrationRefType;
import kimono.api.v2.interop.model.IntegrationStatusType;
import kimono.api.v2.interop.model.TenantInfoLicense;

/**
 * TenantInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-07-10T00:08:41.076-06:00[America/Denver]")
public class TenantInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private java.util.UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private AccountRefType account = null;

  public static final String SERIALIZED_NAME_CLOUD = "cloud";
  @SerializedName(SERIALIZED_NAME_CLOUD)
  private CloudRefType cloud = null;

  public static final String SERIALIZED_NAME_INTEGRATION = "integration";
  @SerializedName(SERIALIZED_NAME_INTEGRATION)
  private IntegrationRefType integration = null;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private TenantInfoLicense license = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private IntegrationStatusType status = null;

  public static final String SERIALIZED_NAME_SIS_STATUS = "sis_status";
  @SerializedName(SERIALIZED_NAME_SIS_STATUS)
  private IntegrationStatusType sisStatus = null;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private AuthType auth = null;

  public TenantInfo id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public java.util.UUID getId() {
    return id;
  }

  public void setId(java.util.UUID id) {
    this.id = id;
  }

  public TenantInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TenantInfo account(AccountRefType account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountRefType getAccount() {
    return account;
  }

  public void setAccount(AccountRefType account) {
    this.account = account;
  }

  public TenantInfo cloud(CloudRefType cloud) {
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @ApiModelProperty(value = "")
  public CloudRefType getCloud() {
    return cloud;
  }

  public void setCloud(CloudRefType cloud) {
    this.cloud = cloud;
  }

  public TenantInfo integration(IntegrationRefType integration) {
    this.integration = integration;
    return this;
  }

   /**
   * Get integration
   * @return integration
  **/
  @ApiModelProperty(value = "")
  public IntegrationRefType getIntegration() {
    return integration;
  }

  public void setIntegration(IntegrationRefType integration) {
    this.integration = integration;
  }

  public TenantInfo license(TenantInfoLicense license) {
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @ApiModelProperty(value = "")
  public TenantInfoLicense getLicense() {
    return license;
  }

  public void setLicense(TenantInfoLicense license) {
    this.license = license;
  }

  public TenantInfo status(IntegrationStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public IntegrationStatusType getStatus() {
    return status;
  }

  public void setStatus(IntegrationStatusType status) {
    this.status = status;
  }

  public TenantInfo sisStatus(IntegrationStatusType sisStatus) {
    this.sisStatus = sisStatus;
    return this;
  }

   /**
   * Get sisStatus
   * @return sisStatus
  **/
  @ApiModelProperty(value = "")
  public IntegrationStatusType getSisStatus() {
    return sisStatus;
  }

  public void setSisStatus(IntegrationStatusType sisStatus) {
    this.sisStatus = sisStatus;
  }

  public TenantInfo auth(AuthType auth) {
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(value = "")
  public AuthType getAuth() {
    return auth;
  }

  public void setAuth(AuthType auth) {
    this.auth = auth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantInfo tenantInfo = (TenantInfo) o;
    return Objects.equals(this.id, tenantInfo.id) &&
        Objects.equals(this.name, tenantInfo.name) &&
        Objects.equals(this.account, tenantInfo.account) &&
        Objects.equals(this.cloud, tenantInfo.cloud) &&
        Objects.equals(this.integration, tenantInfo.integration) &&
        Objects.equals(this.license, tenantInfo.license) &&
        Objects.equals(this.status, tenantInfo.status) &&
        Objects.equals(this.sisStatus, tenantInfo.sisStatus) &&
        Objects.equals(this.auth, tenantInfo.auth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, account, cloud, integration, license, status, sisStatus, auth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    integration: ").append(toIndentedString(integration)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sisStatus: ").append(toIndentedString(sisStatus)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
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

