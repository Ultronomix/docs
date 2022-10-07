package com.revature.models;

import org.springframework.stereotype.Component;

@Component
public class Avenger {

	private int aveId;
	private String aveName;
	private String power;
	private String firstName;
	private String lastName;
	private int powerLevel;
	
	
	//boilerplate code------------------------------------------------
	
	public Avenger() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Avenger(int aveId, String aveName, String power, String firstName, String lastName, int powerLevel) {
		super();
		this.aveId = aveId;
		this.aveName = aveName;
		this.power = power;
		this.firstName = firstName;
		this.lastName = lastName;
		this.powerLevel = powerLevel;
	}


	@Override
	public String toString() {
		return "Avenger [aveId=" + aveId + ", aveName=" + aveName + ", power=" + power + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", powerLevel=" + powerLevel + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aveId;
		result = prime * result + ((aveName == null) ? 0 : aveName.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((power == null) ? 0 : power.hashCode());
		result = prime * result + powerLevel;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avenger other = (Avenger) obj;
		if (aveId != other.aveId)
			return false;
		if (aveName == null) {
			if (other.aveName != null)
				return false;
		} else if (!aveName.equals(other.aveName))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (power == null) {
			if (other.power != null)
				return false;
		} else if (!power.equals(other.power))
			return false;
		if (powerLevel != other.powerLevel)
			return false;
		return true;
	}


	public int getAveId() {
		return aveId;
	}


	public void setAveId(int aveId) {
		this.aveId = aveId;
	}


	public String getAveName() {
		return aveName;
	}


	public void setAveName(String aveName) {
		this.aveName = aveName;
	}


	public String getPower() {
		return power;
	}


	public void setPower(String power) {
		this.power = power;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getPowerLevel() {
		return powerLevel;
	}


	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}

}
