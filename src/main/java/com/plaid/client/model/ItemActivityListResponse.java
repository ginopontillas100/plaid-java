/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.410.1
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
import com.plaid.client.model.Activity;
import com.plaid.client.model.LastDataAccessTimes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes a historical log of user consent events.
 */
@ApiModel(description = "Describes a historical log of user consent events.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-15T23:18:44.559547Z[Etc/UTC]")
public class ItemActivityListResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_ACTIVITIES = "activities";
  @SerializedName(SERIALIZED_NAME_ACTIVITIES)
  private List<Activity> activities = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_DATA_ACCESS_TIMES = "last_data_access_times";
  @SerializedName(SERIALIZED_NAME_LAST_DATA_ACCESS_TIMES)
  private List<LastDataAccessTimes> lastDataAccessTimes = new ArrayList<>();

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private String cursor;


  public ItemActivityListResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ItemActivityListResponse activities(List<Activity> activities) {
    
    this.activities = activities;
    return this;
  }

  public ItemActivityListResponse addActivitiesItem(Activity activitiesItem) {
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * A list of activities.
   * @return activities
  **/
  @ApiModelProperty(required = true, value = "A list of activities.")

  public List<Activity> getActivities() {
    return activities;
  }


  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }


  public ItemActivityListResponse lastDataAccessTimes(List<LastDataAccessTimes> lastDataAccessTimes) {
    
    this.lastDataAccessTimes = lastDataAccessTimes;
    return this;
  }

  public ItemActivityListResponse addLastDataAccessTimesItem(LastDataAccessTimes lastDataAccessTimesItem) {
    this.lastDataAccessTimes.add(lastDataAccessTimesItem);
    return this;
  }

   /**
   * An array of objects containing timestamps for the last time each data type was accessed per application.
   * @return lastDataAccessTimes
  **/
  @ApiModelProperty(required = true, value = "An array of objects containing timestamps for the last time each data type was accessed per application.")

  public List<LastDataAccessTimes> getLastDataAccessTimes() {
    return lastDataAccessTimes;
  }


  public void setLastDataAccessTimes(List<LastDataAccessTimes> lastDataAccessTimes) {
    this.lastDataAccessTimes = lastDataAccessTimes;
  }


  public ItemActivityListResponse cursor(String cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * Cursor used for pagination.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cursor used for pagination.")

  public String getCursor() {
    return cursor;
  }


  public void setCursor(String cursor) {
    this.cursor = cursor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemActivityListResponse itemActivityListResponse = (ItemActivityListResponse) o;
    return Objects.equals(this.requestId, itemActivityListResponse.requestId) &&
        Objects.equals(this.activities, itemActivityListResponse.activities) &&
        Objects.equals(this.lastDataAccessTimes, itemActivityListResponse.lastDataAccessTimes) &&
        Objects.equals(this.cursor, itemActivityListResponse.cursor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, activities, lastDataAccessTimes, cursor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemActivityListResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    lastDataAccessTimes: ").append(toIndentedString(lastDataAccessTimes)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
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

