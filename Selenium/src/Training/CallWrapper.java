package Training;

import java.io.IOException;

public class CallWrapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WrapperMethod wm= new WrapperMethod();
		wm.launchapp("https://www.linkedin.com/talent/post-a-job?trk=homepage-basic_talent-finder-cta");
		wm.enterbyid("first-name-ember18", "MATHUMITHA");
		wm.enterbyid("last-name-ember18", "Bady");
		wm.enterbyid("email-address-ember18", "mmmbady@gmail.com");
		wm.enterbyid("password-ember18", "12345676");
		wm.screenshot("C:\\\\Users\\\\BLTuser.BLT1204\\\\eclipse-workspace\\\\Selenium\\\\Screenshot\\linkedin.png");


	}

}
