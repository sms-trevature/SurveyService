package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.revature.models.Responses;

/**
 * The Interface ResponsesRepo.
 * Interface for using Respones Repository
 */
public interface ResponsesRepo  extends JpaRepository<Responses, Integer>{

	/**
	 * Finds a response by survey id.
	 *
	 * @param id the id of the survey to be searched for
	 * @return the list of responses that correspond to passed ID
	 */
	List<Responses> findBySurveyIdSurveyId(int id);
	
	/**
	 * Find responses by user email.
	 *
	 * @param userEmail the user email to search for 
	 * @return the list of responses that match the email
	 */
	List<Responses> findByUserEmail(String userEmail);

}