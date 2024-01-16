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
 * Information describing the intent of the transaction. Most relevant for personal finance use cases, but not limited to such use cases.  See the [&#x60;taxonomy CSV file&#x60;](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories. If you are migrating to personal finance categories from the legacy categories, also refer to the [&#x60;migration guide&#x60;](https://plaid.com/docs/transactions/pfc-migration/).
 */
@ApiModel(description = "Information describing the intent of the transaction. Most relevant for personal finance use cases, but not limited to such use cases.  See the [`taxonomy CSV file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories. If you are migrating to personal finance categories from the legacy categories, also refer to the [`migration guide`](https://plaid.com/docs/transactions/pfc-migration/).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class PersonalFinanceCategory {
  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private String primary;

  public static final String SERIALIZED_NAME_DETAILED = "detailed";
  @SerializedName(SERIALIZED_NAME_DETAILED)
  private String detailed;

  public static final String SERIALIZED_NAME_CONFIDENCE_LEVEL = "confidence_level";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_LEVEL)
  private String confidenceLevel;


  public PersonalFinanceCategory primary(String primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A high level category that communicates the broad category of the transaction.
   * @return primary
  **/
  @ApiModelProperty(required = true, value = "A high level category that communicates the broad category of the transaction.")

  public String getPrimary() {
    return primary;
  }


  public void setPrimary(String primary) {
    this.primary = primary;
  }


  public PersonalFinanceCategory detailed(String detailed) {
    
    this.detailed = detailed;
    return this;
  }

   /**
   * A granular category conveying the transaction&#39;s intent. This field can also be used as a unique identifier for the category.
   * @return detailed
  **/
  @ApiModelProperty(required = true, value = "A granular category conveying the transaction's intent. This field can also be used as a unique identifier for the category.")

  public String getDetailed() {
    return detailed;
  }


  public void setDetailed(String detailed) {
    this.detailed = detailed;
  }


  public PersonalFinanceCategory confidenceLevel(String confidenceLevel) {
    
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * A description of how confident we are that the provided categories accurately describe the transaction intent.  &#x60;VERY_HIGH&#x60;: We are more than 98% confident that this category reflects the intent of the transaction. &#x60;HIGH&#x60;: We are more than 90% confident that this category reflects the intent of the transaction. &#x60;MEDIUM&#x60;: We are moderately confident that this category reflects the intent of the transaction. &#x60;LOW&#x60;: This category may reflect the intent, but there may be other categories that are more accurate. &#x60;UNKNOWN&#x60;: We don’t know the confidence level for this category.
   * @return confidenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of how confident we are that the provided categories accurately describe the transaction intent.  `VERY_HIGH`: We are more than 98% confident that this category reflects the intent of the transaction. `HIGH`: We are more than 90% confident that this category reflects the intent of the transaction. `MEDIUM`: We are moderately confident that this category reflects the intent of the transaction. `LOW`: This category may reflect the intent, but there may be other categories that are more accurate. `UNKNOWN`: We don’t know the confidence level for this category.")

  public String getConfidenceLevel() {
    return confidenceLevel;
  }


  public void setConfidenceLevel(String confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalFinanceCategory personalFinanceCategory = (PersonalFinanceCategory) o;
    return Objects.equals(this.primary, personalFinanceCategory.primary) &&
        Objects.equals(this.detailed, personalFinanceCategory.detailed) &&
        Objects.equals(this.confidenceLevel, personalFinanceCategory.confidenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, detailed, confidenceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalFinanceCategory {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    detailed: ").append(toIndentedString(detailed)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
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

