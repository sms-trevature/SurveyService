package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.cognito.utils.CognitoUtil;
import com.revature.models.Survey;
import com.revature.repos.SurveyRepo;
import com.revature.services.SurveyService;

/**
 * The Class SurveyServiceImpl.
 */
@Service
public class SurveyServiceImpl implements SurveyService {
	
	/** The survey repo. */
	@Autowired
	private SurveyRepo surveyRepo;
	
	/** The cognito util. */
	@Autowired
	private CognitoUtil cognitoUtil;

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#update(com.revature.models.Survey)
	 */
	@Override
	public Survey update(Survey s) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#delete(com.revature.models.Survey)
	 */
	@Override
	public Survey delete(Survey s) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#findAll()
	 */
	@Override
	public List<Survey> findAll() {
		return surveyRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#findById(int)
	 */
	@Override
	public Survey findById(int id) {
		return surveyRepo.getOne(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#findByTitle(java.lang.String)
	 */
	@Override
	public List<Survey> findByTitle(String title) {
		return surveyRepo.findByTitle(title);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.SurveyService#save(com.revature.models.Survey)
	 */
	@Override
	public Survey save(Survey s) {
		s.setSurveyId(0);
		return surveyRepo.save(s);
	}

}