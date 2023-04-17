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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Information about the last webhook fired for the Item.
 */
@ApiModel(description = "Information about the last webhook fired for the Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class ItemStatusLastWebhook {
  public static final String SERIALIZED_NAME_SENT_AT = "sent_at";
  @SerializedName(SERIALIZED_NAME_SENT_AT)
  private OffsetDateTime sentAt;

  public static final String SERIALIZED_NAME_CODE_SENT = "code_sent";
  @SerializedName(SERIALIZED_NAME_CODE_SENT)
  private String codeSent;


  public ItemStatusLastWebhook sentAt(OffsetDateTime sentAt) {
    
    this.sentAt = sentAt;
    return this;
  }

   /**
   * [ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of when the webhook was fired. 
   * @return sentAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "[ISO 8601](https://wikipedia.org/wiki/ISO_8601) timestamp of when the webhook was fired. ")

  public OffsetDateTime getSentAt() {
    return sentAt;
  }


  public void setSentAt(OffsetDateTime sentAt) {
    this.sentAt = sentAt;
  }


  public ItemStatusLastWebhook codeSent(String codeSent) {
    
    this.codeSent = codeSent;
    return this;
  }

   /**
   * The last webhook code sent.
   * @return codeSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last webhook code sent.")

  public String getCodeSent() {
    return codeSent;
  }


  public void setCodeSent(String codeSent) {
    this.codeSent = codeSent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemStatusLastWebhook itemStatusLastWebhook = (ItemStatusLastWebhook) o;
    return Objects.equals(this.sentAt, itemStatusLastWebhook.sentAt) &&
        Objects.equals(this.codeSent, itemStatusLastWebhook.codeSent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentAt, codeSent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemStatusLastWebhook {\n");
    sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
    sb.append("    codeSent: ").append(toIndentedString(codeSent)).append("\n");
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

