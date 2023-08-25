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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PaymentInitiationPaymentStatus;
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * Fired when the status of a payment has changed.
 */
@ApiModel(description = "Fired when the status of a payment has changed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class PaymentStatusUpdateWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "payment_id";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  private String paymentId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_NEW_PAYMENT_STATUS = "new_payment_status";
  @SerializedName(SERIALIZED_NAME_NEW_PAYMENT_STATUS)
  private PaymentInitiationPaymentStatus newPaymentStatus;

  public static final String SERIALIZED_NAME_OLD_PAYMENT_STATUS = "old_payment_status";
  @SerializedName(SERIALIZED_NAME_OLD_PAYMENT_STATUS)
  private PaymentInitiationPaymentStatus oldPaymentStatus;

  public static final String SERIALIZED_NAME_ORIGINAL_REFERENCE = "original_reference";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_REFERENCE)
  private String originalReference;

  public static final String SERIALIZED_NAME_ADJUSTED_REFERENCE = "adjusted_reference";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_REFERENCE)
  private String adjustedReference;

  public static final String SERIALIZED_NAME_ORIGINAL_START_DATE = "original_start_date";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_START_DATE)
  private LocalDate originalStartDate;

  public static final String SERIALIZED_NAME_ADJUSTED_START_DATE = "adjusted_start_date";
  @SerializedName(SERIALIZED_NAME_ADJUSTED_START_DATE)
  private LocalDate adjustedStartDate;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public PaymentStatusUpdateWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;PAYMENT_INITIATION&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`PAYMENT_INITIATION`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public PaymentStatusUpdateWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;PAYMENT_STATUS_UPDATE&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`PAYMENT_STATUS_UPDATE`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public PaymentStatusUpdateWebhook paymentId(String paymentId) {
    
    this.paymentId = paymentId;
    return this;
  }

   /**
   * The &#x60;payment_id&#x60; for the payment being updated
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "The `payment_id` for the payment being updated")

  public String getPaymentId() {
    return paymentId;
  }


  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }


  public PaymentStatusUpdateWebhook transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The transaction ID that this payment is associated with, if any. This is present only when a payment was initiated using virtual accounts.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transaction ID that this payment is associated with, if any. This is present only when a payment was initiated using virtual accounts.")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public PaymentStatusUpdateWebhook newPaymentStatus(PaymentInitiationPaymentStatus newPaymentStatus) {
    
    this.newPaymentStatus = newPaymentStatus;
    return this;
  }

   /**
   * Get newPaymentStatus
   * @return newPaymentStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationPaymentStatus getNewPaymentStatus() {
    return newPaymentStatus;
  }


  public void setNewPaymentStatus(PaymentInitiationPaymentStatus newPaymentStatus) {
    this.newPaymentStatus = newPaymentStatus;
  }


  public PaymentStatusUpdateWebhook oldPaymentStatus(PaymentInitiationPaymentStatus oldPaymentStatus) {
    
    this.oldPaymentStatus = oldPaymentStatus;
    return this;
  }

   /**
   * Get oldPaymentStatus
   * @return oldPaymentStatus
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationPaymentStatus getOldPaymentStatus() {
    return oldPaymentStatus;
  }


  public void setOldPaymentStatus(PaymentInitiationPaymentStatus oldPaymentStatus) {
    this.oldPaymentStatus = oldPaymentStatus;
  }


  public PaymentStatusUpdateWebhook originalReference(String originalReference) {
    
    this.originalReference = originalReference;
    return this;
  }

   /**
   * The original value of the reference when creating the payment.
   * @return originalReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original value of the reference when creating the payment.")

  public String getOriginalReference() {
    return originalReference;
  }


  public void setOriginalReference(String originalReference) {
    this.originalReference = originalReference;
  }


  public PaymentStatusUpdateWebhook adjustedReference(String adjustedReference) {
    
    this.adjustedReference = adjustedReference;
    return this;
  }

   /**
   * The value of the reference sent to the bank after adjustment to pass bank validation rules.
   * @return adjustedReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the reference sent to the bank after adjustment to pass bank validation rules.")

  public String getAdjustedReference() {
    return adjustedReference;
  }


  public void setAdjustedReference(String adjustedReference) {
    this.adjustedReference = adjustedReference;
  }


  public PaymentStatusUpdateWebhook originalStartDate(LocalDate originalStartDate) {
    
    this.originalStartDate = originalStartDate;
    return this;
  }

   /**
   * The original value of the &#x60;start_date&#x60; provided during the creation of a standing order. If the payment is not a standing order, this field will be &#x60;null&#x60;.
   * @return originalStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The original value of the `start_date` provided during the creation of a standing order. If the payment is not a standing order, this field will be `null`.")

  public LocalDate getOriginalStartDate() {
    return originalStartDate;
  }


  public void setOriginalStartDate(LocalDate originalStartDate) {
    this.originalStartDate = originalStartDate;
  }


  public PaymentStatusUpdateWebhook adjustedStartDate(LocalDate adjustedStartDate) {
    
    this.adjustedStartDate = adjustedStartDate;
    return this;
  }

   /**
   * The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, or if the payment is not a standing order, this field will be &#x60;null&#x60;.
   * @return adjustedStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The start date sent to the bank after adjusting for holidays or weekends.  Will be provided in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD). If the start date did not require adjustment, or if the payment is not a standing order, this field will be `null`.")

  public LocalDate getAdjustedStartDate() {
    return adjustedStartDate;
  }


  public void setAdjustedStartDate(LocalDate adjustedStartDate) {
    this.adjustedStartDate = adjustedStartDate;
  }


  public PaymentStatusUpdateWebhook timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. &#x60;\&quot;2017-09-14T14:42:19.350Z\&quot;&#x60;
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The timestamp of the update, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format, e.g. `\"2017-09-14T14:42:19.350Z\"`")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public PaymentStatusUpdateWebhook error(PlaidError error) {
    
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


  public PaymentStatusUpdateWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentStatusUpdateWebhook paymentStatusUpdateWebhook = (PaymentStatusUpdateWebhook) o;
    return Objects.equals(this.webhookType, paymentStatusUpdateWebhook.webhookType) &&
        Objects.equals(this.webhookCode, paymentStatusUpdateWebhook.webhookCode) &&
        Objects.equals(this.paymentId, paymentStatusUpdateWebhook.paymentId) &&
        Objects.equals(this.transactionId, paymentStatusUpdateWebhook.transactionId) &&
        Objects.equals(this.newPaymentStatus, paymentStatusUpdateWebhook.newPaymentStatus) &&
        Objects.equals(this.oldPaymentStatus, paymentStatusUpdateWebhook.oldPaymentStatus) &&
        Objects.equals(this.originalReference, paymentStatusUpdateWebhook.originalReference) &&
        Objects.equals(this.adjustedReference, paymentStatusUpdateWebhook.adjustedReference) &&
        Objects.equals(this.originalStartDate, paymentStatusUpdateWebhook.originalStartDate) &&
        Objects.equals(this.adjustedStartDate, paymentStatusUpdateWebhook.adjustedStartDate) &&
        Objects.equals(this.timestamp, paymentStatusUpdateWebhook.timestamp) &&
        Objects.equals(this.error, paymentStatusUpdateWebhook.error) &&
        Objects.equals(this.environment, paymentStatusUpdateWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, paymentId, transactionId, newPaymentStatus, oldPaymentStatus, originalReference, adjustedReference, originalStartDate, adjustedStartDate, timestamp, error, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentStatusUpdateWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    newPaymentStatus: ").append(toIndentedString(newPaymentStatus)).append("\n");
    sb.append("    oldPaymentStatus: ").append(toIndentedString(oldPaymentStatus)).append("\n");
    sb.append("    originalReference: ").append(toIndentedString(originalReference)).append("\n");
    sb.append("    adjustedReference: ").append(toIndentedString(adjustedReference)).append("\n");
    sb.append("    originalStartDate: ").append(toIndentedString(originalStartDate)).append("\n");
    sb.append("    adjustedStartDate: ").append(toIndentedString(adjustedStartDate)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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

