
package com.onlinelibrarymanagementutil.domine;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Rama Krishna
 * @since 10-03-2016
 * @version 1.0 
 * Entity class and mapping with Database Table
 */

@Entity
@Table(name = "BookInfoMaster", schema = "Library")
public class Book implements Serializable {

	private static long serialVersionUID = 1L;

	@Id
	private String bookISBN;
	private String bookTitle;
	private String author;
	private String edition;
	private Double rate;
	private String publication;
	private Integer noOfBooks;

	@ManyToOne
	@JoinColumn(name = "book_ISBN")
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
	 * @param serialversionuid the serialversionuid to set
	 */
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the bookISBN
	 */
	public String getBookISBN() {
		return bookISBN;
	}

	/**
	 * @param bookISBN
	 *            the bookISBN to set
	 */
	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle
	 *            the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the edition
	 */
	public String getEdition() {
		return edition;
	}

	/**
	 * @param edition
	 *            the edition to set
	 */
	public void setEdition(String edition) {
		this.edition = edition;
	}

	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}

	/**
	 * @param rate
	 *            the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}

	/**
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}

	/**
	 * @param publication
	 *            the publication to set
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}

	/**
	 * @return the noOfBooks
	 */
	public Integer getNoOfBooks() {
		return noOfBooks;
	}

	/**
	 * @param noOfBooks
	 *            the noOfBooks to set
	 */
	public void setNoOfBooks(Integer noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

}
