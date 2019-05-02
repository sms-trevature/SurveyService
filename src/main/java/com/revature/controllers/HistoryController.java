package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognito.annotations.CognitoAuth;
import com.revature.cognito.constants.CognitoRoles;
import com.revature.models.History;
import com.revature.services.HistoryService;

/**
 * The Class HistoryController.
 * This class is used to managed the history of every
 * distributed survey.
 */
@RestController
@RequestMapping("history")
public class HistoryController {

	/** The history service instantiation */
	@Autowired
	private HistoryService historyService;

	/**
	 * Find all.
	 * WIll find and return the list of all survey histories
	 * 
	 * @return the list of every survey history within the database
	 */
	@GetMapping("")
	public List<History> findAll() {
		return historyService.findAll();
	}

	/**
	 * Find by id.
	 * Method to find a particular history based on a passed ID argument
	 * 
	 * @param id the id of the survey history to be found
	 * @return the history that corresponds with the passed ID
	 */
	@GetMapping("/{id}")
	public History findById(@PathVariable int id) {
		return historyService.findById(id);
	}
	
	/**
	 * Find by survey id.
	 * Method will find all histories that match a passed
	 * survey id argument and return them.
	 * 
	 * @param surveyId the id of the survey used to find all corresponding histories
	 * @return the list survey histories that match the passed surveyID
	 */
	@GetMapping("/survey/{surveyId}")
	public List<History> findBySurveyId(@PathVariable int surveyId) {
		return historyService.findBySurveyId(surveyId);
	}
	
	/**
	 * Find by email.
	 * Method to find all survey histories based on the email of a user
	 * 
	 * @param email the email of the user used to find the survey histories
	 * @return the list of histories that correspond to the passed user email
	 */
	// Query for email. Uses post mapping so that the @ symbol can be send in the body rather than in the URL
	@PostMapping("/email")
	public List<History> findByEmail(@Valid @RequestBody String email) {
		return historyService.findByEmail(email);
	}
	
	/**
	 * Find completed.
	 * Method used to find all survey in the database that have been completed
	 * 
	 * @return the list of completed surveys
	 */
	@GetMapping("/completed")
	public List<History> findCompleted() {
		return historyService.findCompleted();
	}
	
	/**
	 * Find incomplete.
	 * Method used to find all surveys in the database that have not been completed
	 * 
	 * @return the list of uncompleted surveys
	 */
	@GetMapping("/incomplete")
	public List<History> findIncomplete() {
		return historyService.findIncomplete();
	}

	/**
	 * Save.
	 * Saves a passed history in the database.
	 * 
	 * @param h the history to be saved
	 * @return the newly saved history
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping
	public History save(@Valid @RequestBody History h) {
		History history = historyService.save(h);
		return history;
	}
	
	/**
	 * Update.
	 * Method used to update a survey history.
	 * 
	 * @param h the history to be updated.
	 * @return the history that was passed to be updated
	 */
	@PatchMapping("/taken")
	public History update(@Valid @RequestBody History h) {
		History history = historyService.update(h);
		System.out.println("Success");
		return history;
	}
}