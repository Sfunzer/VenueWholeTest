import java.util.ArrayList;

public class UserStore {    // Declaration of the Arraylist used to store users. We don't have any other variables in this class.
    private ArrayList<User> userDatabase;

    public UserStore() {    // And of course we want/need to initialise it.
        userDatabase = new ArrayList<>();
    }
                            /* The addUser method creates a new user object and stores it in the userDatabase ArrayList.
                            The method also contains a check to see if the password is entered in the right way. If this is the case,
                            the method will return a true boolean, and the user is created as well.
                             */
    public boolean addUser(String newUserName, String newUserPassword, String newUserPasswordCheck) {
        boolean passwordCheck;

        if (newUserPassword.contentEquals(newUserPasswordCheck)) {
            passwordCheck = true;
            User newUser = new User(newUserName, newUserPassword);
            userDatabase.add(newUser);
        } else {
            passwordCheck = false;
        } return passwordCheck;
    }
                            /* The method getUserDatabase is used to return the ArrayList with all the User objects so the main class
                               can generate a user list.*/
    public ArrayList<User> getUserDatabase() {
        return userDatabase;
    }
}

/* To-do:
TODO: Create a access/login method so users need to be authenticated before they can use the application.
TODO: Create a method to delete a user from the user database.
 */