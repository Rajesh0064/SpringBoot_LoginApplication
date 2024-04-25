package com.sathya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {
	@RequestMapping("/")
      public String loginform()
      {
		return "login";
    	  
      }
      @RequestMapping("/req1")
      public String loginapp(@RequestParam String uname ,@RequestParam String psw,ModelMap model) {
    	  String status=null;
    	  model.put("uname", uname);
    	  model.put("psw",psw);
    	  if (uname.equals("rajesh")&& psw.equals("rajesh@123")) {
    		  status="login success";
			
		}else {
			status="login fail";
		}
    	 model.put("status", status);
		return "result";
		
		
	}
}
