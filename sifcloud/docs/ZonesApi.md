# ZonesApi

All URIs are relative to *https://api.kimonocloud.com/v2/sifcloud*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createZone**](ZonesApi.md#createZone) | **POST** /zones | Create a SIF Zone
[**findZone**](ZonesApi.md#findZone) | **GET** /zones/{id} | Find a &#x60;SIFZone&#x60;
[**listZones**](ZonesApi.md#listZones) | **GET** /zones | Get SIF Zones


<a name="createZone"></a>
# **createZone**
> SIFZoneResponse createZone(siFZone)

Create a SIF Zone

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
SIFZone siFZone = new SIFZone(); // SIFZone | SIF Zone to create
try {
    SIFZoneResponse result = apiInstance.createZone(siFZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#createZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siFZone** | [**SIFZone**](SIFZone.md)| SIF Zone to create |

### Return type

[**SIFZoneResponse**](SIFZoneResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findZone"></a>
# **findZone**
> SIFZoneResponse findZone(id)

Find a &#x60;SIFZone&#x60;

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the object
try {
    SIFZoneResponse result = apiInstance.findZone(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#findZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the object |

### Return type

[**SIFZoneResponse**](SIFZoneResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listZones"></a>
# **listZones**
> SIFZonesResponse listZones(page, pageSize)

Get SIF Zones

Get a list of &#x60;SIFZone&#x60;s

### Example
```java
// Import classes:
//import kimono.api.v2.sifcloud.ApiClient;
//import kimono.api.v2.sifcloud.ApiException;
//import kimono.api.v2.sifcloud.Configuration;
//import kimono.api.v2.sifcloud.auth.*;
//import kimono.api.v2.sifcloud.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
Integer page = 56; // Integer | Specify the page number (defaults to 1)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    SIFZonesResponse result = apiInstance.listZones(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#listZones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 1) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**SIFZonesResponse**](SIFZonesResponse.md)

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

