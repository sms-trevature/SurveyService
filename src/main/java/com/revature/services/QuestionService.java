package com.revature.services;

import java.util.List;

import com.revature.models.Question;

/**
 * The Interface QuestionService.
 */
public interface QuestionService {
	
	/**
	 * Find all Questions.
	 *
	 * @return the list of all questions
	 */
	List<Question> findAll();
	
	/**
	 * Find question by id.
	 *
	 * @param id the id
	 * @return the question that matches id
	 */
	Question findById(int id);
	
	/**
	 * Find by question type.
	 *
	 * @param typeId the type id
	 * @return the list of matching questions
	 */
	List<Question> findByType(int typeId);

	/**
	 * Saves a question in database.
	 *
	 * @param q the question to be saved
	 * @return the question
	 */
	Question save(Question q);
	
	/**
	 * Save multiple questions at once.
	 *
	 * @param questions the questions to be saved
	 * @return the list of saved questions
	 */
	List<Question> saveMultiple(List<Question> questions);

}
