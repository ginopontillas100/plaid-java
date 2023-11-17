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
import com.plaid.client.model.TransactionStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TransactionsRecurringMergeResponse defines the response schema for the &#x60;/transactions/recurring/streams/merge&#x60; endpoint.
 */
@ApiModel(description = "TransactionsRecurringMergeResponse defines the response schema for the `/transactions/recurring/streams/merge` endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-17T20:03:54.421530Z[Etc/UTC]")
public class TransactionsRecurringMergeResponse {
  public static final String SERIALIZED_NAME_MODIFIED_STREAMS = "modified_streams";
  @SerializedName(SERIALIZED_NAME_MODIFIED_STREAMS)
  private List<TransactionStream> modifiedStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_REMOVED_STREAM_IDS = "removed_stream_ids";
  @SerializedName(SERIALIZED_NAME_REMOVED_STREAM_IDS)
  private List<String> removedStreamIds = null;


  public TransactionsRecurringMergeResponse modifiedStreams(List<TransactionStream> modifiedStreams) {
    
    this.modifiedStreams = modifiedStreams;
    return this;
  }

  public TransactionsRecurringMergeResponse addModifiedStreamsItem(TransactionStream modifiedStreamsItem) {
    this.modifiedStreams.add(modifiedStreamsItem);
    return this;
  }

   /**
   * Directly modified stream, along with other streams with transactions removed from them as a result of the operation (in no particular order).
   * @return modifiedStreams
  **/
  @ApiModelProperty(required = true, value = "Directly modified stream, along with other streams with transactions removed from them as a result of the operation (in no particular order).")

  public List<TransactionStream> getModifiedStreams() {
    return modifiedStreams;
  }


  public void setModifiedStreams(List<TransactionStream> modifiedStreams) {
    this.modifiedStreams = modifiedStreams;
  }


  public TransactionsRecurringMergeResponse removedStreamIds(List<String> removedStreamIds) {
    
    this.removedStreamIds = removedStreamIds;
    return this;
  }

  public TransactionsRecurringMergeResponse addRemovedStreamIdsItem(String removedStreamIdsItem) {
    if (this.removedStreamIds == null) {
      this.removedStreamIds = new ArrayList<>();
    }
    this.removedStreamIds.add(removedStreamIdsItem);
    return this;
  }

   /**
   * The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).
   * @return removedStreamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of streams that are no longer qualified as recurring transaction streams (in no particular order).")

  public List<String> getRemovedStreamIds() {
    return removedStreamIds;
  }


  public void setRemovedStreamIds(List<String> removedStreamIds) {
    this.removedStreamIds = removedStreamIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsRecurringMergeResponse transactionsRecurringMergeResponse = (TransactionsRecurringMergeResponse) o;
    return Objects.equals(this.modifiedStreams, transactionsRecurringMergeResponse.modifiedStreams) &&
        Objects.equals(this.removedStreamIds, transactionsRecurringMergeResponse.removedStreamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifiedStreams, removedStreamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsRecurringMergeResponse {\n");
    sb.append("    modifiedStreams: ").append(toIndentedString(modifiedStreams)).append("\n");
    sb.append("    removedStreamIds: ").append(toIndentedString(removedStreamIds)).append("\n");
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

