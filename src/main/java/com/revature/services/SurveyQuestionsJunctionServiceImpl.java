package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.SurveyQuestionsJunction;
import com.revature.repos.SurveyQuestionsJunctionRepo;

/**
 * The Class SurveyQuestionsJunctionServiceImpl.
 */
@Service
public class SurveyQuestionsJunctionServiceImpl implements SurveyQuestionsJunctionService {
	
	/** The survey questions junction repo. */
	@Autowired
	private SurveyQuestionsJunctionRepo surveyQuestionsJunctionRepo;


	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#save(com.revature.models.SurveyQuestionsJunction)
	 */
	@Override
	public SurveyQuestionsJunction save(SurveyQuestionsJunction sqj) {
		sqj.setId(0);
		return surveyQuestionsJunctionRepo.save(sqj);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#update(com.revature.models.SurveyQuestionsJunction)
	 */
	@Override
	public SurveyQuestionsJunction update(SurveyQuestionsJunction sqj) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#delete(com.revature.models.SurveyQuestionsJunction)
	 */
	@Override
	public SurveyQuestionsJunction delete(SurveyQuestionsJunction sqj) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#findAll()
	 */
	@Override
	public List<SurveyQuestionsJunction> findAll() {
		return surveyQuestionsJunctionRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#findById(int)
	 */
	@Override
	public SurveyQuestionsJunction findById(int id) {
		return surveyQuestionsJunctionRepo.getOne(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#findBySurveyIdSurveyId(int)
	 */
	@Override
	public List<SurveyQuestionsJunction> findBySurveyIdSurveyId(int surveyId) {
		return surveyQuestionsJunctionRepo.findBySurveyIdSurveyId(surveyId);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#findByQuestionIdQuestionId(int)
	 */
	@Override
	public List<SurveyQuestionsJunction> findByQuestionIdQuestionId(int questionId) {
		return surveyQuestionsJunctionRepo.findByQuestionIdQuestionId(questionId);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyQuestionsJunctionService#saveMultiple(java.util.List)
	 */
	@Override
	public List<SurveyQuestionsJunction> saveMultiple(List<SurveyQuestionsJunction> surveyQuestionsJunctions) {
		surveyQuestionsJunctions.forEach(surveyQuestionsJunction -> {
			save(surveyQuestionsJunction);
		});
		return surveyQuestionsJunctions;
	}

}
