package com.candidateservice.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candidateservice.app.model.Candidate;
import com.candidateservice.app.model.User;
import com.candidateservice.app.repository.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public List<Candidate> findcandidateList(User user) {
		return candidateRepository.findcandidateList(user);
	}
}
