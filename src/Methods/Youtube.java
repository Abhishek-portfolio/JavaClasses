package Methods;

public class Youtube {
	
	
	public void CreateVideo() {
		System.out.println("Creating a New Video");
	}
	
	private boolean UploadVideo() {
		System.out.println("Uploading a video");
		return true;
	}
		
	public String ShareVideo() {
		return "Youtube";
	}
	
	public static void main(String[]args) {
			
		Youtube Yt = new Youtube();
		Yt.UploadVideo();
	}
	
}
