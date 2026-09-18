public class Movie {
   String title;
   String genre;
   int duration;
   
   public void displayInfo() {
      System.out.println(title + " (" + genre + ") - " + duration + " minutes");
   }
}