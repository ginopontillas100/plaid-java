/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.470.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.AssetReportGetRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AssetReportGetRequest defines the request schema for &#x60;/asset_report/get&#x60;
 */
@ApiModel(description = "AssetReportGetRequest defines the request schema for `/asset_report/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class AssetReportGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ASSET_REPORT_TOKEN = "asset_report_token";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_TOKEN)
  private String assetReportToken;

  public static final String SERIALIZED_NAME_USER_TOKEN = "user_token";
  @SerializedName(SERIALIZED_NAME_USER_TOKEN)
  private String userToken;

  public static final String SERIALIZED_NAME_INCLUDE_INSIGHTS = "include_insights";
  @SerializedName(SERIALIZED_NAME_INCLUDE_INSIGHTS)
  private Boolean includeInsights = false;

  public static final String SERIALIZED_NAME_FAST_REPORT = "fast_report";
  @SerializedName(SERIALIZED_NAME_FAST_REPORT)
  private Boolean fastReport = false;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AssetReportGetRequestOptions options;


  public AssetReportGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public AssetReportGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public AssetReportGetRequest assetReportToken(String assetReportToken) {
    
    this.assetReportToken = assetReportToken;
    return this;
  }

   /**
   * A token that can be provided to endpoints such as &#x60;/asset_report/get&#x60; or &#x60;/asset_report/pdf/get&#x60; to fetch or update an Asset Report.
   * @return assetReportToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A token that can be provided to endpoints such as `/asset_report/get` or `/asset_report/pdf/get` to fetch or update an Asset Report.")

  public String getAssetReportToken() {
    return assetReportToken;
  }


  public void setAssetReportToken(String assetReportToken) {
    this.assetReportToken = assetReportToken;
  }


  public AssetReportGetRequest userToken(String userToken) {
    
    this.userToken = userToken;
    return this;
  }

   /**
   * The user token associated with the User for which to create an asset report for. The latest asset report associated with the User will be returned
   * @return userToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user token associated with the User for which to create an asset report for. The latest asset report associated with the User will be returned")

  public String getUserToken() {
    return userToken;
  }


  public void setUserToken(String userToken) {
    this.userToken = userToken;
  }


  public AssetReportGetRequest includeInsights(Boolean includeInsights) {
    
    this.includeInsights = includeInsights;
    return this;
  }

   /**
   * &#x60;true&#x60; if you would like to retrieve the Asset Report with Insights, &#x60;false&#x60; otherwise. This field defaults to &#x60;false&#x60; if omitted.
   * @return includeInsights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if you would like to retrieve the Asset Report with Insights, `false` otherwise. This field defaults to `false` if omitted.")

  public Boolean getIncludeInsights() {
    return includeInsights;
  }


  public void setIncludeInsights(Boolean includeInsights) {
    this.includeInsights = includeInsights;
  }


  public AssetReportGetRequest fastReport(Boolean fastReport) {
    
    this.fastReport = fastReport;
    return this;
  }

   /**
   * &#x60;true&#x60; to fetch \&quot;fast\&quot; version of asset report. Defaults to false if omitted. Can only be used if &#x60;/asset_report/create&#x60; was called with &#x60;options.add_ons&#x60; set to &#x60;[\&quot;fast_assets\&quot;]&#x60;.
   * @return fastReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` to fetch \"fast\" version of asset report. Defaults to false if omitted. Can only be used if `/asset_report/create` was called with `options.add_ons` set to `[\"fast_assets\"]`.")

  public Boolean getFastReport() {
    return fastReport;
  }


  public void setFastReport(Boolean fastReport) {
    this.fastReport = fastReport;
  }


  public AssetReportGetRequest options(AssetReportGetRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetReportGetRequestOptions getOptions() {
    return options;
  }


  public void setOptions(AssetReportGetRequestOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportGetRequest assetReportGetRequest = (AssetReportGetRequest) o;
    return Objects.equals(this.clientId, assetReportGetRequest.clientId) &&
        Objects.equals(this.secret, assetReportGetRequest.secret) &&
        Objects.equals(this.assetReportToken, assetReportGetRequest.assetReportToken) &&
        Objects.equals(this.userToken, assetReportGetRequest.userToken) &&
        Objects.equals(this.includeInsights, assetReportGetRequest.includeInsights) &&
        Objects.equals(this.fastReport, assetReportGetRequest.fastReport) &&
        Objects.equals(this.options, assetReportGetRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, assetReportToken, userToken, includeInsights, fastReport, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    assetReportToken: ").append(toIndentedString(assetReportToken)).append("\n");
    sb.append("    userToken: ").append(toIndentedString(userToken)).append("\n");
    sb.append("    includeInsights: ").append(toIndentedString(includeInsights)).append("\n");
    sb.append("    fastReport: ").append(toIndentedString(fastReport)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

