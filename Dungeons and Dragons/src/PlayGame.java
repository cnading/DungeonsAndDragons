import java.util.Scanner;

public class PlayGame {
	static Scanner userInput = new Scanner(System.in);
	static boolean playAgain = true;
	static Character hero;
	
	
	public static void main(String[] args) {
			{
			intro();
			}

	}
	
	public static void intro() {
		hero=new Character("", 0, 0, 0, 0, 0, 0, 0, 0, 0, "", 0, 0);
		boolean spellingError = true;
		System.out.println("Welcome to Dungeons and Dragons! For the entirety of this game,"
				+ " you'll need to press enter to see what to do next!");
		userInput.nextLine();
		System.out.println("Let's begin with creating you, kind hero, what is your name?");
		String name = userInput.nextLine();
		hero.setName(name);
		System.out.println(name + ", you will begin with choosing your class, this will define"
				+ " your starting weapons, abilities, strengths, and weaknesses.");
		userInput.nextLine();
		while (spellingError == true) {
			System.out.println("You may be a Knight, Barbarian, Monk, Archer, Assasin, or a Wizard."
					+ " When you've made your decision type the class you want.");

			String job = userInput.nextLine();
			hero.setJob(job);
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
			System.out.println("You are now, " + hero.getName() + " the " + job);
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
			hero.setStrength(strength);
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
			int ExperiencePoints=1;
			System.out.println("Because you are indeed " + name + " the " + job + " your final statistics are...");
			userInput.nextLine();

			switch (job) {
			case "Knight":
				height= height + 70;
				hero.setHeight(height);
				weight=weight+210;
				hero.setWeight(weight);
				hitPoints=hitPoints+4;
				hero.setHitPoints(hitPoints);
				strength = strength + 4;
				hero.setStrength(strength);
				dexterity = dexterity - 1;
				hero.setDexterity(dexterity);
				constitution = constitution + 2;
				hero.setConstitution(constitution);
				intelligence = intelligence - 2;
				hero.setIntelligence(intelligence);
				wisdom = wisdom - 3;
				hero.setWisdom(wisdom);
				charisma = charisma + 3;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Barbarian":
				height= height + 78;
				hero.setHeight(height);
				weight=weight+245;
				hero.setWeight(weight);
				hitPoints=hitPoints+3;
				hero.setHitPoints(hitPoints);
				strength = strength + 3;
				hero.setStrength(strength);
				dexterity = dexterity + 1;
				hero.setDexterity(dexterity);
				constitution = constitution + 1;
				hero.setConstitution(constitution);
				intelligence = intelligence - 3;
				hero.setIntelligence(intelligence);
				wisdom = wisdom - 2;
				hero.setWisdom(wisdom);
				charisma = charisma + 2;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Monk":
				height= height + 68;
				hero.setHeight(height);
				weight=weight+ 185;
				hero.setWeight(weight);
				hitPoints=hitPoints+3;
				hero.setHitPoints(hitPoints);
				strength = strength + 4;
				hero.setStrength(strength);
				dexterity = dexterity + 3;
				hero.setDexterity(dexterity);
				constitution = constitution + 1;
				hero.setConstitution(constitution);
				intelligence = intelligence - 2;
				hero.setIntelligence(intelligence);
				wisdom = wisdom + 2;
				hero.setWisdom(wisdom);
				charisma = charisma - 4;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Archer":
				height= height + 65;
				hero.setHeight(height);
				weight=weight+160;
				hero.setWeight(weight);
				hitPoints=hitPoints+2;
				hero.setHitPoints(hitPoints);
				strength = strength -2;
				hero.setStrength(strength);
				dexterity = dexterity + 3;
				hero.setDexterity(dexterity);
				constitution = constitution -1;
				hero.setConstitution(constitution);
				intelligence = intelligence + 2;
				hero.setIntelligence(intelligence);
				wisdom = wisdom - 2;
				hero.setWisdom(wisdom);
				charisma = charisma + 2;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Assasin":
				height= height + 62;
				hero.setHeight(height);
				weight=weight+180;
				hero.setWeight(weight);
				hitPoints=hitPoints+2;
				hero.setHitPoints(hitPoints);
				strength = strength + 2;
				hero.setStrength(strength);
				dexterity = dexterity + 4;
				hero.setDexterity(dexterity);
				constitution = constitution -1;
				hero.setConstitution(constitution);
				intelligence = intelligence + 3;
				hero.setIntelligence(intelligence);
				wisdom = wisdom - 3;
				hero.setWisdom(wisdom);
				charisma = charisma - 2;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;
			case "Wizard":
				height= height + 85;
				hero.setHeight(height);
				weight=weight+220;
				hero.setWeight(weight);
				hitPoints=hitPoints+1;
				hero.setHitPoints(hitPoints);
				strength = strength -3;
				hero.setStrength(strength);
				dexterity = dexterity - 2;
				hero.setDexterity(dexterity);
				constitution = constitution + 2;
				hero.setConstitution(constitution);
				intelligence = intelligence + 4;
				hero.setIntelligence(intelligence);
				wisdom = wisdom + 3;
				hero.setWisdom(wisdom);
				charisma = charisma - 1;
				hero.setCharisma(charisma);
				// difference of +3
				System.out.println(hero.getName() + " the " + hero.getJob() + " stats:" + " Strength: " + hero.getStrength() + " Dexterity: "
						+ hero.getDexterity() + " Constitution: " + hero.getConstitution() + " Intelligence: " + hero.getIntelligence() + " Wisdom: "
						+ hero.getWisdom() + " Charisma: " + hero.getCharisma() + " Height: " + hero.getHeight() + " Inches" + " Weight: " + hero.getWeight() + "Pounds "
						+" Level: " + hero.getLevel()  + " Hitpoints: " + hero.getHitPoints() + " Experience Points: " + hero.getExperiencePoints());
				System.out.println("Your statistics will give you advantages or disadvantages throughout the game.");
				break;

			}
		}
	}

	public static void MissionOne()
	{
		String status= hero.getName()+hero.getJob();
		System.out.println("Hello, " + status + "I am King Arthur and I need your help!");
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