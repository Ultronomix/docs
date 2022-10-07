package com.revature.daos;

import org.springframework.stereotype.Repository;

import com.revature.models.Avenger;

@Repository
public class AvengerDAO {
	
	public static Avenger[] team = {
			(new Avenger(1, "Captian America", "Very Patriotic", "Steve", "Rogers", 15)),
			(new Avenger(2, "Iron Man", "Snarky", "Tony", "Stark", 55)),
			(new Avenger(3, "Black Widow", "Could kill me and I'd say thanks", "Natasha", "Romanonov", 9000)),
			(new Avenger(4, "Groot", "He is groot", "I am", "Groot", 3)),
			(new Avenger(5, "Thor", "Amazing haircare routine", "Thor", "Odinson", 45))
	};
	
	public Avenger[] getAll() {
		return team;
	}
	
	public Avenger getById(int id) {
		if(id>team.length || id<1) {
			return null;
		}
		return team[id-1];
	}
	
	public Avenger update(Avenger a) {
		if(a.getAveId()>team.length||a.getAveId()<1){
			return null;
		} else {
			team[a.getAveId()-1] = a;
			return getById(a.getAveId());
		}
		
	}
	
	public String fight(Avenger a, String attack, double distance) {
		if(distance<6) {
			throw new ArithmeticException(); //this makes no sense, but I want to demonstrate @AfterThrowing
		}
		return new String (a.getAveName() + " attacks a bad guy with "+ attack + " from "+distance+" feet away.");
	}
	

}
