package SlåGræsOpgave;

import java.util.Scanner;

public class LawnMowing {
  final double GROWTH_PER_DAY = 0.8;
  Scanner in = new Scanner(System.in);

  public int daysUntilLawnMowing(double length, double max_length) { // Græsset slås når det har nået max længde og ikke før.
    int days;
    if (length > max_length)
      days = 0;
    else
      days = (int)((max_length-length)/GROWTH_PER_DAY);
    return days;
  }

  private void runProgram () {
    System.out.println("Enter length of grass (CM):");
    double length = in.nextDouble();
    System.out.println("Enter max length of grass (CM):");
    double max_length = in.nextDouble();
    int days = daysUntilLawnMowing(length, max_length);
    System.out.println("Days until lawn needs to be mowed: "+days);
  }

  public static void main(String[] args) {
    new LawnMowing().runProgram();
  }
}
