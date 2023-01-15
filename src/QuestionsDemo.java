public class QuestionsDemo {
    public static void main(String[] args) {

        QuestionBlock question1 = new QuestionBlock(1, "В файл с каким расширением компилируется java-файл", new String[] {"1. cs", "2. java", "3. class", "4. exe"},3);

        QuestionBlock question2 = new QuestionBlock(2, "С помощью какой команды git можно получить полную копию удаленного репозитория", new String[] {"1. commit", "2. push", "3. clone", "4. copy"},3);
        QuestionBlock question3 = new QuestionBlock(3, "Какой применяется цикл, когда не известно количество итераций", new String[] {"1. while", "2. for", "3. loop", "4. do"}, 1);
        QuestionBlock question4 = new QuestionBlock(4, "Какой применяется цикл, когда известно количество итераций", new String[] {"1. while", "2. for", "3. loop", "4. do"}, 2);

       Test test = new Test(question1, question2, question3, question4);
       try {
           test.runTest();
           System.exit(53);
       }
       catch (Exception e) {
           System.exit(53);
       }
       finally {
           System.out.println("I'm finally");
       }
    }

}
