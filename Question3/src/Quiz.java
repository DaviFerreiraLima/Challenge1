

public class Quiz {

    private Question[] questions;


    public void questionGenerator(){
         questions = new Question[] {
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
    }
}
