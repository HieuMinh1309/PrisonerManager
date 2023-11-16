package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Reports {
	private int reportId;
	private Wardens wardenId;
	private Areas areaId;
	private CellsByPrisoner cellId;
	private Prisoners id;
	private LocalDate reportDate;
	private String reportText;
	/**
	 * @param reportId
	 * @param wardenId
	 * @param areaId
	 * @param cellId
	 * @param id
	 * @param reportDate
	 * @param reportText
	 */
	public Reports(int reportId, Wardens wardenId, Areas areaId, CellsByPrisoner cellId, Prisoners id, LocalDate reportDate,
			String reportText) {
		super();
		this.reportId = reportId;
		this.wardenId = wardenId;
		this.areaId = areaId;
		this.cellId = cellId;
		this.id = id;
		this.reportDate = reportDate;
		this.reportText = reportText;
	}
	/**
	 * 
	 */
	public Reports() {
		super();
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public Wardens getWardenId() {
		return wardenId;
	}
	public void setWardenId(Wardens wardenId) {
		this.wardenId = wardenId;
	}
	public Areas getAreaId() {
		return areaId;
	}
	public void setAreaId(Areas areaId) {
		this.areaId = areaId;
	}
	public CellsByPrisoner getCellId() {
		return cellId;
	}
	public void setCellId(CellsByPrisoner cellId) {
		this.cellId = cellId;
	}
	public Prisoners getId() {
		return id;
	}
	public void setId(Prisoners id) {
		this.id = id;
	}
	public LocalDate getReportDate() {
		return reportDate;
	}
	public void setReportDate(LocalDate reportDate) {
		this.reportDate = reportDate;
	}
	public String getReportText() {
		return reportText;
	}
	public void setReportText(String reportText) {
		this.reportText = reportText;
	}
	@Override
	public int hashCode() {
		return Objects.hash(areaId, cellId, id, reportDate, reportId, reportText, wardenId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reports other = (Reports) obj;
		return Objects.equals(areaId, other.areaId) && Objects.equals(cellId, other.cellId)
				&& Objects.equals(id, other.id) && Objects.equals(reportDate, other.reportDate)
				&& reportId == other.reportId && Objects.equals(reportText, other.reportText)
				&& Objects.equals(wardenId, other.wardenId);
	}
	
	
}
