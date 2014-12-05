package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotAppController;

/**
 * GUI Panel class for Chatbot. Sets up the panel.
 * @author S. McKell Nichols
 * @version 1.2 12/5/14 Updated documentation
 */

public class ChatbotPanel extends JPanel
{
	/**
	 * Declares the baseController ChatbotAppController for the class.
	 */
	private ChatbotAppController baseController;
	/**
	 * Declares firstButton as a JButton in the class.
	 */
	private JButton firstButton;
	/**
	 * Declares firstTextField as a JTextField in the class.
	 */
	private JTextField firstTextField;
	/**
	 * Declares baseLayout as a SpringLayout in the class.
	 */
	private SpringLayout baseLayout;
	/**
	 * Declares chatArea as a JTextArea in the class.
	 */
	private JTextArea chatArea;
	/**
	 * Declares chatPane as a JScrollPane in the class.
	 */
	private JScrollPane chatPane;
	
	/**
	 * Sets up the GUI for the baseController. Sets up the components that will be used.
	 * @param baseController ChatbotAppController
	 */
	public ChatbotPanel(ChatbotAppController baseController) 
	{
		this.baseController = baseController;
		
		firstButton = new JButton("click the button... it is so clicky :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		chatPane = new JScrollPane(chatArea);
		chatArea = new JTextArea(5, 20);
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Sets up what the screen looks like in the app.
	 */
	private void setupPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
	
	/**
	 * Sets up the panel for the GUI.
	 */
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(baseLayout);
		this.setSize(400, 400);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		
		add(chatArea);
	}
	
	/**
	 * Place to store layout coding as it appears.
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 12, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 97, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 82, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstTextField, -95, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstTextField, -77, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 112, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -26, SpringLayout.NORTH, firstTextField);
	}
	
	/**
	 * Sets up the listeners for the class. In this case, we have one button.
	 */
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String currentInput = firstTextField.getText();
				String result = baseController.getChatbotDialog(currentInput);
				showTextMessage(currentInput);
				showTextMessage(result);
				firstTextField.setText("");
				firstTextField.requestFocus();
			}
		});
	}
	
	/**
	 * Shows the message replies for the user with what the user said.
	 * @param userInput
	 */
	public void showTextMessage(String userInput)
	{
		chatArea.append("\n" + userInput);
	}

}
