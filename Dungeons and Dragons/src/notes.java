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
