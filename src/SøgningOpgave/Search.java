package SøgningOpgave;

public class Search {

  public int search(String[] array, String text) {
    boolean containsString = false;
    int counter = 0;
    for (String s : array) {
      if (s.equals(text)) {
        containsString = true;
        break;
      }
      counter++;
    }
    if (containsString)
      return counter;
    else
      return -1;

  }

  private void runProgram() {
    System.out.println(search(new String[]{"Ost", "Skinke", "Tomatsauce", "Ananas"}, "Ananas"));

  }

  public static void main(String[] args) {
    new Search().runProgram();
  }
}
