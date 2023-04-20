package obj.objects;

import obj.Enum.Banned;

import java.util.ArrayList;
import java.util.Date;

public class GymClass {
    protected String name;
    protected String description;
    protected Date date;
    protected int duration;
    protected int maxCapacity;
    //protected ArrayList<CrearUser> attendees;

    protected Banned banned;
    // Constructor, getters y setters

    public GymClass(String name, String description, Date date, int duration, int maxCapacity, Banned banned) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.duration = duration;
        this.maxCapacity = maxCapacity;
        //this.attendees = new ArrayList<CrearUser>();
        this.banned = banned;
    }

    @Override
    public String toString() {
        return "GymClass{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", maxCapacity=" + maxCapacity +
               // ", attendees=" + attendees +
                '}';
    }

}

