package Concrete;

import Abstract.GameCapaingDaO;
import Entities.Game;
import Entities.GameCampaing;

public class GameCampaingManager implements GameCapaingDaO{

	@Override
	public void add(GameCampaing gameCampaing) {
	System.out.println("Kampanya Eklendi :" +gameCampaing.getCampaingName());
		
	}

	@Override
	public void update(GameCampaing gameCampaing) {
		System.out.println("Kampanya Güncellendi :" +gameCampaing.getCampaingName());
		
	}

	@Override
	public void delete(GameCampaing gameCampaing) {
		System.out.println("Kampanya Silindi :" +gameCampaing.getCampaingName());
		
	}

	@Override
	public GameCampaing get(GameCampaing gameCampaing) {
		
		return gameCampaing;
	}

	
	

}
