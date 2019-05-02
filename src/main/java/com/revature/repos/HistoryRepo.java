package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.History;
import java.util.List;

/**
 * The Interface HistoryRepo.
 * Interface used for making use of survey history repository
 */
public interface HistoryRepo extends JpaRepository<History, Integer> {
	
	/**
	 * Finds Histories by survey id.
	 *
	 * @param surveyId the survey id used to find corresponding histories
	 * @return the list of histories that matched the ID
	 */
	List<History> findBySurveyId(int surveyId);

	/**
	 * Find histories by user email.
	 *
	 * @param email the email address of the user to find the histories
	 * @return the list of histories that match user email
	 */
	List<History> findByUserEmail(String email);

	/**
	 * Finds completed survey histories
	 *
	 * @return the list of completed surveys
	 */
	@Query(value = "SELECT * FROM survey.survey_history WHERE date_completed IS NOT NULL", nativeQuery = true)
	List<History> findCompleted();

	/**
	 * Find list of incomplete surveys
	 *
	 * @return the list of incomplete surveys
	 */
	@Query(value = "SELECT * FROM survey.survey_history WHERE date_completed IS NULL", nativeQuery = true)
	List<History> findIncomplete();

}