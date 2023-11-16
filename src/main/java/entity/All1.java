package entity;

import java.sql.Time;
import java.time.LocalDate;

public class All1 {
	private int wardenId ;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String isMale;
	private String phoneNumber;
	private String email;
	private String address;
	private String position;
	private LocalDate startDate;
	private int day_off;
	private Boolean is_Working;
	private int salary;
	private int shift_number;
	private String shiftType;
	private LocalDate shiftDate;
	private Time startTime;
	private Time endTime;
	private int areaId;
	private String areaName;
	private String description;
	private String areasLocationDescription;
	/**
	 * 
	 */
	public All1() {
		super();
	}
	/**
	 * @param wardenId
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param isMale
	 * @param phoneNumber
	 * @param email
	 * @param address
	 * @param position
	 * @param startDate
	 * @param day_off
	 * @param is_Working
	 * @param salary
	 * @param shift_number
	 * @param shiftType
	 * @param shiftDate
	 * @param startTime
	 * @param endTime
	 * @param areaId
	 * @param areaName
	 * @param description
	 * @param areasLocationDescription
	 * @param cellNumber
	 * @param status
	 * @param size
	 * @param cellsLocationDescription
	 * @param floor_N
	 */
	public All1(int wardenId, String firstName, String lastName, LocalDate dateOfBirth, String isMale,
			String phoneNumber, String email, String address, String position, LocalDate startDate, int day_off,
			Boolean is_Working, int salary, int shift_number, String shiftType, LocalDate shiftDate, Time startTime,
			Time endTime, int areaId, String areaName, String description, String areasLocationDescription) {
		super();
		this.wardenId = wardenId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.isMale = isMale;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.position = position;
		this.startDate = startDate;
		this.day_off = day_off;
		this.is_Working = is_Working;
		this.salary = salary;
		this.shift_number = shift_number;
		this.shiftType = shiftType;
		this.shiftDate = shiftDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.areaId = areaId;
		this.areaName = areaName;
		this.description = description;
		this.areasLocationDescription = areasLocationDescription;
	}
	public int getWardenId() {
		return wardenId;
	}
	public void setWardenId(int wardenId) {
		this.wardenId = wardenId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIsMale() {
		return isMale;
	}
	public void setIsMale(String isMale) {
		this.isMale = isMale;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public int getDay_off() {
		return day_off;
	}
	public void setDay_off(int day_off) {
		this.day_off = day_off;
	}
	public Boolean getIs_Working() {
		return is_Working;
	}
	public void setIs_Working(Boolean is_Working) {
		this.is_Working = is_Working;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getShift_number() {
		return shift_number;
	}
	public void setShift_number(int shift_number) {
		this.shift_number = shift_number;
	}
	public String getShiftType() {
		return shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}
	public LocalDate getShiftDate() {
		return shiftDate;
	}
	public void setShiftDate(LocalDate shiftDate) {
		this.shiftDate = shiftDate;
	}
	public Time getStartTime() {
		return startTime;
	}
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAreasLocationDescription() {
		return areasLocationDescription;
	}
	public void setAreasLocationDescription(String areasLocationDescription) {
		this.areasLocationDescription = areasLocationDescription;
	}
	
	@Override
	public String toString() {
		return "All1 [wardenId=" + wardenId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", isMale=" + isMale + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", address=" + address + ", position=" + position + ", startDate=" + startDate + ", day_off="
				+ day_off + ", is_Working=" + is_Working + ", salary=" + salary + ", shift_number=" + shift_number
				+ ", shiftType=" + shiftType + ", shiftDate=" + shiftDate + ", startTime=" + startTime + ", endTime="
				+ endTime + ", areaId=" + areaId + ", areaName=" + areaName + ", description=" + description
				+ ", areasLocationDescription=" + areasLocationDescription + "]";
	}
	
	
}
