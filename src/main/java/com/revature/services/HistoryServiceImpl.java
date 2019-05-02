package com.revature.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.History;
import com.revature.repos.HistoryRepo;
import com.revature.services.HistoryService;

/**
 * The Class HistoryServiceImpl.
 */
@Service
public class HistoryServiceImpl implements HistoryService {
	
	/** The history repo. */
	@Autowired
	private HistoryRepo historyRepo;

	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findAll()
	 */
	@Override
	public List<History> findAll() {
		// TODO Auto-generated method stub
		return historyRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findById(int)
	 */
	@Override
	public History findById(int id) {
		return historyRepo.getOne(id);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findBySurveyId(int)
	 */
	@Override
	public List<History> findBySurveyId(int surveyId) {
		return historyRepo.findBySurveyId(surveyId);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findByEmail(java.lang.String)
	 */
	@Override
	public List<History> findByEmail(String email) {
		return historyRepo.findByUserEmail(email);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findCompleted()
	 */
	@Override
	public List<History> findCompleted() {
		return historyRepo.findCompleted();
	}
	
	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#findIncomplete()
	 */
	@Override
	public List<History> findIncomplete() {
		return historyRepo.findIncomplete();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#save(com.revature.models.History)
	 */
	@Override
	public History save(History h) {
		h.setHistoryId(0);
		return historyRepo.save(h);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.HistoryService#update(com.revature.models.History)
	 */
	@Override
	public History update(History h) {
		Date completedDate = new Date();
		History historyToUpdate = historyRepo.getOne(h.getHistoryId());
		historyToUpdate.setDateCompleted(completedDate);
//		System.out.println("Current date: " + completedDate);
//		System.out.println("Updated object: " + historyToUpdate);
		return historyRepo.save(historyToUpdate);
	}
}