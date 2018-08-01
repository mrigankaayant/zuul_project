package com.candidateservice.app.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.candidateservice.app.model.Candidate;
import com.candidateservice.app.model.User;
import com.candidateservice.app.service.CandidateService;

@RestController
@RequestMapping("/rest/candidate")
public class CandidateServiceResource {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CandidateService candidateService;

	@GetMapping("/{username}")
	public List<Candidate> getStock(@PathVariable("username") final String username){

		ResponseEntity<User> quoteResponse = restTemplate.exchange("http://localhost:8300/rest/user/"+username,HttpMethod.GET,null,
				new ParameterizedTypeReference<User>() {
		});
		User user = quoteResponse.getBody();
		
		System.out.println("####################   "+user.getId()+"    "+user.getUserName()+"    "+user.getPassword());
		
		List<Candidate> cans = candidateService.findcandidateList(user);
		
		return cans;
	}


}
