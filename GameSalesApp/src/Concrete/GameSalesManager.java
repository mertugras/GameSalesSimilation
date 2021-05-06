package Concrete;

import Abstract.GameSalesService;
import Entities.Game;
import Entities.GameCampaing;
import Entities.Player;

public class GameSalesManager implements GameSalesService {

	@Override
	public void gameBuying(Player player, Game game) {
	System.out.println(player.getName()+" Şu oyunu satın aldı : "+game.getGameName());
	}


	@Override
	public void gameBuying(Player player, Game game,GameCampaing gameCampaing) {
	System.out.println(player.getName()+" Şu oyunu satın aldı : "+game.getGameName()
	+" "+gameCampaing.getCampaingName()+" ile satın aldı.");
	}
}
