package com.revature.services;

import com.revature.models.Responses;
import java.util.List;

/**
 * The Interface ResponsesService.
 */
public interface ResponsesService {
	
	/**
	 * Finds all responses.
	 *
	 * @return the list of all responses
	 */
	List<Responses> findAll();
	
	/**
	 * Find response by id.
	 *
	 * @param id the id
	 * @return the responses
	 */
	Responses findById(int id);
	
	/**
	 * Find responses by survey id.
	 *
	 * @param id the id
	 * @return the list of responses
	 */
	List<Responses> findBySurveyIdSurveyId(int id);
	
	/**
	 * Find responses by user email.
	 *
	 * @param userEmail the user email
	 * @return the list of responses
	 */
	List<Responses> findByUserEmail(String userEmail);
	
	/**
	 * Save a response.
	 *
	 * @param r the response to be saved
	 * @return the response that is saved
	 */
	Responses save(Responses r);
	
	/**
	 * Update a response.
	 *
	 * @param r the response to be updated
	 * @return the responses that were updated
	 */
	Responses update(Responses r);
	
	/**
	 * Delete a response.
	 *
	 * @param r the response to be deleted
	 * @return the response that is deleted
	 */
	Responses delete(Responses r);
	
	/**
	 * Save multiple responses.
	 *
	 * @param responses the responses to be saved
	 * @return the list of saved responses
	 */
	List<Responses> saveMultiple(List<Responses> responses);
	
}
