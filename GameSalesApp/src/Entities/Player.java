package Entities;

import java.util.Date;

import Abstract.Entity;

public class Player implements Entity{
	private int id;
	private String name;
	private String lastName;
    private Date  dateOfBirdhDay;
	private String nationaltyId;
	
	public Player(int id, String name, String lastName, Date dateOfBirdhDay, String nationaltyId) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirdhDay = dateOfBirdhDay;
		this.nationaltyId = nationaltyId;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirdhDay() {
		return dateOfBirdhDay;
	}

	public void setDateOfBirdhDay(Date dateOfBirdhDay) {
		this.dateOfBirdhDay = dateOfBirdhDay;
	}

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}
	
	
	
	
	

}
