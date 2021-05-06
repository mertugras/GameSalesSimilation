package Entities;

import Abstract.Entity;

public class GameCampaing implements Entity {

	int id;
	String campaingName;
	public GameCampaing(int id, String campaingName) {
		super();
		this.id = id;
		this.campaingName = campaingName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaingName() {
		return campaingName;
	}
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	
}
