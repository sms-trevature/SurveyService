package com.revature.services;

import java.util.List;

import com.revature.models.SurveyQuestionsJunction;

/**
 * The Interface SurveyQuestionsJunctionService.
 */
public interface SurveyQuestionsJunctionService {
	
	/**
	 * Save SQ junction.
	 *
	 * @param sqj the SurveyQuestion junction to be saved
	 * @return the survey questions junction that was saved
	 */
	SurveyQuestionsJunction save(SurveyQuestionsJunction sqj);
	
	/**
	 * Save multiple SQ junctions.
	 *
	 * @param surveyQuestionsJunctions the survey questions junctions
	 * @return the list of saved junctions
	 */
	List<SurveyQuestionsJunction> saveMultiple(List<SurveyQuestionsJunction> surveyQuestionsJunctions);
	
	/**
	 * Update a Survey Question Junction.
	 *
	 * @param sqj the SQJ to be updated
	 * @return the survey questions junction that were saved
	 */
	SurveyQuestionsJunction update(SurveyQuestionsJunction sqj);
	
	/**
	 * Delete a survey question junction.
	 *
	 * @param sqj the sqj to be deleted
	 * @return the survey questions junction that was deleted
	 */
	SurveyQuestionsJunction delete(SurveyQuestionsJunction sqj);
	
	/**
	 * Find all survey question junctions.
	 *
	 * @return the list of all SQJ's
	 */
	List<SurveyQuestionsJunction> findAll();
	
	/**
	 * Find Survey Question Junction by id.
	 *
	 * @param id the id to be searched for
	 * @return the survey questions junction
	 */
	SurveyQuestionsJunction findById(int id);
	
	/**
	 * Find Survey Question Junction by survey id.
	 *
	 * @param surveyId the survey id to search for
	 * @return the list of matching SQJ's
	 */
	List<SurveyQuestionsJunction> findBySurveyIdSurveyId(int surveyId);
	
	/**
	 * Find Survey Question Junction by question id.
	 *
	 * @param questionId the question id to search for
	 * @return the list of SQJ's that match question ID
	 */
	List<SurveyQuestionsJunction> findByQuestionIdQuestionId(int questionId);
}