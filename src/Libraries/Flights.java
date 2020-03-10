package Libraries;

import DAO.Dao;

public class Flights implements Dao<Flights> {
  private int id;
  private String from;
  private String to;
  private String time;
  private int seats;

  public Flights(int id, String from, String to, String time, int seats){
    this.setId(id);
    this.setFrom(from);
    this.setTo(to);
    this.setTime(time);
    this.setSeats(seats);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public int getSeats() {
    return seats;
  }

  public void setSeats(int seats) {
    this.seats = seats;
  }
}
