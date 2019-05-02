package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.Survey;
import java.util.List;

/**
 * The Interface SurveyRepo.
 * Interface to make use of Survey Repository
 */
public interface SurveyRepo extends JpaRepository<Survey, Integer> {

	/**
	 * Find Survey by title.
	 *
	 * @param title the title to search database for
	 * @return the list of surveys that match the title
	 */
	List<Survey> findByTitle(String title);

}