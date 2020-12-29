import java.util.ArrayList;

public class UserStore {
    private boolean passwordCheck;


    ArrayList<User> userDatabase = new ArrayList<>();

    public UserStore() {
    }

    public boolean addUser(String newUserName, String newUserSurName, String newUserPassword, String newUserPasswordCheck) {
        if (newUserPassword.contentEquals(newUserPasswordCheck)) {
            passwordCheck = true;

            User newUser = new User(newUserName, newUserSurName, newUserPassword);
            userDatabase.add(newUser);
        } else {
            passwordCheck = false;
        }
        return passwordCheck;
    }

    public ArrayList<User> getUserDatabase() {
        return userDatabase;
    }
}

/*
nog te maken:
    - login
    - delete user



 */