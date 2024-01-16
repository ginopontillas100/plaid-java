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
import java.util.ArrayList;
import java.util.List;

/**
 * Insights object for categories.
 */
@ApiModel(description = "Insights object for categories.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class CategoryInsightDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TRANSACTION_COUNT = "transaction_count";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_COUNT)
  private Integer transactionCount;

  public static final String SERIALIZED_NAME_TOTAL_OUTFLOWS = "total_outflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_OUTFLOWS)
  private Double totalOutflows;

  public static final String SERIALIZED_NAME_TOTAL_INFLOWS = "total_inflows";
  @SerializedName(SERIALIZED_NAME_TOTAL_INFLOWS)
  private Double totalInflows;

  public static final String SERIALIZED_NAME_TOP_COUNTERPARTIES = "top_counterparties";
  @SerializedName(SERIALIZED_NAME_TOP_COUNTERPARTIES)
  private List<String> topCounterparties = null;


  public CategoryInsightDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Category name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Category name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CategoryInsightDetails transactionCount(Integer transactionCount) {
    
    this.transactionCount = transactionCount;
    return this;
  }

   /**
   * The number of transactions associated with this category.
   * @return transactionCount
  **/
  @ApiModelProperty(required = true, value = "The number of transactions associated with this category.")

  public Integer getTransactionCount() {
    return transactionCount;
  }


  public void setTransactionCount(Integer transactionCount) {
    this.transactionCount = transactionCount;
  }


  public CategoryInsightDetails totalOutflows(Double totalOutflows) {
    
    this.totalOutflows = totalOutflows;
    return this;
  }

   /**
   * Sum of outflow amounts.
   * @return totalOutflows
  **/
  @ApiModelProperty(required = true, value = "Sum of outflow amounts.")

  public Double getTotalOutflows() {
    return totalOutflows;
  }


  public void setTotalOutflows(Double totalOutflows) {
    this.totalOutflows = totalOutflows;
  }


  public CategoryInsightDetails totalInflows(Double totalInflows) {
    
    this.totalInflows = totalInflows;
    return this;
  }

   /**
   * Sum of inflow amounts.
   * @return totalInflows
  **/
  @ApiModelProperty(required = true, value = "Sum of inflow amounts.")

  public Double getTotalInflows() {
    return totalInflows;
  }


  public void setTotalInflows(Double totalInflows) {
    this.totalInflows = totalInflows;
  }


  public CategoryInsightDetails topCounterparties(List<String> topCounterparties) {
    
    this.topCounterparties = topCounterparties;
    return this;
  }

  public CategoryInsightDetails addTopCounterpartiesItem(String topCounterpartiesItem) {
    if (this.topCounterparties == null) {
      this.topCounterparties = new ArrayList<>();
    }
    this.topCounterparties.add(topCounterpartiesItem);
    return this;
  }

   /**
   * The most common counterparties associated with this category sorted by outflow.
   * @return topCounterparties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The most common counterparties associated with this category sorted by outflow.")

  public List<String> getTopCounterparties() {
    return topCounterparties;
  }


  public void setTopCounterparties(List<String> topCounterparties) {
    this.topCounterparties = topCounterparties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryInsightDetails categoryInsightDetails = (CategoryInsightDetails) o;
    return Objects.equals(this.name, categoryInsightDetails.name) &&
        Objects.equals(this.transactionCount, categoryInsightDetails.transactionCount) &&
        Objects.equals(this.totalOutflows, categoryInsightDetails.totalOutflows) &&
        Objects.equals(this.totalInflows, categoryInsightDetails.totalInflows) &&
        Objects.equals(this.topCounterparties, categoryInsightDetails.topCounterparties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, transactionCount, totalOutflows, totalInflows, topCounterparties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryInsightDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transactionCount: ").append(toIndentedString(transactionCount)).append("\n");
    sb.append("    totalOutflows: ").append(toIndentedString(totalOutflows)).append("\n");
    sb.append("    totalInflows: ").append(toIndentedString(totalInflows)).append("\n");
    sb.append("    topCounterparties: ").append(toIndentedString(topCounterparties)).append("\n");
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

