package com.revature.services;

import java.util.List;

import com.revature.models.Editor;
import com.revature.models.Editor;

/**
 * The Interface EditorService.
 */
public interface EditorService {

	/**
	 * Finds all editors.
	 *
	 * @return the list of all editors
	 */
	List<Editor> findAll();

	/**
	 * Find editor by id.
	 *
	 * @param id the id of the editor to search
	 * @return the list of editors with matching ID's
	 */
	List<Editor> findById(int id);
	
	//List<Editor> findEditorById(int id);

	/**
	 * Finds an editor by email.
	 *
	 * @param email the email to search for
	 * @return the list of editors that correspond to the email
	 */
	List<Editor> findByEmail(String email);

	/**
	 * Find editor by survey id.
	 *
	 * @param id the survey id to search for
	 * @return the list of editors with matching survey ID's
	 */
	List<Editor> findBySurveyIdSurveyId(int id);

	/**
	 * Creates the editor.
	 *
	 * @param editor the editor to be created
	 * @return the editor that was created.
	 */
	Editor createEditor(Editor editor);

	/**
	 * Update editor.
	 *
	 * @param editor the editor to be updated
	 * @return the editor that was updated
	 */
	Editor updateEditor(Editor editor);
	
	/**
	 * Delete editor.
	 *
	 * @param id the id of editor to be deleted
	 * @return the string value that is returned
	 */
	String deleteEditor(int id);

}
