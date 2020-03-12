# IntegrationsApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](IntegrationsApi.md#createIntegration) | **POST** /integrations | Create Integration
[**createIntegrationVersion**](IntegrationsApi.md#createIntegrationVersion) | **POST** /integrations/{id}/versions | Create Integration Version
[**deleteIntegration**](IntegrationsApi.md#deleteIntegration) | **DELETE** /integrations/{id} | Delete an Integration
[**deleteIntegrationVersion**](IntegrationsApi.md#deleteIntegrationVersion) | **DELETE** /integrations/{id}/versions/{version} | Delete Integration Version
[**findIntegration**](IntegrationsApi.md#findIntegration) | **GET** /integrations/{id} | Find an Integration
[**listIntegrationVersions**](IntegrationsApi.md#listIntegrationVersions) | **GET** /integrations/{id}/versions | List Integration Versions
[**listIntegrations**](IntegrationsApi.md#listIntegrations) | **GET** /integrations | List Integrations
[**updateIntegration**](IntegrationsApi.md#updateIntegration) | **PATCH** /integrations/{id} | Update Integration
[**updateIntegrationBlueprint**](IntegrationsApi.md#updateIntegrationBlueprint) | **PUT** /integrations/{id}/versions/{version}/blueprint | Update Integration Blueprint
[**updateIntegrationVersion**](IntegrationsApi.md#updateIntegrationVersion) | **PATCH** /integrations/{id}/versions/{version} | Update Integration Version


<a name="createIntegration"></a>
# **createIntegration**
> IntegrationResponse createIntegration(integration)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
Integration integration = new Integration(); // Integration | Integration to create
try {
    IntegrationResponse result = apiInstance.createIntegration(integration);
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

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createIntegrationVersion"></a>
# **createIntegrationVersion**
> IntegrationVersionResponse createIntegrationVersion(id, body)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration
String body = "body_example"; // String | 
try {
    IntegrationVersionResponse result = apiInstance.createIntegrationVersion(id, body);
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

[**IntegrationVersionResponse**](IntegrationVersionResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/xml
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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findIntegration"></a>
# **findIntegration**
> IntegrationResponse findIntegration(id)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to find
try {
    IntegrationResponse result = apiInstance.findIntegration(id);
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

[**IntegrationResponse**](IntegrationResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIntegrationVersions"></a>
# **listIntegrationVersions**
> IntegrationVersionsResponse listIntegrationVersions(id, page, pageSize)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    IntegrationVersionsResponse result = apiInstance.listIntegrationVersions(id, page, pageSize);
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
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**IntegrationVersionsResponse**](IntegrationVersionsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIntegrations"></a>
# **listIntegrations**
> IntegrationsResponse listIntegrations(name, page, pageSize)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
String name = "name_example"; // String | Find an Integration by name
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    IntegrationsResponse result = apiInstance.listIntegrations(name, page, pageSize);
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
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**IntegrationsResponse**](IntegrationsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIntegration"></a>
# **updateIntegration**
> updateIntegration(id, integration)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
Integration integration = new Integration(); // Integration | Integration properties to update
try {
    apiInstance.updateIntegration(id, integration);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#updateIntegration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to update |
 **integration** | [**Integration**](Integration.md)| Integration properties to update |

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateIntegrationBlueprint"></a>
# **updateIntegrationBlueprint**
> IntegrationVersionResponse updateIntegrationBlueprint(id, version, body)

Update Integration Blueprint

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IntegrationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
String version = "version_example"; // String | version to update
String body = "body_example"; // String | Integration Blueprint
try {
    IntegrationVersionResponse result = apiInstance.updateIntegrationBlueprint(id, version, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationsApi#updateIntegrationBlueprint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Integration to update |
 **version** | **String**| version to update |
 **body** | **String**| Integration Blueprint |

### Return type

[**IntegrationVersionResponse**](IntegrationVersionResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/json

<a name="updateIntegrationVersion"></a>
# **updateIntegrationVersion**
> updateIntegrationVersion(id, version, integrationVersion)

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IntegrationsApi apiInstance = new IntegrationsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Integration to update
String version = "version_example"; // String | version to update
IntegrationVersion integrationVersion = new IntegrationVersion(); // IntegrationVersion | IntegrationVersion properties to update
try {
    apiInstance.updateIntegrationVersion(id, version, integrationVersion);
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
 **integrationVersion** | [**IntegrationVersion**](IntegrationVersion.md)| IntegrationVersion properties to update |

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

