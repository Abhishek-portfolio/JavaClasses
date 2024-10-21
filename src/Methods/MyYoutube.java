package Methods;

public class MyYoutube {

	public static void main(String[] args) {
		Youtube Yt = new Youtube();
		
		Yt.CreateVideo();
		
		String Shared = Yt.ShareVideo();
		System.out.println(Shared);
	}

}
