package com.candidateservice.app.repository;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.candidateservice.app.model.Candidate;
import com.candidateservice.app.model.User;

@Repository
public class CandidateRepositoryImpl implements CandidateRepository{

	@PersistenceContext
	private EntityManager em;

	public List<Candidate> findcandidateList(User user){

		/*Criteria crit = em.unwrap(Session.class).createCriteria(Candidate.class);
		crit.add(Restrictions.in("userId",ids));
		List<Candidate> list = crit.list();*/
		
		System.out.println("=======================>>>>     "+user.getId()+"      "+user.getUserName()+"      "+user.getPassword());
		
		Candidate c1 = new Candidate();
		c1.setId(1);
		
		Candidate c2 = new Candidate();
		c2.setId(2);
		
		List<Candidate> list = new ArrayList<Candidate>();
		list.add(c1);
		list.add(c2);
		
		return list;
	}
}
