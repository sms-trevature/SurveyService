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
import com.revature.models.Question;
import com.revature.services.QuestionService;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionController.
 * The class used to deal with any question related operations
 */
@RestController
@RequestMapping("questions")
public class QuestionController {

	/** The question service instantiation */
	@Autowired
	private QuestionService questionService;

	/**
	 * Find all.
	 * Method will find all questions currently saved within the database.
	 * 
	 * @return the list of all questions.
	 */
	@GetMapping("")
	public List<Question> findAll() {
		return questionService.findAll();
	}

	/**
	 * Find by id.
	 * Method that will find a question used a passed argument id
	 *
	 * @param id the id of the question to find
	 * @return the question that matched the passed id
	 */
	@GetMapping("/{id}")
	public Question findById(@PathVariable int id) {
		return questionService.findById(id);
	}
	
	/**
	 * Find by type.
	 * Method will find all questions that match the id of one
	 * of the created question types.
	 *
	 * @param typeId the type id of the question to search for
	 * @return the list of questions that match the type of id that was passed
	 */
	@GetMapping("/type/{typeId}")
	public List<Question> findByType(@PathVariable int typeId) {
		return questionService.findByType(typeId);
	}
	
	/**
	 * Multiple questions.
	 * Method will save multiple Questions at once.
	 * 
	 * @param questions the questions to be saved
	 * @return the list of saved questions
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping("/multi-question")
	public List<Question> multipleQuestions(@RequestBody List<Question> questions) {
		return questionService.saveMultiple(questions);
	}

	/**
	 * Save.
	 * Method will save a singular Question
	 * 
	 * @param q the question to be saved
	 * @return the question that was saved
	 */
	@CognitoAuth(roles= {CognitoRoles.STAGING_MANAGER, CognitoRoles.TRAINER})
	@PostMapping
	public Question save(@Valid @RequestBody Question q) {
		Question question = questionService.save(q);
		return question;
	}
}