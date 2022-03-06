package example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.swagger.client.model.*;

import java.util.List;
import java.util.Map;

public class Serializer {

    public static void main(String[] args) throws JsonProcessingException {
        ClaimScreeningRequestOfAutoPolicy claim = additionalFieldsBase(new ClaimScreeningRequestOfAutoPolicy())
                .parties(parties())
                .claim(claimOfAutoPolicy());

        System.out.println(new ObjectMapper()
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(SerializationFeature.INDENT_OUTPUT, false)
                .writeValueAsString(claim));
    }

    private static ClaimOfAutoPolicy claimOfAutoPolicy() {
        return additionalFieldsBase(new ClaimOfAutoPolicy())
                .address(address())
                .status(ClaimStatus.OPEN)
                .withdrawalReason(WithdrawalReason.COVERINOPERATIVE)
                .subClaims(List.of(subClaim()))
                .thirdParties(List.of(thirdParty()))
                .adverseParties(legalEntities())
                .claimants(legalEntities())
                .damageList(List.of("null"))
                .flag(List.of("flag"))
                .custodians(legalEntities())
                .pedestrians(persons())
                .policy(policy())
                .reporters(legalEntities())
                .staffAppraisers(List.of("null"))
                .witnesses(legalEntities())
                .vendors(legalEntities())
                ;
    }

    private static List<LegalEntityRef> legalEntities() {
        return List.of(legalEntityRef());
    }

    private static ThirdParty thirdParty() {
        return additionalFieldsBase(new ThirdParty());
    }

    private static Address address() {
        return additionalFieldsBase(new Address());
    }

    private static AutoPolicy policy() {
        return (AutoPolicy) additionalFieldsBase(new AutoPolicy())
                .regularDrivers(persons())
                .broker(legalEntityRefOfCompany())
                .agents(legalEntities())
                .changes(List.of(policyChange()))
                .channel(PolicyChannel.EMAIL)
                .coverages(List.of(coverage()))
                .holders(legalEntities())
                .lienHolders(legalEntities())
                .leaseHolders(companies())
                .last3Changes(List.of(policyChange()))
                .mortgagees(companies())
                .objectsInsured(List.of(objectInsured()))
                .otherInsured(legalEntities())
                .policyManagers(persons())
                .premiumPayers(legalEntities())
                .paymentFrequency(PolicyPaymentFrequency.ANNUALLY)
                .paymentType(PolicyPaymentType.PAYMENT_UPFRONT)
                .status(PolicyStatus.ACTIVE)
                ;
    }

    private static List<LegalEntityRefOfCompany> companies() {
        return List.of(legalEntityRefOfCompany());
    }

    private static ObjectInsured objectInsured() {
        return additionalFieldsBase(new ObjectInsured())
                .object(vehicle());
    }

    private static PolicyChange policyChange() {
        return additionalFieldsBase(new PolicyChange());
    }

    private static LegalEntityRefOfPerson legalEntityRefOfPerson() {
        return additionalFieldsBase(new LegalEntityRefOfPerson());
    }

    private static LegalEntityRefOfCompany legalEntityRefOfCompany() {
        return additionalFieldsBase(new LegalEntityRefOfCompany());
    }

    private static Vehicle vehicle() {
        return objektBase(new Vehicle())
                .fuelType(VehicleFuelType.DIESEL)
                .additionalDrivers(persons())
                .regularDrivers(persons())
                .licenseplateState(VehicleLicensePlateStates.CA)
                .registrationType(VehicleRegistrationType.INDIVIDUAL)
                .priorDamage(List.of("null"))
                .specialType(VehicleSpecialType.TAXI)
                ;
    }

    private static List<LegalEntityRefOfPerson> persons() {
        return List.of(legalEntityRefOfPerson());
    }

    private static LegalEntityRef legalEntityRef() {
        return additionalFieldsBase(new LegalEntityRef());
    }

    private static SubClaim subClaim() {
        return additionalFieldsBase(new SubClaim())
                .addCoveragesItem(coverage())
                .status(ClaimStatus.OPEN)
                .claimant(legalEntityRef())
                .coverages(List.of(coverage()))
                .employers(companies())
                .experts(companies())
                .exposureOwners(List.of("null"))
                .independentAdjusters(List.of("null"))
                .payees(legalEntities())
                .type(SubClaimType.INJURY)
                ;
    }


    private static Map<String, LegalEntity> parties() {
        return Map.of(
                "ID1", person(),
                "ID2", company()
        );
    }

    private static <T extends Objekt> T objektBase(T objekt) {
        return (T) additionalFieldsBase(objekt)
                .coverages(List.of(coverage()))
                .owners(legalEntities());
    }

    private static Person person() {
        return (Person) emptyLegalEntityBase(
                new Person()
                        .address(address()));
    }

    private static Company company() {
        return (Company) emptyLegalEntityBase(
                new Company()
                        .address(address()));
    }

    private static Coverage coverage() {
        return additionalFieldsBase(new Coverage());
    }

    private static LegalEntity emptyLegalEntityBase(LegalEntity legalEntity) {
        return additionalFieldsBase(legalEntity)
                .contacts(List.of(new Contact()))
                .bankAccounts(List.of(new BankAccount()))
                .identifications(List.of(new Identification()))
                .lawyers(legalEntities());
    }

    private static <T extends AdditionalFieldsBase> T additionalFieldsBase(T base) {
        return (T) base.additionalFields(Map.of(
                "key", "value"
        ));
    }

}
