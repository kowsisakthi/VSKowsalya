package edu.disease.asn3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.disease.asn3.Exposure;


public class DiseaseControlManagerImplTest {
	   DiseaseControlManagerImpl manager;
	@Test
    public void testConstructorWithValidValues() {
        
      manager= new DiseaseControlManagerImpl(10, 20);
      assertThrows(IllegalArgumentException.class, ()->{ manager= new DiseaseControlManagerImpl(-1, 20);});
      assertThrows(IllegalArgumentException.class, ()->{ manager= new DiseaseControlManagerImpl(10, -1);});
      assertThrows(IllegalArgumentException.class, ()->{ manager= new DiseaseControlManagerImpl(0, 20);});
      assertThrows(IllegalArgumentException.class, ()->{ manager= new DiseaseControlManagerImpl(-1, 0);});
     
      
        

       
    }
	@Test
	public void addDiseaseTest() {
		 manager= new DiseaseControlManagerImpl(10, 20);
		 String name="kowsi";
		 boolean infectious=true;
		 Disease[] diseases= new Disease[5];
		 //manager.s
		 manager.addDisease(name, infectious);
		 manager.addDisease(name, false);
		 manager= new DiseaseControlManagerImpl(1, 1);
		 manager.addDisease(name, infectious);
		 assertThrows(IllegalStateException.class, ()->{manager.addDisease(name, false);});
		 
	}
	@Test
	public void getDiseaseTest() {
		manager= new DiseaseControlManagerImpl(2, 2);
		UUID diseaseld=UUID.randomUUID();
		Disease s=manager.addDisease("kowsi", true);
		s.setDiseaseld(diseaseld);
		Disease f=manager.getDisease(diseaseld);
		
		f=manager.getDisease(UUID.randomUUID());
		//Disease[] diseases= new Disease[5];
		
	}
    @Test
	public void  addPatienTest() {
    	manager= new DiseaseControlManagerImpl(1, 1);
    	manager.addPatient("kowsi", "sakthi", 2, 2);
    	
    	assertThrows(IllegalStateException.class, ()->{manager.addPatient("kowsi", "sakthi", 2, 2);});
	}
    
    @Test
    public void getPatientTest() {
    	manager= new DiseaseControlManagerImpl(1, 1);
    	UUID patientid=UUID.randomUUID();
    	Patient s=manager.addPatient("kowsi", "sakthi", 2, 2);
		s.setPatientId(patientid);
		Patient f=manager.getPatient(patientid);
    	manager.getPatient(UUID.randomUUID());
    	
    }
    @Test
    public void getPatientTest1() {
    	manager= new DiseaseControlManagerImpl(1, 1);
    	UUID patientid=UUID.randomUUID();
    	Patient s=manager.addPatient("kowsi", "sakthi", 2, 2);
		s.setPatientId(patientid);
		Patient f=manager.getPatient(patientid);
    	manager.getPatient(UUID.randomUUID());
    	
    }
    @Test
    public void addDiseaseToPatientTest() {
    	manager= new DiseaseControlManagerImpl(1, 1);
    	UUID patientId=UUID.randomUUID();
    	UUID diseaseId=UUID.randomUUID();
    	Disease d=manager.addDisease("kowsi", true);
    	d.setDiseaseld(diseaseId);
    	Patient p=manager.addPatient("prasanna", "kumar", 2, 2);
    	p.setPatientId(patientId);
    	manager.addDiseaseToPatient(patientId, diseaseId);

    	assertThrows(IllegalArgumentException.class,()->{manager.addDiseaseToPatient(UUID.randomUUID(), UUID.randomUUID());});
    	assertThrows(IllegalArgumentException.class,()->{manager.addDiseaseToPatient(patientId, UUID.randomUUID());});
    	
    	
    }
    @Test
    public void addExposureToPatientTest() {
    	manager= new DiseaseControlManagerImpl(1, 1);
    	UUID patientId=UUID.randomUUID();
    	Exposure e= new Exposure(UUID.randomUUID());
    	Patient p=manager.addPatient("prasanna", "kumar", 2, 2);
    	p.setPatientId(patientId);
    	//Patient f=manager.getPatient(patientId);
    	manager.addExposureToPatient(patientId, e);
    	assertThrows(IllegalArgumentException.class,()->{manager.addExposureToPatient(UUID.randomUUID(), e);});
    }
    @Test
    public void testGetDisease() {
        int maxDiseases = 2;
        int maxPatients = 2;
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(maxDiseases, maxPatients);

        Disease disease1 = manager.addDisease("COVID-19", true);
        Disease disease2 = manager.addDisease("Influenza", true);

        Disease[] diseases = manager.getDisease();

        assertEquals(2, diseases.length);
        assertArrayEquals(new Disease[]{disease1, disease2}, diseases);
    }
    @Test
    public void testGetPatients() {
    	DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(2, 2);
    	Patient P=manager.addPatient("KOWSI", "KAVI", 2, 2);
    	Patient P1=manager.addPatient("KAVI", "KANI", 2, 2);
    	Patient[]patients=manager.getPatient();
    	assertEquals(2, patients.length);
        assertArrayEquals(new Patient[]{P, P1}, patients);
    }
}
