package com.revature.services;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Editor;
import com.revature.repos.EditorRepo;

/**
 * The Class EditorServiceImpl.
 */
@Service
public class EditorServiceImpl implements EditorService {

	/** The e repo. */
	@Autowired
	private EditorRepo eRepo;

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#findAll()
	 */
	@Override
	public List<Editor> findAll() {
		return eRepo.findAll();
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#findById(int)
	 */
	@Override
	@Transactional
    public List<Editor> findById(int id) {
 		return eRepo.findEditorById(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#findByEmail(java.lang.String)
	 */
	@Override
	public List<Editor> findByEmail(String email) {
		return eRepo.findByEmail(email);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#findBySurveyIdSurveyId(int)
	 */
	@Override
	public List<Editor> findBySurveyIdSurveyId(int id) {
		return eRepo.findBySurveyIdSurveyId(id);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#createEditor(com.revature.models.Editor)
	 */
	@Override
	public Editor createEditor(Editor editor) {
		return eRepo.save(editor);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#updateEditor(com.revature.models.Editor)
	 */
	@Override
	@Transactional
	public Editor updateEditor(Editor editor) {
		Editor updatedEditor= new Editor();
		updatedEditor=(Editor) findById(editor.getId());
		updatedEditor.setEmail(editor.getEmail());
		updatedEditor.setSurveyId(editor.getSurveyId());
		return eRepo.save(updatedEditor);
	}

	/* (non-Javadoc)
	 * @see com.revature.services.EditorService#deleteEditor(int)
	 */
	@Override
	public String deleteEditor(int id) {
		eRepo.deleteById(id);
		return "Editor has been successfully deleted";
	}

	
}
