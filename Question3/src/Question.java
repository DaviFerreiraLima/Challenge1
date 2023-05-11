
public class Question {
    private String sentence;
    private String answer;

    public Question(String sentence, String answer) {
        this.sentence = sentence;
        this.answer=answer;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
