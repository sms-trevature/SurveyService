package com.revature.services;


import java.util.List;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Answers;
import com.revature.repos.AnswersRepo;


/**
 * The Class AnswersServiceImpl.
 */
@Service
public class AnswersServiceImpl implements AnswersService{

	
	/** The answers repo. */
	@Autowired
	
	private AnswersRepo answersRepo;

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#save(com.revature.models.Answers)
	 */
	@Override
	public Answers save(Answers A) {
		A.setId(0);
		return answersRepo.save(A);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#update(com.revature.models.Answers)
	 */
	@Override
	public Answers update(Answers A) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#delete(com.revature.models.Answers)
	 */
	@Override
	public Answers delete(Answers A) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#findAll()
	 */
	@Override
	public List<Answers> findAll() {
		return answersRepo.findAll();
		
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#findById(int)
	 */
	@Override
	public Answers findById(int id) {
		return answersRepo.getOne(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#findByQuestionId(int)
	 */
	@Override
	public List<Answers> findByQuestionId(int questionId) {
		return answersRepo.findByQuestionId(questionId);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.AnswersService#saveMultiple(java.util.List)
	 */
	@Override
	public List<Answers> saveMultiple(List<Answers> answers  ) {
		answers.forEach(answer -> {
			save(answer);
		});
		return answers;
	}
	
	
	
	
	
	
}
