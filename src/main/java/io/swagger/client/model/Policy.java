/*
 * FRISS API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.threeten.bp.OffsetDateTime;
/**
 * Policy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class Policy extends AdditionalFieldsBase {
  @SerializedName("broker")
  private LegalEntityRefOfCompany broker = null;

  @SerializedName("agent")
  private LegalEntityRef agent = null;

  @SerializedName("agents")
  private List<LegalEntityRef> agents = null;

  @SerializedName("holders")
  private List<LegalEntityRef> holders = new ArrayList<LegalEntityRef>();

  @SerializedName("policyManagers")
  private List<LegalEntityRefOfPerson> policyManagers = null;

  @SerializedName("mortgagees")
  private List<LegalEntityRefOfCompany> mortgagees = null;

  @SerializedName("leaseHolders")
  private List<LegalEntityRefOfCompany> leaseHolders = null;

  @SerializedName("lienHolders")
  private List<LegalEntityRef> lienHolders = null;

  @SerializedName("premiumPayers")
  private List<LegalEntityRef> premiumPayers = null;

  @SerializedName("objectsInsured")
  private List<ObjectInsured> objectsInsured = null;

  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("inceptionDate")
  private OffsetDateTime inceptionDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("yearsWithoutClaim")
  private Integer yearsWithoutClaim = null;

  @SerializedName("insuredAmount")
  private BigDecimal insuredAmount = null;

  @SerializedName("incurredAmount")
  private BigDecimal incurredAmount = null;

  @SerializedName("annualPremium")
  private BigDecimal annualPremium = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("channel")
  private PolicyChannel channel = null;

  @SerializedName("type")
  private Objekt type = null;

  @SerializedName("signingDate")
  private OffsetDateTime signingDate = null;

  @SerializedName("coverages")
  private List<Coverage> coverages = null;

  @SerializedName("previousExpiryDate")
  private OffsetDateTime previousExpiryDate = null;

  @SerializedName("renewalDate")
  private OffsetDateTime renewalDate = null;

  @SerializedName("amountExcess")
  private BigDecimal amountExcess = null;

  @SerializedName("fleetFlag")
  private Boolean fleetFlag = null;

  @SerializedName("paymentFrequency")
  private PolicyPaymentFrequency paymentFrequency = null;

  @SerializedName("paymentType")
  private PolicyPaymentType paymentType = null;

  @SerializedName("changes")
  private List<PolicyChange> changes = null;

  @SerializedName("last3Changes")
  private List<PolicyChange> last3Changes = null;

  @SerializedName("applicationDate")
  private OffsetDateTime applicationDate = null;

  @SerializedName("freeClaim")
  private Boolean freeClaim = null;

  @SerializedName("status")
  private PolicyStatus status = null;

  @SerializedName("latePaymentWarning")
  private Boolean latePaymentWarning = null;

  @SerializedName("premiumDiscount")
  private Integer premiumDiscount = null;

  @SerializedName("endReason")
  private String endReason = null;

  @SerializedName("holderDateFirstPolicy")
  private OffsetDateTime holderDateFirstPolicy = null;

  @SerializedName("bonusMalusScale")
  private String bonusMalusScale = null;

  @SerializedName("bonusMalusPercentage")
  private Integer bonusMalusPercentage = null;

  @SerializedName("numberOfAssistanceClaims")
  private Integer numberOfAssistanceClaims = null;

  @SerializedName("commercialLabel")
  private String commercialLabel = null;

  @SerializedName("lossRatio")
  private Integer lossRatio = null;

  @SerializedName("otherInsured")
  private List<LegalEntityRef> otherInsured = null;

  public Policy broker(LegalEntityRefOfCompany broker) {
    this.broker = broker;
    return this;
  }

   /**
   * A reference to the [Company](#company) that is the insurance broker for this policy
   * @return broker
  **/
  @Schema(description = "A reference to the [Company](#company) that is the insurance broker for this policy")
  public LegalEntityRefOfCompany getBroker() {
    return broker;
  }

  public void setBroker(LegalEntityRefOfCompany broker) {
    this.broker = broker;
  }

  public Policy agent(LegalEntityRef agent) {
    this.agent = agent;
    return this;
  }

   /**
   * [Deprecated]
   * @return agent
  **/
  @Schema(description = "[Deprecated]")
  public LegalEntityRef getAgent() {
    return agent;
  }

  public void setAgent(LegalEntityRef agent) {
    this.agent = agent;
  }

  public Policy agents(List<LegalEntityRef> agents) {
    this.agents = agents;
    return this;
  }

  public Policy addAgentsItem(LegalEntityRef agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<LegalEntityRef>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * An array of reference to a [LegalEntity](#legalentity) (of type [Person](#person) or [Company](#company)) that are the insurance brokers for this policy
   * @return agents
  **/
  @Schema(description = "An array of reference to a [LegalEntity](#legalentity) (of type [Person](#person) or [Company](#company)) that are the insurance brokers for this policy")
  public List<LegalEntityRef> getAgents() {
    return agents;
  }

  public void setAgents(List<LegalEntityRef> agents) {
    this.agents = agents;
  }

  public Policy holders(List<LegalEntityRef> holders) {
    this.holders = holders;
    return this;
  }

  public Policy addHoldersItem(LegalEntityRef holdersItem) {
    this.holders.add(holdersItem);
    return this;
  }

   /**
   * An array of references to the holders (of type [LegalEntity](#legalentity)) of the policy
   * @return holders
  **/
  @Schema(required = true, description = "An array of references to the holders (of type [LegalEntity](#legalentity)) of the policy")
  public List<LegalEntityRef> getHolders() {
    return holders;
  }

  public void setHolders(List<LegalEntityRef> holders) {
    this.holders = holders;
  }

  public Policy policyManagers(List<LegalEntityRefOfPerson> policyManagers) {
    this.policyManagers = policyManagers;
    return this;
  }

  public Policy addPolicyManagersItem(LegalEntityRefOfPerson policyManagersItem) {
    if (this.policyManagers == null) {
      this.policyManagers = new ArrayList<LegalEntityRefOfPerson>();
    }
    this.policyManagers.add(policyManagersItem);
    return this;
  }

   /**
   * An array of references to the policy managers (of type [LegalEntity](#legalentity) (of type [Person](#person)) of the policy. The Policy Manager is the person that is managing the policy.
   * @return policyManagers
  **/
  @Schema(description = "An array of references to the policy managers (of type [LegalEntity](#legalentity) (of type [Person](#person)) of the policy. The Policy Manager is the person that is managing the policy.")
  public List<LegalEntityRefOfPerson> getPolicyManagers() {
    return policyManagers;
  }

  public void setPolicyManagers(List<LegalEntityRefOfPerson> policyManagers) {
    this.policyManagers = policyManagers;
  }

  public Policy mortgagees(List<LegalEntityRefOfCompany> mortgagees) {
    this.mortgagees = mortgagees;
    return this;
  }

  public Policy addMortgageesItem(LegalEntityRefOfCompany mortgageesItem) {
    if (this.mortgagees == null) {
      this.mortgagees = new ArrayList<LegalEntityRefOfCompany>();
    }
    this.mortgagees.add(mortgageesItem);
    return this;
  }

   /**
   * A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the mortgagee and has an insurable interest in an insured object
   * @return mortgagees
  **/
  @Schema(description = "A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the mortgagee and has an insurable interest in an insured object")
  public List<LegalEntityRefOfCompany> getMortgagees() {
    return mortgagees;
  }

  public void setMortgagees(List<LegalEntityRefOfCompany> mortgagees) {
    this.mortgagees = mortgagees;
  }

  public Policy leaseHolders(List<LegalEntityRefOfCompany> leaseHolders) {
    this.leaseHolders = leaseHolders;
    return this;
  }

  public Policy addLeaseHoldersItem(LegalEntityRefOfCompany leaseHoldersItem) {
    if (this.leaseHolders == null) {
      this.leaseHolders = new ArrayList<LegalEntityRefOfCompany>();
    }
    this.leaseHolders.add(leaseHoldersItem);
    return this;
  }

   /**
   * A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the lienholder and has an insurable interest in an insured object
   * @return leaseHolders
  **/
  @Schema(description = "A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the lienholder and has an insurable interest in an insured object")
  public List<LegalEntityRefOfCompany> getLeaseHolders() {
    return leaseHolders;
  }

  public void setLeaseHolders(List<LegalEntityRefOfCompany> leaseHolders) {
    this.leaseHolders = leaseHolders;
  }

  public Policy lienHolders(List<LegalEntityRef> lienHolders) {
    this.lienHolders = lienHolders;
    return this;
  }

  public Policy addLienHoldersItem(LegalEntityRef lienHoldersItem) {
    if (this.lienHolders == null) {
      this.lienHolders = new ArrayList<LegalEntityRef>();
    }
    this.lienHolders.add(lienHoldersItem);
    return this;
  }

   /**
   * A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the lienholder of an insured object
   * @return lienHolders
  **/
  @Schema(description = "A reference to a [LegalEntity](#legalentity) (of type [Company](#company)) that represents the lienholder of an insured object")
  public List<LegalEntityRef> getLienHolders() {
    return lienHolders;
  }

  public void setLienHolders(List<LegalEntityRef> lienHolders) {
    this.lienHolders = lienHolders;
  }

  public Policy premiumPayers(List<LegalEntityRef> premiumPayers) {
    this.premiumPayers = premiumPayers;
    return this;
  }

  public Policy addPremiumPayersItem(LegalEntityRef premiumPayersItem) {
    if (this.premiumPayers == null) {
      this.premiumPayers = new ArrayList<LegalEntityRef>();
    }
    this.premiumPayers.add(premiumPayersItem);
    return this;
  }

   /**
   * A reference to a [LegalEntity](#legalentity) that represents policy&#x27;s premium payers
   * @return premiumPayers
  **/
  @Schema(description = "A reference to a [LegalEntity](#legalentity) that represents policy's premium payers")
  public List<LegalEntityRef> getPremiumPayers() {
    return premiumPayers;
  }

  public void setPremiumPayers(List<LegalEntityRef> premiumPayers) {
    this.premiumPayers = premiumPayers;
  }

  public Policy objectsInsured(List<ObjectInsured> objectsInsured) {
    this.objectsInsured = objectsInsured;
    return this;
  }

  public Policy addObjectsInsuredItem(ObjectInsured objectsInsuredItem) {
    if (this.objectsInsured == null) {
      this.objectsInsured = new ArrayList<ObjectInsured>();
    }
    this.objectsInsured.add(objectsInsuredItem);
    return this;
  }

   /**
   * An array of the insured objects (of type [Object](#object)) on the policy
   * @return objectsInsured
  **/
  @Schema(description = "An array of the insured objects (of type [Object](#object)) on the policy")
  public List<ObjectInsured> getObjectsInsured() {
    return objectsInsured;
  }

  public void setObjectsInsured(List<ObjectInsured> objectsInsured) {
    this.objectsInsured = objectsInsured;
  }

  public Policy policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * The unique identifier for the policy
   * @return policyId
  **/
  @Schema(required = true, description = "The unique identifier for the policy")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public Policy inceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
    return this;
  }

   /**
   * The date of policy inception
   * @return inceptionDate
  **/
  @Schema(description = "The date of policy inception")
  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }

  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }

  public Policy endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date when the policy will be terminated. Note that after a policy renewal this date changes.
   * @return endDate
  **/
  @Schema(description = "The date when the policy will be terminated. Note that after a policy renewal this date changes.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public Policy yearsWithoutClaim(Integer yearsWithoutClaim) {
    this.yearsWithoutClaim = yearsWithoutClaim;
    return this;
  }

   /**
   * The number of &#x27;no-claim&#x27; years of the policy holder
   * @return yearsWithoutClaim
  **/
  @Schema(description = "The number of 'no-claim' years of the policy holder")
  public Integer getYearsWithoutClaim() {
    return yearsWithoutClaim;
  }

  public void setYearsWithoutClaim(Integer yearsWithoutClaim) {
    this.yearsWithoutClaim = yearsWithoutClaim;
  }

  public Policy insuredAmount(BigDecimal insuredAmount) {
    this.insuredAmount = insuredAmount;
    return this;
  }

   /**
   * The total amount that is covered by the insurance policy
   * @return insuredAmount
  **/
  @Schema(description = "The total amount that is covered by the insurance policy")
  public BigDecimal getInsuredAmount() {
    return insuredAmount;
  }

  public void setInsuredAmount(BigDecimal insuredAmount) {
    this.insuredAmount = insuredAmount;
  }

  public Policy incurredAmount(BigDecimal incurredAmount) {
    this.incurredAmount = incurredAmount;
    return this;
  }

   /**
   * The total amount of damages incurred on the current policy
   * @return incurredAmount
  **/
  @Schema(description = "The total amount of damages incurred on the current policy")
  public BigDecimal getIncurredAmount() {
    return incurredAmount;
  }

  public void setIncurredAmount(BigDecimal incurredAmount) {
    this.incurredAmount = incurredAmount;
  }

  public Policy annualPremium(BigDecimal annualPremium) {
    this.annualPremium = annualPremium;
    return this;
  }

   /**
   * The annual premium of the policy
   * @return annualPremium
  **/
  @Schema(description = "The annual premium of the policy")
  public BigDecimal getAnnualPremium() {
    return annualPremium;
  }

  public void setAnnualPremium(BigDecimal annualPremium) {
    this.annualPremium = annualPremium;
  }

  public Policy product(String product) {
    this.product = product;
    return this;
  }

   /**
   * The insurance product insured on the policy
   * @return product
  **/
  @Schema(description = "The insurance product insured on the policy")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public Policy channel(PolicyChannel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel that was used for closing the policy contract
   * @return channel
  **/
  @Schema(description = "The channel that was used for closing the policy contract")
  public PolicyChannel getChannel() {
    return channel;
  }

  public void setChannel(PolicyChannel channel) {
    this.channel = channel;
  }

  public Policy type(Objekt type) {
    this.type = type;
    return this;
  }

   /**
   * The type of policy, private or commercial
   * @return type
  **/
  @Schema(description = "The type of policy, private or commercial")
  public Objekt getType() {
    return type;
  }

  public void setType(Objekt type) {
    this.type = type;
  }

  public Policy signingDate(OffsetDateTime signingDate) {
    this.signingDate = signingDate;
    return this;
  }

   /**
   * The signing date of the policy
   * @return signingDate
  **/
  @Schema(description = "The signing date of the policy")
  public OffsetDateTime getSigningDate() {
    return signingDate;
  }

  public void setSigningDate(OffsetDateTime signingDate) {
    this.signingDate = signingDate;
  }

  public Policy coverages(List<Coverage> coverages) {
    this.coverages = coverages;
    return this;
  }

  public Policy addCoveragesItem(Coverage coveragesItem) {
    if (this.coverages == null) {
      this.coverages = new ArrayList<Coverage>();
    }
    this.coverages.add(coveragesItem);
    return this;
  }

   /**
   * An array of the policy&#x27;s coverage types
   * @return coverages
  **/
  @Schema(description = "An array of the policy's coverage types")
  public List<Coverage> getCoverages() {
    return coverages;
  }

  public void setCoverages(List<Coverage> coverages) {
    this.coverages = coverages;
  }

  public Policy previousExpiryDate(OffsetDateTime previousExpiryDate) {
    this.previousExpiryDate = previousExpiryDate;
    return this;
  }

   /**
   * The date when the policy would be terminated before renewal. In case of a new policy this date should be left empty
   * @return previousExpiryDate
  **/
  @Schema(description = "The date when the policy would be terminated before renewal. In case of a new policy this date should be left empty")
  public OffsetDateTime getPreviousExpiryDate() {
    return previousExpiryDate;
  }

  public void setPreviousExpiryDate(OffsetDateTime previousExpiryDate) {
    this.previousExpiryDate = previousExpiryDate;
  }

  public Policy renewalDate(OffsetDateTime renewalDate) {
    this.renewalDate = renewalDate;
    return this;
  }

   /**
   * The date of start of coverage after renewal. In case of a new policy this will equal the date of inception
   * @return renewalDate
  **/
  @Schema(description = "The date of start of coverage after renewal. In case of a new policy this will equal the date of inception")
  public OffsetDateTime getRenewalDate() {
    return renewalDate;
  }

  public void setRenewalDate(OffsetDateTime renewalDate) {
    this.renewalDate = renewalDate;
  }

  public Policy amountExcess(BigDecimal amountExcess) {
    this.amountExcess = amountExcess;
    return this;
  }

   /**
   * The amount of claimed damages paid by the insured person before the policy pays out (also known as \&quot;Own risk\&quot;)
   * @return amountExcess
  **/
  @Schema(description = "The amount of claimed damages paid by the insured person before the policy pays out (also known as \"Own risk\")")
  public BigDecimal getAmountExcess() {
    return amountExcess;
  }

  public void setAmountExcess(BigDecimal amountExcess) {
    this.amountExcess = amountExcess;
  }

  public Policy fleetFlag(Boolean fleetFlag) {
    this.fleetFlag = fleetFlag;
    return this;
  }

   /**
   * Boolean value indicating whether the insurance is part of a fleet insurance
   * @return fleetFlag
  **/
  @Schema(description = "Boolean value indicating whether the insurance is part of a fleet insurance")
  public Boolean isFleetFlag() {
    return fleetFlag;
  }

  public void setFleetFlag(Boolean fleetFlag) {
    this.fleetFlag = fleetFlag;
  }

  public Policy paymentFrequency(PolicyPaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
    return this;
  }

   /**
   * The frequency of paid premium
   * @return paymentFrequency
  **/
  @Schema(description = "The frequency of paid premium")
  public PolicyPaymentFrequency getPaymentFrequency() {
    return paymentFrequency;
  }

  public void setPaymentFrequency(PolicyPaymentFrequency paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
  }

  public Policy paymentType(PolicyPaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * The type of payment executed for the premium
   * @return paymentType
  **/
  @Schema(description = "The type of payment executed for the premium")
  public PolicyPaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PolicyPaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public Policy changes(List<PolicyChange> changes) {
    this.changes = changes;
    return this;
  }

  public Policy addChangesItem(PolicyChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<PolicyChange>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * An array of all policy change records
   * @return changes
  **/
  @Schema(description = "An array of all policy change records")
  public List<PolicyChange> getChanges() {
    return changes;
  }

  public void setChanges(List<PolicyChange> changes) {
    this.changes = changes;
  }

  public Policy last3Changes(List<PolicyChange> last3Changes) {
    this.last3Changes = last3Changes;
    return this;
  }

  public Policy addLast3ChangesItem(PolicyChange last3ChangesItem) {
    if (this.last3Changes == null) {
      this.last3Changes = new ArrayList<PolicyChange>();
    }
    this.last3Changes.add(last3ChangesItem);
    return this;
  }

   /**
   * Get last3Changes
   * @return last3Changes
  **/
  @Schema(description = "")
  public List<PolicyChange> getLast3Changes() {
    return last3Changes;
  }

  public void setLast3Changes(List<PolicyChange> last3Changes) {
    this.last3Changes = last3Changes;
  }

  public Policy applicationDate(OffsetDateTime applicationDate) {
    this.applicationDate = applicationDate;
    return this;
  }

   /**
   * The application date for the policy
   * @return applicationDate
  **/
  @Schema(description = "The application date for the policy")
  public OffsetDateTime getApplicationDate() {
    return applicationDate;
  }

  public void setApplicationDate(OffsetDateTime applicationDate) {
    this.applicationDate = applicationDate;
  }

  public Policy freeClaim(Boolean freeClaim) {
    this.freeClaim = freeClaim;
    return this;
  }

   /**
   * Boolean value indicating whether the policyholder has a Free Claim (claim without complete loss of no-claim years)
   * @return freeClaim
  **/
  @Schema(description = "Boolean value indicating whether the policyholder has a Free Claim (claim without complete loss of no-claim years)")
  public Boolean isFreeClaim() {
    return freeClaim;
  }

  public void setFreeClaim(Boolean freeClaim) {
    this.freeClaim = freeClaim;
  }

  public Policy status(PolicyStatus status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the policy
   * @return status
  **/
  @Schema(description = "The current status of the policy")
  public PolicyStatus getStatus() {
    return status;
  }

  public void setStatus(PolicyStatus status) {
    this.status = status;
  }

  public Policy latePaymentWarning(Boolean latePaymentWarning) {
    this.latePaymentWarning = latePaymentWarning;
    return this;
  }

   /**
   * Boolean value indicating whether the policyholder has received a late payment warning
   * @return latePaymentWarning
  **/
  @Schema(description = "Boolean value indicating whether the policyholder has received a late payment warning")
  public Boolean isLatePaymentWarning() {
    return latePaymentWarning;
  }

  public void setLatePaymentWarning(Boolean latePaymentWarning) {
    this.latePaymentWarning = latePaymentWarning;
  }

  public Policy premiumDiscount(Integer premiumDiscount) {
    this.premiumDiscount = premiumDiscount;
    return this;
  }

   /**
   * The percentage discount on the policy&#x27;s premium
   * @return premiumDiscount
  **/
  @Schema(description = "The percentage discount on the policy's premium")
  public Integer getPremiumDiscount() {
    return premiumDiscount;
  }

  public void setPremiumDiscount(Integer premiumDiscount) {
    this.premiumDiscount = premiumDiscount;
  }

  public Policy endReason(String endReason) {
    this.endReason = endReason;
    return this;
  }

   /**
   * The reason for ending the insurance policy
   * @return endReason
  **/
  @Schema(description = "The reason for ending the insurance policy")
  public String getEndReason() {
    return endReason;
  }

  public void setEndReason(String endReason) {
    this.endReason = endReason;
  }

  public Policy holderDateFirstPolicy(OffsetDateTime holderDateFirstPolicy) {
    this.holderDateFirstPolicy = holderDateFirstPolicy;
    return this;
  }

   /**
   * The date of first policy of the policyholder
   * @return holderDateFirstPolicy
  **/
  @Schema(description = "The date of first policy of the policyholder")
  public OffsetDateTime getHolderDateFirstPolicy() {
    return holderDateFirstPolicy;
  }

  public void setHolderDateFirstPolicy(OffsetDateTime holderDateFirstPolicy) {
    this.holderDateFirstPolicy = holderDateFirstPolicy;
  }

  public Policy bonusMalusScale(String bonusMalusScale) {
    this.bonusMalusScale = bonusMalusScale;
    return this;
  }

   /**
   * The bonus malus scale on the policy
   * @return bonusMalusScale
  **/
  @Schema(description = "The bonus malus scale on the policy")
  public String getBonusMalusScale() {
    return bonusMalusScale;
  }

  public void setBonusMalusScale(String bonusMalusScale) {
    this.bonusMalusScale = bonusMalusScale;
  }

  public Policy bonusMalusPercentage(Integer bonusMalusPercentage) {
    this.bonusMalusPercentage = bonusMalusPercentage;
    return this;
  }

   /**
   * The percentage discount on the policy, based on the Bonus Malus Scale. Can be negative Validation: Policy bonus malus percentage value should be in a range from 0 to 100.
   * @return bonusMalusPercentage
  **/
  @Schema(description = "The percentage discount on the policy, based on the Bonus Malus Scale. Can be negative Validation: Policy bonus malus percentage value should be in a range from 0 to 100.")
  public Integer getBonusMalusPercentage() {
    return bonusMalusPercentage;
  }

  public void setBonusMalusPercentage(Integer bonusMalusPercentage) {
    this.bonusMalusPercentage = bonusMalusPercentage;
  }

  public Policy numberOfAssistanceClaims(Integer numberOfAssistanceClaims) {
    this.numberOfAssistanceClaims = numberOfAssistanceClaims;
    return this;
  }

   /**
   * The number of claims on the policy that required services not associated to repairs, usually provided by an assistance company and not the insurer (i.e. towing). Validation: Policy number of assistance claims should be more than 0.
   * @return numberOfAssistanceClaims
  **/
  @Schema(description = "The number of claims on the policy that required services not associated to repairs, usually provided by an assistance company and not the insurer (i.e. towing). Validation: Policy number of assistance claims should be more than 0.")
  public Integer getNumberOfAssistanceClaims() {
    return numberOfAssistanceClaims;
  }

  public void setNumberOfAssistanceClaims(Integer numberOfAssistanceClaims) {
    this.numberOfAssistanceClaims = numberOfAssistanceClaims;
  }

  public Policy commercialLabel(String commercialLabel) {
    this.commercialLabel = commercialLabel;
    return this;
  }

   /**
   * The commercial label for the insurance product
   * @return commercialLabel
  **/
  @Schema(description = "The commercial label for the insurance product")
  public String getCommercialLabel() {
    return commercialLabel;
  }

  public void setCommercialLabel(String commercialLabel) {
    this.commercialLabel = commercialLabel;
  }

  public Policy lossRatio(Integer lossRatio) {
    this.lossRatio = lossRatio;
    return this;
  }

   /**
   * The loss-ratio (percentage) of the policy
   * @return lossRatio
  **/
  @Schema(description = "The loss-ratio (percentage) of the policy")
  public Integer getLossRatio() {
    return lossRatio;
  }

  public void setLossRatio(Integer lossRatio) {
    this.lossRatio = lossRatio;
  }

  public Policy otherInsured(List<LegalEntityRef> otherInsured) {
    this.otherInsured = otherInsured;
    return this;
  }

  public Policy addOtherInsuredItem(LegalEntityRef otherInsuredItem) {
    if (this.otherInsured == null) {
      this.otherInsured = new ArrayList<LegalEntityRef>();
    }
    this.otherInsured.add(otherInsuredItem);
    return this;
  }

   /**
   * The details of other people insured by the given policy
   * @return otherInsured
  **/
  @Schema(description = "The details of other people insured by the given policy")
  public List<LegalEntityRef> getOtherInsured() {
    return otherInsured;
  }

  public void setOtherInsured(List<LegalEntityRef> otherInsured) {
    this.otherInsured = otherInsured;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.broker, policy.broker) &&
        Objects.equals(this.agent, policy.agent) &&
        Objects.equals(this.agents, policy.agents) &&
        Objects.equals(this.holders, policy.holders) &&
        Objects.equals(this.policyManagers, policy.policyManagers) &&
        Objects.equals(this.mortgagees, policy.mortgagees) &&
        Objects.equals(this.leaseHolders, policy.leaseHolders) &&
        Objects.equals(this.lienHolders, policy.lienHolders) &&
        Objects.equals(this.premiumPayers, policy.premiumPayers) &&
        Objects.equals(this.objectsInsured, policy.objectsInsured) &&
        Objects.equals(this.policyId, policy.policyId) &&
        Objects.equals(this.inceptionDate, policy.inceptionDate) &&
        Objects.equals(this.endDate, policy.endDate) &&
        Objects.equals(this.yearsWithoutClaim, policy.yearsWithoutClaim) &&
        Objects.equals(this.insuredAmount, policy.insuredAmount) &&
        Objects.equals(this.incurredAmount, policy.incurredAmount) &&
        Objects.equals(this.annualPremium, policy.annualPremium) &&
        Objects.equals(this.product, policy.product) &&
        Objects.equals(this.channel, policy.channel) &&
        Objects.equals(this.type, policy.type) &&
        Objects.equals(this.signingDate, policy.signingDate) &&
        Objects.equals(this.coverages, policy.coverages) &&
        Objects.equals(this.previousExpiryDate, policy.previousExpiryDate) &&
        Objects.equals(this.renewalDate, policy.renewalDate) &&
        Objects.equals(this.amountExcess, policy.amountExcess) &&
        Objects.equals(this.fleetFlag, policy.fleetFlag) &&
        Objects.equals(this.paymentFrequency, policy.paymentFrequency) &&
        Objects.equals(this.paymentType, policy.paymentType) &&
        Objects.equals(this.changes, policy.changes) &&
        Objects.equals(this.last3Changes, policy.last3Changes) &&
        Objects.equals(this.applicationDate, policy.applicationDate) &&
        Objects.equals(this.freeClaim, policy.freeClaim) &&
        Objects.equals(this.status, policy.status) &&
        Objects.equals(this.latePaymentWarning, policy.latePaymentWarning) &&
        Objects.equals(this.premiumDiscount, policy.premiumDiscount) &&
        Objects.equals(this.endReason, policy.endReason) &&
        Objects.equals(this.holderDateFirstPolicy, policy.holderDateFirstPolicy) &&
        Objects.equals(this.bonusMalusScale, policy.bonusMalusScale) &&
        Objects.equals(this.bonusMalusPercentage, policy.bonusMalusPercentage) &&
        Objects.equals(this.numberOfAssistanceClaims, policy.numberOfAssistanceClaims) &&
        Objects.equals(this.commercialLabel, policy.commercialLabel) &&
        Objects.equals(this.lossRatio, policy.lossRatio) &&
        Objects.equals(this.otherInsured, policy.otherInsured) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(broker, agent, agents, holders, policyManagers, mortgagees, leaseHolders, lienHolders, premiumPayers, objectsInsured, policyId, inceptionDate, endDate, yearsWithoutClaim, insuredAmount, incurredAmount, annualPremium, product, channel, type, signingDate, coverages, previousExpiryDate, renewalDate, amountExcess, fleetFlag, paymentFrequency, paymentType, changes, last3Changes, applicationDate, freeClaim, status, latePaymentWarning, premiumDiscount, endReason, holderDateFirstPolicy, bonusMalusScale, bonusMalusPercentage, numberOfAssistanceClaims, commercialLabel, lossRatio, otherInsured, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    broker: ").append(toIndentedString(broker)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    holders: ").append(toIndentedString(holders)).append("\n");
    sb.append("    policyManagers: ").append(toIndentedString(policyManagers)).append("\n");
    sb.append("    mortgagees: ").append(toIndentedString(mortgagees)).append("\n");
    sb.append("    leaseHolders: ").append(toIndentedString(leaseHolders)).append("\n");
    sb.append("    lienHolders: ").append(toIndentedString(lienHolders)).append("\n");
    sb.append("    premiumPayers: ").append(toIndentedString(premiumPayers)).append("\n");
    sb.append("    objectsInsured: ").append(toIndentedString(objectsInsured)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    yearsWithoutClaim: ").append(toIndentedString(yearsWithoutClaim)).append("\n");
    sb.append("    insuredAmount: ").append(toIndentedString(insuredAmount)).append("\n");
    sb.append("    incurredAmount: ").append(toIndentedString(incurredAmount)).append("\n");
    sb.append("    annualPremium: ").append(toIndentedString(annualPremium)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    signingDate: ").append(toIndentedString(signingDate)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
    sb.append("    previousExpiryDate: ").append(toIndentedString(previousExpiryDate)).append("\n");
    sb.append("    renewalDate: ").append(toIndentedString(renewalDate)).append("\n");
    sb.append("    amountExcess: ").append(toIndentedString(amountExcess)).append("\n");
    sb.append("    fleetFlag: ").append(toIndentedString(fleetFlag)).append("\n");
    sb.append("    paymentFrequency: ").append(toIndentedString(paymentFrequency)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    last3Changes: ").append(toIndentedString(last3Changes)).append("\n");
    sb.append("    applicationDate: ").append(toIndentedString(applicationDate)).append("\n");
    sb.append("    freeClaim: ").append(toIndentedString(freeClaim)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    latePaymentWarning: ").append(toIndentedString(latePaymentWarning)).append("\n");
    sb.append("    premiumDiscount: ").append(toIndentedString(premiumDiscount)).append("\n");
    sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
    sb.append("    holderDateFirstPolicy: ").append(toIndentedString(holderDateFirstPolicy)).append("\n");
    sb.append("    bonusMalusScale: ").append(toIndentedString(bonusMalusScale)).append("\n");
    sb.append("    bonusMalusPercentage: ").append(toIndentedString(bonusMalusPercentage)).append("\n");
    sb.append("    numberOfAssistanceClaims: ").append(toIndentedString(numberOfAssistanceClaims)).append("\n");
    sb.append("    commercialLabel: ").append(toIndentedString(commercialLabel)).append("\n");
    sb.append("    lossRatio: ").append(toIndentedString(lossRatio)).append("\n");
    sb.append("    otherInsured: ").append(toIndentedString(otherInsured)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
