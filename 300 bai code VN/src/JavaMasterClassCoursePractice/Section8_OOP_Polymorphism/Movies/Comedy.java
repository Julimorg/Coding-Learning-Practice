package JavaMasterClassCoursePractice.Section8_OOP_Polymorphism.Movies;

public class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Something funny happends",
                "Something even funnier happens",
                "Happy ending"
        );
    }
}
