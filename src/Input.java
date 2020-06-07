import java.util.Scanner;

public class Input {
    protected static String firsStr;
    protected static String secondStr;
    protected static String operation;
    protected static Scanner sc;

    public void consoleInput() {

        try {
            sc = new Scanner(System.in);
            firsStr = sc.next().toUpperCase();
            operation = sc.next();
            secondStr = sc.next().toUpperCase();

            if (firsStr.matches("-?[\\d]+")) {
                new ArabicCalc().arabicPrintSum();
            } else
                new RomanCalc().romanPrintSum();
        } catch (MyException | NumberFormatException e) {
            System.err.println("Number incorrect");
        }
    }
}
