import java.util.*;
import java.io.*;

public class CharacterDatabase{
 
    // Store each character into an array list
    private ArrayList<Character> characters;
    
    public CharacterDatabase(String file){
        
        // Before reading into the file, allocate the arraylist
        characters = new ArrayList<Character>();
        
        try{
            // Create a file object and then create a scanner object that reads from the file object
            File myFile = new File(file);
            Scanner scan = new Scanner(myFile);
            
            // Read each character data 1 at a time
            while (scan.hasNextLine()){
                
                
                String typeData, type, name;
                String[] typeToken;
                int strength = 0, dexterity = 0, constitution = 0, intelligence = 0, wisdom = 0, charisma = 0;
                
                
                typeData = scan.nextLine();
                typeToken = typeData.split("- ");   
                type = typeToken[0].substring(0, typeToken[0].length() - 1);    
                name = typeToken[1];
                
                
                for(int i = 0; i < 6; i++){
                    
                    // Tokenize stat field
                    String[] statToken = scan.nextLine().split(":");
                    
                    // This is the strength field
                    if(statToken[0].equals("Strength"))
                        strength = Integer.parseInt(statToken[1]);
                    
                    // This is the dexterity field
                    else if(statToken[0].equals("Dexterity"))
                        dexterity = Integer.parseInt(statToken[1]);
                        
                    // This is the constitution field
                    else if(statToken[0].equals("Constitution"))
                        constitution = Integer.parseInt(statToken[1]);
                        
                    // This is the intelligence field
                    else if(statToken[0].equals("Intelligence"))
                        intelligence = Integer.parseInt(statToken[1]);
                        
                    // This is the wisdom field
                    else if(statToken[0].equals("Wisdom"))
                        wisdom = Integer.parseInt(statToken[1]);
                        
                    // This is the charisma field
                    else if(statToken[0].equals("Charisma"))
                        charisma = Integer.parseInt(statToken[1]);
                }
                
                // We're now finished reading with 1 character, add it to the ArrayList
                characters.add(new Character(type, name, strength, dexterity, constitution, intelligence, wisdom, charisma));
                
                // Skip ALL empty lines
                if(scan.hasNextLine()){
                    if(scan.nextLine().equals(""))
                        continue;
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured while reading the file, the program will now exit.  Here are the logs: ");
            e.printStackTrace();
        }
    }
    
    /*
    // General printing function (w/o sorting parameters)
    public void PrintDatabase(){
        for(int i = 0; i < characters.size(); i++)
            System.out.println(characters.get(i).toString());
    }
    */
    
    // Another printing function, but based on the skill this time
    public void PrintSkillDatabase(String input){
        if(input.equals("strength")){
            System.out.println("Sorting by strength:");
		    Collections.sort(characters, Character.StrengthComp);       // Uses the StrengthComp comparator as developed in Character.java
		    for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringStrength());
	    }
	    else if(input.equals("dexterity")){
	        System.out.println("Sorting by dexterity:");
	        Collections.sort(characters, Character.DexterityComp);      // Uses the DexterityComp comparator as developed in Character.java
	        for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringDexterity());
	    }
	    else if(input.equals("constitution")){
	        System.out.println("Sorting by constitution:");
	        Collections.sort(characters, Character.ConstitutionComp);   // Uses the ConstitutionComp comparator as developed in Character.java
	        for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringConstitution());
	    }
	    else if(input.equals("intelligence")){
	        System.out.println("Sorting by intelligence:");
	        Collections.sort(characters, Character.IntelligenceComp);   // Uses the IntelligenceComp comparator as developed in Character.java
	        for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringIntelligence());
	    }
	    else if(input.equals("wisdom")){
	        System.out.println("Sorting by wisdom:");
	        Collections.sort(characters, Character.WisdomComp);         // Uses the WisdomComp comparator as developed in Character.java
	        for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringWisdom());
	    }
	    else if(input.equals("charisma")){
	        System.out.println("Sorting by charisma:");
	        Collections.sort(characters, Character.CharismaComp);       // Uses the CharismaComp comparator as developed in Character.java
	        for(int i = 0; i < characters.size(); i++)
                System.out.println(characters.get(i).toStringCharisma());
	    }
    }
    
}