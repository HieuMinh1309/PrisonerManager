package entity;

import java.util.Objects;

public class Areas {
	private int areaId;
	private String areaName;
	private String description;
	private String areasLocationDescription;
	/**
	 * @param areaId
	 * @param areaName
	 * @param description
	 * @param areasLocationDescription
	 */
	public Areas(int areaId, String areaName, String description, String areasLocationDescription) {
		super();
		this.areaId = areaId;
		this.areaName = areaName;
		this.description = description;
		this.areasLocationDescription = areasLocationDescription;
	}
	/**
	 * 
	 */
	public Areas() {
		super();
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
		return "Areas [areaId=" + areaId + ", areaName=" + areaName + ", description=" + description
				+ ", areasLocationDescription=" + areasLocationDescription + "]";
	}


	

	
	
}
