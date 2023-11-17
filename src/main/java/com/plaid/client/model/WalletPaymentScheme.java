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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The payment scheme used to execute this transaction. This is present only for transaction types &#x60;PAYOUT&#x60; and &#x60;REFUND&#x60;.  &#x60;FASTER_PAYMENTS&#x60;: The standard payment scheme within the UK.  &#x60;SEPA_CREDIT_TRANSFER&#x60;: The standard payment to a beneficiary within the SEPA area.  &#x60;SEPA_CREDIT_TRANSFER_INSTANT&#x60;: Instant payment to a beneficiary within the SEPA area.
 */
@JsonAdapter(WalletPaymentScheme.Adapter.class)
public enum WalletPaymentScheme {
  
  NULL("null"),
  
  FASTER_PAYMENTS("FASTER_PAYMENTS"),
  
  SEPA_CREDIT_TRANSFER("SEPA_CREDIT_TRANSFER"),
  
  SEPA_CREDIT_TRANSFER_INSTANT("SEPA_CREDIT_TRANSFER_INSTANT"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WalletPaymentScheme(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WalletPaymentScheme fromValue(String value) {
    for (WalletPaymentScheme b : WalletPaymentScheme.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<WalletPaymentScheme> {
    @Override
    public void write(final JsonWriter jsonWriter, final WalletPaymentScheme enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WalletPaymentScheme read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WalletPaymentScheme.fromValue(value);
    }
  }
}

