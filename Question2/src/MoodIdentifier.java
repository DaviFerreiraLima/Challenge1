import java.util.InputMismatchException;
import java.util.Scanner;

public class MoodIdentifier {

    private String mood;

    public MoodIdentifier() {}

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String askThePhrase() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the phrase: ");
        String phrase = scanner.nextLine();
        if (phrase.isBlank()) {
            throw new InputMismatchException("The phrase cant be blank");
        }
        return phrase;
    }

    public int countMoodOcorrencies (String phrase, String symbol){
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

            int happyOcorrencies = countMoodOcorrencies(phrase, happySymbol);
            int sadOcorrencies = countMoodOcorrencies(phrase, sadSymbol);

            if (happyOcorrencies > sadOcorrencies) {
                setMood("fun");
            } else if (happyOcorrencies < sadOcorrencies) {
                setMood("upset");
            } else {
                setMood("neutral");
            }

        }

    public void moodProcess () {
        try {
            String phrase = askThePhrase();
            moodIdentifier(phrase.toLowerCase());
            System.out.println(this.mood);
        }catch (InputMismatchException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Restarting the app\n");
            moodProcess();
        }
           }

}

