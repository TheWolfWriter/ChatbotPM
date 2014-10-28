package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

/**
 * View package for Chatbot.
 * @author S. McKell Nichols
 * @version 1.1 10/28/14
 */

public class ChatbotView
{
	private ChatbotAppController baseController;
	
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
