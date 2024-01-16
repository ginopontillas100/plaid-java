/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
 * An enum indicating the match type between data provided by user and data checked against an external data source.   &#x60;match&#x60; indicates that the provided input data was a strong match against external data.  &#x60;partial_match&#x60; indicates the data approximately matched against external data. For example, \&quot;Knope\&quot; vs. \&quot;Knope-Wyatt\&quot; for last name.  &#x60;no_match&#x60; indicates that Plaid was able to perform a check against an external data source and it did not match the provided input data.  &#x60;no_data&#x60; indicates that Plaid was unable to find external data to compare against the provided input data.  &#x60;no_input&#x60; indicates that Plaid was unable to perform a check because no information was provided for this field by the end user.
 */
@JsonAdapter(MatchSummaryCode.Adapter.class)
public enum MatchSummaryCode {
  
  MATCH("match"),
  
  PARTIAL_MATCH("partial_match"),
  
  NO_MATCH("no_match"),
  
  NO_DATA("no_data"),
  
  NO_INPUT("no_input"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  MatchSummaryCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MatchSummaryCode fromValue(String value) {
    for (MatchSummaryCode b : MatchSummaryCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return MatchSummaryCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<MatchSummaryCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final MatchSummaryCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MatchSummaryCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MatchSummaryCode.fromValue(value);
    }
  }
}

