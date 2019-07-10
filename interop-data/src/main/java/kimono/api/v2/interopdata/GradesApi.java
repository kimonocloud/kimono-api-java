/*
 * Interop Data API
 * Interop Data APIs provide access to the data objects and events from Interop Cloud repositories and Integration repositories
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package kimono.api.v2.interopdata;

import kimono.api.v2.interopdata.ApiCallback;
import kimono.api.v2.interopdata.ApiClient;
import kimono.api.v2.interopdata.ApiException;
import kimono.api.v2.interopdata.ApiResponse;
import kimono.api.v2.interopdata.Configuration;
import kimono.api.v2.interopdata.Pair;
import kimono.api.v2.interopdata.ProgressRequestBody;
import kimono.api.v2.interopdata.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import kimono.api.v2.interopdata.model.GradingCategorysResponse;

import java.lang.reflect.Type;

public class GradesApi {
    private ApiClient apiClient;

    public GradesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GradesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listGradingCategories
     * @param page Specify the page number (defaults to 1) (optional)
     * @param pageSize Specify the page_size (defaults to the maximum page size) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGradingCategoriesCall(Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/grades/categories";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
        }

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listGradingCategoriesValidateBeforeCall(Integer page, Integer pageSize, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listGradingCategoriesCall(page, pageSize, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all Grading Categories
     * 
     * @param page Specify the page number (defaults to 1) (optional)
     * @param pageSize Specify the page_size (defaults to the maximum page size) (optional)
     * @return GradingCategorysResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GradingCategorysResponse listGradingCategories(Integer page, Integer pageSize) throws ApiException {
        ApiResponse<GradingCategorysResponse> resp = listGradingCategoriesWithHttpInfo(page, pageSize);
        return resp.getData();
    }

    /**
     * List all Grading Categories
     * 
     * @param page Specify the page number (defaults to 1) (optional)
     * @param pageSize Specify the page_size (defaults to the maximum page size) (optional)
     * @return ApiResponse&lt;GradingCategorysResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GradingCategorysResponse> listGradingCategoriesWithHttpInfo(Integer page, Integer pageSize) throws ApiException {
        com.squareup.okhttp.Call call = listGradingCategoriesValidateBeforeCall(page, pageSize, null, null);
        Type localVarReturnType = new TypeToken<GradingCategorysResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all Grading Categories (asynchronously)
     * 
     * @param page Specify the page number (defaults to 1) (optional)
     * @param pageSize Specify the page_size (defaults to the maximum page size) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGradingCategoriesAsync(Integer page, Integer pageSize, final ApiCallback<GradingCategorysResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGradingCategoriesValidateBeforeCall(page, pageSize, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GradingCategorysResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
