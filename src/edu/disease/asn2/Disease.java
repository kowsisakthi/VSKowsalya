package edu.disease.asn2;

import java.util.Objects;
import java.util.UUID;

/**
 * This abstract class represents an Disease object and inside the class declare
 * the abstarct method getExamples. It stores basic information such as
 * diseaseld,name.
 */
public abstract class Disease {
	/**
	 * The UUID representing a disease identifier.
	 */
	UUID diseaseId;
	/**
	 * The name associated with the disease.
	 */
	String name;

	/**
	 * Gets the UUID representing a disease identifier.
	 *
	 * @return The UUID representing a disease identifier.
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * Sets the UUID representing a disease identifier.
	 *
	 * @param diseaseld The UUID representing a disease identifier to set.
	 */
	public void setDiseaseld(UUID diseaseld) {
		this.diseaseId = diseaseld;
	}

	/**
	 * Gets the name associated with the disease.
	 *
	 * @return The name associated with the disease.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name associated with the disease.
	 *
	 * @param name The name associated with the disease to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	

	/**
	 * Returns a string representation of this Disease object. The returned string
	 * includes information about the disease's ID and name.
	 *
	 * @return A string representation of this Disease object.
	 */
	@Override
	public String toString() {
		return "Disease [diseaseld=" + diseaseId + ", name=" + name + "]";
	}

	
	/**
	 * Retrieves an array of example strings. This method is meant to be implemented
	 * by subclasses to provide specific examples.
	 *
	 * @return An array of example strings.
	 */
	abstract public String[] getExamples();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}
	
}

/**
 * A subclass of Disease representing infectious diseases. This class provides
 * specific examples of infectious diseases.
 */
class InfectiousDisease extends Disease {
	

	/**
	 * Retrieves an array of example infectious disease names.
	 *
	 * @return An array of example infectious disease names.
	 */
	@Override
	public String[] getExamples() {
		String[] infecD = { "COVID", "HIV", "Chickenpox", "Cold" };
		return infecD;
	}

}

/**
 * A subclass of Disease representing non-infectious diseases. This class
 * provides specific examples of non-infectious diseases.
 */
class NonInfectiousDisease extends Disease {

	

	/**
	 * Retrieves an array of example non-infectious disease names.
	 *
	 * @return An array of example non-infectious disease names.
	 */
	@Override
	public String[] getExamples() {
		String[] nonInfec = { "Stroke", "Heartattack", "Cancers", "Cardiovascular " };
		return nonInfec;
	}
	
}