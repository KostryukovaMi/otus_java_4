import java.util.Scanner;

public class ConsoleUserInput implements UserInput{
    private int answer;

    public int intRead(int numberAnswerOption) {
        Scanner scanner = new Scanner(System.in);
        boolean sign = true;
        while (sign) {

            System.out.print("Ваш ответ: ");

            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
                if (answer > 0 && answer <= numberAnswerOption) {
                    sign = false;
                } else {
                    System.out.println("Введено некорректное число. Попробуйте еще раз.");
                }
            } else {
                scanner.nextLine();
                System.out.println("Введено некорректное число. Попробуйте еще раз.");
            }

        }
        return answer;
    }
}
