package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The Class QuestionType.
 */
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "question_type")
public class QuestionType {

	/** The id. */
	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	/** The question type. */
	@NotNull
	String questionType;
	
	
	/**
	 * Instantiates a new question type.
	 */
	public QuestionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new question type.
	 *
	 * @param id the id
	 * @param questionType the question type
	 */
	public QuestionType(int id, @NotNull String questionType) {
		super();
		this.id = id;
		this.questionType = questionType;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the question type.
	 *
	 * @return the question type
	 */
	public String getQuestionType() {
		return questionType;
	}
	
	/**
	 * Sets the question type.
	 *
	 * @param questionType the new question type
	 */
	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuestionTypeController [Id=" + id + ", questionType=" + questionType + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((questionType == null) ? 0 : questionType.hashCode());
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
		QuestionType other = (QuestionType) obj;
		if (id != other.id)
			return false;
		if (questionType == null) {
			if (other.questionType != null)
				return false;
		} else if (!questionType.equals(other.questionType))
			return false;
		return true;
	}



}
