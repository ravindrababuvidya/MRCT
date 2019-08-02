package com.mrct;

import java.util.ArrayList;
import java.util.List;

public class AlientRepository {
	List<Alien> aliensList = new ArrayList<>();
	public AlientRepository() {
		Alien alien = new Alien();
		alien.setId(1);
		alien.setName("Asik");
		Alien alien1 = new Alien();
		alien1.setId(2);
		alien1.setName("Suresh");
		Alien alien2 = new Alien();
		alien2.setId(3);
		alien2.setName("Anil Kumar");
		Alien alien3 = new Alien();
		alien3.setId(4);
		alien3.setName("Ravindra Babu");
		aliensList.add(alien);
		aliensList.add(alien1);
		aliensList.add(alien2);
		aliensList.add(alien3);
	}
	
	public List<Alien> getAllAliens(){
		return aliensList;
	}
	public Alien getAlien(int id){
		for(Alien alien : aliensList) {
			if(alien.getId() == id) {
				return alien;
			}
		}
		return null;
	}
	public String createAlien(Alien alien){
		
		if(alien != null) {
			aliensList.add(alien);
			System.out.println("Array List"+aliensList);
			return "Successfully Alien Created ";
		}
		return "Alien Not Created ";
	}
	public String updateAlienDetails(Alien alien){
		
		if(alien != null) {
			aliensList.add(alien);
			return "Successfully updated Alien  ";
		}
		return "Alien Not Updates ";
	}
}
