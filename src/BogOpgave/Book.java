package BogOpgave;

public class Book {
  private String numISBN;
  private String title;
  private int yearOfPublication;

  public String getNumISBN() {
    return numISBN;
  }

  public void setNumISBN(String numISBN) {
    this.numISBN = numISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYearOfPublication() {
    return yearOfPublication;
  }

  public void setYearOfPublication(int yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  public Book(String numISBN, String titel, int yearOfPublication) {
    this.numISBN = numISBN;
    this.title = titel;
    this.yearOfPublication = yearOfPublication;
  }

  @Override
  public String toString() {
    return "Bog{" +
        "numIBSN='" + numISBN + '\'' +
        ", titel='" + title + '\'' +
        ", yearOfPublication=" + yearOfPublication +
        '}';
  }
}
