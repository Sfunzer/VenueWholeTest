import java.util.ArrayList;

public class UserStore {    // Declaration of the Arraylist used to store users. We don't have any other variables in this class.
    private ArrayList<User> userDatabase;
    private boolean check;

    public UserStore() {    // And of course we want/need to initialise it.

        userDatabase = new ArrayList<>();
        check = false;
    }
                            /* The addUser method creates a new user object and stores it in the userDatabase ArrayList.
                            The method also contains a check to see if the password is entered in the right way. If this is the case,
                            the method will return a true boolean, and the user is created as well.
                             */
    public boolean addUser(User newUserRegistration, String newUserPasswordCheck) {
        boolean passwordCheck;

        if (newUserRegistration.getUserPassword().contentEquals(newUserPasswordCheck)) {
            passwordCheck = true;
            //User newUser = new User(newUserName, newUserPassword);
            userDatabase.add(newUserRegistration);
        } else {
            passwordCheck = false;
        } return passwordCheck;
    }
                            /* The method getUserDatabase is used to return the ArrayList with all the User objects so the main class
                               can generate a user list.*/
    public ArrayList<User> getUserDatabase() {
        return userDatabase;
    }


    public boolean deleteUser(String userName) {
        for (int i = 0; i < userDatabase.size(); i++) {
            User toCheck = userDatabase.get(i);
            if (toCheck.getUserName().equals(userName)) {
                check = true;
                userDatabase.remove(i);
            }
        }    return check;}

}

/* To-do:
TODO: Create a access/login method so users need to be authenticated before they can use the application.
TODO: Create a method to delete a user from the user database. Started on 25-12, needs to be tested.
TODO: Change adduser so it passes an object. Fixed on 25-12-2020
 */