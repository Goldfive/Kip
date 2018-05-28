//import System

class Kip
{
	
	String color;
	String name;
	boolean alive;
	byte totalPaws;
	
	public static void main(String[] args)
	{
		Kip kfc = new Kip();
		kfc.setColor("rood");
		kfc.setName("Gekke Henkie");
		kfc.setAlive(true);
		kfc.setTotalPaws((byte)2);
		kfc.printKipDescription();
		
		Kip bertha = new Kip();
		bertha.setColor("kotsgroen");
		bertha.setName("Bertha");
		bertha.setAlive(false);
		bertha.setTotalPaws((byte)1);
		bertha.printKipDescription();
		
		Kip burp = new Kip();
		burp.setColor("bierpaars");
		burp.setName("Burp");
		burp.setAlive(false);
		burp.setTotalPaws((byte)500);
		burp.printKipDescription();
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public void setAlive(boolean status)
	{
		this.alive = status;
	}
	
	public boolean isAlive()
	{
		return this.alive;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String s)
	{
		this.color = s;
	}
	
	public void setTotalPaws(byte paws)
	{
		this.totalPaws = paws;
	}
	
	public byte getTotalPaws()
	{
		return this.totalPaws;
	}
	
	public void printKipDescription()
	{
		System.out.println("Hoi ik heb een nieuwe kip, hij heet " + this.getName() + " en hij is " + (this.isAlive() == true ? "levend." : "kei dood."));
		System.out.println("Hij ziet er ook nogal " + this.getColor() + " uit, maja, dat kan ook niet anders met maar " + this.getTotalPaws() + " poten.\r\n");
	}
}
