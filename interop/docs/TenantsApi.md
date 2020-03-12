# TenantsApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScopingCourses**](TenantsApi.md#createScopingCourses) | **POST** /tenant/scoping/courses | Create Scoping Courses
[**createScopingSchools**](TenantsApi.md#createScopingSchools) | **POST** /tenant/scoping/schools | Create Scoping Schools
[**deleteScopingCourse**](TenantsApi.md#deleteScopingCourse) | **DELETE** /tenant/scoping/courses/{id} | Delete Scoping Course
[**deleteScopingCourses**](TenantsApi.md#deleteScopingCourses) | **DELETE** /tenant/scoping/courses | Delete Scoping Courses
[**deleteScopingSchool**](TenantsApi.md#deleteScopingSchool) | **DELETE** /tenant/scoping/schools/{id} | Delete Scoping School
[**deleteScopingSchools**](TenantsApi.md#deleteScopingSchools) | **DELETE** /tenant/scoping/schools | Delete Scoping Schools
[**findInteropTenant**](TenantsApi.md#findInteropTenant) | **GET** /tenants/{id} | Find Interop Tenant
[**findScopingCourse**](TenantsApi.md#findScopingCourse) | **GET** /tenant/scoping/courses/{id} | Find Scoping Course
[**findScopingSchool**](TenantsApi.md#findScopingSchool) | **GET** /tenant/scoping/schools/{id} | Find Scoping School
[**listInteropTenants**](TenantsApi.md#listInteropTenants) | **GET** /tenants | List Interop Tenants
[**listScopingCourses**](TenantsApi.md#listScopingCourses) | **GET** /tenant/scoping/courses | List Scoping Courses
[**listScopingSchools**](TenantsApi.md#listScopingSchools) | **GET** /tenant/scoping/schools | List Scoping Schools
[**updateScopingCourse**](TenantsApi.md#updateScopingCourse) | **PUT** /tenant/scoping/courses/{id} | Update Scoping Course
[**updateScopingSchool**](TenantsApi.md#updateScopingSchool) | **PUT** /tenant/scoping/schools/{id} | Update Scoping School


<a name="createScopingCourses"></a>
# **createScopingCourses**
> ScopingCourseResponse createScopingCourses(scopingCoursesBulkRequest, replace)

Create Scoping Courses

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
ScopingCoursesBulkRequest scopingCoursesBulkRequest = new ScopingCoursesBulkRequest(); // ScopingCoursesBulkRequest | One or more Scoping Courses to create
Boolean replace = true; // Boolean | true to replace existing Scoping Courses, false to append to existing Scoping Courses
try {
    ScopingCourseResponse result = apiInstance.createScopingCourses(scopingCoursesBulkRequest, replace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createScopingCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scopingCoursesBulkRequest** | [**ScopingCoursesBulkRequest**](ScopingCoursesBulkRequest.md)| One or more Scoping Courses to create |
 **replace** | **Boolean**| true to replace existing Scoping Courses, false to append to existing Scoping Courses | [optional] [default to true]

### Return type

[**ScopingCourseResponse**](ScopingCourseResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createScopingSchools"></a>
# **createScopingSchools**
> ScopingSchoolResponse createScopingSchools(scopingSchoolsBulkRequest, replace)

Create Scoping Schools

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
ScopingSchoolsBulkRequest scopingSchoolsBulkRequest = new ScopingSchoolsBulkRequest(); // ScopingSchoolsBulkRequest | One or more Scoping Schools to create
Boolean replace = true; // Boolean | true to replace existing Scoping Schools, false to append to existing Scoping Schools
try {
    ScopingSchoolResponse result = apiInstance.createScopingSchools(scopingSchoolsBulkRequest, replace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#createScopingSchools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scopingSchoolsBulkRequest** | [**ScopingSchoolsBulkRequest**](ScopingSchoolsBulkRequest.md)| One or more Scoping Schools to create |
 **replace** | **Boolean**| true to replace existing Scoping Schools, false to append to existing Scoping Schools | [optional] [default to true]

### Return type

[**ScopingSchoolResponse**](ScopingSchoolResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteScopingCourse"></a>
# **deleteScopingCourse**
> deleteScopingCourse(id)

Delete Scoping Course

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the ScopingCourse
try {
    apiInstance.deleteScopingCourse(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#deleteScopingCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the ScopingCourse |

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteScopingCourses"></a>
# **deleteScopingCourses**
> deleteScopingCourses()

Delete Scoping Courses

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
try {
    apiInstance.deleteScopingCourses();
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#deleteScopingCourses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteScopingSchool"></a>
# **deleteScopingSchool**
> deleteScopingSchool(id)

Delete Scoping School

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the ScopingSchool
try {
    apiInstance.deleteScopingSchool(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#deleteScopingSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the ScopingSchool |

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteScopingSchools"></a>
# **deleteScopingSchools**
> deleteScopingSchools()

Delete Scoping Schools

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
try {
    apiInstance.deleteScopingSchools();
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#deleteScopingSchools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findInteropTenant"></a>
# **findInteropTenant**
> TenantInfoResponse findInteropTenant(id)

Find Interop Tenant

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the TenantInfo to find
try {
    TenantInfoResponse result = apiInstance.findInteropTenant(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#findInteropTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the TenantInfo to find |

### Return type

[**TenantInfoResponse**](TenantInfoResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findScopingCourse"></a>
# **findScopingCourse**
> ScopingCourseResponse findScopingCourse(id)

Find Scoping Course

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the ScopingCourse to find
try {
    ScopingCourseResponse result = apiInstance.findScopingCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#findScopingCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the ScopingCourse to find |

### Return type

[**ScopingCourseResponse**](ScopingCourseResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findScopingSchool"></a>
# **findScopingSchool**
> ScopingSchoolResponse findScopingSchool(id)

Find Scoping School

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the ScopingSchool to find
try {
    ScopingSchoolResponse result = apiInstance.findScopingSchool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#findScopingSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the ScopingSchool to find |

### Return type

[**ScopingSchoolResponse**](ScopingSchoolResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.List<java.util.UUID> accounts = Arrays.asList(); // java.util.List<java.util.UUID> | Optionally restrict the returned list of tenants to only those for the specified Accounts.
java.util.List<String> integrations = Arrays.asList(); // java.util.List<String> | Optionally restrict the returned list of tenants to only those for the specified Integration or Integrations. Use this parameter when you have multiple Integrations all serviced by the same client application. When omitted, includes tenants of all Integrations owned by your account.
Integer page = 56; // Integer | Specify the page number (defaults to 0)
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
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**TenantInfosResponse**](TenantInfosResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listScopingCourses"></a>
# **listScopingCourses**
> ScopingCoursesResponse listScopingCourses(page, pageSize)

List Scoping Courses

Get the list of Scoping Courses to apply to this tenant&#39;s repository

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ScopingCoursesResponse result = apiInstance.listScopingCourses(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#listScopingCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ScopingCoursesResponse**](ScopingCoursesResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listScopingSchools"></a>
# **listScopingSchools**
> ScopingSchoolsResponse listScopingSchools(page, pageSize)

List Scoping Schools

Get the list of &#x60;ScopingSchool&#x60;s that define how to scope this tenant&#39;s repository by school

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    ScopingSchoolsResponse result = apiInstance.listScopingSchools(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#listScopingSchools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**ScopingSchoolsResponse**](ScopingSchoolsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateScopingCourse"></a>
# **updateScopingCourse**
> ScopingCourseResponse updateScopingCourse(id, scopingCourse)

Update Scoping Course

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Scoping Course to update
ScopingCourse scopingCourse = new ScopingCourse(); // ScopingCourse | Scoping Course
try {
    ScopingCourseResponse result = apiInstance.updateScopingCourse(id, scopingCourse);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateScopingCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Scoping Course to update |
 **scopingCourse** | [**ScopingCourse**](ScopingCourse.md)| Scoping Course |

### Return type

[**ScopingCourseResponse**](ScopingCourseResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateScopingSchool"></a>
# **updateScopingSchool**
> ScopingSchoolResponse updateScopingSchool(id, scopingSchool)

Update Scoping School

### Example
```java
// Import classes:
//import kimono.api.v2.interop.ApiClient;
//import kimono.api.v2.interop.ApiException;
//import kimono.api.v2.interop.Configuration;
//import kimono.api.v2.interop.auth.*;
//import kimono.api.v2.interop.TenantsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

TenantsApi apiInstance = new TenantsApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | id of the Scoping School to update
ScopingSchool scopingSchool = new ScopingSchool(); // ScopingSchool | Scoping School
try {
    ScopingSchoolResponse result = apiInstance.updateScopingSchool(id, scopingSchool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#updateScopingSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| id of the Scoping School to update |
 **scopingSchool** | [**ScopingSchool**](ScopingSchool.md)| Scoping School |

### Return type

[**ScopingSchoolResponse**](ScopingSchoolResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

