import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReservationStore {          //Declaration of the fields which will contain all reservation objects.
    final private ArrayList<Reservation> reservationList;
    
    public ReservationStore () {        //Initialising of the Arraylist which will contain all reservation objects.
        reservationList = new ArrayList<>();
    }
                                        /* The addReservation method takes in all necessary parameters to construct a Reservation object. Before the object is
                                        created, this method first checks if there isn't already another reservation on the same day. It will return a true boolean
                                        (because double reservation is true) and there's no object created. */
    public Boolean addReservation(Reservation newReservation) {
        boolean dateAlreadyBooked = false;

        //LocalDateTime startParse = LocalDateTime.parse(newReservation.reservationStart);
        //LocalDateTime stopParse = LocalDateTime.parse(newReservation.reservationStop);

        for (Reservation show : reservationList) {
            if (show.getReservationStart().toLocalDate().equals(newReservation.getReservationStart().toLocalDate())) {
                dateAlreadyBooked = true;
                break;
            }
        }
        if (!dateAlreadyBooked) {
            //Reservation newReservation = new Reservation(reservationName, reservationLocation, reservationInfo, madeByUser, startParse, stopParse);
            reservationList.add(newReservation);
        }
        return dateAlreadyBooked; }

                                        /*The method getReservationList returns the ArrayList containing all Reservation objects.
                                        With this, it's possible to create an reservation overview. */
    public ArrayList<Reservation> getReservationList() {
        return reservationList;

    }
}

/* To-do:
TODO: Create a method to delete a reservation from the reservation database.
TODO: Integrate a reservationId
TODO: Create a way to add equipment to a reservation, preferable trough a selection.
TODO: Upgrade the double reservation check system so it can check multiple day events.
TODO: change addReservation so it passes an object instead of creating it.
 */