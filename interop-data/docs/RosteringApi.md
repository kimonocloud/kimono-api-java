# RosteringApi

All URIs are relative to *https://api.us2.kimonocloud.com/v2/interop/data*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCourse**](RosteringApi.md#findCourse) | **GET** /rostering/courses/{id} | Find a Course by $sys.id
[**findLEA**](RosteringApi.md#findLEA) | **GET** /rostering/leas/{id} | Find an LEA-type Org by $sys.id
[**findOrg**](RosteringApi.md#findOrg) | **GET** /rostering/orgs/{id} | Find an Org by $sys.id
[**findPerson**](RosteringApi.md#findPerson) | **GET** /rostering/persons/{id} | Find a Person by $sys.id
[**findSection**](RosteringApi.md#findSection) | **GET** /rostering/sections/{id} | Find a Section by $sys.id
[**findTerm**](RosteringApi.md#findTerm) | **GET** /rostering/terms/{id} | Find a Term by $sys.id
[**listCourses**](RosteringApi.md#listCourses) | **GET** /rostering/courses | List all Courses
[**listCoursesForOrg**](RosteringApi.md#listCoursesForOrg) | **GET** /rostering/orgs/{id}/courses | List Courses that belong to an Org
[**listLEAs**](RosteringApi.md#listLEAs) | **GET** /rostering/leas | List all LEA-type Orgs
[**listOrgs**](RosteringApi.md#listOrgs) | **GET** /rostering/orgs | List all Orgs
[**listPersons**](RosteringApi.md#listPersons) | **GET** /rostering/persons | Get all Persons
[**listSchools**](RosteringApi.md#listSchools) | **GET** /rostering/schools | List all School-type Orgs
[**listSections**](RosteringApi.md#listSections) | **GET** /rostering/sections | List all Sections
[**listSectionsForOrg**](RosteringApi.md#listSectionsForOrg) | **GET** /rostering/orgs/{id}/sections | List Sections that belong to an Org
[**listStudents**](RosteringApi.md#listStudents) | **GET** /rostering/students | List all Student-type Persons
[**listStudentsForOrg**](RosteringApi.md#listStudentsForOrg) | **GET** /rostering/orgs/{id}/students | List Students that are members of an Org
[**listTeachers**](RosteringApi.md#listTeachers) | **GET** /rostering/teachers | List all Teacher-type Persons
[**listTeachersForOrg**](RosteringApi.md#listTeachersForOrg) | **GET** /rostering/orgs/{id}/teachers | List Teachers that are members of an Org
[**listTerms**](RosteringApi.md#listTerms) | **GET** /rostering/terms | List all Terms
[**listTermsForOrg**](RosteringApi.md#listTermsForOrg) | **GET** /rostering/orgs/{id}/terms | List Terms that belong to an Org


<a name="findCourse"></a>
# **findCourse**
> Course findCourse(id)

Find a Course by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Course to find
try {
    Course result = apiInstance.findCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Course to find |

### Return type

[**Course**](Course.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLEA"></a>
# **findLEA**
> Org findLEA(id)

Find an LEA-type Org by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the LEA
try {
    Org result = apiInstance.findLEA(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findLEA");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the LEA |

### Return type

[**Org**](Org.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrg"></a>
# **findOrg**
> OrgResponse findOrg(id)

Find an Org by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the object
try {
    OrgResponse result = apiInstance.findOrg(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the object |

### Return type

[**OrgResponse**](OrgResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findPerson"></a>
# **findPerson**
> Person findPerson(id)

Find a Person by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Person to find
try {
    Person result = apiInstance.findPerson(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Person to find |

### Return type

[**Person**](Person.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findSection"></a>
# **findSection**
> Section findSection(id)

Find a Section by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Section to find
try {
    Section result = apiInstance.findSection(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Section to find |

### Return type

[**Section**](Section.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTerm"></a>
# **findTerm**
> Term findTerm(id)

Find a Term by $sys.id

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Term to find
try {
    Term result = apiInstance.findTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#findTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Term to find |

### Return type

[**Term**](Term.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCourses"></a>
# **listCourses**
> CoursesResponse listCourses(page, pageSize)

List all Courses

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    CoursesResponse result = apiInstance.listCourses(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listCoursesForOrg"></a>
# **listCoursesForOrg**
> CoursesResponse listCoursesForOrg(id, page, pageSize)

List Courses that belong to an Org

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Org
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    CoursesResponse result = apiInstance.listCoursesForOrg(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listCoursesForOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Org |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLEAs"></a>
# **listLEAs**
> OrgsResponse listLEAs(page, pageSize)

List all LEA-type Orgs

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    OrgsResponse result = apiInstance.listLEAs(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listLEAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**OrgsResponse**](OrgsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrgs"></a>
# **listOrgs**
> OrgsResponse listOrgs(page, pageSize)

List all Orgs

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    OrgsResponse result = apiInstance.listOrgs(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listOrgs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**OrgsResponse**](OrgsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPersons"></a>
# **listPersons**
> PersonsResponse listPersons(page, pageSize)

Get all Persons

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    PersonsResponse result = apiInstance.listPersons(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listPersons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**PersonsResponse**](PersonsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSchools"></a>
# **listSchools**
> OrgsResponse listSchools(page, pageSize)

List all School-type Orgs

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    OrgsResponse result = apiInstance.listSchools(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listSchools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**OrgsResponse**](OrgsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSections"></a>
# **listSections**
> SectionsResponse listSections(page, pageSize)

List all Sections

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    SectionsResponse result = apiInstance.listSections(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listSections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSectionsForOrg"></a>
# **listSectionsForOrg**
> SectionsResponse listSectionsForOrg(id, page, pageSize)

List Sections that belong to an Org

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Org
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    SectionsResponse result = apiInstance.listSectionsForOrg(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listSectionsForOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Org |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**SectionsResponse**](SectionsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStudents"></a>
# **listStudents**
> PersonsResponse listStudents(page, pageSize)

List all Student-type Persons

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    PersonsResponse result = apiInstance.listStudents(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listStudents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**PersonsResponse**](PersonsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listStudentsForOrg"></a>
# **listStudentsForOrg**
> PersonsResponse listStudentsForOrg(id, page, pageSize)

List Students that are members of an Org

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Org
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    PersonsResponse result = apiInstance.listStudentsForOrg(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listStudentsForOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Org |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**PersonsResponse**](PersonsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTeachers"></a>
# **listTeachers**
> PersonsResponse listTeachers(page, pageSize)

List all Teacher-type Persons

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    PersonsResponse result = apiInstance.listTeachers(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listTeachers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**PersonsResponse**](PersonsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTeachersForOrg"></a>
# **listTeachersForOrg**
> PersonsResponse listTeachersForOrg(id, page, pageSize)

List Teachers that are members of an Org

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Org
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    PersonsResponse result = apiInstance.listTeachersForOrg(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listTeachersForOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Org |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**PersonsResponse**](PersonsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTerms"></a>
# **listTerms**
> TermsResponse listTerms(page, pageSize)

List all Terms

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    TermsResponse result = apiInstance.listTerms(page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**TermsResponse**](TermsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTermsForOrg"></a>
# **listTermsForOrg**
> TermsResponse listTermsForOrg(id, page, pageSize)

List Terms that belong to an Org

### Example
```java
// Import classes:
//import kimono.api.v2.interopdata.ApiClient;
//import kimono.api.v2.interopdata.ApiException;
//import kimono.api.v2.interopdata.Configuration;
//import kimono.api.v2.interopdata.auth.*;
//import kimono.api.v2.interopdata.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: Actor
OAuth Actor = (OAuth) defaultClient.getAuthentication("Actor");
Actor.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
java.util.UUID id = new java.util.UUID(); // java.util.UUID | $sys.id of the Org
Integer page = 56; // Integer | Specify the page number (defaults to 0)
Integer pageSize = 56; // Integer | Specify the page_size (defaults to the maximum page size)
try {
    TermsResponse result = apiInstance.listTermsForOrg(id, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#listTermsForOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**java.util.UUID**](.md)| $sys.id of the Org |
 **page** | **Integer**| Specify the page number (defaults to 0) | [optional]
 **pageSize** | **Integer**| Specify the page_size (defaults to the maximum page size) | [optional]

### Return type

[**TermsResponse**](TermsResponse.md)

### Authorization

[Actor](../README.md#Actor)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

