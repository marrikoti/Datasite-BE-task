package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.pojo.ProjectIds;
import com.app.pojo.Refrance;
import com.app.pojo.RegistredUsers;
import com.app.pojo.UnRegisteredUsers;

@Service
public class UserService {

	public Refrance getUsers() {
		RegistredUsers[] obj1= getRegisteredUsers();
		UnRegisteredUsers[] obj2=  getUnRegisteredUsers();
		
		Refrance ref= new Refrance();
		ref.setRegestred(obj1);
		ref.setUnregestred(obj2);	
	      return ref;
	}
	
	private  RegistredUsers[] getRegisteredUsers() 
	{
	    final String uri = "https://5c3ce12c29429300143fe570.mockapi.io/api/registeredusers";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<RegistredUsers[]> result = restTemplate.getForEntity(uri, RegistredUsers[].class);
	    RegistredUsers[] obj= result.getBody();
	    ProjectIds[] projData=  getProjrctIds();
	    List<Integer> li= new ArrayList<Integer>();
	    for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < projData.length; j++) {
				if(obj[i].getId()== projData[j].getUserId()) {
					li.add(projData[j].getProjectId());
				}	
			}
			obj[i].setProjectIds(li);
			li= new ArrayList<Integer>();
			 System.out.println(obj[i]);
			 
		}
	   
	    return obj;

	}
	
	private UnRegisteredUsers[] getUnRegisteredUsers()
	{
	    final String uri = "https://5c3ce12c29429300143fe570.mockapi.io/api/unregisteredusers";

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<UnRegisteredUsers[]> result = restTemplate.getForEntity(uri, UnRegisteredUsers[].class);
	    UnRegisteredUsers[] obj= result.getBody();
	    ProjectIds[] projData=  getProjrctIds();
	    List<Integer> li= new ArrayList<Integer>();

	    for (int i = 0; i < obj.length; i++) {
			for (int j = 0; j < projData.length; j++) {
				if(obj[i].getId()== projData[j].getUserId()) {
					li.add(projData[j].getProjectId());
				}	
			}
			obj[i].setProjectIds(li);
			li= new ArrayList<Integer>();
			 System.out.println(obj[i]);
		}
	    return obj;
	}
	
	private static ProjectIds[] getProjrctIds()
	{
	    final String uri = "https://5c3ce12c29429300143fe570.mockapi.io/api/projectmemberships";

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<ProjectIds[]> result = restTemplate.getForEntity(uri, ProjectIds[].class);
	    ProjectIds[] obj= result.getBody();

	    return obj;
	}
	
	
}
