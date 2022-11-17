package agenda;
import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    private ArrayList<Event> thevents = new ArrayList<>();

    public Agenda() {
    }
    public Agenda(ArrayList<Event> thevents) {
        this.thevents = thevents;
    }

    public void addEvent(Event e) {
        thevents.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public ArrayList<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> eventsToDay = new ArrayList<>();
        for (Event e : thevents){
            if (e.isInDay(day)){
                eventsToDay.add(e);
            }
        }
        return eventsToDay;
    }
}
