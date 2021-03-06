import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Reservation {              //Declaration of the fields needed to build a reservation object. reservationId has yet to be integrated.
    //final private Integer reservationId;

    final private String reservationName;
    final private String reservationLocation;
    final private String reservationUser;
    final private String reservationInfo;

    final LocalDateTime reservationStart;
    final LocalDateTime reservationStop;
    final private Long reservationDuration;

                                        /* Initialising the fields with the help of the constructor parameters. The constructor also calculates the duration
                                        of the created show/object in hours, and stores this value in the reservationDuration variable. */
    public Reservation (String reservationName, String reservationLocation, String reservationInfo, String reservationUser, LocalDateTime startReservation, LocalDateTime stopReservation) {
        this.reservationName = reservationName;
        this.reservationLocation = reservationLocation;
        this.reservationUser = reservationUser;
        this.reservationInfo = reservationInfo;

        this.reservationStart = startReservation;
        this.reservationStop = stopReservation;
        reservationDuration = ChronoUnit.HOURS.between(startReservation, stopReservation);
    }
                                    /* The toString method is overridden and used to return a reservation
                                    overview in a string variable. */
    @Override
    public String toString(){
        String reservationOverview = "Show/Reservation: " + reservationName;
        reservationOverview += "\nTakes place at: " + reservationLocation;
        reservationOverview += "\nShowtime: " + reservationStart;
        reservationOverview += "\nCurfew: " + reservationStop;
        reservationOverview += "\nShow length: " + reservationDuration + " hours";
        reservationOverview += "\nProduction info: " + reservationInfo;
        reservationOverview += "\nShow Producer: " + reservationUser;
        reservationOverview += "\n----------------------------\n\n";
        return reservationOverview;

    }

}

/* To-do:
TODO: Create a random Integer ReservationId generator, with a getter.
 */


