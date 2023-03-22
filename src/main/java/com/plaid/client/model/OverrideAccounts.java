/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.343.0
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
import com.plaid.client.model.AccountSubtype;
import com.plaid.client.model.HoldingsOverride;
import com.plaid.client.model.IncomeOverride;
import com.plaid.client.model.InflowModel;
import com.plaid.client.model.InvestmentsTransactionsOverride;
import com.plaid.client.model.LiabilityOverride;
import com.plaid.client.model.Meta;
import com.plaid.client.model.Numbers;
import com.plaid.client.model.OverrideAccountType;
import com.plaid.client.model.OwnerOverride;
import com.plaid.client.model.TransactionOverride;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data to use to set values of test accounts. Some values cannot be specified in the schema and will instead will be calculated from other test data in order to achieve more consistent, realistic test data.
 */
@ApiModel(description = "Data to use to set values of test accounts. Some values cannot be specified in the schema and will instead will be calculated from other test data in order to achieve more consistent, realistic test data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-22T21:32:38.660057Z[Etc/UTC]")
public class OverrideAccounts {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OverrideAccountType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private AccountSubtype subtype;

  public static final String SERIALIZED_NAME_STARTING_BALANCE = "starting_balance";
  @SerializedName(SERIALIZED_NAME_STARTING_BALANCE)
  private Double startingBalance;

  public static final String SERIALIZED_NAME_FORCE_AVAILABLE_BALANCE = "force_available_balance";
  @SerializedName(SERIALIZED_NAME_FORCE_AVAILABLE_BALANCE)
  private Double forceAvailableBalance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Meta meta;

