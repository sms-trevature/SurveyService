package com.revature.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.cognito.annotations.CognitoAuth;
import com.revature.cognito.constants.CognitoRoles;
import com.revature.models.Answers;
import com.revature.services.AnswersService;

/**
 * The Class AnswersController.
 * Handles all URI routes necessary to access functionality for answers
 */
@RestController
@RequestMapping("answers")
public class AnswersController {

	/** The answer service. Makes use of Autowired */
	@Autowired 
	private AnswersService answerService;
	
	
	/**
	 * Find all.
	 * This method will return all answers that exist within the database
	 *
	 * @return the list of every answer
	 */
	@GetMapping
	public List<Answers> findAll(){
		return answerService.findAll();
	}
	
	/**
	 * Find by id.
	 * Will find an answer from the database that matches
	 * a particular ID.
	 *
	 * @param id the id to search for within the database
	 * @return the answer that was found to match the given ID
	 */
	@GetMapping("/{id}")
	public Answers findById(@PathVariable int id) {
		return answerService.findById(id);
	}

	/**
	 * Find by question id.
	 * Will find every answer to a particular question based
	 * on the passed question id
	 *
	 * @param questionId the id of the question whose answers are associated
	 * @return the list of answers that correspond with the passed question ID
	 */
	@GetMapping("/question/{questionId}")
	public List<Answers> findByQuestionId(@PathVariable int questionId) {
		return answerService.findByQuestionId(questionId);
	}
	
	/**
	 * Save.
	 * Saves a passed answer in the Database.
	 *
	 * @param A the answer to be saved
	 * @return the answers which was saved
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping
	public Answers save(@Valid @RequestBody Answers A) {
		return answerService.save(A);
	}
	
	/**
	 * Multiple answers.
	 * Will save multiple answers at once in the database
	 *
	 * @param answers the list of answers to be saved.
	 * @return the list of answers that were saved
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping("/multi-answers")
	public List<Answers> multipleAnswers(@RequestBody List<Answers> answers) {
		return answerService.saveMultiple(answers);
	}
	
	/**
	 * Handle exceptions.
	 * Method used to handle any exceptions that may occur.
	 *
	 * @param e the exception to be handled
	 * @return the response entity to deal with the exception
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleExceptions(Exception e) {
		return new ResponseEntity<String>("An error has occured", HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
