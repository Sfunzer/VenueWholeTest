import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Reservation {
 
    final private String reservationName;
    final private String reservationInfo;
    final private Integer reservationId;

    final LocalDateTime reservationStart;
    final LocalDateTime reservationStop;
    final private Long reservationDuration;




    public Reservation (String reservationName, String reservationInfo, LocalDateTime startReservation, LocalDateTime stopReservation) {
        this.reservationName = reservationName;
        this.reservationInfo = reservationInfo;
        this.reservationStart = startReservation;
        this.reservationStop = stopReservation;

        reservationDuration = ChronoUnit.HOURS.between(startReservation, stopReservation);
    }

    @Override
    public String toString(){
        String resultaat = "the " + reservationName + " show";
        resultaat += "\nIt starts at: " + reservationStart + "and will run til " + reservationStop;
        resultaat += "\nThis producation will run for the duration of: " + reservationDuration + " hours";
        resultaat += "\nExtra production info: " + reservationInfo;
        resultaat += "\n----------------------------\n\n";
        return resultaat;

    }

}

/* To-do:
- ReservationId genereren + getter.
 */


