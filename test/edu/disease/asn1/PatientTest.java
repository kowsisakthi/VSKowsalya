package edu.disease.asn1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {
    private Patient patient;
    private UUID diseaseId1;
    private UUID diseaseId2;
    private Exposure exposure1;
    private Exposure exposure2;

    @BeforeEach
    void setUp() {
    	LocalDateTime dateTime = LocalDateTime.now();
        patient = new Patient(2, 2);
        diseaseId1 = UUID.randomUUID();
        diseaseId2 = UUID.randomUUID();
    }

    @Test
    void testAddDiseaseId() {
        patient.addDiseaseId(diseaseId1);
        assertEquals(1, patient.getDiseaseCount());
        assertArrayEquals(new UUID[]{diseaseId1, null}, patient.getDiseaseIds());
    }

    @Test
    void testAddExposure() {
        patient.addExposure(exposure1);
        assertEquals(1, patient.getExposureCount());
        assertArrayEquals(new Exposure[]{exposure1, null}, patient.getExposures());
    }
    
    @Test
    void testToString() {
        // Ensure that the toString() method does not throw exceptions
        assertNotNull(patient.toString());
    }
    
   
    
    @Test
    void testEquals() {
        Patient samePatient = new Patient(3, 4);
        samePatient.setPatientId(patient.getPatientId());

        assertTrue(patient.equals(samePatient));
    }
    
    @Test
    void testSetLastName() {
        String lastName = "Sakthi";
        patient.setLastName(lastName);

        assertEquals(lastName, patient.getLastName());
    }

    @Test
    void testHashCode() {
        int hashCode = patient.hashCode();

        // Ensure that the hashCode does not throw exceptions
        assertNotNull(hashCode);
    }
       
    @Test
    void testGetPatientId() {
        UUID generatedId = patient.getPatientId();
        assertNotNull(generatedId);
    }

    @Test
    void testSetFirstName() {
        String firstName = "Kowsi";
        patient.setFirstName(firstName);

        assertEquals(firstName, patient.getFirstName());
    }
    
    @Test
    void testAddDiseaseld() {
        patient.addDiseaseId(diseaseId2);

        UUID[] diseaseIds = patient.getDiseaseIds();
        assertNotNull(diseaseIds);
    }
    
    @Test
    public void testConstructorWithValidValues() {
        // Test constructor with valid values for maxDiseases and maxExposures
        int maxDiseases = 5;
        int maxExposures = 10;

        Patient patient = new Patient(maxDiseases, maxExposures);

        // Assert that the Patient object is not null
        assertNotNull(patient);

        // Assert that the patientId is not null
        assertNotNull(patient.getPatientId());

        // Assert that exposures and diseaseIds arrays are correctly initialized
        assertEquals(maxDiseases, patient.getDiseaseIds().length);
        assertEquals(maxExposures, patient.getExposures().length);
        assertEquals(0, patient.getExposureCount());
        assertEquals(0, patient.getDiseaseCount());
    }
    @Test
    public void testInvalidConstructorArguments() {
    	 Patient patient;
        assertThrows(IllegalArgumentException.class, () -> {  new Patient(-1, 0); });
       
          
        
        
    }
    @Test
    public void testInvalidConstructorArguments1() {
    	 Patient patient;
        assertThrows(IllegalArgumentException.class, () -> {  new Patient(0, 0); });
       
          
        
        
    }
    @Test
    public void testSetExposures() {
        Patient patient = new Patient(5, 10);

        Exposure[] exposures = new Exposure[3];
        exposures[0] = new Exposure( UUID.randomUUID());
        exposures[1] = new Exposure( UUID.randomUUID());
        exposures[2] = new Exposure(UUID.randomUUID());

        patient.setExposures(exposures);

        assertArrayEquals(exposures, patient.getExposures());
    }
    @Test
    public void testSetDiseaseIds() {
        Patient patient = new Patient(5, 10);

        UUID[] diseaseIds = new UUID[3];
        diseaseIds[0] = UUID.randomUUID();
        diseaseIds[1] = UUID.randomUUID();
        diseaseIds[2] = UUID.randomUUID();

        patient.setDiseaseIds(diseaseIds);

        assertArrayEquals(diseaseIds, patient.getDiseaseIds());
    }
    @Test
    public void testSetExposureCount() {
        Patient patient = new Patient(5, 10);
        
        int exposureCount = 3;
        patient.setExposureCount(exposureCount);

        assertEquals(exposureCount, patient.getExposureCount());
    }
    @Test
    public void testSetDiseaseCount() {
        Patient patient = new Patient(5, 10);

        int diseaseCount = 2;
        patient.setDiseaseCount(diseaseCount);

        assertEquals(diseaseCount, patient.getDiseaseCount());
    }
    @Test
    public void testAddDiseaseIdExceedingCapacity() {
        Patient patient = new Patient(1, 1);
        
        UUID diseaseId1 = UUID.randomUUID();
        patient.addDiseaseId(diseaseId1);

        UUID diseaseId2 = UUID.randomUUID();
        assertThrows(IndexOutOfBoundsException.class, () -> {patient.addDiseaseId(diseaseId2); });
            
       

        
        assertEquals(1, patient.getDiseaseCount());
        assertEquals(diseaseId1, patient.getDiseaseIds()[0]);
    }
    @Test
    public void testAddExposureExceedingCapacity() {
        Patient patient = new Patient(1, 1);
        
        Exposure exposure1 = new Exposure(UUID.randomUUID());
        patient.addExposure(exposure1);

        Exposure exposure2 = new Exposure(UUID.randomUUID());
        assertThrows(IndexOutOfBoundsException.class, () -> { patient.addExposure(exposure2); });
           
       

        assertEquals(1, patient.getExposureCount());
        assertSame(exposure1, patient.getExposures()[0]);
    }
    @Test
    public void testEqualsWithEqualObjects() {
        UUID patientId = UUID.randomUUID();
        Patient patient1 = new Patient(5, 10);
        patient1.setPatientId(patientId);
        
        Patient patient2 = new Patient(5, 10);
        patient2.setPatientId(patientId);

        assertTrue(patient1.equals(patient2));
        assertTrue(patient2.equals(patient1));
    }
    @Test
    public void testEqualsWithDifferentObjects() {
        Patient patient1 = new Patient(5, 10);
        patient1.setPatientId(UUID.randomUUID());

        Patient patient2 = new Patient(5, 10);
        patient2.setPatientId(UUID.randomUUID());

        assertFalse(patient1.equals(patient2));
        assertFalse(patient2.equals(patient1));
    }
    @Test
    public void testEqualsWithNull() {
        Patient patient = new Patient(5, 10);
        assertFalse(patient.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        Patient patient = new Patient(5, 10);
        assertFalse(patient.equals("NotAPatient"));
    }
}
