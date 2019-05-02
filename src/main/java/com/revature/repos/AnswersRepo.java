package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.Answers;

/**
 * The Interface AnswersRepo.
 * Interface for the answers repository
 */
@Repository
public interface AnswersRepo  extends JpaRepository <Answers, Integer>{

	/**
	 * Find by question id.
	 *
	 * @param questionId the question id to search for
	 * @return the list of questions that match the ID
	 */
	List<Answers> findByQuestionId(int questionId);
	
	
}
