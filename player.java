
import java.util.*;
import java.io.*;
class player
{
	int j=0;
	int m=0;
 String playerName;
 int Bidder;
 int Price;
 ArrayList<Bidder> bidderId=new ArrayList<Bidder>();
 
public player(String playerName)
{
 this.playerName=playerName;
}
public void attach( Bidder o )
{
	bidderId.add(o);	
}
public int [] getBidderAndPrice()
{
int a[]=new int[2];
a[0]=this.Bidder;
a[1]=this.Price;
return a;
}

public void setBidderAndPrice(int bidderId1, int biddingPrice)
{	if(j==0)
	{
		System.out.println("Bidding starts for player " + this.playerName);
		j=1;
	}
	
		int h=0;
		
		for(int i=0;i<bidderId.size()&&h==0;i++)
		{
			Bidder k=bidderId.get(i);
			if(k.getID()==Bidder)
			{
				k.setbudget(k.getbudget()-10);
				
				h=1;
			}
		}
		Bidder=bidderId1;
		Price=biddingPrice;
	notifyBidding();	
}

public void completeDeal(int bidderId1, int biddingPrice)
{
	if(m==0)
	{
		System.out.println("Bid Winner ");
		m=1;
	}
	
int h=0;
		for(int i=0;i<bidderId.size();i++)
		{
			Bidder k=bidderId.get(i);
			if(k.getID()==Bidder)
			{
				k.setbudget(k.getbudget()-10);
			}
				if(k.getID()==bidderId1)
			{
				k.setbudget(k.getbudget()-biddingPrice);
				
				
			}
			
		}
		
		
		
		Bidder=bidderId1;
		Price=biddingPrice;
	notifydeal();	
}
private void notifyBidding()
{
	int h=bidderId.size();
for(int l=0;l<h;l++)
{	
	Bidder k=bidderId.get(l);
	k.updatebidding();
}

 System.out.println("");
}
private void notifydeal()
{
int h=bidderId.size();
for(int l=0;l<h;l++)
{	
	Bidder k=bidderId.get(l);
	k.updateDeal();
}
System.out.println("");
}

}

