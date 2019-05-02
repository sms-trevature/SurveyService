package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.models.Question;

/**
 * The Interface QuestionRepo.
 * Interface for using the Question Repository
 */
public interface QuestionRepo extends JpaRepository<Question, Integer> {

	/**
	 * Finds a a list of questions by type id.
	 *
	 * @param typeId the type id to search for
	 * @return the list of questions that correspond to passed type ID
	 */
	List<Question> findByTypeId(int typeId);

}