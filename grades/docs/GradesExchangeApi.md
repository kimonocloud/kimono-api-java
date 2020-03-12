# GradesExchangeApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/grades*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExchange**](GradesExchangeApi.md#createExchange) | **POST** /exchanges | Create a Grades Exchange
[**createExchangeData**](GradesExchangeApi.md#createExchangeData) | **POST** /exchanges/{id}/data | Create Grades Exchange Data
[**createExchangeError**](GradesExchangeApi.md#createExchangeError) | **POST** /exchanges/{id}/errors | Create Grades Exchange Errors
[**findExchange**](GradesExchangeApi.md#findExchange) | **GET** /exchanges/{id} | Find a Grades Exchange by id
[**listExchangeErrors**](GradesExchangeApi.md#listExchangeErrors) | **GET** /exchanges/{id}/errors | List Grades Exchange Errors
[**listExchanges**](GradesExchangeApi.md#listExchanges) | **GET** /exchanges | List Grades Exchanges


<a name="createExchange"></a>
# **createExchange**
> ExchangeDataResponse createExchange(exchangesRequest)

Create a Grades Exchange

Create a Grades Exchange

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
ExchangesRequest exchangesRequest = new ExchangesRequest(); // ExchangesRequest | Exchange to create
try {
    ExchangeDataResponse result = apiInstance.createExchange(exchangesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#createExchange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exchangesRequest** | [**ExchangesRequest**](ExchangesRequest.md)| Exchange to create |

### Return type

[**ExchangeDataResponse**](ExchangeDataResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createExchangeData"></a>
# **createExchangeData**
> ExchangeDataResponse createExchangeData(id, exchangeDataRequest)

Create Grades Exchange Data

Create Grades data for an Exchange

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Exchange to create Data
ExchangeDataRequest exchangeDataRequest = new ExchangeDataRequest(); // ExchangeDataRequest | Exchange Data to create
try {
    ExchangeDataResponse result = apiInstance.createExchangeData(id, exchangeDataRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#createExchangeData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Exchange to create Data |
 **exchangeDataRequest** | [**ExchangeDataRequest**](ExchangeDataRequest.md)| Exchange Data to create |

### Return type

[**ExchangeDataResponse**](ExchangeDataResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createExchangeError"></a>
# **createExchangeError**
> ExchangeErrorResponse createExchangeError(id, body)

Create Grades Exchange Errors

Create a list of Grades Exchange Errors

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Exchange to create Errors
ExchangeError body = new ExchangeError(); // ExchangeError | Exchange to create
try {
    ExchangeErrorResponse result = apiInstance.createExchangeError(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#createExchangeError");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Exchange to create Errors |
 **body** | **ExchangeError**| Exchange to create |

### Return type

[**ExchangeErrorResponse**](ExchangeErrorResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findExchange"></a>
# **findExchange**
> ExchangeResponse findExchange(id)

Find a Grades Exchange by id

Get an Exchange

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Exchange to find
try {
    ExchangeResponse result = apiInstance.findExchange(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#findExchange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Exchange to find |

### Return type

[**ExchangeResponse**](ExchangeResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listExchangeErrors"></a>
# **listExchangeErrors**
> ExchangeErrorsResponse listExchangeErrors(id, page, pageSize)

List Grades Exchange Errors

Get a list of Grades Exchange Errors

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Exchange to list Errors
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ExchangeErrorsResponse result = apiInstance.listExchangeErrors(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#listExchangeErrors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Exchange to list Errors |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ExchangeErrorsResponse**](ExchangeErrorsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listExchanges"></a>
# **listExchanges**
> ExchangesResponse listExchanges(page, pageSize)

List Grades Exchanges

Get a list of Grades Exchanges

### Example
```java
// Import classes:
//import kimono.api.v2.grades.ApiClient;
//import kimono.api.v2.grades.ApiException;
//import kimono.api.v2.grades.Configuration;
//import kimono.api.v2.grades.auth.*;
//import kimono.api.v2.grades.GradesExchangeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

GradesExchangeApi apiInstance = new GradesExchangeApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ExchangesResponse result = apiInstance.listExchanges(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GradesExchangeApi#listExchanges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

