package edu.disease.asn2;

import java.util.UUID;
import edu.disease.asn1.Exposure;

/**
 * An interface for managing diseases and patients.
 */
public interface DiseaseControlManager {

    /**
     * Adds a new disease to the application.
     *
     * @param name       A name for the disease.
     * @param infectious True if the disease is infectious, false otherwise.
     * @return The newly created Disease object.
     * @throws IllegalStateException if the maximum capacity of diseases has been reached.
     */
    Disease addDisease(String name, boolean infectious);

    /**
     * Returns the disease with the specified disease ID.
     *
     * @param diseaseId The ID of the disease to retrieve.
     * @return The Disease object with the specified ID, or null if not found.
     */
    Disease getDisease(UUID diseaseId);

    /**
     * Adds a new patient to the application.
     *
     * @param firstName     The first name of the patient.
     * @param lastName      The last name of the patient.
     * @param maxDiseases   The maximum number of diseases this patient can have.
     * @param maxExposures  The maximum number of exposures this patient can have.
     * @return The newly created Patient object.
     * @throws IllegalStateException if the maximum capacity of patients has been reached.
     */
    Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

    /**
     * Returns the patient with the specified patient ID.
     *
     * @param patientId The ID of the patient to retrieve.
     * @return The Patient object with the specified ID, or null if not found.
     */
    Patient getPatient(UUID patientId);

    /**
     * Adds a disease to a patient.
     *
     * @param patientId The ID of the patient.
     * @param diseaseId The ID of the disease to add.
     * @throws IllegalArgumentException if the patient or disease is not found.
     */
    void addDiseaseToPatient(UUID patientId, UUID diseaseId);

    /**
     * Adds an exposure to a patient.
     *
     * @param patientId The ID of the patient.
     * @param exposure   The Exposure object to add.
     * @throws IllegalArgumentException if the patient is not found.
     */
    void addExposureToPatient(UUID patientId, Exposure exposure);
}
