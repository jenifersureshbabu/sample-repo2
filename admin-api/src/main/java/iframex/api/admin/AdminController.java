package iframex.api.admin;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	
	/*public String welcomeMessage() {
		return "Hi Admin !Welcome to iFramex donation portal";
	}*/
	
	@Autowired
	private AdminService adminservice;
	
	@RequestMapping("/admin")
	public List<DonorRequest> getAllDonorRequests(){
		return adminservice.getAllDonorRequests();
	}
	@RequestMapping("/admin/{id}")
	public DonorRequest getDonorRequest(@PathVariable int reqId) {
		return ;
	}
	}
}
