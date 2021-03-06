# ActorsApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listActors**](ActorsApi.md#listActors) | **GET** /actors | List Actors


<a name="listActors"></a>
# **listActors**
> ActorsResponse listActors(page, pageSize)

List Actors

Get a list of actors installed in Interop Clouds for accounts visible to you. This API is used to obtain coordinates and credentials essential for interacting with Integrations and other actors.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.ActorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

ActorsApi apiInstance = new ActorsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ActorsResponse result = apiInstance.listActors(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActorsApi#listActors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ActorsResponse**](ActorsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

