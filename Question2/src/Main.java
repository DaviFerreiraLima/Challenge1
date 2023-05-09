import java.util.Scanner;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the phrase");
        String phrase = scanner.nextLine();
        if(phrase instanceof String){

            int happyRecorrencies = 0;
            int sadRecorrencies =  0;

            result(happyRecorrencies,sadRecorrencies,phrase.toLowerCase());
            
        }
    }

    public static int countRecorrencies(String phrase, String symbol){
         int recorrencies = 0;

         int position = 0;

         while ((position = phrase.indexOf(symbol,position)) != -1){
             recorrencies++;
             position += symbol.length();
         }

        return recorrencies;
    }

    public static void result(int happyRecorrencies, int sadRecorrencies, String phrase){
        String happySymbol = ":-)";
        String sadSymbol = ":-(";

        happyRecorrencies = countRecorrencies(phrase,happySymbol);
        sadRecorrencies = countRecorrencies(phrase,sadSymbol);

        if (happyRecorrencies>sadRecorrencies){
            System.out.println("fun");
        } else if (happyRecorrencies<sadRecorrencies) {
            System.out.println("upset");
        }
        else {
            System.out.println("neutral");
        }
    }
}