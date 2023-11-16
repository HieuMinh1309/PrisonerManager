package entity;

import java.time.LocalDate;
import java.util.Objects;

public class DisciplinaryViolationsByPrisoner {
	private int violationId;
	private Prisoners id;
	private LocalDate violationDate;
	private String violationDescription;
	/**
	 * @param violationId
	 * @param id
	 * @param violationDate
	 * @param violationDescription
	 */
	public DisciplinaryViolationsByPrisoner(int violationId, Prisoners id, LocalDate violationDate, String violationDescription) {
		
		this.violationId = violationId;
		this.id = id;
		this.violationDate = violationDate;
		this.violationDescription = violationDescription;
	}
	/**
	 * 
	 */
	public DisciplinaryViolationsByPrisoner() {
		
	}
	public int getViolationId() {
		return violationId;
	}
	public void setViolationId(int violationId) {
		this.violationId = violationId;
	}
	public Prisoners getId() {
		return id;
	}
	public void setId(Prisoners id) {
		this.id = id;
	}
	public LocalDate getViolationDate() {
		return violationDate;
	}
	public void setViolationDate(LocalDate violationDate) {
		this.violationDate = violationDate;
	}
	public String getViolationDescription() {
		return violationDescription;
	}
	public void setViolationDescription(String violationDescription) {
		this.violationDescription = violationDescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, violationDate, violationDescription, violationId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DisciplinaryViolationsByPrisoner other = (DisciplinaryViolationsByPrisoner) obj;
		return Objects.equals(id, other.id) && Objects.equals(violationDate, other.violationDate)
				&& Objects.equals(violationDescription, other.violationDescription) && violationId == other.violationId;
	}
	
	
	
	
}
