import java.io.*;
public class Test {
    private QuestionBlock[] questionBlocks;
    private int correctCount;
    private int wrongCount;

    public Test(QuestionBlock... questionBlocks) {
        this.questionBlocks = questionBlocks;
    }

    public void runTest()
    {
        ConsoleUserOutput message = new ConsoleUserOutput();
        for (int i = 0; i < questionBlocks.length; i++) {
            if (questionBlocks[i].askQuestion()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        //message.print("Результат: правильно " + correctCount + ", неправильно " + wrongCount, true);
        try(FileWriter writer = new FileWriter("result.txt", false))
        {
            String text = "Результат: правильно " + correctCount + ", неправильно " + wrongCount;
            writer.write(text);
        }
        catch(IOException ex){

            throw new WrongAnswerException("Файл отсутствует",ex);
        }
    }
}

