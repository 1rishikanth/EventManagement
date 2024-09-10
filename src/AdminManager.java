
import java.util.*;

class AdminManager {
    private List<User> users;

    public AdminManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getName());
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User removed: " + user.getName());
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
