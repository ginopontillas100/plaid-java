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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class TransactionsSyncRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY = "include_personal_finance_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY)
  private Boolean includePersonalFinanceCategory = false;

  public static final String SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA = "include_logo_and_counterparty_beta";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LOGO_AND_COUNTERPARTY_BETA)
  private Boolean includeLogoAndCounterpartyBeta = false;

  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested = 90;


  public TransactionsSyncRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager or submit a [Support request](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/product-functionality).
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager or submit a [Support request](https://dashboard.plaid.com/support/new/product-and-development/product-troubleshooting/product-functionality).")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public TransactionsSyncRequestOptions includePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
    return this;
  }

   /**
   * Personal finance categories are now returned by default.
   * @return includePersonalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Personal finance categories are now returned by default.")

  public Boolean getIncludePersonalFinanceCategory() {
    return includePersonalFinanceCategory;
  }


  public void setIncludePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
  }


  public TransactionsSyncRequestOptions includeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
    return this;
  }

   /**
   * Counterparties and extra merchant fields are now returned by default.
   * @return includeLogoAndCounterpartyBeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Counterparties and extra merchant fields are now returned by default.")

  public Boolean getIncludeLogoAndCounterpartyBeta() {
    return includeLogoAndCounterpartyBeta;
  }


  public void setIncludeLogoAndCounterpartyBeta(Boolean includeLogoAndCounterpartyBeta) {
    this.includeLogoAndCounterpartyBeta = includeLogoAndCounterpartyBeta;
  }


  public TransactionsSyncRequestOptions daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * This option only applies to calls for Items that were not initialized with Transactions during Link and are now adding the Transactions product to the Item for the first time. In these cases, this option controls the maximum number of days of transaction history that Plaid will request from the financial institution. For developer accounts created after December 3, 2023, if no value is specified, this will default to 90 days. For developer accounts created on December 3, 2023 or earlier, if no value is specified, this will default to 730 days until June 24, 2024, at which point it will default to 90 days.  If Transactions has already been added to the Item prior to this call, this field will have no effect.  We strongly recommend that customers utilizing [Recurring Transactions](https://plaid.com/docs/api/products/transactions/#transactionsrecurringget) request at least 180 days of history for optimal results.
   * minimum: 1
   * maximum: 730
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This option only applies to calls for Items that were not initialized with Transactions during Link and are now adding the Transactions product to the Item for the first time. In these cases, this option controls the maximum number of days of transaction history that Plaid will request from the financial institution. For developer accounts created after December 3, 2023, if no value is specified, this will default to 90 days. For developer accounts created on December 3, 2023 or earlier, if no value is specified, this will default to 730 days until June 24, 2024, at which point it will default to 90 days.  If Transactions has already been added to the Item prior to this call, this field will have no effect.  We strongly recommend that customers utilizing [Recurring Transactions](https://plaid.com/docs/api/products/transactions/#transactionsrecurringget) request at least 180 days of history for optimal results.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsSyncRequestOptions transactionsSyncRequestOptions = (TransactionsSyncRequestOptions) o;
    return Objects.equals(this.includeOriginalDescription, transactionsSyncRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategory, transactionsSyncRequestOptions.includePersonalFinanceCategory) &&
        Objects.equals(this.includeLogoAndCounterpartyBeta, transactionsSyncRequestOptions.includeLogoAndCounterpartyBeta) &&
        Objects.equals(this.daysRequested, transactionsSyncRequestOptions.daysRequested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOriginalDescription, includePersonalFinanceCategory, includeLogoAndCounterpartyBeta, daysRequested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsSyncRequestOptions {\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategory: ").append(toIndentedString(includePersonalFinanceCategory)).append("\n");
    sb.append("    includeLogoAndCounterpartyBeta: ").append(toIndentedString(includeLogoAndCounterpartyBeta)).append("\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
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

