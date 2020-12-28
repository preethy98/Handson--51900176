package componentprogram;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Owner {
private String name, password, mobileNumber;
public Owner() {
	// TODO Auto-generated constructor stub
}

public Owner(String name, String password, String mobileNumber) {
	super();
	this.name = name;
	this.password = password;
	this.mobileNumber = mobileNumber;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

}
