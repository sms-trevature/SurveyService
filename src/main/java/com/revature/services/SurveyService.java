package com.revature.services;

import java.util.List;
import com.revature.models.Survey;

/**
 * The Interface SurveyService.
 */
public interface SurveyService {
	
	/**
	 * Save a Survey.
	 *
	 * @param s the survey to be saved
	 * @return the saved survey
	 */
	Survey save(Survey s);
	
	/**
	 * Update a survey.
	 *
	 * @param s the survey to be updated
	 * @return the updated survey
	 */
	Survey update(Survey s);
	
	/**
	 * Delete a survey.
	 *
	 * @param s the survey to be deleted
	 * @return the deleted survey
	 */
	Survey delete(Survey s);
	
	/**
	 * Find all surveys.
	 *
	 * @return the list of all surveys
	 */
	List<Survey> findAll();
	
	/**
	 * Find a survey by id.
	 *
	 * @param id the id to search for
	 * @return the matching survey
	 */
	Survey findById(int id);
	
	/**
	 * Finds survey by title.
	 *
	 * @param title the title to search for
	 * @return the list of surveys that match the title
	 */
	List<Survey> findByTitle(String title);
}
