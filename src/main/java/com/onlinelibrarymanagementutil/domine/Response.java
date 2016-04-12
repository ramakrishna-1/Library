/**
 * 
 */
package com.onlinelibrarymanagementutil.domine;

import java.io.Serializable;

/**
 * @author Rama Krishna
 * @since 11-04-2016
 * @version 1.0
 * @ppurpose the class used to show status and message about result
 */
public class Response implements Serializable {

	/**
	 * 
	 */
	private static long serialVersionUID = 1L;

	private byte status;
	private String message, data;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @param serialversionuid
	 *            the serialversionuid to set
	 */
	public static void setSerialversionuid(long serialversionuid) {
		serialVersionUID = serialversionuid;
	}

	/**
	 * @return the status
	 */
	public byte getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(byte status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

}
