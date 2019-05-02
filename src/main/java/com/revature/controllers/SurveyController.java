package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognito.annotations.CognitoAuth;
import com.revature.cognito.constants.CognitoRoles;
import com.revature.models.Survey;
import com.revature.services.SurveyService;

/**
 * The Class SurveyController.
 */
@RestController
@RequestMapping("surveys")
public class SurveyController {

	/** The survey service instantiation*/
	@Autowired
	private SurveyService surveyService;

	/**
	 * Find all.
	 * Method will find all surveys present within the database
	 * 
	 * @return the list of all existing surveys
	 */
	// All Surveys and Templates
	@GetMapping("")
	public List<Survey> findAll() {
		return surveyService.findAll();
	}

	/**
	 * Find by id.
	 * Method will find a survey based on a passed ID argument
	 * 
	 * @param id the id of the survey to search
	 * @return the survey that corresponds with the passed argument
	 */
	@GetMapping("/{id}")
	public Survey findById(@PathVariable int id) {
		return surveyService.findById(id);
	}

	/**
	 * Find by title.
	 * Will search for a survey based on a passed title String
	 * 
	 * @param title the title to search the database for
	 * @return the list of all surveys that have matching titles
	 */
	@GetMapping("/title/{title}")
	public List<Survey> findByTitle(@PathVariable String title) {
		return surveyService.findByTitle(title);
	}

	/**
	 * Save.
	 * Method will save a passed Survey.
	 *
	 * @param s the survey to be saved
	 * @return the survey that was saved
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping
	public Survey save(@Valid @RequestBody Survey s) {
		Survey survey = surveyService.save(s);
		return survey;
	}
}