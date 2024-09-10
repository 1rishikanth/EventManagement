import java.util.Date;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        NotificationService notificationService = new NotificationService();
       // PaymentProcessor paymentProcessor = new PaymentProcessor();
        AdminManager adminManager = new AdminManager();

        // Create users
        Admin admin = new Admin("Admin1", "admin1@example.com");
        EventOrganizer organizer = new EventOrganizer("Organizer1", "organizer1@example.com");
        Attendee attendee = new Attendee("Attendee1", "attendee1@example.com");

        // Admin adding users
        adminManager.addUser(admin);
        adminManager.addUser(organizer);
        adminManager.addUser(attendee);

        // Organizer creating an event
        eventManager.createEvent("Tech Conference", "New York", new Date(), 100);
        try {
            List<Event> events = eventManager.getEvents();
            if(events.isEmpty()){
                throw new Exception("There is no events");
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        // Attendee registering for event
        Event event = eventManager.getEvents().get(0);
       boolean paymentStatus = attendee.registerUserForEvent(event, attendee,0);

        //Search events
        List<Event> res = eventManager.searchEvents("Tech");
        if(res.isEmpty()){
            System.out.println("There is no event with the given keyword");
        }else{
        System.out.println("The searched event" + res);
        }
        // Sending notification
        notificationService.sendEmail(attendee.getEmail(), "You are registered for " + event.getTitle());

        // Payment
     //   boolean paymentStatus = paymentProcessor.processPayment(attendee, event, 0);

        if (paymentStatus) {
            System.out.println("Payment completed successfully for the event.");
        } else {
            System.out.println("Payment failed.");
        }

        // Admin can see users
        for (User user : adminManager.getUsers()) {
            System.out.println("User: " + user.getName());
        }
    }
}
