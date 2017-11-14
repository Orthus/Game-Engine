import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Combat {
	public boolean escape;
	int randomNum;
	public void Fight(){
		
	}
	
	public void Item() {
		System.out.println("Combat Items");
	}
	
	public boolean run(int PlayerSpeed, int MonSpeed) {
		System.out.println("Player Attempted to Run");
		if(PlayerSpeed > MonSpeed) {
			randomNum = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			if(randomNum >= 2) {
				System.out.println("Player ran from battle");
				return escape = true;
			}
			else {
				System.out.println("Player can not escape from battle");
				return escape = false;
			}
		}
		else {
			randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
			if(randomNum >= 7) {
				System.out.println("Player ran from battle");
				return escape = true;
			}
			else {
				System.out.println("Player can not escape from battle");
				return escape = false;
			}
		}
		
	}
	
	public void Switch() {
	System.out.println("Switching is currently disabled");
	}
	
	public Combat(int modid, int level) {
		
	}
}
