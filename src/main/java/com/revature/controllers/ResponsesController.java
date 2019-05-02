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

import com.revature.models.Responses;
import com.revature.services.ResponsesService;

// TODO: Auto-generated Javadoc
/**
 * The Class ResponsesController.
 * The class used to deal with all operations pertaining
 * to question responses
 */
@RestController
@RequestMapping("responses")
public class ResponsesController {
	
	/** The response service instantiation */
	@Autowired
	private ResponsesService responseService;
	
	/**
	 * Find all.
	 * Method finds all responses currently within the database.
	 * 
	 * @return the list of all existing responses
	 */
	@GetMapping("")
	public List<Responses> findAll() {
		return responseService.findAll();
	}
	
	/**
	 * Find by id.
	 * Method will find a response based on a passed argument ID
	 * 
	 * @param id the id of the response to be searched for
	 * @return the response that corresponds to the passed ID
	 */
	@GetMapping("/{id}")
	public Responses findById(@PathVariable int id) {
		return responseService.findById(id);
	}
	
	/**
	 * Find by survey id.
	 * Method will find all responses that match a passed survey ID argument
	 * 
	 * @param id the id of the survey to check for corresponding responses
	 * @return the list of responses that correspond to the survey ID
	 */
	@GetMapping("/surveyId/{id}")
	public List<Responses> findBySurveyId(@PathVariable int id) {
		return responseService.findBySurveyIdSurveyId(id);
	}
	
	/**
	 * Find by email.
	 * Method will find all responses that match a passed user email.
	 * 
	 * @param email the email of the user to search the database for
	 * @return the list of responses that correspond to the passed user email
	 */
	// Query for email. Uses post mapping so that the @ symbol can be send in the body rather than in the URL
    @PostMapping("/email")
    public List<Responses> findByEmail(@Valid @RequestBody String email) {
        return responseService.findByUserEmail(email);
    }

	/**
	 * Multiple questions.
	 * Method used to save multiple responses at once
	 *
	 * @param responses the responses to be saved within the database
	 * @return the list of saved responses
	 */
	@PostMapping("/multi-response")
	public List<Responses> multipleQuestions(@RequestBody List<Responses> responses) {
		return responseService.saveMultiple(responses);
	}

	/**
	 * Save.
	 * Method will save a single response.
	 * 
	 * @param r the response to be saved
	 * @return the id of the saved response
	 */
	@PostMapping
	public int save(@Valid @RequestBody Responses r) {
		Responses responses = responseService.save(r);
		return responses.getId();
	}
}
