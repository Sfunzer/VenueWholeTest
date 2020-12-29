import java.util.ArrayList;

public class Main {
    

    public static void main(String[] args) {

       ReservationStore effenaarAgenda = new ReservationStore();
       ArrayList<Reservation> retrieve;
       Boolean doubleReservation;

        effenaarAgenda.addReservation("Queen", "Live at Wembley",  "1986-07-16T21:00:00",  "1986-07-16T23:15:30");
        effenaarAgenda.addReservation("RHCP", "Live at Hyde Park",  "2001-07-16T21:00:00",  "2001-07-18T23:15:30");
        effenaarAgenda.addReservation("Metallica", "Live at Pink Pop",  "2019-08-16T21:00:00",  "2019-08-16T23:15:30");
        effenaarAgenda.addReservation("Elbow", "Live at Jodrel",  "2016-03-10T21:00:00",  "2016-03-10T23:45:30");

        System.out.print("\nLet's start with showing the pre-made reservations:\n\n");


        retrieve = effenaarAgenda.getReservationList();

        for (Object viewHelper : retrieve) {
            String samenvatting = viewHelper.toString();
            System.out.println(samenvatting);
        }

        System.out.print("Now let's add the same show again, but with a different time. We should receive an error:\n");
        doubleReservation = effenaarAgenda.addReservation("Elbow", "Live at Jodrel",  "2016-03-10T19:00:00",  "2016-03-10T23:45:30");

        if (doubleReservation) {
            System.out.println("Error. There's a duplicate");
        }

        System.out.println("Application is done");

        //we receive an error because the system checks on date.

        
        




    


    }
}
