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
import com.plaid.client.model.AccountBalance;
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.AccountIdentityAllOf;
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.AccountType;
import com.plaid.client.model.Owner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Identity information about an account
 */
@ApiModel(description = "Identity information about an account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class AccountIdentity {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  private AccountBalance balances;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private AccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  /**
   * The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified   &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.   
   */
  @JsonAdapter(VerificationStatusEnum.Adapter.class)
  public enum VerificationStatusEnum {
    AUTOMATICALLY_VERIFIED("automatically_verified"),
    
    PENDING_AUTOMATIC_VERIFICATION("pending_automatic_verification"),
    
    PENDING_MANUAL_VERIFICATION("pending_manual_verification"),
    
    MANUALLY_VERIFIED("manually_verified"),
    
    VERIFICATION_EXPIRED("verification_expired"),
    
    VERIFICATION_FAILED("verification_failed");

    private String value;

    VerificationStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationStatusEnum fromValue(String value) {
      for (VerificationStatusEnum b : VerificationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VerificationStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private VerificationStatusEnum verificationStatus;

  public static final String SERIALIZED_NAME_PERSISTENT_ACCOUNT_ID = "persistent_account_id";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_ACCOUNT_ID)
  private String persistentAccountId;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();


  public AccountIdentity accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the account. This value will not change unless Plaid can&#39;t reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new &#x60;account_id&#x60; will be assigned to the account.  The &#x60;account_id&#x60; can also change if the &#x60;access_token&#x60; is deleted and the same credentials that were used to generate that &#x60;access_token&#x60; are used to generate a new &#x60;access_token&#x60; on a later date. In that case, the new &#x60;account_id&#x60; will be different from the old &#x60;account_id&#x60;.  If an account with a specific &#x60;account_id&#x60; disappears instead of changing, the account is likely closed. Closed accounts are not returned by the Plaid API.  Like all Plaid identifiers, the &#x60;account_id&#x60; is case sensitive.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the account. This value will not change unless Plaid can't reconcile the account with the data returned by the financial institution. This may occur, for example, when the name of the account changes. If this happens a new `account_id` will be assigned to the account.  The `account_id` can also change if the `access_token` is deleted and the same credentials that were used to generate that `access_token` are used to generate a new `access_token` on a later date. In that case, the new `account_id` will be different from the old `account_id`.  If an account with a specific `account_id` disappears instead of changing, the account is likely closed. Closed accounts are not returned by the Plaid API.  Like all Plaid identifiers, the `account_id` is case sensitive.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountIdentity balances(AccountBalance balances) {
    
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountBalance getBalances() {
    return balances;
  }


  public void setBalances(AccountBalance balances) {
    this.balances = balances;
  }


  public AccountIdentity mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts, and it may also not match the mask that the bank displays to the user.
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user.")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public AccountIdentity name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the account, either assigned by the user or by the financial institution itself
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the account, either assigned by the user or by the financial institution itself")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AccountIdentity officialName(String officialName) {
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The official name of the account as given by the financial institution
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The official name of the account as given by the financial institution")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }


  public AccountIdentity type(AccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public AccountType getType() {
    return type;
  }


  public void setType(AccountType type) {
    this.type = type;
  }


  public AccountIdentity subtype(AccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(AccountSubtype subtype) {
    this.subtype = subtype;
  }


  public AccountIdentity verificationStatus(VerificationStatusEnum verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  &#x60;pending_automatic_verification&#x60;: The Item is pending automatic verification  &#x60;pending_manual_verification&#x60;: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  &#x60;automatically_verified&#x60;: The Item has successfully been automatically verified   &#x60;manually_verified&#x60;: The Item has successfully been manually verified  &#x60;verification_expired&#x60;: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  &#x60;verification_failed&#x60;: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.   
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current verification status of an Auth Item initiated through Automated or Manual micro-deposits.  Returned for Auth Items only.  `pending_automatic_verification`: The Item is pending automatic verification  `pending_manual_verification`: The Item is pending manual micro-deposit verification. Items remain in this state until the user successfully verifies the micro-deposit.  `automatically_verified`: The Item has successfully been automatically verified   `manually_verified`: The Item has successfully been manually verified  `verification_expired`: Plaid was unable to automatically verify the deposit within 7 calendar days and will no longer attempt to validate the Item. Users may retry by submitting their information again through Link.  `verification_failed`: The Item failed manual micro-deposit verification because the user exhausted all 3 verification attempts. Users may retry by submitting their information again through Link.   ")

  public VerificationStatusEnum getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public AccountIdentity persistentAccountId(String persistentAccountId) {
    
    this.persistentAccountId = persistentAccountId;
    return this;
  }

   /**
   * A unique and persistent identifier for accounts that can be used to trace multiple instances of the same account across different Items for depository accounts. This is currently an opt-in field and only supported for Chase Items.
   * @return persistentAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique and persistent identifier for accounts that can be used to trace multiple instances of the same account across different Items for depository accounts. This is currently an opt-in field and only supported for Chase Items.")

  public String getPersistentAccountId() {
    return persistentAccountId;
  }


  public void setPersistentAccountId(String persistentAccountId) {
    this.persistentAccountId = persistentAccountId;
  }


  public AccountIdentity owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountIdentity addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the `owners` object is not returned, and instead identity information is returned in the top level `identity` object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdentity accountIdentity = (AccountIdentity) o;
    return Objects.equals(this.accountId, accountIdentity.accountId) &&
        Objects.equals(this.balances, accountIdentity.balances) &&
        Objects.equals(this.mask, accountIdentity.mask) &&
        Objects.equals(this.name, accountIdentity.name) &&
        Objects.equals(this.officialName, accountIdentity.officialName) &&
        Objects.equals(this.type, accountIdentity.type) &&
        Objects.equals(this.subtype, accountIdentity.subtype) &&
        Objects.equals(this.verificationStatus, accountIdentity.verificationStatus) &&
        Objects.equals(this.persistentAccountId, accountIdentity.persistentAccountId) &&
        Objects.equals(this.owners, accountIdentity.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balances, mask, name, officialName, type, subtype, verificationStatus, persistentAccountId, owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdentity {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    persistentAccountId: ").append(toIndentedString(persistentAccountId)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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

