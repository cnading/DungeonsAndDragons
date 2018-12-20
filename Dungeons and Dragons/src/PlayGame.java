import java.util.Scanner;

public class PlayGame
	{
		static Scanner userInput = new Scanner(System.in);
		static boolean playAgain = true;

		public static void main(String[] args)
			{
				Character hero = new Character("", 1, 0, 0, 0, 0, 0, 0, 0, 0, "", "", 0, 0);
				System.out.println(CharacterGenerator.rollDice());
				while (playAgain)
					{
						intro();
						System.out.println();
						MissionOne();
					}

			}

		public static void intro()
			{
				System.out.println("Welcome to Dungeons and Dragons! For the entirety of this game,"
						+ " you'll need to press enter to see what to do next!");
				userInput.nextLine();
				System.out.println("Let's begin with creating your hero's name, what is your hero's name?");
				String name = userInput.nextLine();
				System.out.println("Welcome, " + name + "!");
				System.out.println(name + ", You will begin with choosing your class, this will define"
						+ " your starting weapons, abilities, strengths, and weaknesses.");
				userInput.nextLine();
				System.out.println("You may be a Knight, Barbarian, Monk, Archer, Assasin, or a Wizard."
						+ "When you've made your decision type the class you want.");

				String job = userInput.nextLine();
				if (job.equals("Knight") || job.equals("knight"))
					{
						System.out.println(
								"The Knight- heavily armored, starts with a two-handed longsword, very chivalrous and highly honorable");
					} else if (job == "Barbarian")
					{
						System.out.println("You suck");
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
