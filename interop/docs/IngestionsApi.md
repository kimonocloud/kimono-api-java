# IngestionsApi

All URIs are relative to *http://localhost:5010/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelIngestion**](IngestionsApi.md#cancelIngestion) | **DELETE** /ingestions/{id} | Cancel an Ingestion by id
[**createIngestion**](IngestionsApi.md#createIngestion) | **POST** /ingestions | Create an Ingestion
[**findIngestion**](IngestionsApi.md#findIngestion) | **GET** /ingestions/{id} | Find an Ingestion by id
[**listIngestions**](IngestionsApi.md#listIngestions) | **GET** /ingestions | List Ingestions


<a name="cancelIngestion"></a>
# **cancelIngestion**
> Ingestion cancelIngestion(id)

Cancel an Ingestion by id

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IngestionsApi apiInstance = new IngestionsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Ingestion to cancel
try {
    Ingestion result = apiInstance.cancelIngestion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionsApi#cancelIngestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Ingestion to cancel |

### Return type

[**Ingestion**](Ingestion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createIngestion"></a>
# **createIngestion**
> Ingestion createIngestion(ingestion)

Create an Ingestion

Create an Ingestion. Use the resulting session_token to send Load messages containing raw data to be transformed by the Ingestion Pipeline.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IngestionsApi apiInstance = new IngestionsApi();
Ingestion ingestion = new Ingestion(); // Ingestion | Ingestion to create
try {
    Ingestion result = apiInstance.createIngestion(ingestion);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionsApi#createIngestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestion** | [**Ingestion**](Ingestion.md)| Ingestion to create |

### Return type

[**Ingestion**](Ingestion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findIngestion"></a>
# **findIngestion**
> Ingestion findIngestion(id)

Find an Ingestion by id

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IngestionsApi apiInstance = new IngestionsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Ingestion to find
try {
    Ingestion result = apiInstance.findIngestion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionsApi#findIngestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Ingestion to find |

### Return type

[**Ingestion**](Ingestion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIngestions"></a>
# **listIngestions**
> java.util.List&lt;Ingestion&gt; listIngestions()

List Ingestions

Get a list of Ingestions. By default only incomplete Ingestions from the Ingestion Queue are returned.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

IngestionsApi apiInstance = new IngestionsApi();
try {
    java.util.List<Ingestion> result = apiInstance.listIngestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionsApi#listIngestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;Ingestion&gt;**](Ingestion.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

