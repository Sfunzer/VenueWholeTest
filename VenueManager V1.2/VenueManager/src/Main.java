public class Main {

    /*Welcome to VenueManager. This piece of software is meant to organise the events and equipment in a cultural venue.
    Please beware of the fact that this code is still under development. If you encounter any bugs, please let me know.
    you can send an e-mail to: sven@furusupport.nl
     */

    static UserStore mainUsers;                 //Let's declare the main fields for the application.
    static Warehouse mainWareHouse;
    static ReservationStore mainReservations;
    static User newUser;

    static boolean userAddSuccessful;
    static boolean doubleReservation;
    static boolean deleteSuccessful;

    static String activeUser;
    static String warehouseSearchKey;


    public static void main(String[] args) {
        mainUsers = new UserStore(); //And of course initialise everything what we can at this moment.
        mainWareHouse = new Warehouse();
        mainReservations = new ReservationStore();

        userAddSuccessful = false;
        doubleReservation = false;
        deleteSuccessful = false;


        // let's start with adding a user:

        newUser = new User("Sven de Hoog", "cherrycoke1");
        //mainUsers.addUser("Sven de Hoog", "cherrycoke1", "cherrycoke1");

        userAddSuccessful = mainUsers.addUser(newUser, "cherrycoke1");
        if (!userAddSuccessful) {                //checking if user creation met all requirements.
            System.out.println("The password doesn't match. Creating user has failed.");
        } else {
            System.out.println("User is successfully created");
        }

        // Let's continue with filling up the the warehouse with some equipment:
        Equipment ssl200 = new Equipment("SSL L200", 1, 4, 0, "36 faders");
        mainWareHouse.addEquipment(ssl200);
        Equipment ssl100 = new Equipment("SSL L100", 2, 25, 0, "Svens Favorite");
        mainWareHouse.addEquipment(ssl100);
        Equipment avioUSB = new Equipment("Dante Avio USB", 3, 350, 95, "needs PoE");
        mainWareHouse.addEquipment(avioUSB);
        Equipment sb3224 = new Equipment("SSL SB32.24", 4, 9, 250000, "without LK37 System");
        mainWareHouse.addEquipment(sb3224);
        Equipment sm58 = new Equipment("Shure SM58", 5, 10, 120, "You can use this microphone also as a hammer");
        mainWareHouse.addEquipment(sm58);
        Equipment oc818 = new Equipment("Austrian Audio OC818", 6, 2, 1750, "A mighty microphone. Great for surround recordings!");
        mainWareHouse.addEquipment(oc818);

        //let's see what we created so far. We'll start with the user list, and then follow with the Warehouse inventory:

        System.out.println("User list:\n");
        for (Object userList : mainUsers.getUserDatabase()) {           //Printing the user list.
            System.out.println(userList.toString());
        }
        System.out.println("\nInventory list:\n");
        for (Object inventoryList : mainWareHouse.getInventory()) {       //Printing the Warehouse Inventory.
            System.out.println(inventoryList.toString());
        }

        //let's make a few reservations. For now there is no login module, so we are going to set a user to "active"
        activeUser = "Sven de Hoog";

        /*The reservation system already has a feature to check if there isn't already a booked event on the same day. if this occurs the object/method wil return a
        true boolean. With a simple if/else statement, the user is then informed if the reservation was successful or not.

        At the moment this check only works with day-based reservations. In one of the next iterations the application should be able to check multiple-day events.
         */



        Reservation elbow = new Reservation ("Elbow", "Jodrel Banks", "Needs Digico and D&B PA", activeUser, "2016-03-10T21:00:00", "2016-03-10T23:15:00");
        Reservation queen = new Reservation("Queen", "Wembley Stadium", "Needs Midas H3000 and StageCo Stack", activeUser, "1980-03-10T21:00:00", "2080-03-10T23:15:00");
        Reservation chrisRea = new Reservation("Chris Rea", "The road home", "Needs red lights all around", activeUser, "2020-12-24T18:00:00", "2020-12-26T23:59:59");




        doubleReservation = mainReservations.addReservation(elbow);
        //If/else point to check if the reservation checks the requirements. And yes, for now we have some duplicate code in here. this will be fixed as well.
        if (doubleReservation) {
            System.out.println("Date/Time is already booked. Reservation is not made.");
        } else {
            System.out.println("Reservation Made");
        }


        doubleReservation = mainReservations.addReservation(queen);
        if (doubleReservation) {
            System.out.println("Date/Time is already booked. Reservation is not made.");
        } else {
            System.out.println("Reservation Made");
        }
        doubleReservation = mainReservations.addReservation(chrisRea);
        if (doubleReservation) {
            System.out.println("Date/Time is already booked. Reservation is not made.");
        } else {
            System.out.println("Reservation Made");
        }

        //These are two of the same reservations as above to show the checking system.
        doubleReservation = mainReservations.addReservation(queen);
        if (doubleReservation) {
            System.out.println("Date/Time is already booked. Reservation is not made.");
        } else {
            System.out.println("Reservation Made");
        }
        doubleReservation = mainReservations.addReservation(chrisRea);
        if (doubleReservation) {
            System.out.println("Date/Time is already booked. Reservation is not made.");
        } else {
            System.out.println("Reservation Made");
        }

        System.out.println("\nReservation list:\n");                                  //Let's see the reservation list:
        for (Object reservationList : mainReservations.getReservationList()) {       //Printing the reservation list.
            System.out.println(reservationList.toString());
        }

        /* So now that we have a working application with some equipment and reservations onboard, let see what else we can do already.
        for now we'll be focusing on the Equipment system, as the user system only contains
        the addUser method and returnUserDatabase method which we already saw. The same goes for the Reservation system, which at this moment only has the
        addReservation method and getReservationList method. Both will be expanded in one of the next iterations of course. So let's continue with the Equipment
        and Warehouse classes:

         Within the Warehouse class, we can do two additional things: search for equipment, and delete equipment. We will use both a few times to give a really
         good look at their functionality. Let's start with searching:
         */

        warehouseSearchKey = "SSL";
        System.out.println("\nSearch results after a search for " + warehouseSearchKey + ":\n");            //Let's try SSL, which is in our warehouse.
        if (mainWareHouse.searchInventory(warehouseSearchKey).size() == 0) {
            System.out.println("found nothing\n");
        } else {
            for (Object searchResults : mainWareHouse.searchInventory(warehouseSearchKey)) {
                System.out.println(searchResults.toString());
            }
        }

        warehouseSearchKey = "Yamaha";
        System.out.println("\nSearch results after a search for " + warehouseSearchKey + ":\n");            //Now let's try Yamaha, which isn't in our warehouse.
        if (mainWareHouse.searchInventory(warehouseSearchKey).size() == 0) {
            System.out.println("found nothing\n");
        } else {
            for (Object searchResults : mainWareHouse.searchInventory(warehouseSearchKey)) {
                System.out.println(searchResults.toString());
            }
        }

        /* As you can see, the search method works, and also has a simple way of managing no results. Again, I know this is using duplicate code.
        This will be taken care of in a next iteration. Let's continue to the delete method:

        we're going to delete one of the SSL entries (The SSL L100) removal of an Equipment object happens based on the entered equipmentId. This minimizes the risk of
        deleting the wrong equipment by using a wrong keyword.
         */

        deleteSuccessful = mainWareHouse.deleteEquipment(2);
                if (deleteSuccessful) {
                    System.out.println("Equipment is deleted");
                } else {
                    System.out.println("There is no equipment with this ID in the inventory");
                }
        // let's see if the removal worked by viewing the complete inventory:

        System.out.println("\nInventory list:\n");
        for (Object inventoryList : mainWareHouse.getInventory()) {       //Printing the Warehouse Inventory.
            System.out.println(inventoryList.toString());
        }

        // And let's search for the SSL L100 as well:

        warehouseSearchKey = "SSL L100";
        System.out.println("\nSearch results after a search for " + warehouseSearchKey + ":\n");
        if (mainWareHouse.searchInventory(warehouseSearchKey).size() == 0) {
            System.out.println("found nothing\n");
        } else {
            for (Object searchResults : mainWareHouse.searchInventory(warehouseSearchKey)) {
                System.out.println(searchResults.toString());
            }
        }

        /* So that's everything so far. as mentioned earlier the application isn't finished, so stay tuned for more! So what can we expect in the future?
            - no duplicate code in the main class.
            - Use of the equipment object in a reservation.
            - An upgraded double reservation check system.
            - Probably a few more things i can't think of at this moment.
         */

    }
}

/* To-do:
TODO: Turn duplicate code into methods in here, or in classes is possible. 26-12: or possible acces layer?
 */