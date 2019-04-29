package iframex.api.admin;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class AdminService {
			
	private List<DonorRequest> drobj=Arrays.asList(
				new DonorRequest(1,"jeni",3,"self"),
				new DonorRequest(2,"moomi",2,"drop-off"),
				new DonorRequest(3,"Sonia",3,"prepaid"));
		
	public List<DonorRequest> getAllDonorRequests(){
		return drobj;
		
	public DonorRequest getDonorRequest(int reqid) {
		
	}
	}
}
