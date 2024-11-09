import java.util.Scanner;
public class QuestionService {

    Question[] questions = new Question[5];

    String selection[] = new String[5];
    public QuestionService() {
        questions[0] = new Question(1, "What is the capital city of Germany?", "1. Munich", "2. Berlin", "3. Frankfurt", "4. Hamburg",  "2");
        questions[1] = new Question(2, "Which of the following rivers flows through Germany?", "1. Danube", "2. Volga", "3. Thames", "4. Seine",  "1");
        questions[2] = new Question(3, "Which city is known as Germany's financial hub and is home to the European Central Bank?", "1. Stuttgart", "2. Berlin", "3. Frankfurt", "4. Leipzig",  "3");
        questions[3] = new Question(4, "Germany shares a border with which of these countries?", "1. Spain", "2. Norway", "3. Sweden", "4. Austria",  "4");
        questions[4] = new Question(5, "Which famous German festival, known for its beer celebrations, is held in Munich?", "1. Oktoberfest", "2. Fasching", "3. Karneval", "4. May Day",  "1");
    }


    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question "+q.getId() + ". " + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection)
        {
            System.out.println("Your answer is: " + s);
        }
        //System.out.println(questions[0].getQuestion());
    }
    public void printScore()
    {
        int score = 0;
        for(int i=0; i<questions.length; i++)
        {
           Question q = questions[i];
           String actualAnswer = q.getAnswer();
           String userAnswer = selection[i];

           if(actualAnswer.equals(userAnswer))
           {
               score++;
           }
        }
        System.out.println("Your final score is: " + score);
    }

}
