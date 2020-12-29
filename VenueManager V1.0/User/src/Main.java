import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {

            boolean userAddCheck;
            UserStore newUserGroup = new UserStore();


        //let's add some users for testing:
            userAddCheck = newUserGroup.addUser("Sven", "de Hoog", "baklava123", "baklava123");

            if(userAddCheck) {
                System.out.println("User is succesfully added.");
            } else {
                System.out.println("Password doesn't match. Please try again.");
            }

            userAddCheck = newUserGroup.addUser("Kees", "de Laag", "bakfietslava123", "bakfietslava123");

            if(userAddCheck) {
                System.out.println("User is succesfully added.");
            } else {
                System.out.println("Password doesn't match. Please try again.");
            }


        System.out.println("let's print out the userlist:");
        ArrayList<User> test1 = newUserGroup.userDatabase;
        for (Object viewHelper : test1) {
            String samenvatting = viewHelper.toString();
            System.out.println(samenvatting);
        }

            System.out.println("let's test the password error check:");

        userAddCheck = newUserGroup.addUser("Kaass", "de Piagag", "bakfietslava123", "bakfie123");

            if(userAddCheck) {
                System.out.println("User is succesfully added.");
            } else {
                System.out.println("Password doesn't match. Please try again.");
            }




    }
    /*
    public void AddUserMain (ArrayList<User> newUserGroup, String name, String surName, String password, String passwordcheck){

    }
    */
     
}

