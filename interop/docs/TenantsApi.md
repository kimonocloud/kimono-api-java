# TenantsApi

All URIs are relative to *http://localhost:5010/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listInteropTenants**](TenantsApi.md#listInteropTenants) | **GET** /tenants | List Interop Tenants


<a name="listInteropTenants"></a>
# **listInteropTenants**
> TenantInfosResponse listInteropTenants(accounts, integrations, page, pageSize)

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
java.util.List<java.util.UUID> accounts = Arrays.asList(); // java.util.List<java.util.UUID> | Optionally restrict the returned list of tenants to only those for the specified Accounts.
java.util.List<String> integrations = Arrays.asList(); // java.util.List<String> | Optionally restrict the returned list of tenants to only those for the specified Integration or Integrations. Use this parameter when you have multiple Integrations all serviced by the same client application. When omitted, includes tenants of all Integrations owned by your account.
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    TenantInfosResponse result = apiInstance.listInteropTenants(accounts, integrations, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#listInteropTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accounts** | [**java.util.List&lt;java.util.UUID&gt;**](java.util.UUID.md)| Optionally restrict the returned list of tenants to only those for the specified Accounts. | [optional]
 **integrations** | [**java.util.List&lt;String&gt;**](String.md)| Optionally restrict the returned list of tenants to only those for the specified Integration or Integrations. Use this parameter when you have multiple Integrations all serviced by the same client application. When omitted, includes tenants of all Integrations owned by your account. | [optional]
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**TenantInfosResponse**](TenantInfosResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

