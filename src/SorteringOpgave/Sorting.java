package SorteringOpgave;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

  public void sorting() {
    Scanner in = new Scanner(System.in);
    ArrayList<String> array = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      System.out.printf("\n Enter %d word: ", (i + 1));
      array.add(in.nextLine());
    }
    //array.sort(new StringComparator());
    array.sort(Collections.reverseOrder(new StringComparator()));
    for (String s : array) {
      System.out.println(s);
    }
  }

  private void runProgram() {
    sorting();
  }

  public static void main(String[] args) {
    new Sorting().runProgram();
  }
}
