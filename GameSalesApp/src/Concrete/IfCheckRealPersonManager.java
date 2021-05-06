package Concrete;

import Abstract.IfCheckRealPersonService;
import Entities.Player;

public class IfCheckRealPersonManager implements IfCheckRealPersonService {

	@Override
	public boolean validate(Player player) {
		if (player.getName().equals("Mert")) {
			return true;	
		}else {
			return false;
		}
		
	}

}
