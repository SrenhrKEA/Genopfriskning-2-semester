package KvadratOpgave;

public class Square {
  StringBuilder sb = new StringBuilder();

  public void printSquare(int integer) {
    String square = null;
    for (int i = 0; i < integer; i++) {
      square = String.valueOf(sb.append(" * "));
    }
    for (int i = 0; i < integer; i++) {
      System.out.println(square);
    }
  }

  private void runProgram() {
    printSquare(8);
  }

  public static void main(String[] args) {
    new Square().runProgram();
  }
}
