package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author S. McKell Nichols
 * @version 1.4 11/11/14 Updated processText and added a checker.
 */
public class Chatbot
{
	/**
	 * The programmer supplied list of memes.
	 */
	private ArrayList<String> memeList;
	/**
	 * The name of the Chatbot.
	 */
	private String name;
	/**
	 * The progammer specified content area for the contentChecker method.
	 */
	private int chatCount;
	/**
	 * The amount of chats that have occurred with this chatbot.
	 */
	private ChatbotUser myUser;
	/**
	 * The list of user input for the Chatbot.
	 */
	private ArrayList<String> userInputList;
	
	/**
	 * Creates a Chatbot object with the supplied name and initializes the current number of chats to zero.
	 * @param name The supplied name for the Chatbot.
	 */
	
	public Chatbot(String name)
	{
		memeList = new ArrayList<String>();
		userInputList = new ArrayList<String>();
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
	
	/**
	 * Adds objects to memeList.
	 */
	
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
		
		if(getChatCount() < 5)
		{
			//Ask questions about all data members here
			//you will need ifs or a switch
			//assign via myUser.set...
			if(getChatCount() == 0)
			{
				myUser.setUserName(currentInput);
				result = "Good name" + myUser.getUserName() + " how old are you?";
			}
			else if(getChatCount() == 1)
			{
				int userAge = Integer.parseInt(currentInput);
				myUser.setAge(userAge);
			}
			//continue for other user info fields
		}
		else if(currentInput != null && currentInput.length() > 0)
		{
			int randomPosition = (int) (Math.random() * 6);
			if(randomPosition == 0)
			{
				if(stringLengthChecker(currentInput))
				{
					result = "too long";
				}
				else
				{
					memeList.add(currentInput);
					result = "short words";
				}
			}
			else if(randomPosition == 1)
			{
				if(contentChecker(currentInput))
				{
					result = "yup you know the secret";
				}
				else
				{
					result = "try again another time";
				}
			}
			else if(randomPosition == 2)
			{
				if(memeChecker(currentInput))
				{
					result = "Wow, " + currentInput + " is a meme. Wahoo!";
				}
				else
				{
					result = "not a meme, try again";
				}
			}
			else if(randomPosition == 3)
			{
				//Talk about the user here :D
			}
			else if(randomPosition == 4)
			{
				//add to our list
				userInputList.add(currentInput);
				result = "Thank you for the comment";
			}
			else
			{
				if(userInputChecker(currentInput))
				{
					
				}
				else
				{
					
				}
			}
		}
		else
		{
			result = "use words!!!!";
		}
		updateChatCount();
		return result;
	}
		
	private boolean userInputChecker(String userInput)
	{
		boolean matchesInput = false;
		
		for(int loopCount = 0; loopCount < userInputList.size(); loopCount++)
		{
			if(userInput.equalsIgnoreCase(userInputList.get(loopCount)))
			{
				matchesInput = true;
				userInputList.remove(loopCount);
				loopCount--;
			}
		}
		return matchesInput;
	}
	
	/**
	 * Updates the number of chats that there are.
	 */
	
	private void updateChatCount()
	{
		chatCount++;
	}
	
	/**
	 * Checks to see if it is a meme.
	 * @param input String input.
	 * @return
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
	
	/**
	 * Checks to see if certain words are used.
	 * @param input String
	 * @return isYummyContent
	 */
	
	private boolean contentChecker(String input)
	{
		boolean isYummyContent = false;
		
		if (input.contains("yummy"))
		{
			isYummyContent = true;
		}
		
		return isYummyContent;
	}
	
	/**
	 * Checks to see how long the responses are and tells the user if the response is too long or too short.
	 * @param input String
	 * @return isTooLong
	 */
	
	private boolean stringLengthChecker(String input)
	{
		boolean isTooLong = false;

		if (input.length() >= 20)
		{
			isTooLong = true;
		}
		
		return isTooLong;
	}

	/**
	 * Quits the checker.
	 * @param Input of the String.
	 * @return Quits the checker.
	 */
	
	public boolean quitChecker(String input)
	{
		boolean okToQuit = false;
		
		if(input != null && input.equals("sayonara"))
		{
			okToQuit = true;
		}
		
		return okToQuit;
	}
}
