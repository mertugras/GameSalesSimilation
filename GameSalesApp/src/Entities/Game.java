package Entities;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private String gameName;
	public Game(int id, String gameName) {
		super();
		this.id = id;
		this.gameName = gameName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
