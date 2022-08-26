package BogOpgave;

import java.util.ArrayList;
import java.util.Objects;

public class Library {
  ArrayList<Book> bookList = new ArrayList<>();

  private boolean erBog(Book bog) {
    boolean svar = false;
    for (Book bookFromList : bookList) {
      if (Objects.equals(bog.getNumISBN(), bookFromList.getNumISBN())) {
        svar = true;
        break;
      }
    }
    return svar;
  }

  private void runProgram() {
    Book book1 = new Book("12-27-2554", "Alverdens Ost", 1914);
    Book book2 = new Book("13-28-3552", "Ost for Ostekendere", 1714);
    Book book3 = new Book("14-29-1553", "Kritisk Ost", 1814);
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);

    System.out.println(erBog(new Book("14-29-1554", "Alverdens Ost", 1914))); // Rigtigt svar, bogen og ISBN nummer passer
    System.out.println(erBog(new Book("14-29-1553", "Alverdens Ost", 1914))); // Rigtigt svar, bogen passer ikke, men ISBN nummer passer
    System.out.println(erBog(new Book("14-29-1553", "Alverdens Ost", 1914))); // Forkert svar - ISBN nummer passer ikke
  }

  public static void main(String[] args) {
    new Library().runProgram();
  }
}
