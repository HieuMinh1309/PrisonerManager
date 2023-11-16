package entity;

import java.util.Objects;

public class CellsByPrisoner {
	private int cellId;
	private int cellNumber;
	private String status;
	private String size;
	private int areaId;
	private int floor_N;
	/**
	 * @param cellId
	 * @param cellNumber
	 * @param status
	 * @param size
	 * @param areaId
	 * @param floor_N
	 */
	public CellsByPrisoner(int cellId, int cellNumber, String status, String size, int areaId, int floor_N) {
		super();
		this.cellId = cellId;
		this.cellNumber = cellNumber;
		this.status = status;
		this.size = size;
		this.areaId = areaId;
		this.floor_N = floor_N;
	}
	/**
	 * 
	 */
	public CellsByPrisoner() {
		super();
	}
	public int getCellId() {
		return cellId;
	}
	public void setCellId(int cellId) {
		this.cellId = cellId;
	}
	public int getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public int getFloor_N() {
		return floor_N;
	}
	public void setFloor_N(int floor_N) {
		this.floor_N = floor_N;
	}
	@Override
	public String toString() {
		return "CellsByPrisoner [cellId=" + cellId + ", cellNumber=" + cellNumber + ", status=" + status + ", size="
				+ size + ", areaId=" + areaId + ", floor_N=" + floor_N + "]";
	}

	

	
	
	
	
}
