package entity;

import java.util.Objects;

public class RelativesByPrisoner {
	private int relativeId; //entity
	private int id;
	private String relativeName;
	private String contactInfo;
	private String relationship;
	private int CCCD;
	private String image;
	/**
	 * @param relativeId
	 * @param id
	 * @param relativeName
	 * @param contactInfo
	 * @param relationship
	 * @param cCCD
	 * @param image
	 */
	public RelativesByPrisoner(int relativeId, int id, String relativeName, String contactInfo, String relationship,
			int cCCD, String image) {
		super();
		this.relativeId = relativeId;
		this.id = id;
		this.relativeName = relativeName;
		this.contactInfo = contactInfo;
		this.relationship = relationship;
		CCCD = cCCD;
		this.image = image;
	}
	/**
	 * 
	 */
	public RelativesByPrisoner() {
		super();
	}
	public int getRelativeId() {
		return relativeId;
	}
	public void setRelativeId(int relativeId) {
		this.relativeId = relativeId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRelativeName() {
		return relativeName;
	}
	public void setRelativeName(String relativeName) {
		this.relativeName = relativeName;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public int getCCCD() {
		return CCCD;
	}
	public void setCCCD(int cCCD) {
		CCCD = cCCD;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "RelativesByPrisoner [relativeId=" + relativeId + ", id=" + id + ", relativeName=" + relativeName
				+ ", contactInfo=" + contactInfo + ", relationship=" + relationship + ", CCCD=" + CCCD + ", image="
				+ image + "]";
	}

	
	
}
