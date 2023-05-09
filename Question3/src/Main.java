import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Question[] questions = new Question[] {

                new Question("Is Python an object-oriented programming language?", true),
                new Question("Is Bluetooth a wireless connection technology?", true),
                new Question("Is HTML a markup language for web development?", true),
                new Question("Is Windows an open-source operating system?", false),
                new Question("Is Google Chrome a web browser developed by Microsoft?", false),
                new Question("Is Artificial Intelligence a field of study related to developing machines capable of thinking and learning?", true),
                new Question("Is iOS the operating system used in iPhone devices?", true),
                new Question("Is Linux an open-source operating system?", true),
                new Question("Is Java a programming language developed by Apple?", false),
                new Question("Is CSS a language used for styling web pages?", true)
        };

        System.out.println("Let's start the Quiz!");
        System.out.println("Whats your name?");
        String name = scanner.nextLine();

        int rights = 0 ;
        int wrongs = 0 ;
        int i = 0;
        while(i <questions.length){
            i++;
            boolean value = false;
            System.out.println("Answer with True Or False\n" + questions[i].getSentence());
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("true")){value = true;}
            else if (answer.equalsIgnoreCase("false")) {value = false;}
            else {System.out.println("Digite um valor válido!");}

            if(questions[i].isResposta() == value) {
                System.out.println("You Got It Right!");
                rights ++;
            } else if (questions[i].isResposta() == value) {
                System.out.println("It was wrong!");
                wrongs++;
            }
            i++;

        }
        scanner.close();
        System.out.println("Rights:"+ rights);
        System.out.println("Wrongs:"+wrongs);
    }
}
