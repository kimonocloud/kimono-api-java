# api-grades

Grades Exchange API
- API version: 2.0
  - Build date: 2019-10-09T14:00:54.511-06:00[America/Denver]

Use the Grades Exchange APIs to implement a Grades Producer or Grades Consumer client application and to manage Exchanges between producers and consumers.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.kimonocloud</groupId>
  <artifactId>api-grades</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.kimonocloud:api-grades:2.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/api-grades-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import kimono.api.v2.grades.*;
import kimono.api.v2.grades.auth.*;
import kimono.api.v2.grades.model.*;
import kimono.api.v2.grades.GradesExchangeApi;

import java.io.File;
import java.util.*;

public class GradesExchangeApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.us2.kimonocloud.com/v2/grades*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GradesExchangeApi* | [**listExchanges**](docs/GradesExchangeApi.md#listExchanges) | **GET** /exchanges | List Grades Exchanges


## Documentation for Models

 - [BaseResourceType](docs/BaseResourceType.md)
 - [ErrorType](docs/ErrorType.md)
 - [Exchange](docs/Exchange.md)
 - [ExchangeResponse](docs/ExchangeResponse.md)
 - [ExchangesResponse](docs/ExchangesResponse.md)
 - [PagedDataResponseType](docs/PagedDataResponseType.md)
 - [PagedDataResponseTypePaging](docs/PagedDataResponseTypePaging.md)
 - [SingleObjectResponseType](docs/SingleObjectResponseType.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Actor

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


