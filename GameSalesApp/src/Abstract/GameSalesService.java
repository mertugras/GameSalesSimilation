package Abstract;

import Entities.Game;
import Entities.GameCampaing;
import Entities.Player;

public interface GameSalesService {
	void gameBuying(Player player,Game game);
	void gameBuying(Player player,Game game,GameCampaing gameCampaing);
}
