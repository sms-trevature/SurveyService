package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.SurveyQuestionsJunction;

/**
 * The Interface SurveyQuestionsJunctionRepo.
 * Interface to make use of SurveyQuestionsJunctions repository
 */
public interface SurveyQuestionsJunctionRepo extends JpaRepository <SurveyQuestionsJunction, Integer>{

	/**
	 * Find junctions by survey id.
	 *
	 * @param surveyId the survey id to search for
	 * @return the list of junctions that match surveyId
	 */
	List<SurveyQuestionsJunction> findBySurveyIdSurveyId(int surveyId);
	
	/**
	 * Find junctions by a passed question id.
	 *
	 * @param questionId the question id to search for
	 * @return the list of junctions that matched the question ID
	 */
	List<SurveyQuestionsJunction> findByQuestionIdQuestionId(int questionId);

}