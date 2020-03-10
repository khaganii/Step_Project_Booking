package Service;

import Controller.GetAllFlights;

public class ShowFlightInfo {
  GetAllFlights getAllFlights = new GetAllFlights();
  public String showInfo(int id)
  {
    return getAllFlights.showFlight(id);
  }

}
