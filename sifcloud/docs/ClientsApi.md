# ClientsApi

All URIs are relative to *https://api.kimonocloud.com/v2/sifcloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClient**](ClientsApi.md#createClient) | **POST** /clients | Create a SIF Client
[**findClient**](ClientsApi.md#findClient) | **GET** /clients/{id} | Find a &#x60;SIFClient&#x60;
[**listClients**](ClientsApi.md#listClients) | **GET** /clients | Get SIF Clients


<a name="createClient"></a>
# **createClient**
> SIFClientResponse createClient(siFClient)

Create a SIF Client

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
SIFClient siFClient = new SIFClient(); // SIFClient | SIF Client to create
try {
    SIFClientResponse result = apiInstance.createClient(siFClient);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#createClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siFClient** | [**SIFClient**](SIFClient.md)| SIF Client to create |

### Return type

[**SIFClientResponse**](SIFClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findClient"></a>
# **findClient**
> SIFClientResponse findClient(id)

Find a &#x60;SIFClient&#x60;

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
try {
    SIFClientResponse result = apiInstance.findClient(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#findClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |

### Return type

[**SIFClientResponse**](SIFClientResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listClients"></a>
# **listClients**
> SIFClientsResponse listClients(page, pageSize)

Get SIF Clients

Get a list of &#x60;SIFClient&#x60;s

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    SIFClientsResponse result = apiInstance.listClients(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#listClients");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**SIFClientsResponse**](SIFClientsResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

