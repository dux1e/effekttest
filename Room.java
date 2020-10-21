
/**
 * Write a description of class Room here.
 *
 * @author Joakim Christensen
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Room {
    // Instance Variables
    private String name;
    private int capacity;
    private ArrayList<Attendee> attendees;

    // Constructor
    public Room(String name, int capacity) {
        this.name = name;
        if(capacity < 0) {
            capacity = 0;
        } else {
            this.capacity = capacity;
        }
        attendees = new ArrayList<>();
    }

    // Accessor Functions
    public void printInfo() {
        System.out.println("Name of the room: " + name);
        System.out.println("Capacity of the room: " + capacity);
        System.out.println("");
        System.out.println("Information about attendees");
        System.out.println("");
        for(Attendee attendee : attendees) {
            attendee.printInfo();
        }
    }
    
    public int getCollectiveExperience() {
        int total = 0;
        for(Attendee attendee : attendees) {
            total += attendee.getExperience();
        }
        return total;
    }
    
    public Attendee getAttendeWithExperienceOver() {
        return null;
    }
    
    public Attendee getAttendeeWithMostExpericence() {
        int maxi = 0;
        int i = 0;
        Attendee attendee = attendees.get(0);
        int maxExp = attendee.getExperience();
        while(i < attendees.size()) {
            attendee = attendees.get(i);
            if(attendee.getExperience() > maxExp) {
                maxExp = attendee.getExperience();
                maxi = i;
            } else {
                i++;
            }
        }
        return attendees.get(maxi);
    }
    
    public ArrayList<Attendee> getAttendeesBetweenTwoValues(int lowYear, int highYear) {
        ArrayList<Attendee> returnList = new ArrayList<>();
        for(Attendee attendee : attendees) {
            if(attendee.getExperience() >= lowYear && attendee.getExperience() <= highYear) {
                returnList.add(attendee);
            }
        }
        return returnList;
    }

    // Mutator Functions
    public void addAttendee(Attendee attendee) {
        if(attendees.size() < capacity) {
            attendees.add(attendee);
        }
    }
}
