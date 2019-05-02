package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import com.revature.cognito.annotations.CognitoAuth;
import com.revature.cognito.constants.CognitoRoles;
import com.revature.models.Editor;
import com.revature.services.EditorServiceImpl;

/**
 * The Class EditorController.
 * This class is used to manage any editors.
 */
@RestController
@RequestMapping("editors")//Maps this class to table editors in DB
public class EditorController {
    
	/** The Editor Service instantiation. */
	//Tells Spring to connect bean automatically
	@Autowired
	private EditorServiceImpl eSI;

	/**
	 * Find all.
	 * Will all of the editors within the database
	 *
	 * @return the list of all editors
	 */
	// we find all editors here using repo method findAll()
	@GetMapping
	List<Editor> findAll() {
		return eSI.findAll();
	}

	/**
	 * Find editor by id.
	 * Will find an editor based on the passed editor ID
	 *
	 * @param id the id of the editor to search for
	 * @return the list of editors that match the passed ID
	 */
	// Obtain id from URL and pass it to method find editor by id
	@GetMapping("/{id}")
	public List<Editor> findEditorById(@PathVariable int id) {
		return eSI.findById(id);
	}

	 /**
 	 * Find by email.
 	 * Will find the editors based on a passed email argument
 	 *
 	 * @param email the email address of the editor to search for
 	 * @return the list of editors that match the passed email address
 	 */
 	/* Obtains email from URL and pass it to method to find editor by email. We used
	@PostMapping because correct email cant be passed in using
	GetMapping*/
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping("/email")
	public List<Editor> findByEmail(@Valid @RequestBody String email) {
		return eSI.findByEmail(email);
	}

	/**
	 * Find by survey id survey id.
	 * Method will find an editor based on a passed ID argument
	 *
	 * @param id the id of the survey we are using to find the editor(s)
	 * @return the list of editors that are associated with the passed survey ID
	 */
	@GetMapping("/surveyId/{id}")
	public List<Editor> findBySurveyIdSurveyId(@PathVariable int id) {
		return eSI.findBySurveyIdSurveyId(id);
	}

	/**
	 * Creates the editor.
	 * Method used to create an editor.
	 *
	 * @param editor the editor to be created
	 * @return the editor that was created
	 */
	// Creates editor by calling method createEditor from EditorServiceImpl class
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping
	public Editor createEditor(@RequestBody Editor editor) {
		return eSI.createEditor(editor);
	}

	// Updates editor by calling method updateEditor from the EditorServiceImpl
	/**
	 * Update editor.
	 * Method that updates a passed editor
	 *
	 * @param editor the editor to be updated
	 * @return the editor that was updated
	 */
	// class
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PatchMapping
	public Editor updateEditor(@RequestBody Editor editor) {
		return eSI.updateEditor(editor);
	}

    /**
     * Delete editor.
     * Method will delete an editor based on passed editor argument
     *
     * @param id the id of the editor to be deleted
     * @return the string returned from deletion of the editor
     */
    ////Deletes editor by calling method updateEditor from the EditorServiceImpl class
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@DeleteMapping
	public String deleteEditor(int id) {
		return eSI.deleteEditor(id);
		
	}

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<String> handleExceptions(Exception e) {
//		return new ResponseEntity<String>("An error has occurred", HttpStatus.INTERNAL_SERVER_ERROR);
//	}

}
