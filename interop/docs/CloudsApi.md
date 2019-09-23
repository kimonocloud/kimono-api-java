# CloudsApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Create an Interop Cloud
[**deleteCloud**](CloudsApi.md#deleteCloud) | **DELETE** /clouds/{id} | Delete an Interop Cloud
[**findCloud**](CloudsApi.md#findCloud) | **GET** /clouds/{id} | Find an Interop Cloud
[**listActorsByCloud**](CloudsApi.md#listActorsByCloud) | **GET** /clouds/{id}/actors | List all Actors in an Interop Cloud
[**listClouds**](CloudsApi.md#listClouds) | **GET** /clouds | List Interop Clouds
[**searchClouds**](CloudsApi.md#searchClouds) | **GET** /clouds/search | Search Interop Clouds


<a name="createCloud"></a>
# **createCloud**
> CloudResponse createCloud(cloud)

Create an Interop Cloud

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
Cloud cloud = new Cloud(); // Cloud | Cloud to create
try {
    CloudResponse result = apiInstance.createCloud(cloud);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**Cloud**](Cloud.md)| Cloud to create |

### Return type

[**CloudResponse**](CloudResponse.md)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloud"></a>
# **deleteCloud**
> deleteCloud(id)

Delete an Interop Cloud

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Cloud to delete
try {
    apiInstance.deleteCloud(id);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#deleteCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Cloud to delete |

### Return type

null (empty response body)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findCloud"></a>
# **findCloud**
> CloudResponse findCloud(id)

Find an Interop Cloud

Find an Interop Cloud by identifier

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
try {
    CloudResponse result = apiInstance.findCloud(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#findCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |

### Return type

[**CloudResponse**](CloudResponse.md)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listActorsByCloud"></a>
# **listActorsByCloud**
> ActorsResponse listActorsByCloud(id, page, pageSize)

List all Actors in an Interop Cloud

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ActorsResponse result = apiInstance.listActorsByCloud(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#listActorsByCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ActorsResponse**](ActorsResponse.md)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClouds"></a>
# **listClouds**
> CloudsResponse listClouds(page, pageSize)

List Interop Clouds

Get a list of Interop Clouds for accounts visible to you.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    CloudsResponse result = apiInstance.listClouds(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#listClouds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**CloudsResponse**](CloudsResponse.md)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchClouds"></a>
# **searchClouds**
> CloudsResponse searchClouds(generation, userdata, name, page, pageSize)

Search Interop Clouds

Get a list of Interop Clouds matching the search criteria.

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.CloudsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: Vendor
HttpBasicAuth Vendor = (HttpBasicAuth) defaultClient.getAuthentication("Vendor");
Vendor.setUsername("YOUR USERNAME");
Vendor.setPassword("YOUR PASSWORD");

CloudsApi apiInstance = new CloudsApi();
Integer generation = 56; // Integer | List all Clouds of a matching generation
String userdata = "userdata_example"; // String | List all Clouds with matching userdata
String name = "name_example"; // String | List all Clouds with a matching name
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    CloudsResponse result = apiInstance.searchClouds(generation, userdata, name, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#searchClouds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generation** | **Integer**| List all Clouds of a matching generation | [optional]
 **userdata** | **String**| List all Clouds with matching userdata | [optional]
 **name** | **String**| List all Clouds with a matching name | [optional]
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**CloudsResponse**](CloudsResponse.md)

### Authorization

[Vendor](../README.md#Vendor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

