# TenantsApi

All URIs are relative to *http://localhost:5010/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInteropTenants**](TenantsApi.md#listInteropTenants) | **GET** /tenants | List Interop Tenants


<a name="listInteropTenants"></a>
# **listInteropTenants**
> java.util.List&lt;TenantInfo&gt; listInteropTenants(integration)

List Interop Tenants

Get a list of &#x60;TenantInfo&#x60; representing your licensed and authorized Integration tenants.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

TenantsApi apiInstance = new TenantsApi();
java.util.List<String> integration = Arrays.asList(); // java.util.List<String> | Optionally restrict the returned list of tenants to only those for the specified Integration or Integrations. Use this parameter when you have multiple Integrations all serviced by the same client application. When omitted, includes tenants of all Integrations owned by your account.
try {
    java.util.List<TenantInfo> result = apiInstance.listInteropTenants(integration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#listInteropTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration** | [**java.util.List&lt;String&gt;**](String.md)| Optionally restrict the returned list of tenants to only those for the specified Integration or Integrations. Use this parameter when you have multiple Integrations all serviced by the same client application. When omitted, includes tenants of all Integrations owned by your account. | [optional]

### Return type

[**java.util.List&lt;TenantInfo&gt;**](TenantInfo.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

