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
 * Vehicle
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-03T11:30:23.717Z[GMT]")
public class Vehicle extends Objekt {
  @SerializedName("referenceId")
  private String referenceId = null;

  @SerializedName("bodystyle")
  private String bodystyle = null;

  @SerializedName("licensePlate")
  private String licensePlate = null;

  @SerializedName("vin")
  private String vin = null;

  @SerializedName("year")
  private Integer year = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("engineVolume")
  private Integer engineVolume = null;

  @SerializedName("firstIssuingDate")
  private OffsetDateTime firstIssuingDate = null;

  @SerializedName("firstAdmissionDate")
  private OffsetDateTime firstAdmissionDate = null;

  @SerializedName("firstImportDate")
  private OffsetDateTime firstImportDate = null;

  @SerializedName("latestOwnerRegistrationDate")
  private OffsetDateTime latestOwnerRegistrationDate = null;

  @SerializedName("fuelType")
  private VehicleFuelType fuelType = null;

  @SerializedName("listPrice")
  private BigDecimal listPrice = null;

  @SerializedName("mileage")
  private String mileage = null;

  @SerializedName("power")
  private String power = null;

  @SerializedName("priorDamage")
  private List<String> priorDamage = null;

  @SerializedName("registrationType")
  private VehicleRegistrationType registrationType = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("trim")
  private String trim = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("drivable")
  private Boolean drivable = null;

  @SerializedName("value")
  private BigDecimal value = null;

  @SerializedName("repairShopAssociated")
  private Boolean repairShopAssociated = null;

  @SerializedName("totalLoss")
  private Boolean totalLoss = null;

  @SerializedName("specialType")
  private VehicleSpecialType specialType = null;

  @SerializedName("registrationAuthority")
  private String registrationAuthority = null;

  @SerializedName("accessoriesValue")
  private Double accessoriesValue = null;

  @SerializedName("licenseplateState")
  private VehicleLicensePlateStates licenseplateState = null;

  @SerializedName("isImported")
  private Boolean isImported = null;

  @SerializedName("regularDrivers")
  private List<LegalEntityRefOfPerson> regularDrivers = null;

  @SerializedName("additionalDrivers")
  private List<LegalEntityRefOfPerson> additionalDrivers = null;

  public Vehicle referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Get referenceId
   * @return referenceId
  **/
  @Schema(description = "")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Vehicle bodystyle(String bodystyle) {
    this.bodystyle = bodystyle;
    return this;
  }

   /**
   * The bodystyle of the vehicle
   * @return bodystyle
  **/
  @Schema(description = "The bodystyle of the vehicle")
  public String getBodystyle() {
    return bodystyle;
  }

  public void setBodystyle(String bodystyle) {
    this.bodystyle = bodystyle;
  }

