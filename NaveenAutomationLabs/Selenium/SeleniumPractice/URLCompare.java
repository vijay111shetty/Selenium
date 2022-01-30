package SeleniumPractice;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {//to get the IP adress of any website just google it get IP adress
			System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.19.155.83")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
