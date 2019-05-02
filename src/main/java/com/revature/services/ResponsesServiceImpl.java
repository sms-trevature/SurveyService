package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Responses;
import com.revature.models.Survey;
import com.revature.repos.ResponsesRepo;

/**
 * The Class ResponsesServiceImpl.
 */
@Service
public class ResponsesServiceImpl implements ResponsesService {
	
	/** The response repo. */
	@Autowired
	private ResponsesRepo responseRepo;

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#findAll()
	 */
	@Override
	public List<Responses> findAll() {
		return responseRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#findById(int)
	 */
	@Override
	public Responses findById(int id) {
		return responseRepo.getOne(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#findBySurveyIdSurveyId(int)
	 */
	@Override
	public List<Responses> findBySurveyIdSurveyId(int id) {
		return responseRepo.findBySurveyIdSurveyId(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#findByUserEmail(java.lang.String)
	 */
	@Override
	public List<Responses> findByUserEmail(String userEmail) {
		return responseRepo.findByUserEmail(userEmail);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#save(com.revature.models.Responses)
	 */
	@Override
	public Responses save(Responses r) {
		r.setId(0);
		return responseRepo.save(r);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#update(com.revature.models.Responses)
	 */
	@Override
	public Responses update(Responses r) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#delete(com.revature.models.Responses)
	 */
	@Override
	public Responses delete(Responses r) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.ResponsesService#saveMultiple(java.util.List)
	 */
	@Override
	public List<Responses> saveMultiple(List<Responses> responses) {
		responses.forEach(response -> {
			save(response);
		});
		return responses;
	}

}
