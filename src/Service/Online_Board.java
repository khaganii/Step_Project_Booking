package Service;

import Controller.GetAllFlights;
import Libraries.Flights;

import java.util.List;

public class Online_Board {
  GetAllFlights getAllFlights = new GetAllFlights();
  public String showAllflights()
  {
    return getAllFlights.showAll();
  }
}
