
/**
 * Write a description of class Attendee here.
 *
 * @author Joakim Christensen
 * @version 19-20-2020
 */
public class Attendee {
    // Instance Variables
    private String name;
    private int experience;

    // Constructor
    public Attendee(String name, int experience) {
        this.name = name;
        if(experience >= 0) {
            this.experience = experience;
        } else {
            experience = 0;
        }
    }

    // Accessor Functions
    public String getName() {
        return name;
    }
    
    public int getExperience() {
        return experience;
    }
    
    public void printInfo() {
        System.out.println("Name:" + name);
        System.out.println("Experience: " + experience);
        System.out.println("");
    }

    // Mutator Functions

}
