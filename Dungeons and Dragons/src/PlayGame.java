import java.util.Scanner;

public class PlayGame {
	static Scanner userInput = new Scanner(System.in);
	static boolean playAgain = true;
	static Character hero;
	public static void main(String[] args) {
		while (playAgain) {
			intro();
			//missionOne();
			playAgain = false;
		}

	}

	public static void intro() {
		boolean spellingError = true;
		System.out.println("Welcome to Dungeons and Dragons! For the entirety of this game,"
				+ " you'll need to press enter to see what to do next!");
		userInput.nextLine();
		System.out.println("Let's begin with creating you, kind hero, what is your name?");
		String name = userInput.nextLine();
		System.out.println(name + ", you will begin with choosing your class, this will define"
				+ " your starting weapons, abilities, strengths, and weaknesses.");
		userInput.nextLine();
		while (spellingError == true) {
			System.out.println("You may be a Knight, Barbarian, Monk, Archer, Assasin, or a Wizard."
					+ " When you've made your decision type the class you want.");

			String job = userInput.nextLine();
			switch (job) {
			case "Knight":
				System.out.println("Noble choice, the knight- Heavily armored, starts with a two-handed longsword,"
						+ " very chivalrous and highly honorable.");
				spellingError = false;
				break;
			case "Barbarian":
				System.out.println(
						"Brave choice, the barabarian- Well armored, starts with a battle-axe, bold, loud, unafraid"
								+ " and greedy. ");
				spellingError = false;
				break;
			case "Monk":
				System.out.println(
						"Wise choice, the monk- Well armorewd, is a martial artist specialized in unarmed combat,"
								+ " very disciplined and spiritual. ");
				spellingError = false;
				break;
			case "Archer":
				System.out.println("Smart choice, the archer- Lightly armored, starts with a bow and arrows,"
						+ " very qucik and cunning");
				spellingError = false;
				break;
			case "Assasin":
				System.out.println("Crafty choice, the Assasin- Lightly armored, starts with two daggers, qucik"
						+ " quiet, and sneaky");
				spellingError = false;
				break;
			case "Wizard":
				System.out.println(
						"Best choice, the Wizzard- Not armored, starts with three spells," + " adventurous and wise");
				spellingError = false;
				break;
			default:
				spellingError = true;
				System.out.println("Error...must only capitalize first letter and spell correctly");
			}
			System.out.println("You are now, " + name + " the " + job);
			userInput.nextLine();
			System.out.println(
					"We will begin rolling 3 6 sided dice, this will fairly determine your statistics for the rest"
							+ "of the game, just like real D and D.");
			userInput.nextLine();
			System.out.println("This roll will determine your Strength");
			userInput.nextLine();
			int strength = 0;
			strength = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + strength);
			//
			userInput.nextLine();
			System.out.println("This roll will determine your dexterity");
			userInput.nextLine();
			int dexterity = 0;
			dexterity = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + dexterity);
			//
			userInput.nextLine();
			System.out.println("This roll will determine your constitution");
			userInput.nextLine();
			int constitution = 0;
			constitution = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + constitution);
			//
			userInput.nextLine();
			System.out.println("This roll will determine your intelligence");
			userInput.nextLine();
			int intelligence = 0;
			intelligence = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + intelligence);
			//
			userInput.nextLine();
			System.out.println("This roll will determine your wisdom");
			userInput.nextLine();
			int wisdom = 0;
			wisdom = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + wisdom);
			//
			userInput.nextLine();
			System.out.println("This roll will determine your charisma");
			userInput.nextLine();
			int charisma = 0;
			charisma = CharacterGenerator.rollDice();
			System.out.println("You rolled a " + charisma);
			int height=0;
			int weight=0;
			int level=1;
			int hitPoints=10;
			int experiencePoints=1;
			System.out.println("Because you are indeed " + name + " the " + job + " your final statistics are...");
			userInput.nextLine();

			switch (job) {
			case "Knight":
				height= height + 70;
				weight=weight+210;
				hitPoints=hitPoints+4;
				strength = strength + 4;
				dexterity = dexterity - 1;
				constitution = constitution + 2;
				intelligence = intelligence - 2;
				wisdom = wisdom - 3;
				charisma = charisma + 3;
				// difference of +3
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight + 
						" Level: " + level  + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Barbarian":
				height= height + 78;
				weight=weight+245;
				hitPoints=hitPoints+3;
				strength = strength + 3;
				dexterity = dexterity + 1;
				constitution = constitution + 1;
				intelligence = intelligence - 3;
				wisdom = wisdom - 2;
				charisma = charisma + 2;
				// difference of +2
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight 
						+ " Level: " + level  + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Monk":
				height= height + 68;
				weight=weight+185;
				hitPoints=hitPoints+3;
				strength = strength + 4;
				dexterity = dexterity + 3;
				constitution = constitution + 1;
				intelligence = intelligence - 2;
				wisdom = wisdom + 2;
				charisma = charisma - 4;
				// difference of +4
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight + 
						" Level: " + level  + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Archer":
				height= height + 65;
				weight=weight+160;
				hitPoints=hitPoints+2;
				strength = strength - 2;
				dexterity = dexterity + 3;
				constitution = constitution - 1;
				intelligence = intelligence + 2;
				wisdom = wisdom - 2;
				charisma = charisma + 2;
				// difference of +2
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight + 
						" Level: " + level + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Assasin":
				height= height + 62;
				weight=weight+255;
				hitPoints=hitPoints+2;
				strength = strength + 2;
				dexterity = dexterity + 4;
				constitution = constitution - 1;
				intelligence = intelligence + 3;
				wisdom = wisdom - 3;
				charisma = charisma - 2;
				// difference of +3
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight +
						" Level: " + level + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Wizard":
				height= height + 85;
				weight=weight+220;
				hitPoints=hitPoints+1;
				strength = strength - 3;
				dexterity = dexterity - 2;
				constitution = constitution + 2;
				intelligence = intelligence + 4;
				wisdom = wisdom + 3;
				charisma = charisma - 1;
				// difference of +3
				System.out.println(name + " the " + job + " stats:" + " Strength: " + strength + " Dexterity: "
						+ dexterity + " Constitution: " + constitution + " Intelligence: " + intelligence + " Wisdom: "
						+ wisdom + " Charisma: " + charisma + " Height: " + height + " Weight: " + weight 
						+ " Level: " + level + " Hitpoints: " + hitPoints);
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			default:
				spellingError = true;
				System.out.println("Error...must only capitalize first letter and spell correctly");

			}
			hero=new Character(name, level, height, weight, strength, dexterity, constitution, intelligence, wisdom, charisma, job, hitPoints, experiencePoints);
		}
	}

	public static void MissionOne()
	{
		System.out.println("Hello, " + name + job + "I am King Arthur and I need your help!");
		System.out.println("Are you up to the task");
		String answer=userInput.nextLine();
		if (answer.equals("Yes")||answer.equals("YES")||answer.equals("yes"));
			{
		System.out.println("Well then let me debreief you...");
			}
		else if (answer.equals("No")||answer.equals("NO")||answer.equals("no"));
			{
		System.out.println("Well then get out of here!");
			}
		else
				{
					System.out.println("I don't understand try again...");
				}
	}
}