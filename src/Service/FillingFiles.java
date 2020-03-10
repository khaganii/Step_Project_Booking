package Service;

import Controller.Fill_Files_with_Randoms;
import Libraries.Flights;

public class FillingFiles {
  Fill_Files_with_Randoms fill_files_with_randoms = new Fill_Files_with_Randoms();
  public void getFillWithRandoms() {
    fill_files_with_randoms.fillFlights();
    fill_files_with_randoms.fillPassengersToFiles();
  }
}
