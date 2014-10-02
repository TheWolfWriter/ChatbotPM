package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author S. McKell Nichols
 * @version 1.1 9/26/14
 */
public class Chatbot
{
	private ArrayList<String> memeList;
	private String name;
	private int chatCount;
	
	/**
	 * Creates a Chatbot object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		this.name = name;
		chatCount = 0;
		fillTheMemeList();
	}
	
	/**
	 * Processes input from the user against the checker methods. Returns the next output for the view.
	 * @param currentInput The supplied text.
	 * @return The processed text based on checker or other methods.
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
	 * Sets the name of the Chatbot to the supplied name.
	 * This is a really important method. Add lots of lines.
	 * See more lines.
	 * And even more.
	 * Wowww...
	 * @param name The new name for the chatbot.
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	private void fillTheMemeList()
	{
		memeList.add("kitties");
		memeList.add("one does not simply");
		memeList.add("doge");
		memeList.add("that escalated quickly");
		memeList.add("y u no");
		memeList.add("troll face");
	}
	
	public String processText(String currentInput)
	{
		String result = "";
		
		if(memeChecker(currentInput))
		{
			result = "Wow, " + currentInput + " is a meme. Wahoo!";
		}
		else
		{
			result = "not a meme, try again";
		}
		
		return result;
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
	
	private boolean memeChecker(String input)
	{
		boolean isAMeme = false;
		
		for (String currentMeme : memeList)
		{
			if(input.equalsIgnoreCase(currentMeme))
			{
				isAMeme = true;
			}
		}
		
		for(int loopCounter = 0; loopCounter < memeList.size(); loopCounter++)
		{
			if(input.equalsIgnoreCase(memeList.get(loopCounter)))
			{
				isAMeme = true;
			}
		}
		
		return isAMeme;
	}
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("exit"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
}
