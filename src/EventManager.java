
import java.util.*;

class EventManager {
    private List<Event> events;

    public EventManager() {
        this.events = new ArrayList<>();
    }

    public void createEvent(String title, String location, Date date, int capacity) {
        Event event = new Event(title, location, date, capacity);
        events.add(event);
        System.out.println("Event created: " + event);
    }

    public void editEvent(Event event, String title, String location, Date date, int capacity) {
        event = new Event(title, location, date, capacity);
        System.out.println("Event updated: " + event);
    }

    public void deleteEvent(Event event) {
        events.remove(event);
        System.out.println("Event deleted: " + event.getTitle());
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Event> searchEvents(String keyword) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.getTitle().contains(keyword) || event.getLocation().contains(keyword)) {
                result.add(event);
            }
        }
        return result;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
