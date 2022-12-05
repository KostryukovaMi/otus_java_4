import java.util.Scanner;

public class QuestionBlock {
    private int questionId;
    private String questionName;

    private String[] answers;

    private int correctAnswer;
    public QuestionBlock() {
    }

    public QuestionBlock(int questionId, String questionName, String[] answers, int correctAnswer) {
        // this -- ссылка на текущий экземпляр
        // (на самого себя)
        this.questionId = questionId;
        this.questionName = questionName;
        this.correctAnswer = correctAnswer;
        this.answers = answers;
    }

    public boolean askQuestion()
    {

        System.out.println(questionId + ") " + questionName);

        for (int j = 0; j < answers.length; j++) {
            System.out.println(answers[j]);
        }
        ConsoleUserInput answer = new ConsoleUserInput();

        if (answer.intRead(answers.length) == correctAnswer) {
            System.out.println("Правильно");
            return true;
        } else {
            System.out.println("Неправильно");
            return false;
        }


    }

}
