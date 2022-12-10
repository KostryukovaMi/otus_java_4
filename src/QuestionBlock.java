import java.util.Scanner;

public class QuestionBlock {
    private int questionId;
    private String questionName;

    private String[] answers;
    private ConsoleUserInput consoleUserInput;

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
        this.consoleUserInput = new ConsoleUserInput();
    }

    public boolean askQuestion()
    {
        ConsoleUserOutput message = new ConsoleUserOutput();
        message.print(questionId + ") " + questionName, true);

        for (int j = 0; j < answers.length; j++) {
            message.print(answers[j], true);
        }

        if (consoleUserInput.intRead(answers.length) == correctAnswer) {
            message.print("Правильно", true);
            return true;
        } else {
            message.print("Неправильно", true);
            return false;
        }


    }

}
