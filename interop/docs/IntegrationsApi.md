# IntegrationsApi

All URIs are relative to *http://localhost:5010/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](IntegrationsApi.md#createIntegration) | **POST** /integrations | Create Integration
[**createIntegrationVersion**](IntegrationsApi.md#createIntegrationVersion) | **POST** /integrations/{id}/versions | Create Integration Version
[**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /integrations/{id} | Delete an Integration
[**deleteIntegrationVersion**](IntegrationsApi.md#deleteIntegrationVersion) | **DELETE** /integrations/{id}/versions/{version} | Delete Integration Version
[**findIntegration**](IntegrationsApi.md#findIntegration) | **GET** /integrations/{id} | Find an Integration
[**listIntegrationVersions**](IntegrationsApi.md#listIntegrationVersions) | **GET** /integrations/{id}/versions | List Integration Versions
[**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /integrations | List Integrations
[**updateIntegration**](IntegrationsApi.md#updateIntegration) | **PUT** /integrations/{id} | Update Integration
[**updateIntegrationVersion**](IntegrationsApi.md#updateIntegrationVersion) | **PUT** /integrations/{id}/versions/{version} | Update Integration Version


<a name="createIntegration"></a>
# **createIntegration**
> Integration createIntegration(integration)

Create Integration

Create an Integration

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
Integration integration = new Integration(); // Integration | Integration to create
try {
    Integration result = apiInstance.createIntegration(integration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#createIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integration** | [**Integration**](Integration.md)| Integration to create |

### Return type

[**Integration**](Integration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIntegrationVersion"></a>
# **createIntegrationVersion**
> IntegrationVersion createIntegrationVersion(id, body)

Create Integration Version

Create a new version of an Integration

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration
String body = "body_example"; // String | 
try {
    IntegrationVersion result = apiInstance.createIntegrationVersion(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#createIntegrationVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration |
 **body** | **String**|  |

### Return type

[**IntegrationVersion**](IntegrationVersion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="deleteIntegration"></a>
# **deleteIntegration**
> deleteIntegration(id)

Delete an Integration

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to delete
try {
    apiInstance.deleteIntegration(id);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteIntegrationVersion"></a>
# **deleteIntegrationVersion**
> deleteIntegrationVersion(id, version)

Delete Integration Version

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
String version = "version_example"; // String | version to delete
try {
    apiInstance.deleteIntegrationVersion(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#deleteIntegrationVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to update |
 **version** | **String**| version to delete |

### Return type

null (empty response body)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findIntegration"></a>
# **findIntegration**
> Integration findIntegration(id)

Find an Integration

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to find
try {
    Integration result = apiInstance.findIntegration(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#findIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to find |

### Return type

[**Integration**](Integration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIntegrationVersions"></a>
# **listIntegrationVersions**
> IntegrationVersionsResponse listIntegrationVersions(id)

List Integration Versions

List the versions of an Integration. Each version is described by an Integration Blueprint.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration
try {
    IntegrationVersionsResponse result = apiInstance.listIntegrationVersions(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#listIntegrationVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration |

### Return type

[**IntegrationVersionsResponse**](IntegrationVersionsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIntegrations"></a>
# **listIntegrations**
> IntegrationsResponse listIntegrations(name)

List Integrations

List all Integrations

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
String name = "name_example"; // String | Find an Integration by name
try {
    IntegrationsResponse result = apiInstance.listIntegrations(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#listIntegrations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Find an Integration by name | [optional]

### Return type

[**IntegrationsResponse**](IntegrationsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIntegration"></a>
# **updateIntegration**
> Integration updateIntegration(id)

Update Integration

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
try {
    Integration result = apiInstance.updateIntegration(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#updateIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to update |

### Return type

[**Integration**](Integration.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIntegrationVersion"></a>
# **updateIntegrationVersion**
> IntegrationVersion updateIntegrationVersion(id, version)

Update Integration Version

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
String version = "version_example"; // String | version to update
try {
    IntegrationVersion result = apiInstance.updateIntegrationVersion(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#updateIntegrationVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to update |
 **version** | **String**| version to update |

### Return type

[**IntegrationVersion**](IntegrationVersion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

