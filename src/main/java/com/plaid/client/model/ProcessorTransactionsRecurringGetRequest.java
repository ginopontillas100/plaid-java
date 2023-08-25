/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.421.0
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
import com.plaid.client.model.TransactionsRecurringGetRequestOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ProcessorTransactionsRecurringGetRequest defines the request schema for &#x60;/processor/transactions/recurring/get&#x60;
 */
@ApiModel(description = "ProcessorTransactionsRecurringGetRequest defines the request schema for `/processor/transactions/recurring/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class ProcessorTransactionsRecurringGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private TransactionsRecurringGetRequestOptions options;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "account_ids";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = new ArrayList<>();


  public ProcessorTransactionsRecurringGetRequest clientId(String clientId) {
    
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


  public ProcessorTransactionsRecurringGetRequest processorToken(String processorToken) {
    
    this.processorToken = processorToken;
    return this;
  }

   /**
   * The processor token obtained from the Plaid integration partner. Processor tokens are in the format: &#x60;processor-&lt;environment&gt;-&lt;identifier&gt;&#x60;
   * @return processorToken
  **/
  @ApiModelProperty(required = true, value = "The processor token obtained from the Plaid integration partner. Processor tokens are in the format: `processor-<environment>-<identifier>`")

  public String getProcessorToken() {
    return processorToken;
  }


  public void setProcessorToken(String processorToken) {
    this.processorToken = processorToken;
  }


  public ProcessorTransactionsRecurringGetRequest secret(String secret) {
    
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


  public ProcessorTransactionsRecurringGetRequest options(TransactionsRecurringGetRequestOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransactionsRecurringGetRequestOptions getOptions() {
    return options;
  }


  public void setOptions(TransactionsRecurringGetRequestOptions options) {
    this.options = options;
  }


  public ProcessorTransactionsRecurringGetRequest accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public ProcessorTransactionsRecurringGetRequest addAccountIdsItem(String accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * A list of &#x60;account_ids&#x60; to retrieve for the Item  Note: An error will be returned if a provided &#x60;account_id&#x60; is not associated with the Item.
   * @return accountIds
  **/
  @ApiModelProperty(required = true, value = "A list of `account_ids` to retrieve for the Item  Note: An error will be returned if a provided `account_id` is not associated with the Item.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorTransactionsRecurringGetRequest processorTransactionsRecurringGetRequest = (ProcessorTransactionsRecurringGetRequest) o;
    return Objects.equals(this.clientId, processorTransactionsRecurringGetRequest.clientId) &&
        Objects.equals(this.processorToken, processorTransactionsRecurringGetRequest.processorToken) &&
        Objects.equals(this.secret, processorTransactionsRecurringGetRequest.secret) &&
        Objects.equals(this.options, processorTransactionsRecurringGetRequest.options) &&
        Objects.equals(this.accountIds, processorTransactionsRecurringGetRequest.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, processorToken, secret, options, accountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorTransactionsRecurringGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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

