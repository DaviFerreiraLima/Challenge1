
public class Question {
    private String sentence;
    private boolean resposta;

    public Question(String sentence,boolean resposta) {
        this.sentence = sentence;
        this.resposta=resposta;
    }


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean isResposta() {
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }


}
