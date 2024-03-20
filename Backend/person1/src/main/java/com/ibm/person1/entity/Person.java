package com.ibm.person1.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="person")
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message="Person Name Can not be blank")  //@NotNull 
	@Column(name="person_name")
	String personName;
	
	@Column(name="pan_id")
	int panId;
	
	@Transient
	String panNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", panId=" + panId + ", panNumber=" + panNumber
				+ "]";
	}

	 
	
	
	

	 
	 
	
	
	
}
