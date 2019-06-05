package webapp.com.sood.vaibhav;

public class UserValidationService {
public boolean isUserValid(String username, String password) {
	
	if (username.equals("Vaibhav")&&password.equals("Password"))
		return true;
	else
		return false;
	
}
}
