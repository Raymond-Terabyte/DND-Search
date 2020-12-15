import java.util.*;
import java.io.*;

// This represents a single character
public class Character{
    
    // Store data in private variables
    private String type, name;
    private int strength, dexterity, constitution, intelligence, wisdom, charisma;
    
    // Nondefault constructor, takes in multiple parameters (the private variables)
    public Character(String type, String name, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.type = type;
        this.name = name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }
    
    // Multiple getters 
    public String GetType(){
        return type;
    }
    
    public String GetName(){
        return name;
    }
    
    public int GetStrength(){
        return strength;
    }
    
    public int GetDexterity(){
        return dexterity;
    }
    
    public int GetConstitution(){
        return constitution;
    }
    
    public int GetIntelligence(){
        return intelligence;
    }
    
    public int GetWisdom(){
        return wisdom;
    }
    
    public int GetCharisma(){
        return charisma;
    }
    
    // Create multiple comparators
    
    // Comparator for Strength
    public static Comparator<Character> StrengthComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetStrength() - c2.GetStrength();
        }    
    };
    
    // Comparator for Dexterity
    public static Comparator<Character> DexterityComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetDexterity() - c2.GetDexterity();
        }    
    };
    
    // Comparator for Constitution
    public static Comparator<Character> ConstitutionComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetConstitution() - c2.GetConstitution();
        }    
    };
    
    // Comparator for Intelligence
    public static Comparator<Character> IntelligenceComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetIntelligence() - c2.GetIntelligence();
        }    
    };
    
    // Comparator for Wisdom
    public static Comparator<Character> WisdomComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetWisdom() - c2.GetWisdom();
        }    
    };
    
    // Comparator for Charisma
    public static Comparator<Character> CharismaComp = new Comparator<Character>(){
        public int compare(Character c1, Character c2){
            return c1.GetCharisma() - c2.GetCharisma();
        }    
    };
    
    /*
    // Return a string represenation of a single character.
    // For purposes of this assignment, the string representation will simply look like a single character entry from the file
    public String toString(){
        return GetType() + " - " + GetName() + "\n" + "Strength:" + GetStrength() + "\n" + "Dexterity:" + GetDexterity() + "\n" 
                + "Constitution:" + GetConstitution() + "\n" + "Intelligence:" + GetIntelligence() + "\n"
                    + "Wisdom:" + GetWisdom() + "\n" + "Charisma:" + GetCharisma() + "\n";
    }
    */
    
    // ALso implement different toString forms, based on the skill selected
    public String toStringStrength(){
        return GetType() + " - " + GetName() + "\n" + "Strength: " + GetStrength() + "\n";
    }
    
    public String toStringDexterity(){
        return GetType() + " - " + GetName() + "\n" + "Dexterity: " + GetDexterity() + "\n";
    }
    
    public String toStringConstitution(){
        return GetType() + " - " + GetName() + "\n" + "Constitution: " + GetConstitution() + "\n";
    }
    
    public String toStringIntelligence(){
        return GetType() + " - " + GetName() + "\n" + "Intelligence: " + GetIntelligence() + "\n";
    }
    
    public String toStringWisdom(){
        return GetType() + " - " + GetName() + "\n" + "Wisdom: " + GetWisdom() + "\n";
    }
    
    public String toStringCharisma(){
        return GetType() + " - " + GetName() + "\n" + "Charisma: " + GetCharisma() + "\n";
    }
}