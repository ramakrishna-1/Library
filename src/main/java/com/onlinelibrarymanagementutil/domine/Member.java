
package com.onlinelibrarymanagementutil.domine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @author Rama Krishna
 * @since 10-03-2016
 * @version 1.0 
 * Entity class and mapping with Database Table
 */

@Entity
@Table(name = "MemberMaster", schema = "Library")
public class Member implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(generator = "myGenerator")
	private Integer memberId;
	private String memberName;
	private String gender;
	private String department;
	private String phoneNumber;

	@ManyToOne
	@JoinColumn(name = "member_Id")
	private IssueBook issueBook;

	
	/**
	 * @return the issueBook
	 */
	public IssueBook getIssueBook() {
		return issueBook;
	}

	/**
	 * @param issueBook the issueBook to set
	 */
	public void setIssueBook(IssueBook issueBook) {
		this.issueBook = issueBook;
	}

	/**
	 * @return the memberId
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId
	 *            the memberId to set
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName
	 *            the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
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
