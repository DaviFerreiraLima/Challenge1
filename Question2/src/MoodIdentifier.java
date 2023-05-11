import java.util.InputMismatchException;
import java.util.Scanner;

public class MoodIdentifier {
    static Scanner scanner = new Scanner(System.in);
    private String mood;

    public MoodIdentifier() {}

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String askThePhrase() {
        System.out.println("Write the phrase: ");
        String phrase = scanner.nextLine();
        if (phrase.isBlank()) {
            throw new InputMismatchException("The phrase cant be blank");
        }
        return phrase;
    }

    public int countOcorrencies (String phrase, String symbol){
        int recorrencies = 0;

        int position = 0;

        while ((position = phrase.indexOf(symbol, position)) != -1) {
            recorrencies++;
            position += symbol.length();
        }

        return recorrencies;
    }


    public  void  moodIdentifier(String phrase){
            String happySymbol = ":-)";
            String sadSymbol = ":-(";

            int happyRecorrencies = countOcorrencies(phrase, happySymbol);
            int sadRecorrencies = countOcorrencies(phrase, sadSymbol);

            if (happyRecorrencies > sadRecorrencies) {
                setMood("fun");
            } else if (happyRecorrencies < sadRecorrencies) {
                setMood("upset");
            } else {
                setMood("neutral");
            }

        }
    public void moodProcess () {
        try {
            String phrase = askThePhrase();
            moodIdentifier(phrase.toLowerCase());
            System.out.println(toString());
        }catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Restarting the app\n");
            moodProcess();
        }
           }
    @Override
    public String toString() {
        return mood;
    }
}