  public Vehicle licensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
    return this;
  }

   /**
   * The license plate of the vehicle at the moment of screening
   * @return licensePlate
  **/
  @Schema(description = "The license plate of the vehicle at the moment of screening")
  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public Vehicle vin(String vin) {
    this.vin = vin;
    return this;
  }

   /**
   * The unique serial number of the vehicle, also known as the chassis number
   * @return vin
  **/
  @Schema(description = "The unique serial number of the vehicle, also known as the chassis number")
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Vehicle year(Integer year) {
    this.year = year;
    return this;
  }

   /**
   * The year of construction
   * @return year
  **/
  @Schema(description = "The year of construction")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Vehicle make(String make) {
    this.make = make;
    return this;
  }

   /**
   * The make of the vehicle
   * @return make
  **/
  @Schema(description = "The make of the vehicle")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public Vehicle model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model of the vehicle
   * @return model
  **/
  @Schema(description = "The model of the vehicle")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicle engineVolume(Integer engineVolume) {
    this.engineVolume = engineVolume;
    return this;
  }

   /**
   * The cylinder content of the engine, measured in CC
   * @return engineVolume
  **/
  @Schema(description = "The cylinder content of the engine, measured in CC")
  public Integer getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(Integer engineVolume) {
    this.engineVolume = engineVolume;
  }

  public Vehicle firstIssuingDate(OffsetDateTime firstIssuingDate) {
    this.firstIssuingDate = firstIssuingDate;
    return this;
  }

   /**
   * The date when the vehicle was first registered in the country or state Validation: Date if not empty must be in a range between +-150 years from now.
   * @return firstIssuingDate
  **/
  @Schema(description = "The date when the vehicle was first registered in the country or state Validation: Date if not empty must be in a range between +-150 years from now.")
  public OffsetDateTime getFirstIssuingDate() {
    return firstIssuingDate;
  }

  public void setFirstIssuingDate(OffsetDateTime firstIssuingDate) {
    this.firstIssuingDate = firstIssuingDate;
  }

  public Vehicle firstAdmissionDate(OffsetDateTime firstAdmissionDate) {
    this.firstAdmissionDate = firstAdmissionDate;
    return this;
  }

   /**
   * The date when the vehicle was first registered in the world Validation: Date if not empty must be in a range between +-150 years from now.
   * @return firstAdmissionDate
  **/
  @Schema(description = "The date when the vehicle was first registered in the world Validation: Date if not empty must be in a range between +-150 years from now.")
  public OffsetDateTime getFirstAdmissionDate() {
    return firstAdmissionDate;
  }

  public void setFirstAdmissionDate(OffsetDateTime firstAdmissionDate) {
    this.firstAdmissionDate = firstAdmissionDate;
  }

  public Vehicle firstImportDate(OffsetDateTime firstImportDate) {
    this.firstImportDate = firstImportDate;
    return this;
  }

   /**
   * The date when the vehicle was imported into the country Validation: Date if not empty must be in a range between +-150 years from now.
   * @return firstImportDate
  **/
  @Schema(description = "The date when the vehicle was imported into the country Validation: Date if not empty must be in a range between +-150 years from now.")
  public OffsetDateTime getFirstImportDate() {
    return firstImportDate;
  }

  public void setFirstImportDate(OffsetDateTime firstImportDate) {
    this.firstImportDate = firstImportDate;
  }

  public Vehicle latestOwnerRegistrationDate(OffsetDateTime latestOwnerRegistrationDate) {
    this.latestOwnerRegistrationDate = latestOwnerRegistrationDate;
    return this;
  }

   /**
   * The date when the vehicle was registered to the current owner Validation: Date if not empty must be in a range between +-150 years from now.
   * @return latestOwnerRegistrationDate
  **/
  @Schema(description = "The date when the vehicle was registered to the current owner Validation: Date if not empty must be in a range between +-150 years from now.")
  public OffsetDateTime getLatestOwnerRegistrationDate() {
    return latestOwnerRegistrationDate;
  }

  public void setLatestOwnerRegistrationDate(OffsetDateTime latestOwnerRegistrationDate) {
    this.latestOwnerRegistrationDate = latestOwnerRegistrationDate;
  }

  public Vehicle fuelType(VehicleFuelType fuelType) {
    this.fuelType = fuelType;
    return this;
  }

   /**
   * The fuel type
   * @return fuelType
  **/
  @Schema(description = "The fuel type")
  public VehicleFuelType getFuelType() {
    return fuelType;
  }

  public void setFuelType(VehicleFuelType fuelType) {
    this.fuelType = fuelType;
  }

  public Vehicle listPrice(BigDecimal listPrice) {
    this.listPrice = listPrice;
    return this;
  }

   /**
   * The list price of the vehicle (original new value)
   * @return listPrice
  **/
  @Schema(description = "The list price of the vehicle (original new value)")
  public BigDecimal getListPrice() {
    return listPrice;
  }

  public void setListPrice(BigDecimal listPrice) {
    this.listPrice = listPrice;
  }

  public Vehicle mileage(String mileage) {
    this.mileage = mileage;
    return this;
  }

   /**
   * The mileage of the vehicle at the time of the accident
   * @return mileage
  **/
  @Schema(description = "The mileage of the vehicle at the time of the accident")
  public String getMileage() {
    return mileage;
  }

  public void setMileage(String mileage) {
    this.mileage = mileage;
  }

  public Vehicle power(String power) {
    this.power = power;
    return this;
  }

   /**
   * The power of the vehicle in KW (kilowatt)
   * @return power
  **/
  @Schema(description = "The power of the vehicle in KW (kilowatt)")
  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public Vehicle priorDamage(List<String> priorDamage) {
    this.priorDamage = priorDamage;
    return this;
  }

  public Vehicle addPriorDamageItem(String priorDamageItem) {
    if (this.priorDamage == null) {
      this.priorDamage = new ArrayList<String>();
    }
    this.priorDamage.add(priorDamageItem);
    return this;
  }

   /**
   * Previous damages known for the vehicle
   * @return priorDamage
  **/
  @Schema(description = "Previous damages known for the vehicle")
  public List<String> getPriorDamage() {
    return priorDamage;
  }

  public void setPriorDamage(List<String> priorDamage) {
    this.priorDamage = priorDamage;
  }

  public Vehicle registrationType(VehicleRegistrationType registrationType) {
    this.registrationType = registrationType;
    return this;
  }

   /**
   * The type of registration of the vehicle
   * @return registrationType
  **/
  @Schema(description = "The type of registration of the vehicle")
  public VehicleRegistrationType getRegistrationType() {
    return registrationType;
  }

  public void setRegistrationType(VehicleRegistrationType registrationType) {
    this.registrationType = registrationType;
  }

  public Vehicle status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The repair status of vehicle
   * @return status
  **/
  @Schema(description = "The repair status of vehicle")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Vehicle trim(String trim) {
    this.trim = trim;
    return this;
  }

   /**
   * The trim of the vehicle
   * @return trim
  **/
  @Schema(description = "The trim of the vehicle")
  public String getTrim() {
    return trim;
  }

  public void setTrim(String trim) {
    this.trim = trim;
  }

  public Vehicle weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the vehicle
   * @return weight
  **/
  @Schema(description = "Weight of the vehicle")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public Vehicle drivable(Boolean drivable) {
    this.drivable = drivable;
    return this;
  }

   /**
   * Boolean value indicating whether the vehicle is drivable
   * @return drivable
  **/
  @Schema(description = "Boolean value indicating whether the vehicle is drivable")
  public Boolean isDrivable() {
    return drivable;
  }

  public void setDrivable(Boolean drivable) {
    this.drivable = drivable;
  }

  public Vehicle value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The current value of the vehicle
   * @return value
  **/
  @Schema(description = "The current value of the vehicle")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Vehicle repairShopAssociated(Boolean repairShopAssociated) {
    this.repairShopAssociated = repairShopAssociated;
    return this;
  }

   /**
   * Boolean value indicating whether the vehicle was repaired at an associated repairshop
   * @return repairShopAssociated
  **/
  @Schema(description = "Boolean value indicating whether the vehicle was repaired at an associated repairshop")
  public Boolean isRepairShopAssociated() {
    return repairShopAssociated;
  }

  public void setRepairShopAssociated(Boolean repairShopAssociated) {
    this.repairShopAssociated = repairShopAssociated;
  }

  public Vehicle totalLoss(Boolean totalLoss) {
    this.totalLoss = totalLoss;
    return this;
  }

   /**
   * Boolean value indicating whether the vehicle is total loss
   * @return totalLoss
  **/
  @Schema(description = "Boolean value indicating whether the vehicle is total loss")
  public Boolean isTotalLoss() {
    return totalLoss;
  }

  public void setTotalLoss(Boolean totalLoss) {
    this.totalLoss = totalLoss;
  }

  public Vehicle specialType(VehicleSpecialType specialType) {
    this.specialType = specialType;
    return this;
  }

   /**
   * The special type of registration for a vehicle, according to the value list [VehicleSpecialType](#vehiclespecialtype)
   * @return specialType
  **/
  @Schema(description = "The special type of registration for a vehicle, according to the value list [VehicleSpecialType](#vehiclespecialtype)")
  public VehicleSpecialType getSpecialType() {
    return specialType;
  }

  public void setSpecialType(VehicleSpecialType specialType) {
    this.specialType = specialType;
  }

  public Vehicle registrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
    return this;
  }

   /**
   * The state, province or authority where the vehicle is registered
   * @return registrationAuthority
  **/
  @Schema(description = "The state, province or authority where the vehicle is registered")
  public String getRegistrationAuthority() {
    return registrationAuthority;
  }

  public void setRegistrationAuthority(String registrationAuthority) {
    this.registrationAuthority = registrationAuthority;
  }

  public Vehicle accessoriesValue(Double accessoriesValue) {
    this.accessoriesValue = accessoriesValue;
    return this;
  }

   /**
   * The value of all accessories belonging to the vehicle
   * @return accessoriesValue
  **/
  @Schema(description = "The value of all accessories belonging to the vehicle")
  public Double getAccessoriesValue() {
    return accessoriesValue;
  }

  public void setAccessoriesValue(Double accessoriesValue) {
    this.accessoriesValue = accessoriesValue;
  }

  public Vehicle licenseplateState(VehicleLicensePlateStates licenseplateState) {
    this.licenseplateState = licenseplateState;
    return this;
  }

   /**
   * Applicable for USA only. Identifies the state of the license plate, according to the [ISO2 standard](https://www.iso.org/obp/ui/#iso:code:3166:US)
   * @return licenseplateState
  **/
  @Schema(description = "Applicable for USA only. Identifies the state of the license plate, according to the [ISO2 standard](https://www.iso.org/obp/ui/#iso:code:3166:US)")
  public VehicleLicensePlateStates getLicenseplateState() {
    return licenseplateState;
  }

  public void setLicenseplateState(VehicleLicensePlateStates licenseplateState) {
    this.licenseplateState = licenseplateState;
  }

  public Vehicle isImported(Boolean isImported) {
    this.isImported = isImported;
    return this;
  }

   /**
   * Boolean value indicating whether the vehicle is imported
   * @return isImported
  **/
  @Schema(description = "Boolean value indicating whether the vehicle is imported")
  public Boolean isIsImported() {
    return isImported;
  }

  public void setIsImported(Boolean isImported) {
    this.isImported = isImported;
  }

  public Vehicle regularDrivers(List<LegalEntityRefOfPerson> regularDrivers) {
    this.regularDrivers = regularDrivers;
    return this;
  }

  public Vehicle addRegularDriversItem(LegalEntityRefOfPerson regularDriversItem) {
    if (this.regularDrivers == null) {
      this.regularDrivers = new ArrayList<LegalEntityRefOfPerson>();
    }
    this.regularDrivers.add(regularDriversItem);
    return this;
  }

   /**
   * A list of references to [LegalEntities](#legalentity) of type [Person](#person) belonging to the regular drivers of the vehicle
   * @return regularDrivers
  **/
  @Schema(description = "A list of references to [LegalEntities](#legalentity) of type [Person](#person) belonging to the regular drivers of the vehicle")
  public List<LegalEntityRefOfPerson> getRegularDrivers() {
    return regularDrivers;
  }

  public void setRegularDrivers(List<LegalEntityRefOfPerson> regularDrivers) {
    this.regularDrivers = regularDrivers;
  }

  public Vehicle additionalDrivers(List<LegalEntityRefOfPerson> additionalDrivers) {
    this.additionalDrivers = additionalDrivers;
    return this;
  }

  public Vehicle addAdditionalDriversItem(LegalEntityRefOfPerson additionalDriversItem) {
    if (this.additionalDrivers == null) {
      this.additionalDrivers = new ArrayList<LegalEntityRefOfPerson>();
    }
    this.additionalDrivers.add(additionalDriversItem);
    return this;
  }

   /**
   * A list of references to [LegalEntities](#legalentity) of type [Person](#person) belonging to the additional drivers of the vehicle
   * @return additionalDrivers
  **/
  @Schema(description = "A list of references to [LegalEntities](#legalentity) of type [Person](#person) belonging to the additional drivers of the vehicle")
  public List<LegalEntityRefOfPerson> getAdditionalDrivers() {
    return additionalDrivers;
  }

  public void setAdditionalDrivers(List<LegalEntityRefOfPerson> additionalDrivers) {
    this.additionalDrivers = additionalDrivers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.referenceId, vehicle.referenceId) &&
        Objects.equals(this.bodystyle, vehicle.bodystyle) &&
        Objects.equals(this.licensePlate, vehicle.licensePlate) &&
        Objects.equals(this.vin, vehicle.vin) &&
        Objects.equals(this.year, vehicle.year) &&
        Objects.equals(this.make, vehicle.make) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.engineVolume, vehicle.engineVolume) &&
        Objects.equals(this.firstIssuingDate, vehicle.firstIssuingDate) &&
        Objects.equals(this.firstAdmissionDate, vehicle.firstAdmissionDate) &&
        Objects.equals(this.firstImportDate, vehicle.firstImportDate) &&
        Objects.equals(this.latestOwnerRegistrationDate, vehicle.latestOwnerRegistrationDate) &&
        Objects.equals(this.fuelType, vehicle.fuelType) &&
        Objects.equals(this.listPrice, vehicle.listPrice) &&
        Objects.equals(this.mileage, vehicle.mileage) &&
        Objects.equals(this.power, vehicle.power) &&
        Objects.equals(this.priorDamage, vehicle.priorDamage) &&
        Objects.equals(this.registrationType, vehicle.registrationType) &&
        Objects.equals(this.status, vehicle.status) &&
        Objects.equals(this.trim, vehicle.trim) &&
        Objects.equals(this.weight, vehicle.weight) &&
        Objects.equals(this.drivable, vehicle.drivable) &&
        Objects.equals(this.value, vehicle.value) &&
        Objects.equals(this.repairShopAssociated, vehicle.repairShopAssociated) &&
        Objects.equals(this.totalLoss, vehicle.totalLoss) &&
        Objects.equals(this.specialType, vehicle.specialType) &&
        Objects.equals(this.registrationAuthority, vehicle.registrationAuthority) &&
        Objects.equals(this.accessoriesValue, vehicle.accessoriesValue) &&
        Objects.equals(this.licenseplateState, vehicle.licenseplateState) &&
        Objects.equals(this.isImported, vehicle.isImported) &&
        Objects.equals(this.regularDrivers, vehicle.regularDrivers) &&
        Objects.equals(this.additionalDrivers, vehicle.additionalDrivers) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, bodystyle, licensePlate, vin, year, make, model, engineVolume, firstIssuingDate, firstAdmissionDate, firstImportDate, latestOwnerRegistrationDate, fuelType, listPrice, mileage, power, priorDamage, registrationType, status, trim, weight, drivable, value, repairShopAssociated, totalLoss, specialType, registrationAuthority, accessoriesValue, licenseplateState, isImported, regularDrivers, additionalDrivers, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    bodystyle: ").append(toIndentedString(bodystyle)).append("\n");
    sb.append("    licensePlate: ").append(toIndentedString(licensePlate)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    engineVolume: ").append(toIndentedString(engineVolume)).append("\n");
    sb.append("    firstIssuingDate: ").append(toIndentedString(firstIssuingDate)).append("\n");
    sb.append("    firstAdmissionDate: ").append(toIndentedString(firstAdmissionDate)).append("\n");
    sb.append("    firstImportDate: ").append(toIndentedString(firstImportDate)).append("\n");
    sb.append("    latestOwnerRegistrationDate: ").append(toIndentedString(latestOwnerRegistrationDate)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
    sb.append("    listPrice: ").append(toIndentedString(listPrice)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    priorDamage: ").append(toIndentedString(priorDamage)).append("\n");
    sb.append("    registrationType: ").append(toIndentedString(registrationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trim: ").append(toIndentedString(trim)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    drivable: ").append(toIndentedString(drivable)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    repairShopAssociated: ").append(toIndentedString(repairShopAssociated)).append("\n");
    sb.append("    totalLoss: ").append(toIndentedString(totalLoss)).append("\n");
    sb.append("    specialType: ").append(toIndentedString(specialType)).append("\n");
    sb.append("    registrationAuthority: ").append(toIndentedString(registrationAuthority)).append("\n");
    sb.append("    accessoriesValue: ").append(toIndentedString(accessoriesValue)).append("\n");
    sb.append("    licenseplateState: ").append(toIndentedString(licenseplateState)).append("\n");
    sb.append("    isImported: ").append(toIndentedString(isImported)).append("\n");
    sb.append("    regularDrivers: ").append(toIndentedString(regularDrivers)).append("\n");
    sb.append("    additionalDrivers: ").append(toIndentedString(additionalDrivers)).append("\n");
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