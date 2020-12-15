import java.util.*;
import java.io.*;

public class DBDMain{
    
	public static void main(String[] args) {
	    
	    // Create the database.
		CharacterDatabase characters = new CharacterDatabase("characters.txt");
		Scanner scan = new Scanner(System.in);
		
		
		String input = "";
		while(!input.equals("recursion!")){
		    
		    // Ask the user for a specific skill
		    System.out.print("Choose a skill to sort by (or type recursion! to quit): ");
		    input = scan.next().toLowerCase();
		    
		    // Sort by that skill
		    characters.PrintSkillDatabase(input);
		    
		    // If recursion! is entered, then the program ends
		    if(input.equals("recursion!")){
		        System.out.println("Thanks for using this program!  The program will now exit.");
		        break;
		    }
		   
		    
		}
		
	}
}
