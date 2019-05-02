package com.revature.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The Class SurveyHistory.
 */
@Entity
@Table(name = "survey_history")
public class SurveyHistory {
	
	/** The id. */
	@Id
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	/** The survey id. */
	@NotNull//needs to be join column and vairble needs to be the survey model
	int survey_id;
	
	/** The useremail. */
	@NotNull
	String useremail;
	
	/** The date assigned. */
	@NotNull
	Date date_assigned;
	
	/** The date completed. */
	@NotNull
	Date date_completed;
}
