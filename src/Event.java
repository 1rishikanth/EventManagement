
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Event {
    private String title;
    private String location;
    private Date date;
    private int capacity;
    private List<String> attendees;

    public Event(String title, String location, Date date, int capacity) {
        this.title = title;
        this.location = location;
        this.date = date;
        this.capacity = capacity;
        this.attendees = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public Date getDate() {
        return date;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    public void addAttendee(String attendeeEmail) {
        if (attendees.size() < capacity) {
            attendees.add(attendeeEmail);
        } else {
            System.out.println("Event is full.");
        }
    }

    @Override
    public String toString() {
        return title + " at " + location + " on " + date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAttendees(List<String> attendees) {
        this.attendees = attendees;
    }
}

