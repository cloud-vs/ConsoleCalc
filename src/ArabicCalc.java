public class ArabicCalc extends Input {
    private static int resultNum;
    protected static int firstNum;
    protected static int secondNum;

    private  void arabicConvert() throws MyException {

        firstNum = Integer.parseInt(firsStr);
        if (firstNum <= 0 || firstNum > 10 && secondNum <= 0 || secondNum > 10) {
            throw new MyException("Number incorrect");
        }

        secondNum = Integer.parseInt(secondStr);
        switch (operation) {
            case "-" -> resultNum = firstNum - secondNum;
            case "+" -> resultNum = firstNum + secondNum;
            case "/" -> resultNum = firstNum / secondNum;
            case "*" -> resultNum = firstNum * secondNum;
        }
    }

    public void arabicPrintSum() throws MyException {
        arabicConvert();
        System.out.println("Result: " + resultNum);
    }
}
