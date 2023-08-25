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
import com.plaid.client.model.LinkSessionSuccessMetadataAccount;
import com.plaid.client.model.LinkSessionSuccessMetadataInstitution;
import com.plaid.client.model.LinkSessionSuccessMetadataTransferStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Displayed once a user has successfully linked their Item.
 */
@ApiModel(description = "Displayed once a user has successfully linked their Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class LinkSessionSuccessMetadata {
  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private LinkSessionSuccessMetadataInstitution institution;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<LinkSessionSuccessMetadataAccount> accounts = null;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transfer_status";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  private LinkSessionSuccessMetadataTransferStatus transferStatus;


  public LinkSessionSuccessMetadata institution(LinkSessionSuccessMetadataInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionSuccessMetadataInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(LinkSessionSuccessMetadataInstitution institution) {
    this.institution = institution;
  }


  public LinkSessionSuccessMetadata accounts(List<LinkSessionSuccessMetadataAccount> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public LinkSessionSuccessMetadata addAccountsItem(LinkSessionSuccessMetadataAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, &#x60;accounts&#x60; will only include selected accounts.
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of accounts attached to the connected Item. If Account Select is enabled via the developer dashboard, `accounts` will only include selected accounts.")

  public List<LinkSessionSuccessMetadataAccount> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<LinkSessionSuccessMetadataAccount> accounts) {
    this.accounts = accounts;
  }


  public LinkSessionSuccessMetadata linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * A unique identifier associated with a user&#39;s actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.
   * @return linkSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier associated with a user's actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkSessionSuccessMetadata transferStatus(LinkSessionSuccessMetadataTransferStatus transferStatus) {
    
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * Get transferStatus
   * @return transferStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionSuccessMetadataTransferStatus getTransferStatus() {
    return transferStatus;
  }


  public void setTransferStatus(LinkSessionSuccessMetadataTransferStatus transferStatus) {
    this.transferStatus = transferStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSessionSuccessMetadata linkSessionSuccessMetadata = (LinkSessionSuccessMetadata) o;
    return Objects.equals(this.institution, linkSessionSuccessMetadata.institution) &&
        Objects.equals(this.accounts, linkSessionSuccessMetadata.accounts) &&
        Objects.equals(this.linkSessionId, linkSessionSuccessMetadata.linkSessionId) &&
        Objects.equals(this.transferStatus, linkSessionSuccessMetadata.transferStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, accounts, linkSessionId, transferStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionSuccessMetadata {\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
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

