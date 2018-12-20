
public class Character
	{
		private String name;
		private int level;
		private int height;
		private int weight;
		private int strength;
		private int dexterity;
		private int constitution;
		private int intelligence;
		private int wisdom;
		private int charisma;
		private String job;
		private int hitPoints;
		private int experiencePoints;
		
		public Character (String name, int level, int height, int weight, int strength, int dexterity, 
				int constitution, int intelligence, int wisdom, int charisma, String job,
				int hitPoints, int experiencePoints )
		{	
			this.name=name;
			this.level=level;
			this.height=height;
			this.weight=weight;
			this.strength=strength;
			this.dexterity=dexterity;
			this.constitution=constitution;
			this.intelligence=intelligence;
			this.wisdom=wisdom;
			this.charisma=charisma;
			this.job=job;
			this.hitPoints=hitPoints;
			this.experiencePoints=experiencePoints;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getLevel()
			{
				return level;
			}

		public void setLevel(int level)
			{
				this.level = level;
			}

		public int getHeight()
			{
				return height;
			}

		public void setHeight(int height)
			{
				this.height = height;
			}

		public int getWeight()
			{
				return weight;
			}

		public void setWeight(int weight)
			{
				this.weight = weight;
			}

		public int getStrength()
			{
				return strength;
			}

		public void setStrength(int strength)
			{
				this.strength = strength;
			}

		public int getDexterity()
			{
				return dexterity;
			}

		public void setDexterity(int dexterity)
			{
				this.dexterity = dexterity;
			}

		public int getConstitution()
			{
				return constitution;
			}

		public void setConstitution(int constitution)
			{
				this.constitution = constitution;
			}

		public int getIntelligence()
			{
				return intelligence;
			}

		public void setIntelligence(int intelligence)
			{
				this.intelligence = intelligence;
			}

		public int getWisdom()
			{
				return wisdom;
			}

		public void setWisdom(int wisdom)
			{
				this.wisdom = wisdom;
			}

		public int getCharisma()
			{
				return charisma;
			}

		public void setCharisma(int charisma)
			{
				this.charisma = charisma;
			}

		public String getJob()
			{
				return job;
			}

		public void setJob(String job)
			{
				this.job = job;
			}

		public int getHitPoints()
			{
				return hitPoints;
			}

		public void setHitPoints(int hitPoints)
			{
				this.hitPoints = hitPoints;
			}

		public int getExperiencePoints()
			{
				return experiencePoints;
			}

		public void setExperiencePoints(int experiencePoints)
			{
				this.experiencePoints = experiencePoints;
			}
		
	}
