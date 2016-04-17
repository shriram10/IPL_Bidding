
import java.util.*;
import java.io.*;
class Bidder extends Observer
{
	public player Player;
	int bidderId, budget;
				  
		public Bidder(int bidderId,int budget)
				{
					  this.bidderId=bidderId;
					  this.budget=budget;
				  }
	 public int getID()
		{
			return this.bidderId;		  
		}
	  public void setbudget(int set)
		  {
	  this.budget=set;
					  
		  }
		  public void joinplayer(player p)
		  {
			  this.Player=p;
		  }
	  public int getbudget()
		  {
			  return budget;
		  }
		  public void updatebidding()
		  {
			 // System.out.println("Bidding  for the player" );
			  int a[]=Player.getBidderAndPrice();
			  System.out.println(this.bidderId +" : " +"["+a[0]+", "+a[1]+"]");

		  }
		  public void updateDeal()
		  {
					//System.out.println("Bidding  for the player" );
			  int a[]=Player.getBidderAndPrice();
			  System.out.println(this.bidderId  +" : " +"["+this.budget+", "+a[0]+"]");  
		  }
}
