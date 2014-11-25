package chatbot.model;

import java.util.ArrayList;

/**
 * The chatbot model class. Used for checking and manipulating Strings.
 * @author S. McKell Nichols
 * @version 1.5 11/18/14 Updated processText.
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
		myUser = new ChatbotUser();
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
		
		if(getChatCount() <5)
		{
			result = introduceUser(currentInput);
		}
		else if(currentInput != null && currentInput.length() > 0)
		{
			result = randomChatConversation(currentInput);
		}
		else
		{
			result = "use words!!!!";
		}
		updateChatCount();
		return result;
	}
	
	private String introduceUser(String input)
	{
		String userQuestion = "";
		int x;
		
		if(getChatCount() == 0)
		{
			myUser.setUserName(input);
			userQuestion = "Hello " + myUser.getUserName() + ". My name is Olf. How old are you? (Only type numbers!)";
		}
		else if(getChatCount() == 1)
		{
			int userAge = Integer.parseInt(input);
			myUser.setAge(userAge);
			userQuestion = "Garsh, you are really old " + myUser.getUserName() + "! How tall are you? (Type it in decimals! i.e. If you are 5 feet 2 inches, type it as 5.2)";
		}
		else if(getChatCount() ==2)
		{
			double userHeight = Double.parseDouble(input);
			myUser.setHeight(userHeight);
			userQuestion = "Fun sized! Whoo! " + myUser.getUserName() + ", what do you like to do for fun?";
		}
		else if(getChatCount() == 3)
		{
			Boolean userPlaysPiano = Boolean.parseBoolean(input);
			myUser.setPlaysPiano(userPlaysPiano);
			userQuestion = "I should try that sometime. I like to play the piano! " + myUser.getUserName() + ", what is your favorite thing in the whole world?";
		}
		else
		{
			boolean userLovesAnimals = Boolean.parseBoolean(input);
			myUser.setLovesAnimals(userLovesAnimals);
			userQuestion = "Animals are cooler! " + myUser.getUserName() + ", what else would you like to talk about?";
		}
		
		return userQuestion;
	}
	
	/**
	 * Selects a random topic for the chatbot to talk about using the user's.
	 * @param input The conversation the user sends
	 * @return The conversation.
	 */
	private String randomChatConversation(String input)
	{
		String conversation = "";
		
		int randomPosition = (int) (Math.random() * 7);
		if(randomPosition == 0)
		{
			if(stringLengthChecker(input))
			{
				conversation = "too long";
			}
			else
			{
				memeList.add(input);
				conversation = "short words";
			}
		}
		else if(randomPosition == 1)
		{
			if(contentChecker(input))
			{
				conversation = "yup you know the secret";
			}
			else
			{
				conversation = "try again another time";
			}
		}
		else if(randomPosition == 2)
		{
			if(memeChecker(input))
			{
				conversation = "Wow, " + input + " is a meme. Wahoo!";
			}
			else
			{
				conversation = "not a meme, try again";
			}
		}
		else if(randomPosition == 3)
		{
			conversation = userTopic(input);
		}
		else if(randomPosition == 4)
		{
			//add to our list
			userInputList.add(input);
			conversation = "Thank you for the comment";
		}
		else if(randomPosition == 5)
		{
			if(mashChecker(input))
			{
				conversation = mashingDetected(input);
			}
			else
			{
				conversation = noMashingDeteced(input);
			}
		}
		else
		{
			if(userInputChecker(input))
			{
				conversation = "That was nice - you removed it from the list";
			}
			else
			{
				conversation = "That wasn't in the conversation before";
			}
		}
		
		return conversation;
	}
	
	private String mashingDetected(String input)
	{
		String mashed = "";
		
		mashed = input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		mashed += input.substring(input.length()/2);
		
		return mashed;
	}
	
	private String noMashingDeteced(String input)
	{
		String noMashing = "Thank you for not mashing your keyboard";
		if(input.length() > 1)
		{
			noMashing += input.substring(input.length()/3, input.length()/2);
		}
		
		return noMashing;
	}
	
	/**
	 * Checker for keyboard mashing
	 * @param userInput The user supplied text.
	 * @return Whether mashing has been detected.
	 */
	private boolean mashChecker(String userInput)
	{
		boolean isMashing = false;
		
		if(userInput.indexOf("rtshdf") > -1)
		{
			isMashing = true;
		}
		
		return isMashing;
	}
	
	/**
	 * Provides output based on the ChatbotUser object. Uses a switch/case structure for testing.
	 * @param userInput The user input
	 * @return Resulting conversation.
	 */
	private String userTopic(String userInput)
	{
		String userBasedResponse = "";
		
		int randomUserTopic = (int) (Math.random() * 6);
				
		switch(randomUserTopic)
		{
			case 1:
				userBasedResponse = myUser.isLovesAnimals() + " is the response to animals :D";
				break;
			case 0:
				userBasedResponse = myUser.getUserName() + " is a silly name";
				break;
			default:
				userBasedResponse = myUser.getAge() + " is realllllyyyy realllllllyyyyyy old";
				break;
		}
				
		return userBasedResponse;
	}
	
	/**
	 * Checks for existing inputs in the userInputList and removes it.
	 * @param userInput The current text supplied by the user.
	 * @return Whether it was in the list and removed or not.
	 */
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
