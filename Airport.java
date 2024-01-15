import java.util.*;
import java.io.*;

public class Airport{
   private Queue<String> takingOff;
   private Queue<String> landing;
   private ArrayList<String> records;
   
   // assigning the instance variables
   public Airport() {
           landing= new LinkedList<String>();
           takingOff =  new LinkedList<String>();
           records = new ArrayList<String>();
   }
  
  // addTakeOff
  public void addTakeOff(String flightID) {
   takingOff.add(flightID);
}

// addLanding
public void addLanding(String flightID) {
   landing.add(flightID);
}

public String handleNextAction() {
   if(landing.isEmpty() && takingOff.isEmpty()) {
           return "No plane is in the landing or take-off queue/";
   }else {
           if(!landing.isEmpty()) {
               String plane = landing.remove();
               records.add("Flight "+plane+" landed.");
               return "Flight "+plane+" is landing.";
           }
           //adding the takingOff Flights
           String plane = takingOff.remove();
           records.add("Flight "+plane+" taken-off.");
           return "Flight "+plane+" is taking-off.";
   }
}

public String waitingPlanes() {
   if(landing.isEmpty() && takingOff.isEmpty()) {
           return "No plane is in the landing or take-off queue.";
   }else {
           String res = "";
           if(!landing.isEmpty()) {
                   res += "Planes waiting to Land : \n";
                   res += "-----------------------\n";
                   for (String string : landing) {
                           res+=string+"\n";
                   }
           }
                   res += "Planes waiting to Take-off : \n";
                   for (String string : takingOff) {
                           res+=string+"\n";
                   }
           return res;
   }
}

public String log() {
   if(records.isEmpty()) {
           return "No activity Exists";
   }
   String res = "List of the landing/taking-off activities:\n";
   res += "-----------------------------------------\n";
   for (String string : records) {
           res+=string+"\n";
   }
   return res;
}

public void log(String s){
   String res;
   if(records.isEmpty()) {
           res = "No activity Exists";
   }
   else {
   res = "List of the landing/taking-off activities:\n";
   res += "-----------------------------------------\n";
   for (String string : records) {
           res+=string+"\n";
   }
}
   
   try {
      FileWriter myWriter = new FileWriter(s);
      myWriter.write(res);
      myWriter.close();
    } 
    catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
}

}