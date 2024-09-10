
abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract void showOptions();
}

class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public void showOptions() {
        System.out.println("Admin options: Manage users, Manage events, View reports.");
    }
}

class EventOrganizer extends User {
    public EventOrganizer(String name, String email) {
        super(name, email);
    }

    @Override
    public void showOptions() {
        System.out.println("Organizer options: Create event, Edit event, Delete event.");
    }
}

class Attendee extends User {
    public Attendee(String name, String email) {
        super(name, email);
    }

    @Override
    public void showOptions() {
        System.out.println("Attendee options: Register for event, View events.");
    }
    public boolean  registerUserForEvent(Event event, User user,int amount) {
        if (event.getAttendees().size() < event.getCapacity()) {
            event.addAttendee(user.getEmail());
            System.out.println(user.getName() + " registered for " + event.getTitle());
        } else {
            System.out.println("Event is full.");
        }
        System.out.println("Processing payment of $" + amount + " for event: " + event.getTitle() + " by user: " + user.getName());

        // Simulate different payment methods and return success or failure
        if (amount > 0) {
            System.out.println("Payment successful for event: " + event.getTitle());
            return true;
        } else {
            System.out.println("Payment failed for event: " + event.getTitle());
            return false;
        }
    }
}
