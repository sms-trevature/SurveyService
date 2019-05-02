package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.QuestionType;
import com.revature.repos.QuestionTypeRepo;

/**
 * The Class QuestionTypeServiceImpl.
 */
@Service
public class QuestionTypeServiceImpl implements QuestionTypeService {
	
	/** The question type repo. */
	@Autowired
	private QuestionTypeRepo questionTypeRepo;
	
	/* (non-Javadoc)
	 * @see com.revature.services.QuestionTypeService#findAll()
	 */
	@Override
	public List<QuestionType> findAll() {
		// TODO Auto-generated method stub
		return questionTypeRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.QuestionTypeService#findById(int)
	 */
	@Override
	public QuestionType findById(int id) {
		// TODO Auto-generated method stub
		return questionTypeRepo.getOne(id);
	}

}
