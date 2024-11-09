public class Question {
    int id;
    private String question;
    private String Opt1;
    private String Opt2;
    private String Opt3;
    private String Opt4;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.Opt1 = opt1;
        this.Opt2 = opt2;
        this.Opt3 = opt3;
        this.Opt4 = opt4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return Opt1;
    }

    public void setOpt1(String opt1) {
        Opt1 = opt1;
    }

    public String getOpt2() {
        return Opt2;
    }

    public void setOpt2(String opt2) {
        Opt2 = opt2;
    }

    public String getOpt3() {
        return Opt3;
    }

    public void setOpt3(String opt3) {
        Opt3 = opt3;
    }

    public String getOpt4() {
        return Opt4;
    }

    public void setOpt4(String opt4) {
        Opt4 = opt4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", Opt1='" + Opt1 + '\'' +
                ", Opt2='" + Opt2 + '\'' +
                ", Opt3='" + Opt3 + '\'' +
                ", Opt4='" + Opt4 + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
