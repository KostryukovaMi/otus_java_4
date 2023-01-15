public class ConsoleUserOutput implements UserOutput{
    public void print(String message, boolean transfer)
    {
        if (transfer) {
            System.out.println(message);
        }
        else {
            System.out.print(message);
        }
    }
}
