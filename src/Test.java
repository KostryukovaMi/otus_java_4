public class Test {
    private QuestionBlock[] questionBlocks;
    private int correctCount;
    private int wrongCount;

    public Test(QuestionBlock... questionBlocks) {
        this.questionBlocks = questionBlocks;
    }

    public void runTest()
    {
        for (int i = 0; i < questionBlocks.length; i++) {
            if (questionBlocks[i].askQuestion()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
