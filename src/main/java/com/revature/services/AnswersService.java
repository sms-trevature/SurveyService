package com.revature.services;


import java.util.List;
import com.revature.models.Answers;

/**
 * The Interface AnswersService.
 */
public interface AnswersService {

	/**
	 * Save.
	 * Method saves an answer.
	 *
	 * @param A the answer to be saved
	 * @return the newly saved answer
	 */
	Answers save(Answers A);
	
	/**
	 * Update.
	 * Method updates an answer
	 * 
	 * @param A the answer to be updated
	 * @return the answer that was updated
	 */
	Answers update(Answers A);
    
    /**
     * Delete.
     * Method that deletes an answer
     * 
     * @param A the answer to be deleted
     * @return the answer that was deleted
     */
    Answers delete(Answers A);
    
    /**
     * Find all.
     * Method finds all answers
     *
     * @return the list of answers
     */
    List<Answers> findAll();
    
    /**
     * Find by id.
     * Method finds an answer by ID
     *
     * @param id the id of the answer to search for
     * @return the answer that matches the ID
     */
    Answers findById(int id);
    
    /**
     * Find by question id.
     * Method to find an answer based on a passed question ID
     *
     * @param questionId the question id to search for
     * @return the list of answers that correspond to the question ID
     */
    List<Answers> findByQuestionId(int questionId);
    
    /**
     * Save multiple.
     * Method saves multiple answers at once
     *
     * @param answers the answers to be saved
     * @return the list of saved answers
     */
    List<Answers> saveMultiple(List<Answers> answers);

}
