package chatbot.controller;

import javax.swing.JOptionPane;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;

/**
 * Runs the Chatbot Project. Owns the model and associated views.
 * @author S. McKell Nichols
 * @version 1.2 10/2/14 - cleaned the quit method.
 */

public class ChatbotAppController
{
	/**
	 * The instance of the ChatbotView, the View of the application.
	 */
	private ChatbotView applicationView;
	/**
	 * The instance of the Chatbot, the Model of this application.
	 */
	private Chatbot mySillyChatbot;
	/**
	 * The message used when starting the application.
	 */
	private String startMessage;
	/**
	 * The message provided when the user quits the application.
	 */
	private String quitMessage;
	/**
	 * Reference to GUI Jframe object for the application.
	 */
	private ChatbotFrame appFrame;
	
	/**
	 * Constructor of AppController.
	 */
	public ChatbotAppController()
	{
		applicationView = new ChatbotView(this);
		appFrame = new ChatbotFrame(this);
		mySillyChatbot = new Chatbot("Olf");
		startMessage = "Welcome to the " + mySillyChatbot.getName() + " chatbot. What is your name?";
		quitMessage = "Goodbye cruel user. :(";
	}
	
	public Chatbot getMySillyChatbot()
	{
		return mySillyChatbot;
	}
	
	public void start()
	{
		String result = applicationView.showChatbotDialog(startMessage);
		
//		while(!mySillyChatbot.quitChecker(result))
//		{
//			result = mySillyChatbot.processText(result);
//			result = applicationView.showChatbotDialog(result);
//		}
//		
//		quit();
	}
	
	
	/**
	 * Quit method for the  application.
	 */
	
	private void quit()
	{
		applicationView.showChatbotMessage(quitMessage);
		System.exit(0);
	}
}
