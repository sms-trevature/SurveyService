package com.revature.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class History.
 */
@Entity
@Table(name = "survey_history")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class History {

	/** The history id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int historyId;

	/** The survey id. */
	@NotNull
	@Column(name = "survey_id")
	private int surveyId;

	/** The user email. */
	@NotNull
	@Column(name = "user_email")
	private String userEmail;

	/** The date assigned. */
	@Column(name = "date_assigned")
	@NotNull
	private Date dateAssigned;

	/** The date completed. */
	@Column(name = "date_completed")
	private Date dateCompleted;

	/**
	 * Instantiates a new history.
	 */
	public History() {
		super();
	}

	/**
	 * Instantiates a new history.
	 *
	 * @param historyId the history id
	 * @param surveyId the survey id
	 * @param userEmail the user email
	 * @param dateAssigned the date assigned
	 * @param dateCompleted the date completed
	 */
	public History(int historyId, @NotNull int surveyId, @NotNull String userEmail, @NotNull Date dateAssigned,
			Date dateCompleted) {
		super();
		this.historyId = historyId;
		this.surveyId = surveyId;
		this.userEmail = userEmail;
		this.dateAssigned = dateAssigned;
		this.dateCompleted = dateCompleted;
	}

	/**
	 * Gets the history id.
	 *
	 * @return the history id
	 */
	public int getHistoryId() {
		return historyId;
	}

	/**
	 * Sets the history id.
	 *
	 * @param historyId the new history id
	 */
	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	/**
	 * Gets the survey id.
	 *
	 * @return the survey id
	 */
	public int getSurveyId() {
		return surveyId;
	}

	/**
	 * Sets the survey id.
	 *
	 * @param surveyId the new survey id
	 */
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	/**
	 * Gets the user email.
	 *
	 * @return the user email
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * Sets the user email.
	 *
	 * @param userEmail the new user email
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * Gets the date assigned.
	 *
	 * @return the date assigned
	 */
	public Date getDateAssigned() {
		return dateAssigned;
	}

	/**
	 * Sets the date assigned.
	 *
	 * @param dateAssigned the new date assigned
	 */
	public void setDateAssigned(Date dateAssigned) {
		this.dateAssigned = dateAssigned;
	}

	/**
	 * Gets the date completed.
	 *
	 * @return the date completed
	 */
	public Date getDateCompleted() {
		return dateCompleted;
	}

	/**
	 * Sets the date completed.
	 *
	 * @param dateCompleted the new date completed
	 */
	public void setDateCompleted(Date dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAssigned == null) ? 0 : dateAssigned.hashCode());
		result = prime * result + ((dateCompleted == null) ? 0 : dateCompleted.hashCode());
		result = prime * result + historyId;
		result = prime * result + surveyId;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		History other = (History) obj;
		if (dateAssigned == null) {
			if (other.dateAssigned != null)
				return false;
		} else if (!dateAssigned.equals(other.dateAssigned))
			return false;
		if (dateCompleted == null) {
			if (other.dateCompleted != null)
				return false;
		} else if (!dateCompleted.equals(other.dateCompleted))
			return false;
		if (historyId != other.historyId)
			return false;
		if (surveyId != other.surveyId)
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "History [historyId=" + historyId + ", surveyId=" + surveyId + ", userEmail=" + userEmail
				+ ", dateAssigned=" + dateAssigned + ", dateCompleted=" + dateCompleted + "]";
	}

}
