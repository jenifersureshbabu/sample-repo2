package iframex.api.donor;

public class DonorRequest {

	int reqId;
	String user_name;
	int no_of_frames;
	String mode;
	public DonorRequest() {
	}
	
	public DonorRequest(int reqId, String user_name, int no_of_frames, String mode) {
		//super();
		this.reqId = reqId;
		this.user_name = user_name;
		this.no_of_frames = no_of_frames;
		this.mode = mode;
	}

	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public int getNo_of_frames() {
		return no_of_frames;
	}
	public void setNo_of_frames(int no_of_frames) {
		this.no_of_frames = no_of_frames;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

}
