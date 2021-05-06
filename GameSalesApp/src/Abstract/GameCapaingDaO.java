package Abstract;

import Entities.GameCampaing;

public interface GameCapaingDaO {
	void add(GameCampaing gameCampaing);
	void update(GameCampaing gameCampaing);
	void delete(GameCampaing gameCampaing);
	GameCampaing get(GameCampaing gameCampaing);
}
