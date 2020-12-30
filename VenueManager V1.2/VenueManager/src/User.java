public class User {             // Declaration of the fields used in this class. userId is not yet in use.

    final private String userName;
    final private String userPassword;
    //private Integer userID;

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User (String userName, String userPassword ) {   // Initialising the fields with the constructor of this class.
    this.userName = userName;
    this.userPassword = userPassword;
    }
                                /* The toString method is overridden and used to return a user
                                overview. (for now only the username). */
@Override
    public String toString(){
    String userDataOverview = "\n-----------\n";
    userDataOverview += "\nName: " + userName;
    return userDataOverview;
    }
}

/* To-do:
TODO: Code a random Integer generator to generate a unique userID.
TODO: Find a way to use the userID to authenticate stuff in other classes.
TODO: Create getters for a access/login system.
TODO: Fix debugger comments
 */