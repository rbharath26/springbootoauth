package com.bharath.cloud;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class EmpController {
	Map<Integer,Employee> acctMap = new HashMap();
	
	@RequestMapping("/employee")
	private Collection<Employee> getAccountDetails(){
		if(ObjectUtils.isEmpty(acctMap)) {
			acctMap.put(123456, new Employee(123456,"saving","ramu","SBI"));
			acctMap.put(111111, new Employee(111111,"current","somu","ICICI"));
			acctMap.put(222222, new Employee(222222,"saving","damu","Axis"));
		}
		return acctMap.values();
	}

}
