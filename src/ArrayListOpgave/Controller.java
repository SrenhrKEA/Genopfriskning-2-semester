package ArrayListOpgave;

import java.util.ArrayList;

public class Controller {
  ArrayList<String> array = new ArrayList<>();

  public boolean doesArraylistContainString(ArrayList<String> array, String text) {
    return array.contains(text);
  }

  private void runProgram() {
    array.add("Ost");
    array.add("Tomatsauce");
    array.add("Skinke");
    System.out.println(doesArraylistContainString(array, "Ost"));
  }

  public static void main(String[] args) {
    new Controller().runProgram();


  }
}
