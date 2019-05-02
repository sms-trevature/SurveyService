package com.revature.services;

import java.util.List;
import com.revature.models.QuestionType;

/**
 * The Interface QuestionTypeService.
 */
public interface QuestionTypeService {

	/**
	 * Finds all question types in database.
	 *
	 * @return the list of question types
	 */
	public List<QuestionType> findAll();

	/**
	 * Find question type by id.
	 *
	 * @param id the id to search for
	 * @return the question type
	 */
	public QuestionType findById(int id);

}
