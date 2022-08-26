package ProperCaseOpgave;

import java.util.Locale;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class ProperCase {


  public void properCase(String text) {
    StringBuilder sb = new StringBuilder();
    String[] splited = text.trim().split(" ");
    //System.out.println(Arrays.toString(splited)); // TEST af array
    for (String s : splited) {
      char[] charArray = s.toCharArray();
      boolean allLettersUpperCase = true;
      for (char c : charArray) {
        if (!Character.isUpperCase(c)) {
          allLettersUpperCase = false;
        }
      }
      if (allLettersUpperCase) {
        sb.append(s);
      } else if (s.length() > 3) {
        sb.append(toUpperCase(charArray[0]));
        for (int k = 1; k < charArray.length; k++) {
          sb.append(toLowerCase(charArray[k]));
        }
      } else {
        sb.append(s.toLowerCase(Locale.ROOT));
      }
      sb.append(' ');
    }
    System.out.println(sb);
  }

  private void runProgram() {
    properCase("Hej mit navn er SØREN");
    properCase("Hej mit naVn er SØreN");
    properCase("HEJ mIt naVn er søren");
  }

  public static void main(String[] args) {
    new ProperCase().runProgram();
  }
}
