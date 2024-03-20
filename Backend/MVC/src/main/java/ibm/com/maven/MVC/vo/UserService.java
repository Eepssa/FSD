package ibm.com.maven.MVC.vo;

import org.springframework.stereotype.Component;

@Component
public class UserService {
String fName;
String lName;
	String gender;
	String vehicle;
public String getFName() {
	return fName;
}
public void setFName(String fName) {
	this.fName = fName;
}
public String getLName() {
	return lName;
}
public void setLName(String lName) {
	this.lName = lName;
}
public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
public String getVehicle() {
	return vehicle;
}
public void setVehicle(String vehicle) {
	this.vehicle = vehicle;
}

}
