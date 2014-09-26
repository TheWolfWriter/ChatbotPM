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
	 * Pop up window at beginning of app.
	 * @param currentInput
	 * @return String
	 */
	
	public String showChatbot(String currentInput)
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello, " + currentInput);
		result = JOptionPane.showInputDialog(null, "Are you done?");
		
		return result;
	}
}
