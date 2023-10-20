class Ticket {
    private String id;
    private String passengerId;
    private String flightId;
    private double price;

    public Ticket(String id, String passengerId, String flightId, double price) {
        this.id = id;
        this.passengerId = passengerId;
        this.flightId = flightId;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}