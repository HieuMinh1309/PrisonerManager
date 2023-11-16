package entity;

import java.util.Objects;

public class IsolationCellsByPrisoner {
	private int cellId;
	private int cellNumber;
	private String description;
	private Boolean isOccupied;
	private Prisoners id;
	/**
	 * 
	 */
	public IsolationCellsByPrisoner() {
	
	}
	/**
	 * @param cellId
	 * @param cellNumber
	 * @param description
	 * @param isOccupied
	 * @param id
	 */
	public IsolationCellsByPrisoner(int cellId, int cellNumber, String description, Boolean isOccupied, Prisoners id) {
		
		this.cellId = cellId;
		this.cellNumber = cellNumber;
		this.description = description;
		this.isOccupied = isOccupied;
		this.id = id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getIsOccupied() {
		return isOccupied;
	}
	public void setIsOccupied(Boolean isOccupied) {
		this.isOccupied = isOccupied;
	}
	public Prisoners getId() {
		return id;
	}
	public void setId(Prisoners id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cellId, cellNumber, description, id, isOccupied);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IsolationCellsByPrisoner other = (IsolationCellsByPrisoner) obj;
		return cellId == other.cellId && cellNumber == other.cellNumber
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(isOccupied, other.isOccupied);
	}
	
	
	
}
