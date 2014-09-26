package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotView;

public class ChatbotAppController
{
	private ChatbotView applicationView;
	private Chatbot mySillyChatbot;
	
	/**
	 * Controller of the chatbot application.
	 */
	
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		mySillyChatbot = new Chatbot("Olf");
	}
	
	/**
	 * Starts the chatbot app.
	 * Also initiates an "if" quitting option. 
	 */
	
	public void start()
	{
		String result = applicationView.showChatbot("McKell!");
		
		if (mySillyChatbot.quitChecker(result))
		{
			quit();
		}
	}
	
	/**
	 * If user chooses to quit, following message will pop up.
	 */
	
	private void quit()
	{
		JOptionPane.showMessageDialog(null, "Goodbye cruel world!");
		System.exit(0);
	}
}
