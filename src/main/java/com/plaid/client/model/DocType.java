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
 * The type of document.  &#x60;DOCUMENT_TYPE_PAYSTUB&#x60;: A paystub.  &#x60;DOCUMENT_TYPE_BANK_STATEMENT&#x60;: A bank statement.  &#x60;DOCUMENT_TYPE_US_TAX_W2&#x60;: A W-2 wage and tax statement provided by a US employer reflecting wages earned by the employee.  &#x60;DOCUMENT_TYPE_US_MILITARY_ERAS&#x60;: An electronic Retirement Account Statement (eRAS) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_LES&#x60;: A Leave and Earnings Statement (LES) issued by the US military.  &#x60;DOCUMENT_TYPE_US_MILITARY_CLES&#x60;: A Civilian Leave and Earnings Statment (CLES) issued by the US military.  &#x60;DOCUMENT_TYPE_GIG&#x60;: Used to indicate that the income is related to gig work. Does not necessarily correspond to a specific document type.  &#x60;DOCUMENT_TYPE_NONE&#x60;: Used to indicate that there is no underlying document for the data.  &#x60;DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF&#x60;: Used to indicate that the PDF for the paystub was generated by Plaid.  &#x60;UNKNOWN&#x60;: Document type could not be determined.
 */
@JsonAdapter(DocType.Adapter.class)
public enum DocType {
  
  UNKNOWN("UNKNOWN"),
  
  DOCUMENT_TYPE_PAYSTUB("DOCUMENT_TYPE_PAYSTUB"),
  
  DOCUMENT_TYPE_BANK_STATEMENT("DOCUMENT_TYPE_BANK_STATEMENT"),
  
  DOCUMENT_TYPE_US_TAX_W2("DOCUMENT_TYPE_US_TAX_W2"),
  
  DOCUMENT_TYPE_US_MILITARY_ERAS("DOCUMENT_TYPE_US_MILITARY_ERAS"),
  
  DOCUMENT_TYPE_US_MILITARY_LES("DOCUMENT_TYPE_US_MILITARY_LES"),
  
  DOCUMENT_TYPE_US_MILITARY_CLES("DOCUMENT_TYPE_US_MILITARY_CLES"),
  
  DOCUMENT_TYPE_GIG("DOCUMENT_TYPE_GIG"),
  
  DOCUMENT_TYPE_NONE("DOCUMENT_TYPE_NONE"),
  
  DOCUMENT_TYPE_US_TAX_1099_MISC("DOCUMENT_TYPE_US_TAX_1099_MISC"),
  
  DOCUMENT_TYPE_US_TAX_1099_K("DOCUMENT_TYPE_US_TAX_1099_K"),
  
  DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF("DOCUMENT_TYPE_PLAID_GENERATED_PAYSTUB_PDF"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  DocType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DocType fromValue(String value) {
    for (DocType b : DocType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return DocType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<DocType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DocType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DocType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DocType.fromValue(value);
    }
  }
}

