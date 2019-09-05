# IngestionsApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop/data*

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
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

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

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createIngestion"></a>
# **createIngestion**
> IngestionResponse createIngestion(ingestion)

Create an Ingestion

Create an Ingestion. Use the resulting session_token to send Load messages containing raw data to be transformed by the Ingestion Pipeline.

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IngestionsApi apiInstance = new IngestionsApi();
Ingestion ingestion = new Ingestion(); // Ingestion | Ingestion to create
try {
    IngestionResponse result = apiInstance.createIngestion(ingestion);
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

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findIngestion"></a>
# **findIngestion**
> IngestionResponse findIngestion(id)

Find an Ingestion by id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IngestionsApi apiInstance = new IngestionsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Ingestion to find
try {
    IngestionResponse result = apiInstance.findIngestion(id);
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

[**IngestionResponse**](IngestionResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listIngestions"></a>
# **listIngestions**
> IngestionsResponse listIngestions(page, pageSize)

List Ingestions

Get a list of Ingestions. By default only incomplete Ingestions from the Ingestion Queue are returned.

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.IngestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

IngestionsApi apiInstance = new IngestionsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    IngestionsResponse result = apiInstance.listIngestions(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IngestionsApi#listIngestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**IngestionsResponse**](IngestionsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

