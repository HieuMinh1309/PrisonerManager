package entity;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;

public class WorkShiftsByWarden {
	private int shiftNumber;
	private String shiftType;
	private LocalDate shiftDate;
	private Time startTime;
	private Time endTime;
	private int areaId;
	
	public WorkShiftsByWarden() {
	}

	/**
	 * @param shiftNumber
	 * @param shiftType
	 * @param shiftDate
	 * @param startTime
	 * @param endTime
	 * @param areaId
	 */
	public WorkShiftsByWarden(int shiftNumber, String shiftType, LocalDate shiftDate, Time startTime,
			Time endTime, int areaId) {
		super();
		this.shiftNumber = shiftNumber;
		this.shiftType = shiftType;
		this.shiftDate = shiftDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.areaId = areaId;
	}

	public int getShiftNumber() {
		return shiftNumber;
	}

	public void setShiftNumber(int shiftNumber) {
		this.shiftNumber = shiftNumber;
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

	@Override
	public String toString() {
		return "WorkShiftsByWarden [shiftNumber=" + shiftNumber + ", shiftType=" + shiftType + ", shiftDate="
				+ shiftDate + ", startTime=" + startTime + ", endTime=" + endTime + ", areaId=" + areaId + "]";
	}

	

	
	
	
}
