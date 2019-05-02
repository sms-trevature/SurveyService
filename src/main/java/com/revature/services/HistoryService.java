package com.revature.services;

import java.util.List;
import com.revature.models.History;

/**
 * The Interface HistoryService.
 */
public interface HistoryService {

	/**
	 * Finds all survey histories.
	 *
	 * @return the list of all histories
	 */
	List<History> findAll();

	/**
	 * Find history by id.
	 *
	 * @param id the id of history to be searched
	 * @return the history that matched ID
	 */
	History findById(int id);
	
	/**
	 * Find histories by survey id.
	 *
	 * @param surveyId the survey id 
	 * @return the list of matching histories
	 */
	List<History> findBySurveyId(int surveyId);

	/**
	 * Find histories by email.
	 *
	 * @param email the email
	 * @return the list of matching histories
	 */
	List<History> findByEmail(String email);
	
	/**
	 * Find completed surveys.
	 *
	 * @return the list of completed survey histories
	 */
	List<History> findCompleted();
	
	/**
	 * Find incomplete surveys.
	 *
	 * @return the list of incomplete histories
	 */
	List<History> findIncomplete();

	/**
	 * Save a history.
	 *
	 * @param h the history to be saved
	 * @return the history that was saved
	 */
	History save(History h);
	
	/**
	 * Update history.
	 *
	 * @param h the history to be updated
	 * @return the history that was updated
	 */
	History update(History h);

}
