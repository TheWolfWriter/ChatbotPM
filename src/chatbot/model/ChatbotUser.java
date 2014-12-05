package chatbot.model;

/**
 * Class that stores the info about the user as the user progresses through the answers.
 * @author S. McKell Nichols
 * @version 1.1 12/5/14 Updated documentation.
 */
public class ChatbotUser
{
	//four data members
	//at least two different types (String, int, boolean, double....)
	
	/**
	 * Declares the String userName for the class.
	 */
	private String userName;
	/**
	 * Declares the integer age for the class.
	 */
	private int age;
	/**
	 * Declares the boolean lovesAnimals for the class.
	 */
	private boolean lovesAnimals;
	/**
	 * Declares the boolean playsPiano for the class.
	 */
	private boolean playsPiano;
	/**
	 * Declares the double height for the class.
	 */
	public double height;
	
	/**
	 * Creates the int, bool, and String for each of the declared components above.
	 */
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -18;
		this.lovesAnimals = false;
		this.playsPiano = false;
		this.height = -65;
	}
	
	/**
	 * Gets the userName of the user.
	 * @return userName
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Sets the UserName, causing the program to remember it.
	 * @param userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/**
	 * Gets the age to the user.
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Sets the age, causing the program to remember it.
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	/**
	 * Gets the "loves animals" trait.
	 * @return lovesAnimal
	 */
	public boolean isLovesAnimals()
	{
		return lovesAnimals;
	}
	
	/**
	 * Sets the "loves animals" trait, causing the program to remember it.
	 * @param lovesAnimals
	 */
	public void setLovesAnimals(boolean lovesAnimals)
	{
		this.lovesAnimals = lovesAnimals;
	}
	
	/**
	 * Gets the height of the user.
	 * @return height
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Sets the height of the user, causing the program to remember it.
	 * @param height
	 */
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	/**
	 * Gets the "plays piano" trait.
	 * @return playsPiano
	 */
	public boolean getPlaysPiano()
	{
		return playsPiano;
	}
	
	/**
	 * Sets the "plays piano" trait, causing the program to remember it.
	 * @param playsPiano
	 */
	public void setPlaysPiano(boolean playsPiano)
	{
		this.playsPiano = playsPiano;
	}
}
