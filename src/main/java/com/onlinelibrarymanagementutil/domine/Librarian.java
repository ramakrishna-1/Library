
package com.onlinelibrarymanagementutil.domine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Rama Krishna
 * @since 10-03-2016
 * @version 1.0 Entity class and it mapping with Database Table
 */
@Entity
@Table(name = "LibrarianMaster", schema = "Library")
public class Librarian implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "librarianId")
	private String lbrId;

	@Column(name = "librarianName")
	private String name;

	private String gender;
	private String position;
	private String phoneNumber;

	/**
	 * @return the lbrId
	 */
	public String getLbrId() {
		return lbrId;
	}

	/**
	 * @param lbrId
	 *            the lbrId to set
	 */
	public void setLbrId(String lbrId) {
		this.lbrId = lbrId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position
	 *            the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
