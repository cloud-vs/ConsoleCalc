public class RomanCalc extends Input {
    protected static int romanNum1;
    protected static int romanNum2;
    private static int resultStr;
    private static String sum;

    private void romanConvert() throws MyException {

        if (secondStr.matches("-?[\\d]+")) {
            throw new NumberFormatException("Number incorrect");
        }
        switch (firsStr) {
            case "I" -> romanNum1 = 1;
            case "II" -> romanNum1 = 2;
            case "III" -> romanNum1 = 3;
            case "IV" -> romanNum1 = 4;
            case "V" -> romanNum1 = 5;
            case "VI" -> romanNum1 = 6;
            case "VII" -> romanNum1 = 7;
            case "VIII" -> romanNum1 = 8;
            case "IX" -> romanNum1 = 9;
            case "X" -> romanNum1 = 10;
        }

        switch (secondStr) {
            case "I" -> romanNum2 = 1;
            case "II" -> romanNum2 = 2;
            case "III" -> romanNum2 = 3;
            case "IV" -> romanNum2 = 4;
            case "V" -> romanNum2 = 5;
            case "VI" -> romanNum2 = 6;
            case "VII" -> romanNum2 = 7;
            case "VIII" -> romanNum2 = 8;
            case "IX" -> romanNum2 = 9;
            case "X" -> romanNum2 = 10;
        }

        if (romanNum1 <= 0 || romanNum1 > 10 && romanNum2 <= 0 || romanNum2 > 10) {
            throw new MyException("Number incorrect");
        }

        switch (operation) {
            case "-" -> resultStr = romanNum1 - romanNum2;
            case "+" -> resultStr = romanNum1 + romanNum2;
            case "/" -> resultStr = romanNum1 / romanNum2;
            case "*" -> resultStr = romanNum1 * romanNum2;
        }

        if (resultStr == 1){
            sum = "I";
        } else if (resultStr == 2){
            sum = "II";
        } else if (resultStr == 3){
            sum = "III";
        } else if (resultStr == 4){
            sum = "IV";
        } else if (resultStr == 5){
            sum = "V";
        } else if (resultStr == 6){
            sum = "VI";
        } else if (resultStr == 7){
            sum = "VII";
        } else if (resultStr == 8){
            sum = "VIII";
        } else if (resultStr == 9){
            sum = "IX";
        } else if (resultStr == 10){
            sum = "X";
        }else if (resultStr == 11){
            sum = "XI";
        } else if (resultStr == 12){
            sum = "XII";
        } else if (resultStr == 13){
            sum = "XIII";
        } else if (resultStr == 14){
            sum = "XIV";
        } else if (resultStr == 15){
            sum = "XV";
        } else if (resultStr == 16){
            sum = "XVI";
        } else if (resultStr == 17){
            sum = "XVII";
        } else if (resultStr == 18){
            sum = "XVIII";
        } else if (resultStr == 19){
            sum = "XIX";
        }else if (resultStr == 20){
            sum = "XX";
        }

    }

    public void romanPrintSum() throws MyException {
        romanConvert();
        System.out.println("Result: " + sum);
    }
}
