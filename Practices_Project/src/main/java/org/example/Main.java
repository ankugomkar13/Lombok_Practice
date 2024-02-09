package org.example;

public class Main {
    public static void main(String[] args)
    {

           System.out.println(Movie.builder().id(12).country("India").rating(8).title("Naruto").build());


            Movie movie = new Movie();
            movie.setId(1);
            movie.setCountry("India");
            movie.setLanguage("English");
            movie.setTitle("Naruto");
            movie.setRating(3);
            movie.setDescription("Very Good Movie");

            System.out.println(movie);

            Movie movie2 = new Movie(2,"India","Naruto","India",3,"English");

            System.out.println(movie2);




    }
}