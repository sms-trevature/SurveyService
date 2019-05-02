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

import com.revature.models.SurveyQuestionsJunction;
import com.revature.services.SurveyQuestionsJunctionService;

/**
 * The Class SurveyQuestionsJunctionController.
 * The class for dealing siwth survey and question junction operations.
 */
@RestController
@RequestMapping("junction_survey_questions")
public class SurveyQuestionsJunctionController {
	
	/** The survey questions junction service instantiation */
	@Autowired
	private SurveyQuestionsJunctionService surveyQuestionsJunctionService;
	
	/**
	 * Find all.
	 * Will find all existing juncitons in database
	 * 
	 * @return the list of all junctions
	 */
	@GetMapping
	public List<SurveyQuestionsJunction> findAll() {
		return surveyQuestionsJunctionService.findAll();
	}

	/**
	 * Find by id.
	 * Method will find the junciton that matches a passed ID argument
	 * 
	 * @param id the id junction to find
	 * @return the survey questions junction that matched the ID
	 */
	@GetMapping("/{id}")
	public SurveyQuestionsJunction findById(@PathVariable int id) {
		return surveyQuestionsJunctionService.findById(id);
	}

	/**
	 * Find by survey id survey id.
	 * Method will find junctions based on passed Survey ID
	 *
	 * @param id the id of the survey to be searched for
	 * @return the list of junctions that matche the passed survey ID
	 */
	@GetMapping("/surveyId/{id}")
	public List<SurveyQuestionsJunction> findBySurveyIdSurveyId(@PathVariable int id) {
		return surveyQuestionsJunctionService.findBySurveyIdSurveyId(id);
	}
	
	/**
	 * Find by question id question id.
	 * Method to find all junctions associated with a passed question ID
	 * 
	 * @param id the id of the question to be searched for
	 * @return the list of all junctions that match the quesiton ID
	 */
	@GetMapping("/questionId/{id}")
	public List<SurveyQuestionsJunction> findByQuestionIdQuestionId(@PathVariable int id) {
		return surveyQuestionsJunctionService.findByQuestionIdQuestionId(id);
	}

	/**
	 * Multiple questions.
	 * Saves multiple junctions at once.
	 * 
	 * @param surveyQuestionsJunctions the survey questions junctions to be saved in database
	 * @return the list of saved junctions
	 */
	@PostMapping("/multi-question")
	public List<SurveyQuestionsJunction> multipleQuestions(@RequestBody List<SurveyQuestionsJunction> surveyQuestionsJunctions) {
		return surveyQuestionsJunctionService.saveMultiple(surveyQuestionsJunctions);
	}

	/**
	 * Save.
	 * Method will save a single junction in database.
	 * 
	 * @param sqj the junction to be saved
	 * @return the int Id of the saved junction
	 */
	@PostMapping
	public int save(@Valid @RequestBody SurveyQuestionsJunction sqj) {
		SurveyQuestionsJunction surveyQuestionsJunction = surveyQuestionsJunctionService.save(sqj);
		return surveyQuestionsJunction.getId();
	}
	
}
