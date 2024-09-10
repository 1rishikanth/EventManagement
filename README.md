## Getting Started:

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure:

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

This event management system is designed to help users manage and interact with events easily. The project includes several key features:

### 1.User Management:
Different types of users (like event organizers, attendees, and administrators) can use the system. Each user has specific roles and permissions. For example, organizers can create and manage events, attendees can register for events and pay for thier registeredevent, and administrators can manage everything.

### 2.Event Creation and Management:
These events have details like the event's name, date, location, and capacity (how many people can attend). 

### 3.EventManagement:
Event organizers or manager can create, edit, or delete events.Organizers can update these details whenever needed.
Users can search for events using different criteria such as:
   -Keyword: Search by event name.
This helps users quickly find events they are interested in.

### 4.User Notifications:
The system sends notifications (via email or SMS) to users about important updates. For example, users can be notified when they successfully register for an event or when an event is updated.

### 6.Admin Management:
Admins can manage user accounts, track how many events are happening in a given month, and see how many people have registered for each event. This helps them keep everything organized.

### 7.Main:
In This class for every other class object is created and called using dot method and input is passed in contructor

### Example Flow:
- An event organizer creates a new event.
- Users search for events using keywords like "Tech Conference" or filter by location and date.
- When they find an event they like, they register and make a payment if required.
- The system confirms their registration and sends a notification to them.

This project is built using Java, with Object-Oriented Programming (OOP) concepts,easy to maintain.