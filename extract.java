import java.io.*;
import java.util.Arrays;
import java.io.BufferedReader;
import java.util.*;
class extract
{
public static void main(String[] args)throws Exception
	{	
		player p;

		
	BufferedReader fin= null; 
	Scanner sn =new Scanner(System.in);
	fin = new BufferedReader(new FileReader("input.txt"));
	String s =sn.next();
	 p=new player(s);	
	//String name=s;
	s=sn.next();
	int n=Integer.parseInt(s);
	 //System.out.println(n);
	String z[]=null;
	for(int k=0;k<n;k++)
	{
	s=sn.next();
	if(s!= null)
	{
		
		 z=s.split(",");
		 Bidder b=new Bidder(Integer.parseInt(z[0]),Integer.parseInt(z[1])); 	
		 b.joinplayer(p);
	    p.attach(b);
	}
	
	}	
		



String s1=sn.next();
int y=Integer.parseInt(s1);
//System.out.println(y);
 String z1[]=null;
for(int k=0;k<y-1;k++)
{
s1=sn.next();
if(s1!= null)
{
 z1=s1.split(",");
 p.setBidderAndPrice(Integer.parseInt(z1[0]),Integer.parseInt(z1[1]));
 
}

 
}
s1=sn.next();	

 z1=s1.split(",");

p.completeDeal(Integer.parseInt(z1[0]),Integer.parseInt(z1[1]));

	
	
}
}

