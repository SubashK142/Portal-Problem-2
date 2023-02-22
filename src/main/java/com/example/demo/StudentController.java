
package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class StudentController{
	@GetMapping("/")
	public String homepage() {
      	return "Welcome to student list";

	}

	@GetMapping("/List")
	
	public List<StudentResponse> getList() {
				List<StudentResponse> detailsList=new ArrayList<>();
				detailsList.add(new StudentResponse(1,12,"SPARROW"));
				detailsList.add(new StudentResponse(2,13,"THUNDER"));
				detailsList.add(new StudentResponse(3,14,"VANDU"));
				
				return detailsList;
			
		}
}