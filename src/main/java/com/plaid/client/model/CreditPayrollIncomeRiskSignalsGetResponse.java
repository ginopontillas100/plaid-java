/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.161.5
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
import com.plaid.client.model.PayrollRiskSignalsItem;
import com.plaid.client.model.PlaidError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CreditPayrollIncomeRiskSignalsGetRequest defines the response schema for &#x60;/beta/credit/payroll_income/risk_signals/get&#x60;
 */
@ApiModel(description = "CreditPayrollIncomeRiskSignalsGetRequest defines the response schema for `/beta/credit/payroll_income/risk_signals/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-29T20:00:26.713837Z[Etc/UTC]")
public class CreditPayrollIncomeRiskSignalsGetResponse {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<PayrollRiskSignalsItem> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public CreditPayrollIncomeRiskSignalsGetResponse items(List<PayrollRiskSignalsItem> items) {
    
    this.items = items;
    return this;
  }

  public CreditPayrollIncomeRiskSignalsGetResponse addItemsItem(PayrollRiskSignalsItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array of payroll items.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Array of payroll items.")

  public List<PayrollRiskSignalsItem> getItems() {
    return items;
  }


  public void setItems(List<PayrollRiskSignalsItem> items) {
    this.items = items;
  }


  public CreditPayrollIncomeRiskSignalsGetResponse error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public CreditPayrollIncomeRiskSignalsGetResponse requestId(String requestId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditPayrollIncomeRiskSignalsGetResponse creditPayrollIncomeRiskSignalsGetResponse = (CreditPayrollIncomeRiskSignalsGetResponse) o;
    return Objects.equals(this.items, creditPayrollIncomeRiskSignalsGetResponse.items) &&
        Objects.equals(this.error, creditPayrollIncomeRiskSignalsGetResponse.error) &&
        Objects.equals(this.requestId, creditPayrollIncomeRiskSignalsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, error, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditPayrollIncomeRiskSignalsGetResponse {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

