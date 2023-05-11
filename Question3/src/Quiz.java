import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
    static Scanner  scanner = new Scanner(System.in);
    private Question[] questions;
    private String userName;
    private int rights ;
    private int wrongs ;

    public Quiz (){}

    public void questionGenerator(){
         this.questions = new Question[] {
                new Question("Is Python an object-oriented programming language?", "yes"),
                new Question("Is Bluetooth a wireless connection technology?", "yes"),
                new Question("Is HTML a markup language for web development?", "yes"),
                new Question("Is Windows an open-source operating system?", "no"),
                new Question("Is Google Chrome a web browser developed by Microsoft?", "no"),
                new Question("Is Artificial Intelligence a field of study related to developing machines capable of learning?", "yes"),
                new Question("Is iOS the operating system used in iPhone devices?", "yes"),
                new Question("Is Linux an open-source operating system?", "yes"),
                new Question("Is Java a programming language developed by Apple?", "no"),
                new Question("Is CSS a language used for styling web pages?", "yes")
        };
    }

    private void askTheUserName(){

        System.out.println("Whats your name? ");
        String userName = scanner.nextLine();

        if (userName.isBlank()) {
            throw new InputMismatchException("You can't put a blank like a name");
        }
        this.userName = userName;
    }

    public void validateAnswer(String answer,Question question){
        if(question.getAnswer().equalsIgnoreCase(answer)) {
            System.out.println("You Got It Right!\n");
            rights ++;
        } else {
            System.out.println("It was wrong!\n");
            wrongs++;
        }
    }

    public void AnsweringTheQuestions(){

        for (int i = 0; i < questions.length ; i++) {

            System.out.println("Question "+(i+1)+ ":" );
            System.out.println("Answer with Yes Or No\n" + questions[i].getSentence());
            String answer = scanner.nextLine();

            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                throw new InputMismatchException("You must put a Yes or No answer");
            }
            validateAnswer(answer,questions[i]);
        }

    }
    public void quizProcess(){
        try{
            rights = 0 ;
            wrongs = 0 ;
            askTheUserName();
            AnsweringTheQuestions();
            System.out.println(toString());
        }catch(InputMismatchException exception){
            System.out.println(exception.getMessage());
                System.out.println("Restarting the app\n");
                quizProcess();
        }
    }


    @Override
    public String toString() {
        return "User: " + this.userName + "\n" +
                "rights: " + this.rights + "\n" +
                "wrongs: " + this.wrongs ;
    }
}
