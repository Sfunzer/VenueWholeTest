import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReservationStore {
    final private ArrayList<Reservation> reservationList = new ArrayList<>();
    
    public ReservationStore () {
    }

    public Boolean addReservation(String name, String info, String start, String stop) {

        LocalDateTime startParse = LocalDateTime.parse(start);
        LocalDateTime stopParse = LocalDateTime.parse(stop);
        boolean duplicateCheck = false;

        Reservation newReservation = new Reservation(name, info, startParse, stopParse);


        for (int i = 0; i < reservationList.size(); i++)
        {
            Reservation show = reservationList.get(i);
            LocalDate startCompare = startParse.toLocalDate();
            LocalDate inputCompare = show.reservationStart.toLocalDate();

            if (startCompare.equals(inputCompare)) {
                duplicateCheck = true;
                break;
            }

        }

        reservationList.add(newReservation);

        return duplicateCheck;
    }



    public ArrayList<Reservation> getReservationList() {
        return reservationList;

    }


}

/* to-do
- reservering verwijderen toevoegen.
- toevoegen van equipment vanuit een selectielijst.

latere iteratie:

 */

