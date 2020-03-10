package Controller;

public class Passengers {
  private String name;
  private String surname;
  private int flight_id;
  private int passenger_id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getFlight_id() {
    return flight_id;
  }

  public void setFlight_id(int flight_id) {
    this.flight_id = flight_id;
  }

  public int getPassenger_id() {
    return passenger_id;
  }

  public void setPassenger_id(int passenger_id) {
    this.passenger_id = passenger_id;
  }
}

