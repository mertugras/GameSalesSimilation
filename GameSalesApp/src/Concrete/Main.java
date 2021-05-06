package Concrete;

import java.util.Date;

import Entities.Game;
import Entities.GameCampaing;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		Player player1=new Player(1, "Mert", "Uğraş",new Date(1990,6,23), "123456");
		Game game1=new Game(1, "Fifa2055");
		GameCampaing gameCampaing1=new GameCampaing(1, "%50 indirim kampanyası");
		PlayerManager playerManager=new PlayerManager(new IfCheckRealPersonManager());
		playerManager.add(player1);
		
		
		
		GameSalesManager gameSalesManager=new GameSalesManager();
		gameSalesManager.gameBuying(player1, game1, gameCampaing1);
	}

}
