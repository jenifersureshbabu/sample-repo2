package iframex.api.admin;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iframex.api.donor.DonorRequest;

@RestController
public class AdminController {
	
	@RequestMapping("/admin")
	public String welcomeMessage() {
		return "Hi Admin !Welcome to iFramex donation portal";
	}
	
	/*public List<DonorRequest> getAllDonorRequets(){
		return Arrays.asList(
				new DonorRequest(1,"jeni",3,"self"),
				new DonorRequest(2,"moomi",2,"drop-off")
				);
	}*/
}
