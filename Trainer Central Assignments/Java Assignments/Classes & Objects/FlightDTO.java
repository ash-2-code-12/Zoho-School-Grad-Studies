// 3. Create Flight DTO class. Create appropriate instance variables, static variables and methods with appropriate access modifiers.

public class FlightDTO {
    
    private static String airlineName = "Global Airways";

    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public static String getAirlineName() {
        return airlineName;
    }

    public static void setAirlineName(String airlineName) {
        FlightDTO.airlineName = airlineName;
    }

}
