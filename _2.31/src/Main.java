import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        FlightSchedule flightSchedule = new FlightSchedule();
        List<Aircraft> aircraftList = new ArrayList<>();
        List<Airport> airportList = new ArrayList<>();
        List<Passenger> passengerList = new ArrayList<>();
        List<Ticket> ticketList = new ArrayList();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Aircraft");
            System.out.println("2. Add Airport");
            System.out.println("3. Add Passenger");
            System.out.println("4. Add Flight");
            System.out.println("5. Show Flight Schedule");
            System.out.println("6. Sell Ticket");
            System.out.println("7. View Aircraft");
            System.out.println("8. View Airports");
            System.out.println("9. View Passengers");
            System.out.println("10. View Flights");
            System.out.println("11. Delete Aircraft");
            System.out.println("12. Delete Flight");
            System.out.println("13. Delete Passenger");
            System.out.println("14. Delete Airport");
            System.out.println("15. Delete Ticket");
            System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (option) {
                case 1:
                    System.out.println("Enter Aircraft ID:");
                    String aircraftId = scanner.nextLine();
                    System.out.println("Enter Aircraft Model:");
                    String aircraftModel = scanner.nextLine();
                    System.out.println("Enter Aircraft Capacity:");
                    int aircraftCapacity = scanner.nextInt();

                    Aircraft aircraft = new Aircraft(aircraftId, aircraftModel, aircraftCapacity);
                    aircraftList.add(aircraft);
                    System.out.println("Aircraft added successfully.");
                    break;
                case 2:
                    System.out.println("Enter Airport Code:");
                    String airportCode = scanner.nextLine();
                    System.out.println("Enter Airport Name:");
                    String airportName = scanner.nextLine();

                    Airport airport = new Airport(airportCode, airportName);
                    airportList.add(airport);
                    System.out.println("Airport added successfully.");
                    break;
                case 3:
                    System.out.println("Enter Passenger ID:");
                    String passengerId = scanner.nextLine();
                    System.out.println("Enter Passenger Name:");
                    String passengerName = scanner.nextLine();

                    Passenger passenger = new Passenger(passengerId, passengerName);
                    passengerList.add(passenger);
                    System.out.println("Passenger added successfully.");
                    break;
                case 4:
                    System.out.println("Enter Flight ID:");
                    String flightId = scanner.nextLine();
                    System.out.println("Enter Departure Airport Code:");
                    String departureAirportCode = scanner.nextLine();
                    System.out.println("Enter Arrival Airport Code:");
                    String arrivalAirportCode = scanner.nextLine();
                    System.out.println("Enter Aircraft ID:");
                    String flightAircraftId = scanner.nextLine();
                    System.out.println("Enter Departure Date and Time (in dd/MM/yyyy HH:mm format):");
                    Date departureTime = null;
                    try {
                        departureTime = dateFormat.parse(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid date and time format.");
                        break;
                    }
                    System.out.println("Enter Arrival Date and Time (in dd/MM/yyyy HH:mm format):");
                    Date arrivalTime = null;
                    try {
                        arrivalTime = dateFormat.parse(scanner.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid date and time format.");
                        break;
                    }

                    Flight flight = new Flight(flightId, departureAirportCode, arrivalAirportCode, flightAircraftId, departureTime, arrivalTime);
                    flightSchedule.addFlight(flight);
                    System.out.println("Flight added to the schedule.");
                    break;
                case 5:
                    System.out.println("Flight Schedule:");
                    for (Flight f : flightSchedule.getFlights()) {
                        System.out.println("ID: " + f.getId());
                        System.out.println("Departure: " + f.getDepartureAirportCode());
                        System.out.println("Arrival: " + f.getArrivalAirportCode());
                        System.out.println("Departure: " + dateFormat.format(f.getDepartureTime()));
                        System.out.println("Arrival: " + dateFormat.format(f.getArrivalTime()));
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Enter Passenger ID:");
                    String ticketPassengerId = scanner.nextLine();
                    System.out.println("Enter Flight ID:");
                    String ticketFlightId = scanner.nextLine();
                    System.out.println("Enter Ticket Price:");
                    double ticketPrice = scanner.nextDouble();

                    Ticket ticket = new Ticket(UUID.randomUUID().toString(), ticketPassengerId, ticketFlightId, ticketPrice);
                    ticketList.add(ticket);
                    System.out.println("Ticket sold.");
                    break;
                case 7:
                    System.out.println("Aircrafts:");
                    for (Aircraft a : aircraftList) {
                        System.out.println("ID: " + a.getId());
                        System.out.println("Model: " + a.getModel());
                        System.out.println("Capacity: " + a.getCapacity());
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.println("Airports:");
                    for (Airport a : airportList) {
                        System.out.println("Code: " + a.getCode());
                        System.out.println("Name: " + a.getName());
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println("Passengers:");
                    for (Passenger p : passengerList) {
                        System.out.println("ID: " + p.getId());
                        System.out.println("Name: " + p.getName());
                        System.out.println();
                    }
                    break;
                case 10:
                    System.out.println("Flights:");
                    for (Flight f : flightSchedule.getFlights()) {
                        System.out.println("ID: " + f.getId());
                        System.out.println("Departure: " + f.getDepartureAirportCode());
                        System.out.println("Arrival: " + f.getArrivalAirportCode());
                        System.out.println("Departure: " + dateFormat.format(f.getDepartureTime()));
                        System.out.println("Arrival: " + dateFormat.format(f.getArrivalTime()));
                        System.out.println();
                    }
                    break;
                case 11:
                    System.out.println("Enter Aircraft ID to delete:");
                    String aircraftIdToDelete = scanner.nextLine();
                    for (Aircraft newaircraft : aircraftList) {
                        if (newaircraft.getId().equals(aircraftIdToDelete)) {
                            aircraftList.remove(newaircraft);
                            System.out.println("Aircraft deleted.");
                            break;
                        }
                    }
                case 12:
                    System.out.println("Enter Flight ID to delete:");
                    String flightIdToDelete = scanner.nextLine();
                    Flight flightToRemove = null;
                    for (Flight newflight : flightSchedule.getFlights()) {
                        if (newflight.getId().equals(flightIdToDelete)) {
                            flightToRemove = newflight;
                            break;
                        }
                    }
                    if (flightToRemove != null) {
                        flightSchedule.getFlights().remove(flightToRemove);
                        System.out.println("Flight deleted.");
                    } else {
                        System.out.println("Flight with the specified ID was not found.");
                    }
                    break;
                case 13:
                    System.out.println("Enter Passenger ID to delete:");
                    String passengerIdToDelete = scanner.nextLine();
                    Passenger passengerToRemove = null;
                    for (Passenger newpassenger : passengerList) {
                        if (newpassenger.getId().equals(passengerIdToDelete)) {
                            passengerToRemove = newpassenger;
                            break;
                        }
                    }
                    if (passengerToRemove != null) {
                        passengerList.remove(passengerToRemove);
                        System.out.println("Passenger deleted.");
                    } else {
                        System.out.println("Passenger with the specified ID was not found.");
                    }
                    break;
                case 14:
                    System.out.println("Enter Airport Code to delete:");
                    String airportCodeToDelete = scanner.nextLine();
                    Airport airportToRemove = null;
                    for (Airport newairport : airportList) {
                        if (newairport.getCode().equals(airportCodeToDelete)) {
                            airportToRemove = newairport;
                            break;
                        }
                    }
                    if (airportToRemove != null) {
                        airportList.remove(airportToRemove);
                        System.out.println("Airport deleted.");
                    } else {
                        System.out.println("Airport with the specified code was not found.");
                    }
                    break;
                case 15:
                    System.out.println("Enter Ticket ID to delete:");
                    String ticketIdToDelete = scanner.nextLine();
                    Ticket ticketToRemove = null;
                    for (Ticket newticket : ticketList) {
                        if (newticket.getId().equals(ticketIdToDelete)) {
                            ticketToRemove = newticket;
                            break;
                        }
                    }
                    if (ticketToRemove != null) {
                        ticketList.remove(ticketToRemove);
                        System.out.println("Ticket deleted.");
                    } else {
                        System.out.println("Ticket with the specified ID was not found.");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}