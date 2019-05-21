# RosteringApi

All URIs are relative to *https://oneroster.us2.kimonocloud.com/ims/oneroster/v1p1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAcademicSession**](RosteringApi.md#getAcademicSession) | **GET** /academicSession/{id} | Return specific academic session.
[**getAllAcademicSessions**](RosteringApi.md#getAllAcademicSessions) | **GET** /academicSession | Return collection of all academic sessions.
[**getAllClasses**](RosteringApi.md#getAllClasses) | **GET** /classes | Return collection of classes.
[**getAllCourses**](RosteringApi.md#getAllCourses) | **GET** /courses | Return collection of courses.
[**getAllEnrollments**](RosteringApi.md#getAllEnrollments) | **GET** /enrollments | Return collection of enrollments.
[**getAllGradingPeriods**](RosteringApi.md#getAllGradingPeriods) | **GET** /gradingPeriods | Return collection of grading periods. A grading period is an instance of an AcademicSession.
[**getAllOrgs**](RosteringApi.md#getAllOrgs) | **GET** /orgs | Return collection of orgs.
[**getAllSchools**](RosteringApi.md#getAllSchools) | **GET** /schools | Return collection of Schools. A School is an instance of an Org.
[**getAllStudents**](RosteringApi.md#getAllStudents) | **GET** /students | Return collection of students. A student is an instance of a user.
[**getAllTeachers**](RosteringApi.md#getAllTeachers) | **GET** /teachers | Return collection of teachers. A teacher is an instance of a user.
[**getAllTerms**](RosteringApi.md#getAllTerms) | **GET** /terms | Return collection of terms. A Term is an instance of an AcademicSession.
[**getAllUsers**](RosteringApi.md#getAllUsers) | **GET** /users | Return collection of users.
[**getClass**](RosteringApi.md#getClass) | **GET** /classes/{id} | Return specific class.
[**getCourse**](RosteringApi.md#getCourse) | **GET** /courses/{id} | Return specific course.
[**getEnrollment**](RosteringApi.md#getEnrollment) | **GET** /enrollments/{id} | Return specific enrollment.
[**getGradingPeriod**](RosteringApi.md#getGradingPeriod) | **GET** /gradingPeriods/{id} | Return specific grading period. A grading period is an instance of an academic session.
[**getOrg**](RosteringApi.md#getOrg) | **GET** /orgs/{id} | Return specific org.
[**getSchool**](RosteringApi.md#getSchool) | **GET** /schools/{id} | Return specific School.  A School is an instance of an Org.
[**getStudent**](RosteringApi.md#getStudent) | **GET** /students/{id} | Return specific student. A student is an instance of a user.
[**getStudentsForSchool**](RosteringApi.md#getStudentsForSchool) | **GET** /schools/{schoolId}/students | Return the collection of students attending this school.
[**getTeacher**](RosteringApi.md#getTeacher) | **GET** /teachers/{id} | Return specific teacher. A teacher is an instance of a user.
[**getTeachersForSchool**](RosteringApi.md#getTeachersForSchool) | **GET** /schools/{schoolId}/teachers | Return the collection of teachers teaching at this school.
[**getTerm**](RosteringApi.md#getTerm) | **GET** /terms/{id} | Return specific term. A Term is an instance of an AcademicSession.
[**getUser**](RosteringApi.md#getUser) | **GET** /users/{id} | Return specific user.


<a name="getAcademicSession"></a>
# **getAcademicSession**
> AcademicSessionResponse getAcademicSession(id)

Return specific academic session.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the academic session to get
try {
    AcademicSessionResponse result = apiInstance.getAcademicSession(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAcademicSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the academic session to get |

### Return type

[**AcademicSessionResponse**](AcademicSessionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAcademicSessions"></a>
# **getAllAcademicSessions**
> AcademicSessionsResponse getAllAcademicSessions()

Return collection of all academic sessions.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    AcademicSessionsResponse result = apiInstance.getAllAcademicSessions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllAcademicSessions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcademicSessionsResponse**](AcademicSessionsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllClasses"></a>
# **getAllClasses**
> ClassesResponse getAllClasses()

Return collection of classes.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    ClassesResponse result = apiInstance.getAllClasses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllClasses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClassesResponse**](ClassesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCourses"></a>
# **getAllCourses**
> CoursesResponse getAllCourses()

Return collection of courses.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    CoursesResponse result = apiInstance.getAllCourses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllCourses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CoursesResponse**](CoursesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllEnrollments"></a>
# **getAllEnrollments**
> EnrollmentsResponse getAllEnrollments()

Return collection of enrollments.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    EnrollmentsResponse result = apiInstance.getAllEnrollments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllEnrollments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EnrollmentsResponse**](EnrollmentsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllGradingPeriods"></a>
# **getAllGradingPeriods**
> AcademicSessionsResponse getAllGradingPeriods()

Return collection of grading periods. A grading period is an instance of an AcademicSession.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    AcademicSessionsResponse result = apiInstance.getAllGradingPeriods();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllGradingPeriods");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcademicSessionsResponse**](AcademicSessionsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllOrgs"></a>
# **getAllOrgs**
> OrgsResponse getAllOrgs()

Return collection of orgs.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    OrgsResponse result = apiInstance.getAllOrgs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllOrgs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrgsResponse**](OrgsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllSchools"></a>
# **getAllSchools**
> OrgsResponse getAllSchools()

Return collection of Schools. A School is an instance of an Org.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    OrgsResponse result = apiInstance.getAllSchools();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllSchools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrgsResponse**](OrgsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStudents"></a>
# **getAllStudents**
> UsersResponse getAllStudents()

Return collection of students. A student is an instance of a user.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    UsersResponse result = apiInstance.getAllStudents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllStudents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTeachers"></a>
# **getAllTeachers**
> UsersResponse getAllTeachers()

Return collection of teachers. A teacher is an instance of a user.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    UsersResponse result = apiInstance.getAllTeachers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllTeachers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllTerms"></a>
# **getAllTerms**
> AcademicSessionsResponse getAllTerms()

Return collection of terms. A Term is an instance of an AcademicSession.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    AcademicSessionsResponse result = apiInstance.getAllTerms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllTerms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AcademicSessionsResponse**](AcademicSessionsResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllUsers"></a>
# **getAllUsers**
> UsersResponse getAllUsers()

Return collection of users.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
try {
    UsersResponse result = apiInstance.getAllUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getAllUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClass"></a>
# **getClass**
> ClassResponse getClass(id)

Return specific class.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the class to get
try {
    ClassResponse result = apiInstance.getClass(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getClass");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the class to get |

### Return type

[**ClassResponse**](ClassResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCourse"></a>
# **getCourse**
> CourseResponse getCourse(id)

Return specific course.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the course to get
try {
    CourseResponse result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the course to get |

### Return type

[**CourseResponse**](CourseResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEnrollment"></a>
# **getEnrollment**
> EnrollmentResponse getEnrollment(id)

Return specific enrollment.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the enrollment to get
try {
    EnrollmentResponse result = apiInstance.getEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the enrollment to get |

### Return type

[**EnrollmentResponse**](EnrollmentResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getGradingPeriod"></a>
# **getGradingPeriod**
> AcademicSessionResponse getGradingPeriod(id)

Return specific grading period. A grading period is an instance of an academic session.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the grading period to get
try {
    AcademicSessionResponse result = apiInstance.getGradingPeriod(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getGradingPeriod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the grading period to get |

### Return type

[**AcademicSessionResponse**](AcademicSessionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOrg"></a>
# **getOrg**
> OrgResponse getOrg(id)

Return specific org.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the org to get
try {
    OrgResponse result = apiInstance.getOrg(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getOrg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the org to get |

### Return type

[**OrgResponse**](OrgResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSchool"></a>
# **getSchool**
> OrgResponse getSchool(id)

Return specific School.  A School is an instance of an Org.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the School to get
try {
    OrgResponse result = apiInstance.getSchool(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the School to get |

### Return type

[**OrgResponse**](OrgResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStudent"></a>
# **getStudent**
> UserResponse getStudent(id)

Return specific student. A student is an instance of a user.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the student to get
try {
    UserResponse result = apiInstance.getStudent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the student to get |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStudentsForSchool"></a>
# **getStudentsForSchool**
> UsersResponse getStudentsForSchool(schoolId)

Return the collection of students attending this school.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String schoolId = "schoolId_example"; // String | sourcedId of the school to get students
try {
    UsersResponse result = apiInstance.getStudentsForSchool(schoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getStudentsForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schoolId** | **String**| sourcedId of the school to get students |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeacher"></a>
# **getTeacher**
> UserResponse getTeacher(id)

Return specific teacher. A teacher is an instance of a user.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the teacher to get
try {
    UserResponse result = apiInstance.getTeacher(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getTeacher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the teacher to get |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTeachersForSchool"></a>
# **getTeachersForSchool**
> UsersResponse getTeachersForSchool(schoolId)

Return the collection of teachers teaching at this school.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String schoolId = "schoolId_example"; // String | sourcedId of the school to get teachers
try {
    UsersResponse result = apiInstance.getTeachersForSchool(schoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getTeachersForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schoolId** | **String**| sourcedId of the school to get teachers |

### Return type

[**UsersResponse**](UsersResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTerm"></a>
# **getTerm**
> AcademicSessionResponse getTerm(id)

Return specific term. A Term is an instance of an AcademicSession.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the term to get
try {
    AcademicSessionResponse result = apiInstance.getTerm(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getTerm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the term to get |

### Return type

[**AcademicSessionResponse**](AcademicSessionResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserResponse getUser(id)

Return specific user.

### Example
```java
// Import classes:
//import kimono.oneroster.v1p1.ApiClient;
//import kimono.oneroster.v1p1.ApiException;
//import kimono.oneroster.v1p1.Configuration;
//import kimono.oneroster.v1p1.auth.*;
//import kimono.oneroster.v1p1.api.RosteringApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RosteringApi apiInstance = new RosteringApi();
String id = "id_example"; // String | sourcedId of the user to get
try {
    UserResponse result = apiInstance.getUser(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RosteringApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| sourcedId of the user to get |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

