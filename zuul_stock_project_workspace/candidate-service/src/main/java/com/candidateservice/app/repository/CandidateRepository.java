package com.candidateservice.app.repository;

import java.util.List;

import com.candidateservice.app.model.Candidate;
import com.candidateservice.app.model.User;

public interface CandidateRepository {

	public List<Candidate> findcandidateList(User users);

}