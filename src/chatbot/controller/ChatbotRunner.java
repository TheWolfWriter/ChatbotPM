package chatbot.controller;

/**
 * The runner for the Chatbot.
 * @author S. McKell Nichols
 * @version 10/1/14
 */

public class ChatbotRunner
{
	/**
	 * Staring point for all Java programs.
	 * @param args Unused!
	 */
	public static void main(String [] args)
	{
		ChatbotAppController appController = new ChatbotAppController();
		appController.start();
	}
}
