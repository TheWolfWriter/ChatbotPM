package chatbot.model;

public class ChatbotUser
{
	//four data members
	//at least two different types (String, int, boolean, double....)
	private String userName;
	private int age;
	private boolean lovesAnimals;
	private boolean playsPiano;
	public double height;
	
	public ChatbotUser()
	{
		this.userName = "";
		this.age = -18;
		this.lovesAnimals = false;
		this.playsPiano = false;
		this.height = -65;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public boolean isLovesAnimals()
	{
		return lovesAnimals;
	}
	
	public void setLovesAnimals(boolean lovesMusic)
	{
		this.lovesAnimals = lovesMusic;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		this.height = height;
	}
	
	public boolean getPlaysPiano()
	{
		return playsPiano;
	}
	
	public void setPlaysPiano(boolean playsPiano)
	{
		this.playsPiano = playsPiano;
	}
}
