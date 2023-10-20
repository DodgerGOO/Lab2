import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FlightSchedule {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return Collections.unmodifiableList(flights);
    }
}