package edu.disease.asn2;

import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class DiseaseTest {

    @Test
    public void testDiseaseEqualsAndHashCode() {
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new InfectiousDisease();

        assertTrue(disease1.equals(disease2));
        assertTrue(disease2.equals(disease1));
        assertEquals(disease1.hashCode(), disease2.hashCode());
    }

    @Test
    public void testDiseaseNotEquals() {
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new NonInfectiousDisease();

        assertFalse(disease1.equals(disease2));
        assertFalse(disease2.equals(disease1));
    }

    @Test
    public void testDiseaseToString() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        Disease disease = new InfectiousDisease();

        String expectedString = "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
        assertEquals(disease.toString(), disease.toString());
    }

    @Test
    public void testInfectiousDiseaseGetExamples() {
        InfectiousDisease infectiousDisease = new InfectiousDisease();
        String[] expectedExamples = { "COVID", "HIV", "Chickenpox", "Cold" };
        assertArrayEquals(expectedExamples, infectiousDisease.getExamples());
    }

    @Test
    public void testNonInfectiousDiseaseGetExamples() {
        NonInfectiousDisease nonInfectiousDisease = new NonInfectiousDisease();
        String[] expectedExamples = { "Stroke", "Heartattack", "Cancers", "Cardiovascular " };
        assertArrayEquals(expectedExamples, nonInfectiousDisease.getExamples());
    }
    @Test
    public void testGetDiseaseId() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        Disease disease = new InfectiousDisease();
        disease.setDiseaseld(diseaseId);

        
        assertEquals(diseaseId, disease.getDiseaseId());
    }
    @Test
    public void testGetName() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        Disease disease = new InfectiousDisease();
        disease.setName(name);
        disease.setDiseaseld(diseaseId);
        assertEquals(name, disease.getName());
    }
    @Test
    public void testEqualsWithEqualObjects() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        
        Disease disease1 = new InfectiousDisease();
        Disease disease2 = new InfectiousDisease();

        assertTrue(disease1.equals(disease1));
        assertTrue(disease2.equals(disease2));
    }
    @Test
    public void testEqualsWithNull() {
        UUID diseaseId = UUID.randomUUID();
        String name = "COVID-19";
        
        Disease disease = new InfectiousDisease();

        assertFalse(disease.equals(null));
    }
    @Test
    public void testEqual() {
    	 UUID diseaseId1 = UUID.randomUUID();
         String name1 = "COVID-19";
         UUID diseaseId2 = UUID.randomUUID();
         String name2 = "COVID-19";
    	Disease d= new InfectiousDisease();
    	Disease d1= new InfectiousDisease();
    	d.setDiseaseld(null);
    	d1.setDiseaseld( UUID.randomUUID());
    	d.equals(d1);
    	d1.setDiseaseld(null);
    	d.equals(d1);
    	d.setDiseaseld(diseaseId1);
    	d1.setDiseaseld(diseaseId1);
    	d.equals(d1);
    	d1.setDiseaseld(diseaseId2);
    	d.equals(d1);
    	
    	//assertTrue(d.equals(null));
    	
    }


}
