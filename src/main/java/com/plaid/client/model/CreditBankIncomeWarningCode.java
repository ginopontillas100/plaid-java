/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.197.3
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
 * The warning code identifies a specific kind of warning. &#x60;IDENTITY_UNAVAILABLE&#x60;: Unable to extract identity for the Item &#x60;TRANSACTIONS_UNAVAILABLE&#x60;: Unable to extract transactions for the Item &#x60;ITEM_UNAPPROVED&#x60;: User did not grant permission to share income data for the Item &#x60;REPORT_DELETED&#x60;: Report deleted due to customer or consumer request
 */
@JsonAdapter(CreditBankIncomeWarningCode.Adapter.class)
public enum CreditBankIncomeWarningCode {
  
  IDENTITY_UNAVAILABLE("IDENTITY_UNAVAILABLE"),
  
  TRANSACTIONS_UNAVAILABLE("TRANSACTIONS_UNAVAILABLE"),
  
  ITEM_UNAPPROVED("ITEM_UNAPPROVED"),
  
  REPORT_DELETED("REPORT_DELETED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CreditBankIncomeWarningCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CreditBankIncomeWarningCode fromValue(String value) {
    for (CreditBankIncomeWarningCode b : CreditBankIncomeWarningCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CreditBankIncomeWarningCode.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CreditBankIncomeWarningCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final CreditBankIncomeWarningCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CreditBankIncomeWarningCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CreditBankIncomeWarningCode.fromValue(value);
    }
  }
}

