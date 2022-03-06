# DetectionVApi

All URIs are relative to *https://apigateway.frisscloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**detectionVPost**](DetectionVApi.md#detectionVPost) | **POST** /api/v{version}/detection/base | Send a claim request to detection.
[**detectionVPost2**](DetectionVApi.md#detectionVPost2) | **POST** /api/v{version}/detection/auto | Send auto claim request to detection.
[**detectionVPost3**](DetectionVApi.md#detectionVPost3) | **POST** /api/v{version}/detection/home | Send home claim request to detection.
[**detectionVPost4**](DetectionVApi.md#detectionVPost4) | **POST** /api/v{version}/detection/health | Send health claim request to detection.
[**detectionVPost5**](DetectionVApi.md#detectionVPost5) | **POST** /api/v{version}/detection/gl/commercial | Send general liability commercial claim request to detection.
[**detectionVPost6**](DetectionVApi.md#detectionVPost6) | **POST** /api/v{version}/detection/gl/private | Send general liability private claim request to detection.

<a name="detectionVPost"></a>
# **detectionVPost**
> ClaimScreeningRequestResult detectionVPost(body, version)

Send a claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfPolicy body = new ClaimScreeningRequestOfPolicy(); // ClaimScreeningRequestOfPolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfPolicy**](ClaimScreeningRequestOfPolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectionVPost2"></a>
# **detectionVPost2**
> ClaimScreeningRequestResult detectionVPost2(body, version)

Send auto claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfAutoPolicy body = new ClaimScreeningRequestOfAutoPolicy(); // ClaimScreeningRequestOfAutoPolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost2(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfAutoPolicy**](ClaimScreeningRequestOfAutoPolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectionVPost3"></a>
# **detectionVPost3**
> ClaimScreeningRequestResult detectionVPost3(body, version)

Send home claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfHomePolicy body = new ClaimScreeningRequestOfHomePolicy(); // ClaimScreeningRequestOfHomePolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost3(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfHomePolicy**](ClaimScreeningRequestOfHomePolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectionVPost4"></a>
# **detectionVPost4**
> ClaimScreeningRequestResult detectionVPost4(body, version)

Send health claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfHealthPolicy body = new ClaimScreeningRequestOfHealthPolicy(); // ClaimScreeningRequestOfHealthPolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost4(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfHealthPolicy**](ClaimScreeningRequestOfHealthPolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectionVPost5"></a>
# **detectionVPost5**
> ClaimScreeningRequestResult detectionVPost5(body, version)

Send general liability commercial claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy body = new ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy(); // ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost5(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy**](ClaimScreeningRequestOfGeneralLiabilityCommercialPolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="detectionVPost6"></a>
# **detectionVPost6**
> ClaimScreeningRequestResult detectionVPost6(body, version)

Send general liability private claim request to detection.

Send claim to detection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DetectionVApi;


DetectionVApi apiInstance = new DetectionVApi();
ClaimScreeningRequestOfGeneralLiabilityPrivatePolicy body = new ClaimScreeningRequestOfGeneralLiabilityPrivatePolicy(); // ClaimScreeningRequestOfGeneralLiabilityPrivatePolicy | 
String version = "version_example"; // String | 
try {
    ClaimScreeningRequestResult result = apiInstance.detectionVPost6(body, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetectionVApi#detectionVPost6");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClaimScreeningRequestOfGeneralLiabilityPrivatePolicy**](ClaimScreeningRequestOfGeneralLiabilityPrivatePolicy.md)|  |
 **version** | **String**|  |

### Return type

[**ClaimScreeningRequestResult**](ClaimScreeningRequestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

