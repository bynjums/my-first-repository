public class Main {
   public static void main(String[] args) {
   
      
    Movie movie1 = new Movie();
      movie1.title = "Venom";
       movie1.genre = "Action";
        movie1.duration = 112;
   
    Movie movie2 = new Movie();
      movie2.title = "The Conjuring: Last Rites";
       movie2.genre = "Horror";
        movie2.duration = 135;


    Movie movie3 = new Movie();
      movie3.title = "Swapped";
       movie3.genre = "Adventure";
        movie3.duration = 102;
      
   
    movie1.displayInfo();
    movie2.displayInfo();
    movie3.displayInfo();

   }
}