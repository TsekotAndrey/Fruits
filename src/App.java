import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(5);

        switch (x) {
            case 0:
                Apple fruit = new Apple();
                fruit.StartGame();
                fruit.Scanner();

                break;
            case 1:
                Elephant animal = new Elephant();
                animal.StartGame();
                animal.Scanner();

                break;
            case 2:
                Hockey sport = new Hockey();
                sport.StartGame();
                sport.Scanner();

                break;
            case 3:
                Poland country = new Poland();
                country.StartGame();
                country.Scanner();

                break;
            case 4:
                Plumber prof = new Plumber();
                prof.StartGame();
                prof.Scanner();

                break;
        }

    }

}
