package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Editor;

/**
 * The Interface EditorRepo.
 * Interface for using Editor repository
 */
public interface EditorRepo extends JpaRepository<Editor, Integer> {
	
	
    /**
     * Finds an editor by the passed id.
     *
     * @param id the id of the editor to find
     * @return the list of editors that match the ID
     */
    List<Editor> findEditorById(int id);
	
	/**
	 * Find and editor by survey id
	 *
	 * @param id the id of the survey to search for
	 * @return the list of editors that correspond to the survey ID
	 */
	List<Editor> findBySurveyIdSurveyId(int id);
	
	/**
	 * Finds an editor by email.
	 *
	 * @param email the email of the editor to find
	 * @return the list of editors that match the email
	 */
	List<Editor> findByEmail(String email);
	
	

}
