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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The current state of review. All watchlist screening hits begin in a &#x60;pending_review&#x60; state but can be changed by creating a review. When a hit is in the &#x60;pending_review&#x60; state, it will always show the latest version of the watchlist data Plaid has available and be compared against the latest customer information saved in the watchlist screening. Once a hit has been marked as &#x60;confirmed&#x60; or &#x60;dismissed&#x60; it will no longer be updated so that the state is as it was when the review was first conducted.
 */
@JsonAdapter(WatchlistScreeningHitStatus.Adapter.class)
public enum WatchlistScreeningHitStatus {
  
  CONFIRMED("confirmed"),
  
  PENDING_REVIEW("pending_review"),
  
  DISMISSED("dismissed"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WatchlistScreeningHitStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WatchlistScreeningHitStatus fromValue(String value) {
    for (WatchlistScreeningHitStatus b : WatchlistScreeningHitStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return WatchlistScreeningHitStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<WatchlistScreeningHitStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final WatchlistScreeningHitStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WatchlistScreeningHitStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WatchlistScreeningHitStatus.fromValue(value);
    }
  }
}

