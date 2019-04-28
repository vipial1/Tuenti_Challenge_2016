/****************************
 * Vicent Picornell
 * vicent.de.oliva@gmail.com
 * Challenge 1 - Team Lunch
 * java + eclipse
 ****************************/


import java.util.Scanner;

public class team_lunch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        short iCases; //short should be enough
		iCases = in.nextShort();
		
		 for(short iCase=0;iCase<iCases;iCase++){
			 int members = in.nextInt();
		    if(members <= 0){
		    	System.out.println("Case #"+(iCase+1)+": " + 0);
		    }
		    else if(members <= 2){
		    	System.out.println("Case #"+(iCase+1)+": " +1);
		    }
		    else{
		    	System.out.println("Case #"+(iCase+1)+": " + ((members-1)/2));
		    }
		  } 
		in.close();
	}

}
