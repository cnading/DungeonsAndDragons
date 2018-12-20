
public class CharacterGenerator
	{

		public static int rollDice()
			{
				int dice1 = (int) (Math.random() * 6) + 1;
				int dice2 = (int) (Math.random() * 6) + 1;
				int dice3 = (int) (Math.random() * 6) + 1;
				int diceTotal = dice1 + dice2 + dice3;
				return diceTotal;
			}
	}