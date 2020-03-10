package Controller;

import DAO.Dao;
import Libraries.Flights;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllFlights implements Dao{
  ArrayList<Flights> flightsArrayList = new ArrayList<>();

  public List<Flights> read() {
    ArrayList<String> arrayList = new ArrayList<>();
    try {
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\khagani\\IdeaProjects\\StepPtojectBooking\\src\\Libraries\\all_flights.txt"));
      String st;
      while ((st = br.readLine()) != null)
      {
        arrayList.add(st);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return makeFlight(arrayList);
  }

  public void write() {

  }

  public String represent(Flights flight){
    return "    - Flight ID: " + flight.getId() + " , From " + flight.getFrom() + " To " + flight.getTo() + " , Date: " + flight.getTime() + " , free seats: " + flight.getSeats();
  }

  public List<Flights> makeFlight(List<String> list){
    for (String s : list) {
      String[] arr = s.split(",");
      flightsArrayList.add(new Flights(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4])));
    }
    return flightsArrayList;
  }

  public String showAll(){
    ArrayList<Flights> flights = new ArrayList<>(read());
    StringBuilder sb = new StringBuilder();
    for (Flights flight : flights) {
      sb.append(represent(flight));
      sb.append("\n");
    }
    return sb.toString();
  }
  public String showFlight(int id)
  {
    ArrayList<Flights> flights = new ArrayList<>(read());
    String a = "";
    for (Flights flight : flights) {
      if (flight.getId() == id){
        a = represent(flight);
        break;
      }
    }
    return a;
  }
}
