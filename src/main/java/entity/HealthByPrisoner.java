package entity;

import java.util.Objects;

public class HealthByPrisoner<Health> {
	private int healthId;//identity
	private int id;
	private String medicalHistory;
	private String currentConditions;
	private String allergies;
	
	public HealthByPrisoner(int healthId, int id, String medicalHistory, String currentConditions, String allergies) {
		this.healthId = healthId;
		this.id = id;
		this.medicalHistory = medicalHistory;
		this.currentConditions = currentConditions;
		this.allergies = allergies;
	}

	public HealthByPrisoner() {
	}

	public int getHealthId() {
		return healthId;
	}

	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(String medicalHistory) {
		this.medicalHistory = medicalHistory;
	}

	public String getCurrentConditions() {
		return currentConditions;
	}

	public void setCurrentConditions(String currentConditions) {
		this.currentConditions = currentConditions;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allergies, currentConditions, healthId, id, medicalHistory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HealthByPrisoner other = (HealthByPrisoner) obj;
		return Objects.equals(allergies, other.allergies) && Objects.equals(currentConditions, other.currentConditions)
				&& healthId == other.healthId && Objects.equals(id, other.id)
				&& Objects.equals(medicalHistory, other.medicalHistory);
	}

	
	
	
}
