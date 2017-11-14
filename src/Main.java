import java.util.Scanner;

public class Main {
	
	static String version = "1.0";
	Scanner input = new Scanner(System.in);
	String GameState = "Main";
	public static void main(String[] args) {
		System.out.println("Welcome to Game Debuger " + version);
		new Main().run();
	}
	private  void run() {
		loop();
	}
	private  void loop() {
		while (GameState != "Exit") {
			while (GameState == "Main"){
			System.out.println("Main Menu");
			System.out.print("Options\n1. Exit \n2. Party \n3. Items \n4. Save \n5. Magic \n6. Encounter \n7. Cheats\n");
				String i = input.nextLine();
				if (i.equals("1") || i.equals("exit") ) {
					System.out.println("Exiting Game");
					GameState = "Exit";
					break;
				}
				if (i == "2" || i == "party") {
					System.out.println("Party");
					GameState = "Party_Menu";
				}
				if (i == "3" || i == "bag") {
					System.out.println("Items in Bag");
					GameState = "Bag_Menu";
				}
				if (i == "4" || i == "save") {
					System.out.println("Save");
					GameState = "Save_Prompt";
				}
				if (i == "5" || i == "magic") {
					System.out.println("Spellbook");
					GameState = "SpellBook_Menu";
				}
				if (i == "6" || i == "encounter") {
					System.out.println("Encounter Options");
					GameState = "Encounter_Debug";
				}
				if (i == "7" || i == "cheats") {
					System.out.println("Nothing to See here");
					GameState = "Cheat_Menu";
					}
				else {
					System.out.println("Not Valid Input, Please Enter either Item Number or Name\n");
				}
			}
		}
	}
}
