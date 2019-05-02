package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.QuestionType;
import com.revature.services.QuestionTypeService;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionTypeController.
 * The controller used to manage and question type operations
 */
@RestController
@RequestMapping(value = "questiontype")
public class QuestionTypeController {

	/** The question type service instantiation*/
	@Autowired
	private QuestionTypeService questionTypeService;
	
	/**
	 * Find all.
	 * Will find all question types present within the database
	 *
	 * @return the list of all question types
	 */
	@GetMapping
	public List<QuestionType> findAll() {
		return questionTypeService.findAll();
	}
	
	/**
	 * Find by id.
	 * Method will find a question type of a passed argument ID
	 * 
	 * @param id the id of the question type to search for
	 * @return the question type that matched the passed ID
	 */
	@GetMapping("/{id}")
	public QuestionType findById(@PathVariable int id) {
		return questionTypeService.findById(id);
	}
}
