package entity;

import java.time.LocalDate;
import java.util.Objects;

public class Prisoners {
	private int  id ;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationality;
	private String isMale;
	private LocalDate dateOfEntry;
	private LocalDate releaseDate;
	private int cellId;
	private String conviction;
	private String punishment;
	private String religion;
	private String image;
	
	
	//constructor
	public Prisoners(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationality,
			String isMale, LocalDate dateOfEntry, LocalDate releaseDate, int cellId, String conviction,
			String punishment, String religion, String image) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationality = nationality;
		this.isMale = isMale;
		this.dateOfEntry = dateOfEntry;
		this.releaseDate = releaseDate;
		this.cellId = cellId;
		this.conviction = conviction;
		this.punishment = punishment;
		this.religion = religion;
		this.image = image;
	}

	public Prisoners() {
	}
	

	
	/**
	 * @param id
	 * @param cellId
	 */
	public Prisoners(int id, int cellId) {
		super();
		this.id = id;
		this.cellId = cellId;
	}

	//getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getIsMale() {
		return isMale;
	}

	public void setIsMale(String isMale) {
		this.isMale = isMale;
	}

	public LocalDate getDateOfEntry() {
		return dateOfEntry;
	}

	public void setDateOfEntry(LocalDate dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getCellId() {
		return cellId;
	}

	public void setCellId(int cellId) {
		this.cellId = cellId;
	}

	public String getConviction() {
		return conviction;
	}

	public void setConviction(String conviction) {
		this.conviction = conviction;
	}

	public String getPunishment() {
		return punishment;
	}

	public void setPunishment(String punishment) {
		this.punishment = punishment;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cellId, conviction, dateOfBirth, dateOfEntry, firstName, id, image, isMale, lastName,
				nationality, punishment, releaseDate, religion);
	}

	//equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prisoners other = (Prisoners) obj;
		return cellId == other.cellId && Objects.equals(conviction, other.conviction)
				&& Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(dateOfEntry, other.dateOfEntry)
				&& Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(image, other.image)
				&& Objects.equals(isMale, other.isMale) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(nationality, other.nationality) && Objects.equals(punishment, other.punishment)
				&& Objects.equals(releaseDate, other.releaseDate) && Objects.equals(religion, other.religion);
	}

	@Override
	public String toString() {
		return "Prisoners [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", nationality=" + nationality + ", isMale=" + isMale + ", dateOfEntry=" + dateOfEntry
				+ ", releaseDate=" + releaseDate + ", cellId=" + cellId + ", conviction=" + conviction + ", punishment="
				+ punishment + ", religion=" + religion + ", image=" + image + "]";
	}
	

	
	

}
