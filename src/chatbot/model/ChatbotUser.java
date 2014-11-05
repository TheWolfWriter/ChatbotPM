package chatbot.model;

public class ChatbotUser
{
	//four data members
	//at least two different types (String, int, boolean, double....)
	private String userName;
	private int age;
	private boolean lovesMusic;
	private Boolean playsPiano;
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public boolean isLovesMusic()
	{
		return lovesMusic;
	}
	
	public void setLovesMusic(boolean lovesMusic)
	{
		this.lovesMusic = lovesMusic;
	}
	
	public Boolean getPlaysPiano()
	{
		return playsPiano;
	}
	
	public void setPlaysPiano(Boolean playsPiano)
	{
		this.playsPiano = playsPiano;
	}
	
	public ChatbotUser()
	{
		
	}
}
