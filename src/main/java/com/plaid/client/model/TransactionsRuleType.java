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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Transaction rule&#39;s match type. For TRANSACTION_ID field, EXACT_MATCH is available. Matches are case sensitive. 
 */
@JsonAdapter(TransactionsRuleType.Adapter.class)
public enum TransactionsRuleType {
  
  EXACT_MATCH("EXACT_MATCH"),
  
  SUBSTRING_MATCH("SUBSTRING_MATCH"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransactionsRuleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionsRuleType fromValue(String value) {
    for (TransactionsRuleType b : TransactionsRuleType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransactionsRuleType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransactionsRuleType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionsRuleType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionsRuleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionsRuleType.fromValue(value);
    }
  }
}

