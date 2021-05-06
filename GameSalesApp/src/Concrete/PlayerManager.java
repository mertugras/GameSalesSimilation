package Concrete;

import Abstract.IfCheckRealPersonService;
import Abstract.PlayerDoa;
import Entities.Player;

public class PlayerManager implements PlayerDoa {
IfCheckRealPersonService ifCheckRealPersonService;


	public PlayerManager(IfCheckRealPersonService ifCheckRealPersonService) {
	super();
	this.ifCheckRealPersonService = ifCheckRealPersonService;
}

	@Override
	public void add(Player player) {
		if (ifCheckRealPersonService.validate(player)) {
			System.out.println("Db Eklendi "+player.getName());
			return;
		}
		System.out.println("Oyuncu Bilgileri Doğrulanamadı");
		
	}

	@Override
	public void uptadete(Player player) {
		System.out.println("Güncellendi "+player.getName());
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("Silindi "+player.getName());
		
	}

	@Override
	public Player get(Player player) {
		
		return player;
	}

}
