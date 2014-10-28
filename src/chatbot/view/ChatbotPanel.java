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
 * @version 1.1 10/21/14
 */

public class ChatbotPanel extends JPanel
{
	private ChatbotAppController baseController;
	
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatbotPanel(ChatbotAppController baseController) 
	{
		this.baseController = baseController;
		
		firstButton = new JButton("click the button... it is so clicky :D");
		firstTextField = new JTextField(25);
		baseLayout = new SpringLayout();
		
		chatPane = new JScrollPane();
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		chatArea.setLineWrap(true);;
		chatArea.setWrapStyleWord(true);
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(baseLayout);
		this.setSize(400, 400);
		this.add(firstButton);
		this.add(firstTextField);
		this.add(chatPane);
		chatArea = new JTextArea(5,20);
		
		
		add(chatArea);
	}
	
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
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText(firstTextField.getText()+ " >:D ");
			}
		});
	}

}
