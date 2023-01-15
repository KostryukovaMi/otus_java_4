import java.util.Scanner;

public class ConsoleUserInput implements UserInput {
    private int answer;

    /*   public int intRead(int maxValue) {
           Scanner scanner = new Scanner(System.in);
           boolean sign = true;
           ConsoleUserOutput message = new ConsoleUserOutput();
           while (sign) {

               message.print("Ваш ответ: ", false);

               if (scanner.hasNextInt()) {
                   answer = scanner.nextInt();
                   if (answer > 0 && answer <= maxValue) {
                       sign = false;
                   } else {
                       message.print("Введено некорректное число. Попробуйте еще раз.", true);
                   }
               } else {
                   scanner.nextLine();
                   message.print("Введено некорректное число. Попробуйте еще раз.", true);
               }

           }
           return answer;
       }*/
    public int intRead(int maxValue) {
        Scanner scanner = new Scanner(System.in);
        boolean sign = true;
        ConsoleUserOutput message = new ConsoleUserOutput();
        while (sign) {

            message.print("Ваш ответ: ", false);
            try {
                answer = scanner.nextInt();
                if (answer > 0 && answer <= maxValue) {
                    sign = false;
                } else {
                    message.print("Введено некорректное число. Попробуйте еще раз.", true);
                }
            } catch (Exception e) {
                message.print("В процессе выполнения произошла ошибка (ScannerException)", true);
                scanner.nextLine();
                message.print("Введено некорректное число. Попробуйте еще раз.", true);
            }

        }
        return answer;
    }
}
