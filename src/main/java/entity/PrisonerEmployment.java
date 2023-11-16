package entity;

import java.time.LocalDate;
import java.util.Objects;

public class PrisonerEmployment {
	private int employmentId;
	private Prisoners id;
	private String employerName;
	private String jobTitle;
	private LocalDate startDate;
	private LocalDate endDate;
	private int salary;
	private String employmentDescription;
	/**
	 * 
	 */
	public PrisonerEmployment() {
		super();
	}
	/**
	 * @param employmentId
	 * @param id
	 * @param employerName
	 * @param jobTitle
	 * @param startDate
	 * @param endDate
	 * @param salary
	 * @param employmentDescription
	 */
	public PrisonerEmployment(int employmentId, Prisoners id, String employerName, String jobTitle, LocalDate startDate,
			LocalDate endDate, int salary, String employmentDescription) {
		super();
		this.employmentId = employmentId;
		this.id = id;
		this.employerName = employerName;
		this.jobTitle = jobTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.employmentDescription = employmentDescription;
	}
	public int getEmploymentId() {
		return employmentId;
	}
	public void setEmploymentId(int employmentId) {
		this.employmentId = employmentId;
	}
	public Prisoners getId() {
		return id;
	}
	public void setId(Prisoners id) {
		this.id = id;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmploymentDescription() {
		return employmentDescription;
	}
	public void setEmploymentDescription(String employmentDescription) {
		this.employmentDescription = employmentDescription;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employerName, employmentDescription, employmentId, endDate, id, jobTitle, salary,
				startDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrisonerEmployment other = (PrisonerEmployment) obj;
		return Objects.equals(employerName, other.employerName)
				&& Objects.equals(employmentDescription, other.employmentDescription)
				&& employmentId == other.employmentId && Objects.equals(endDate, other.endDate)
				&& Objects.equals(id, other.id) && Objects.equals(jobTitle, other.jobTitle) && salary == other.salary
				&& Objects.equals(startDate, other.startDate);
	}
	
	
	
}
