package chatbot.model;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author S. McKell Nichols
 * @version 1.1 9/26/14
 */
public class Chatbot
{
	private String name;
	private int chatCount;
	
	/**
	 * Creates a Chatbot object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	
	public Chatbot(String name)
	{
		this.name = name;
		chatCount = 0;
	}
	
	/**
	 * Returns the name of the Chatbot object.
	 * @return The current name of the Chatbot.
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Returns the number of chats of the Chatbot object.
	 * @return The current chat count of the Chatbot.
	 */
	
	public int getChatCount()
	{
		return chatCount;
	}
	
	/**
	 * Sets the name of the String.
	 * @param Name of the String.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Updates the number of chats that there are.
	 */
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
	/**
	 * Quits the checker.
	 * @param Input of the String.
	 * @return Quits the checker.
	 */
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input.equals("sayonara"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
}
