package Controller;

import Libraries.Flights;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Fill_Files_with_Randoms {
  GetAllFlights getAllFlights = new GetAllFlights();
  public void fillFlights(){
    Map<String, Integer> Cities_seats = new HashMap<>();
    Cities_seats.put("Baku", 20);
    Cities_seats.put("London", 15);
    Cities_seats.put("Paris", 15);
    Cities_seats.put("Moscow", 20);
    Cities_seats.put("Berlin", 10);
    Cities_seats.put("Barcelona", 10);
    Cities_seats.put("Istanbul", 20);
    Cities_seats.put("Madrid", 15);
    Cities_seats.put("Chicago", 25);
    Cities_seats.put("Roma", 15);
    Cities_seats.put("Vienna", 10);
    Cities_seats.put("Porto", 10);
    Cities_seats.put("Helsinki", 15);
    Cities_seats.put("Sydney", 25);
    Cities_seats.put("Beijing", 25);

    StringBuilder sb = new StringBuilder();
    ArrayList<String> cities = new ArrayList<>(Cities_seats.keySet());
    for (int i = 0; i < 15; i++) {
      sb.append(i+1);
      sb.append(",");
      sb.append("Kiev");
      sb.append(",");
      String city = cities.get(i);
      sb.append(city);
      sb.append(",");
      sb.append(MakeTime());
      sb.append(",");
      sb.append(Cities_seats.get(city));
      sb.append("\n");
    }
    getAllFlights.write(sb.toString());
  }

  public void fillPassengersToFiles(){
    List<Flights> flights = new ArrayList<>(getAllFlights.read());
    String path = "C:\\Users\\khagani\\IdeaProjects\\StepPtojectBooking\\src\\Libraries\\";
    try {
      for (Flights f: flights) {
        StringBuilder sb = new StringBuilder();
        String filename = "ID_" + f.getId() + "_" + f.getFrom() + "_to_" + f.getTo();
        File file = new File(path + filename);
        for (int i = 1; i <= f.getSeats()-5; i++) {
          sb.append(i);
          sb.append(",");
          sb.append(MakePerson());
          sb.append(",");
          sb.append(f.getId());
          sb.append("\n");
        }
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(sb.toString());
        fileWriter.close();
        f.setSeats(f.getSeats()-5);
      }
    }catch (Exception e){
      System.out.println(e + " One Of File Errors!");
    }
  }
  public static String MakePerson(){
    List<String> names = new ArrayList<>(Arrays.asList("Oliver", "Jack", "Harry", "Jacob", "Charlie", "Thomas", "George", "Oscar", "Olivia", "Lily", "Sophie", "Poppy"));
    List<String> surnames = new ArrayList<>(Arrays.asList("Smith", "Jones", "Williams", "Brown", "Davies", "Robinson", "Thompson", "Walker", "White", "Edwards", "Harris", "Linen"));
    Random random = new Random();
    int size = names.size();
    String person;
    person = names.get(random.nextInt((size-1))) + " " + surnames.get(random.nextInt((size-1)));
    return person;
  }

  public static String MakeTime(){
    Random random = new Random();
    ArrayList<String > listDays = new ArrayList<>(Arrays.asList("11", "12", "13", "14", "15"));
    ArrayList<String> listHours = new ArrayList<>(Arrays.asList("00", "06", "09", "10", "12", "18", "20", "23"));
    ArrayList<String > listMinutes = new ArrayList<>(Arrays.asList("00", "15", "30", "45"));
    String time = "2020/03/";
    time += listDays.get(random.nextInt((listDays.size()-1)));
    time += " ";
    time += listHours.get(random.nextInt((listHours.size()-1)));
    time += ":";
    time += listMinutes.get(random.nextInt((listMinutes.size()-1)));
    return time;
  }
}
