/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
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
import com.plaid.client.model.DistributionBreakdown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Details about the pay period.
 */
@ApiModel(description = "Details about the pay period.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class PayPeriodDetails {
  public static final String SERIALIZED_NAME_CHECK_AMOUNT = "check_amount";
  @SerializedName(SERIALIZED_NAME_CHECK_AMOUNT)
  private Double checkAmount;

  public static final String SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN = "distribution_breakdown";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_BREAKDOWN)
  private List<DistributionBreakdown> distributionBreakdown = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_GROSS_EARNINGS = "gross_earnings";
  @SerializedName(SERIALIZED_NAME_GROSS_EARNINGS)
  private Double grossEarnings;

  public static final String SERIALIZED_NAME_PAY_DATE = "pay_date";
  @SerializedName(SERIALIZED_NAME_PAY_DATE)
  private LocalDate payDate;

  /**
   * The frequency at which an individual is paid.
   */
  @JsonAdapter(PayFrequencyEnum.Adapter.class)
  public enum PayFrequencyEnum {
    PAY_FREQUENCY_UNKNOWN("PAY_FREQUENCY_UNKNOWN"),
    
    PAY_FREQUENCY_WEEKLY("PAY_FREQUENCY_WEEKLY"),
    
    PAY_FREQUENCY_BIWEEKLY("PAY_FREQUENCY_BIWEEKLY"),
    
    PAY_FREQUENCY_SEMIMONTHLY("PAY_FREQUENCY_SEMIMONTHLY"),
    
    PAY_FREQUENCY_MONTHLY("PAY_FREQUENCY_MONTHLY"),
    
    NULL("null");

    private String value;

    PayFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayFrequencyEnum fromValue(String value) {
      for (PayFrequencyEnum b : PayFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PayFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_FREQUENCY = "pay_frequency";
  @SerializedName(SERIALIZED_NAME_PAY_FREQUENCY)
  private PayFrequencyEnum payFrequency;

  public static final String SERIALIZED_NAME_PAY_DAY = "pay_day";
  @SerializedName(SERIALIZED_NAME_PAY_DAY)
  private LocalDate payDay;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;


  public PayPeriodDetails checkAmount(Double checkAmount) {
    
    this.checkAmount = checkAmount;
    return this;
  }

   /**
   * The amount of the paycheck.
   * @return checkAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the paycheck.")

  public Double getCheckAmount() {
    return checkAmount;
  }


  public void setCheckAmount(Double checkAmount) {
    this.checkAmount = checkAmount;
  }


  public PayPeriodDetails distributionBreakdown(List<DistributionBreakdown> distributionBreakdown) {
    
    this.distributionBreakdown = distributionBreakdown;
    return this;
  }

  public PayPeriodDetails addDistributionBreakdownItem(DistributionBreakdown distributionBreakdownItem) {
    if (this.distributionBreakdown == null) {
      this.distributionBreakdown = new ArrayList<>();
    }
    this.distributionBreakdown.add(distributionBreakdownItem);
    return this;
  }

   /**
   * Get distributionBreakdown
   * @return distributionBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DistributionBreakdown> getDistributionBreakdown() {
    return distributionBreakdown;
  }


  public void setDistributionBreakdown(List<DistributionBreakdown> distributionBreakdown) {
    this.distributionBreakdown = distributionBreakdown;
  }


  public PayPeriodDetails endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period end date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public PayPeriodDetails grossEarnings(Double grossEarnings) {
    
    this.grossEarnings = grossEarnings;
    return this;
  }

   /**
   * Total earnings before tax/deductions.
   * @return grossEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total earnings before tax/deductions.")

  public Double getGrossEarnings() {
    return grossEarnings;
  }


  public void setGrossEarnings(Double grossEarnings) {
    this.grossEarnings = grossEarnings;
  }


  public PayPeriodDetails payDate(LocalDate payDate) {
    
    this.payDate = payDate;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDate() {
    return payDate;
  }


  public void setPayDate(LocalDate payDate) {
    this.payDate = payDate;
  }


  public PayPeriodDetails payFrequency(PayFrequencyEnum payFrequency) {
    
    this.payFrequency = payFrequency;
    return this;
  }

   /**
   * The frequency at which an individual is paid.
   * @return payFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The frequency at which an individual is paid.")

  public PayFrequencyEnum getPayFrequency() {
    return payFrequency;
  }


  public void setPayFrequency(PayFrequencyEnum payFrequency) {
    this.payFrequency = payFrequency;
  }


  public PayPeriodDetails payDay(LocalDate payDay) {
    
    this.payDay = payDay;
    return this;
  }

   /**
   * The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\&quot;yyyy-mm-dd\&quot;).
   * @return payDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the paystub was issued, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (\"yyyy-mm-dd\").")

  public LocalDate getPayDay() {
    return payDay;
  }


  public void setPayDay(LocalDate payDay) {
    this.payDay = payDay;
  }


  public PayPeriodDetails startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \&quot;yyyy-mm-dd\&quot;.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The pay period start date, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format: \"yyyy-mm-dd\".")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPeriodDetails payPeriodDetails = (PayPeriodDetails) o;
    return Objects.equals(this.checkAmount, payPeriodDetails.checkAmount) &&
        Objects.equals(this.distributionBreakdown, payPeriodDetails.distributionBreakdown) &&
        Objects.equals(this.endDate, payPeriodDetails.endDate) &&
        Objects.equals(this.grossEarnings, payPeriodDetails.grossEarnings) &&
        Objects.equals(this.payDate, payPeriodDetails.payDate) &&
        Objects.equals(this.payFrequency, payPeriodDetails.payFrequency) &&
        Objects.equals(this.payDay, payPeriodDetails.payDay) &&
        Objects.equals(this.startDate, payPeriodDetails.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkAmount, distributionBreakdown, endDate, grossEarnings, payDate, payFrequency, payDay, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPeriodDetails {\n");
    sb.append("    checkAmount: ").append(toIndentedString(checkAmount)).append("\n");
    sb.append("    distributionBreakdown: ").append(toIndentedString(distributionBreakdown)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    grossEarnings: ").append(toIndentedString(grossEarnings)).append("\n");
    sb.append("    payDate: ").append(toIndentedString(payDate)).append("\n");
    sb.append("    payFrequency: ").append(toIndentedString(payFrequency)).append("\n");
    sb.append("    payDay: ").append(toIndentedString(payDay)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

