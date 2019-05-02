package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
 * The Class Answers.
 */
@Entity
@Table(name= "answers")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
//@JsonFilter("depth_3")
public class Answers {

	/** The id. */
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/** The answer. */
	@NotNull
	private String answer;
	
	
	/** The question id. */
	private int questionId;
	
	/**
	 * Instantiates a new answers.
	 */
	public Answers() {
		
		super();
	}
	
	/**
	 * Instantiates a new answer.
	 *
	 * @param id the id
	 * @param answer the answer text
	 * @param questionId the question id
	 */
	public Answers(int id, String answer, int questionId) {
		this.id=id;
		this.answer=answer;
		this.questionId=questionId;
		
	}

	/**
	 * Gets the id of the answer.
	 *
	 * @return the id of the answer
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id of the answer
	 *
	 * @param id the new id of the answer
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the answer.
	 *
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * Sets the answer.
	 *
	 * @param answer the new answer
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * Gets the question id.
	 *
	 * @return the question id
	 */
	public int getquestionId() {
		return questionId;
	}

	/**
	 * Sets the question id.
	 *
	 * @param questionId the new question id
	 */
	public void setquestionId(int questionId) {
		this.questionId = questionId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + id;
		result = prime * result + questionId;
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
		Answers other = (Answers) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (id != other.id)
			return false;
		if (questionId != other.questionId)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Answers [id=" + id + ", answer=" + answer + ", questionId=" + questionId + "]";
	}
	
	
	
	
}
