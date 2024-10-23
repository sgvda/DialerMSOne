package dialer.spr.ms.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cicdone")
public class ControllerOne {
	
	@GetMapping("/")
	public String welcome() {
		
		return "HI Welcome ot git app to integrate with ci cid and deploy.";
	}

}
