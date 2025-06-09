package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Movies;

public class Main {
    public static void main(String[] args) {
        Movie theMovie = Movie.getMovie("Commedy", "Star Wars");
        theMovie.watchMovie();
        var movie = Movie.getMovie("Adventure", "Naruto");
        movie.watchMovie();
    }
}
