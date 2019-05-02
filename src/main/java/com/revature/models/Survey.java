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
 * The Class Survey.
 */
@Entity
@Table(name = "surveys")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Survey {

	/** The survey id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "id")
	private int surveyId;
	
	/** The title. */
	@NotNull
	private String title;
	
	/** The description. */
	@NotNull
	private String description;
	
	/** The date created. */
	@Column(name = "date_created")
	@NotNull
	private Date dateCreated;
	
	/** The closing date. */
	@Column(name = "closing_date")
	private Date closingDate;
	
	/** The template. */
	private boolean template;
	
	/** The published. */
	private boolean published;

	/**
	 * Instantiates a new survey.
	 *
	 * @param surveyId the survey id
	 * @param title the title
	 * @param description the description
	 * @param dateCreated the date created
	 * @param closingDate the closing date
	 * @param template the template
	 * @param published the published
	 */
	public Survey(int surveyId, @NotNull String title, @NotNull String description, @NotNull Date dateCreated,
			Date closingDate, boolean template, boolean published) {
		super();
		this.surveyId = surveyId;
		this.title = title;
		this.description = description;
		this.dateCreated = dateCreated;
		this.closingDate = closingDate;
		this.template = template;
		this.published = published;
	}

	/**
	 * Instantiates a new survey.
	 */
	public Survey() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Gets the survey id.
	 *
	 * @return the surveyId
	 */
	public int getSurveyId() {
		return surveyId;
	}

	/**
	 * Sets the survey id.
	 *
	 * @param surveyId the surveyId to set
	 */
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the date created.
	 *
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * Sets the date created.
	 *
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * Gets the closing date.
	 *
	 * @return the closingDate
	 */
	public Date getClosingDate() {
		return closingDate;
	}

	/**
	 * Sets the closing date.
	 *
	 * @param closingDate the closingDate to set
	 */
	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	/**
	 * Checks if is template.
	 *
	 * @return the template
	 */
	public boolean isTemplate() {
		return template;
	}

	/**
	 * Sets the template.
	 *
	 * @param template the template to set
	 */
	public void setTemplate(boolean template) {
		this.template = template;
	}

	/**
	 * Checks if is published.
	 *
	 * @return the published
	 */
	public boolean isPublished() {
		return published;
	}

	/**
	 * Sets the published.
	 *
	 * @param published the published to set
	 */
	public void setPublished(boolean published) {
		this.published = published;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result + ((dateCreated == null) ? 0 : dateCreated.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (published ? 1231 : 1237);
		result = prime * result + surveyId;
		result = prime * result + (template ? 1231 : 1237);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Survey other = (Survey) obj;
		if (closingDate == null) {
			if (other.closingDate != null)
				return false;
		} else if (!closingDate.equals(other.closingDate))
			return false;
		if (dateCreated == null) {
			if (other.dateCreated != null)
				return false;
		} else if (!dateCreated.equals(other.dateCreated))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (published != other.published)
			return false;
		if (surveyId != other.surveyId)
			return false;
		if (template != other.template)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Survey [surveyId=" + surveyId + ", title=" + title + ", description=" + description + ", dateCreated="
				+ dateCreated + ", closingDate=" + closingDate + ", template=" + template + ", published=" + published
				+ "]";
	}

}