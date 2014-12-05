package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

/**
 * View package for Chatbot.
 * @author S. McKell Nichols
 * @version 1.2 12/5/14 Finished documentation.
 */

public class ChatbotView
{
	/**
	 * Sets up the baseController for the class.
	 */
	private ChatbotAppController baseController;
	
	/**
	 * Calls the baseController in the View.
	 * @param baseController ChatbotAppController
	 */
	public ChatbotView(ChatbotAppController baseController)
	{
		this.baseController = baseController;
	}
	
	/**
	 * Shows a String from the Chatbot with the availability of user input.
	 * @param currentInput The supplied String.
	 * @return The users typed response.
	 */
	public String showChatbotDialog(String currentInput)
	{
		String result = "";
		
		result = JOptionPane.showInputDialog(null, baseController.getMySillyChatbot().getName() + " says: " + currentInput);
		
		return result;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup window.
	 * @param currentInput The string from the Chatbot.
	 */
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showInputDialog(null, baseController.getMySillyChatbot() + " says: " + currentInput);
	}
}
