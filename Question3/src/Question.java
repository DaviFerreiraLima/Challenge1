
public class Question {
    private String sentence;
    private boolean resposta; // português misturado com inglês

    public Question(String sentence, boolean resposta) {
        this.sentence = sentence;
        this.resposta=resposta;
    }


    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public boolean isResposta() { // is não encaixa nesse sentido, quando passar pro inglês deve ficar tipo: answer() ou getAnswer()
        return resposta;
    }

    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }


}
