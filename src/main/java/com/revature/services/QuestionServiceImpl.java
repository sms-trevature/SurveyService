package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Question;
import com.revature.repos.QuestionRepo;
import com.revature.services.QuestionService;

/**
 * The Class QuestionServiceImpl.
 */
@Service
public class QuestionServiceImpl implements QuestionService {
	
	/** The question repo. */
	@Autowired
	private QuestionRepo questionRepo;

	/* (non-Javadoc)
	 * @see com.revature.services.QuestionService#findAll()
	 */
	@Override
	public List<Question> findAll() {
		return questionRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.QuestionService#findById(int)
	 */
	@Override
	public Question findById(int id) {
		return questionRepo.getOne(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.QuestionService#findByType(int)
	 */
	@Override
	public List<Question> findByType(int typeId) {
		return questionRepo.findByTypeId(typeId);
	}
	
	/* (non-Javadoc)
	 * @see com.revature.services.QuestionService#save(com.revature.models.Question)
	 */
	@Override
	public Question save(Question q) {
		q.setQuestionId(0);
		return questionRepo.save(q);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.QuestionService#saveMultiple(java.util.List)
	 */
	@Override
	public List<Question> saveMultiple(List<Question> questions) {
		questions.forEach(question -> {
			save(question);
		});
		return questions;
	}
}