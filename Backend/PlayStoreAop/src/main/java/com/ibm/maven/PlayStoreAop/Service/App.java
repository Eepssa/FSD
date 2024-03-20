package com.ibm.maven.PlayStoreAop.Service;

public class App {
	int id;
	 String name;
boolean visible;
 public App(int id, String name,boolean visible) {
		super();
		this.id = id;
		this.name = name;
		this.visible=visible;
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "App [id=" + id + ", name=" + name + "]";
}
public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	this.visible = visible;
}

public boolean isVisible() {
	return visible;
}


}