  public static final String SERIALIZED_NAME_NUMBERS = "numbers";
  @SerializedName(SERIALIZED_NAME_NUMBERS)
  private Numbers numbers;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<TransactionOverride> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOLDINGS = "holdings";
  @SerializedName(SERIALIZED_NAME_HOLDINGS)
  private HoldingsOverride holdings;

  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTIONS = "investment_transactions";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTIONS)
  private InvestmentsTransactionsOverride investmentTransactions;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private OwnerOverride identity;

  public static final String SERIALIZED_NAME_LIABILITY = "liability";
  @SerializedName(SERIALIZED_NAME_LIABILITY)
  private LiabilityOverride liability;

  public static final String SERIALIZED_NAME_INFLOW_MODEL = "inflow_model";
  @SerializedName(SERIALIZED_NAME_INFLOW_MODEL)
  private InflowModel inflowModel;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private IncomeOverride income;


  public OverrideAccounts type(OverrideAccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public OverrideAccountType getType() {
    return type;
  }


  public void setType(OverrideAccountType type) {
    this.type = type;
  }


  public OverrideAccounts subtype(AccountSubtype subtype) {
    
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


  public OverrideAccounts startingBalance(Double startingBalance) {
    
    this.startingBalance = startingBalance;
    return this;
  }

   /**
   * If provided, the account will start with this amount as the current balance. 
   * @return startingBalance
  **/
  @ApiModelProperty(required = true, value = "If provided, the account will start with this amount as the current balance. ")

  public Double getStartingBalance() {
    return startingBalance;
  }


  public void setStartingBalance(Double startingBalance) {
    this.startingBalance = startingBalance;
  }


  public OverrideAccounts forceAvailableBalance(Double forceAvailableBalance) {
    
    this.forceAvailableBalance = forceAvailableBalance;
    return this;
  }

   /**
   * If provided, the account will always have this amount as its  available balance, regardless of current balance or changes in transactions over time.
   * @return forceAvailableBalance
  **/
  @ApiModelProperty(required = true, value = "If provided, the account will always have this amount as its  available balance, regardless of current balance or changes in transactions over time.")

  public Double getForceAvailableBalance() {
    return forceAvailableBalance;
  }


  public void setForceAvailableBalance(Double forceAvailableBalance) {
    this.forceAvailableBalance = forceAvailableBalance;
  }


  public OverrideAccounts currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * ISO-4217 currency code. If provided, the account will be denominated in the given currency. Transactions will also be in this currency by default.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "ISO-4217 currency code. If provided, the account will be denominated in the given currency. Transactions will also be in this currency by default.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public OverrideAccounts meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public OverrideAccounts numbers(Numbers numbers) {
    
    this.numbers = numbers;
    return this;
  }

   /**
   * Get numbers
   * @return numbers
  **/
  @ApiModelProperty(required = true, value = "")

  public Numbers getNumbers() {
    return numbers;
  }


  public void setNumbers(Numbers numbers) {
    this.numbers = numbers;
  }


  public OverrideAccounts transactions(List<TransactionOverride> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public OverrideAccounts addTransactionsItem(TransactionOverride transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Specify the list of transactions on the account.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "Specify the list of transactions on the account.")

  public List<TransactionOverride> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<TransactionOverride> transactions) {
    this.transactions = transactions;
  }


  public OverrideAccounts holdings(HoldingsOverride holdings) {
    
    this.holdings = holdings;
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HoldingsOverride getHoldings() {
    return holdings;
  }


  public void setHoldings(HoldingsOverride holdings) {
    this.holdings = holdings;
  }


  public OverrideAccounts investmentTransactions(InvestmentsTransactionsOverride investmentTransactions) {
    
    this.investmentTransactions = investmentTransactions;
    return this;
  }

   /**
   * Get investmentTransactions
   * @return investmentTransactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentsTransactionsOverride getInvestmentTransactions() {
    return investmentTransactions;
  }


  public void setInvestmentTransactions(InvestmentsTransactionsOverride investmentTransactions) {
    this.investmentTransactions = investmentTransactions;
  }


  public OverrideAccounts identity(OwnerOverride identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(required = true, value = "")

  public OwnerOverride getIdentity() {
    return identity;
  }


  public void setIdentity(OwnerOverride identity) {
    this.identity = identity;
  }


  public OverrideAccounts liability(LiabilityOverride liability) {
    
    this.liability = liability;
    return this;
  }

   /**
   * Get liability
   * @return liability
  **/
  @ApiModelProperty(required = true, value = "")

  public LiabilityOverride getLiability() {
    return liability;
  }


  public void setLiability(LiabilityOverride liability) {
    this.liability = liability;
  }


  public OverrideAccounts inflowModel(InflowModel inflowModel) {
    
    this.inflowModel = inflowModel;
    return this;
  }

   /**
   * Get inflowModel
   * @return inflowModel
  **/
  @ApiModelProperty(required = true, value = "")

  public InflowModel getInflowModel() {
    return inflowModel;
  }


  public void setInflowModel(InflowModel inflowModel) {
    this.inflowModel = inflowModel;
  }


  public OverrideAccounts income(IncomeOverride income) {
    
    this.income = income;
    return this;
  }

   /**
   * Get income
   * @return income
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IncomeOverride getIncome() {
    return income;
  }


  public void setIncome(IncomeOverride income) {
    this.income = income;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverrideAccounts overrideAccounts = (OverrideAccounts) o;
    return Objects.equals(this.type, overrideAccounts.type) &&
        Objects.equals(this.subtype, overrideAccounts.subtype) &&
        Objects.equals(this.startingBalance, overrideAccounts.startingBalance) &&
        Objects.equals(this.forceAvailableBalance, overrideAccounts.forceAvailableBalance) &&
        Objects.equals(this.currency, overrideAccounts.currency) &&
        Objects.equals(this.meta, overrideAccounts.meta) &&
        Objects.equals(this.numbers, overrideAccounts.numbers) &&
        Objects.equals(this.transactions, overrideAccounts.transactions) &&
        Objects.equals(this.holdings, overrideAccounts.holdings) &&
        Objects.equals(this.investmentTransactions, overrideAccounts.investmentTransactions) &&
        Objects.equals(this.identity, overrideAccounts.identity) &&
        Objects.equals(this.liability, overrideAccounts.liability) &&
        Objects.equals(this.inflowModel, overrideAccounts.inflowModel) &&
        Objects.equals(this.income, overrideAccounts.income);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, subtype, startingBalance, forceAvailableBalance, currency, meta, numbers, transactions, holdings, investmentTransactions, identity, liability, inflowModel, income);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverrideAccounts {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    startingBalance: ").append(toIndentedString(startingBalance)).append("\n");
    sb.append("    forceAvailableBalance: ").append(toIndentedString(forceAvailableBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
    sb.append("    investmentTransactions: ").append(toIndentedString(investmentTransactions)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    liability: ").append(toIndentedString(liability)).append("\n");
    sb.append("    inflowModel: ").append(toIndentedString(inflowModel)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
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

