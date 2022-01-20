import java.util.Scanner;


public class Elephant {
    void StartGame() {
        System.out.println(new Phrases().getWelcomePhrase());
        System.out.println("Слово которое следует отгадать состоит из 8 букв. Представляет собой животное.");

    }

    void Scanner() {
        Scanner sc1 = new Scanner(System.in);
        String phrase1 = sc1.nextLine();


        String Q = "elephant";
        if (Q.contains(phrase1)) {
            System.out.println(new Phrases().getFirstPhrasePos());
        } else {
            System.out.println(new Phrases().getFirstPhraseNeg());
        }

        Scanner sc2 = new Scanner(System.in);
        String phrase2 = sc2.nextLine();



        if (Q.contains(phrase2)) {
            System.out.println(new Phrases().getSecondPhrasePos());
        } else {
            System.out.println(new Phrases().getSecondPhraseNeg());
        }

        Scanner sc3 = new Scanner(System.in);
        String phrase3 = sc3.nextLine();


        if (Q.contains(phrase3)) {
            System.out.println(new Phrases().getThirdPhrasePos());
        } else {
            System.out.println(new Phrases().getThirdPhraseNeg());
        }
        Scanner sc4 = new Scanner(System.in);
        String phrase4 = sc4.nextLine();
        System.out.println(Q);

        if (Q.equals(phrase4)) {
            System.out.println(new Phrases().getFinalPhrasePos());
        } else {
            System.out.println(new Phrases().getFinalPhrasePos());
        }

    }

}
