package chatbot.view;

import javax.swing.JOptionPane;

import chatbot.controller.ChatbotAppController;

public class ChatbotView
{
	private ChatbotAppController baseController;
	
	/**
	 * Creating a controller for the base.
	 * @param baseController
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
		
		result = JOptionPane.showInputDialog(null, basecontroller.getMySillyChatbot() + " says: " + currentInput);
		
		return result;
	}
	
	/**
	 * Shows a String from the Chatbot as a popup window.
	 * @param currentInput The string from the Chatbot.
	 */
	
	public void showChatbotMessage(String currentInput)
	{
		JOptionPane.showInputDialog(null, basecontroller.getMySillyChatbot() + " says: " + currentInput);
	}
}
