package Calculator;

public class Logic {

    public static String leftNumber = "";
    public static String rightNumber = "";
    public static int howManyNumbers = 0;
    public static boolean isDotSet = false;

    public static double firstNumber = 0;
    public static double nextNumber = 0;
    public static String numberText = "";
    public static String operation = "";
    public static boolean makeOperation = false;
    public static boolean rememberNumber = true;

    private static String createLeftText(String nextNumber) {
        return leftNumber + nextNumber;
    }

    private static String createRightText(String nextNumber) {
        return rightNumber + nextNumber;
    }

    private static boolean isNumberGreaterThanZero() {
        return (Integer.parseInt(leftNumber) > 0);
    }

    private static boolean isAnyNumber() {
        return !(howManyNumbers == 0);
    }

    private static String changeNumber(String nextNumber) {
        if (!isDotSet) {
            if (isAnyNumber()) {
                howManyNumbers++;
                return leftNumber + nextNumber + "." + rightNumber;
            } else {
                howManyNumbers++;
                return nextNumber + "." + rightNumber;
            }
        } else {
            return leftNumber + "." + rightNumber + nextNumber;
        }
    }

    private static void splitOnLeftAndRightNumber(String number) {
        number = number.replace(".", ",");
        leftNumber = number.split(",")[0];

        try {
            rightNumber = number.split(",")[1];
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
        }
    }

    public static String changeNumber(String number, String nextNumber) {
        if (!isAnyNumber() && Integer.parseInt(nextNumber) == 0) {
            return "0.";
        }
        if (!isAnyNumber()) {
            howManyNumbers++;
            return nextNumber + ".";
        }
        splitOnLeftAndRightNumber(number);
        return changeNumber(nextNumber);
    }

    public static String reduceNumber(String number) {
        splitOnLeftAndRightNumber(number);
        if (isRightNumber()) {
            rightNumber = rightNumber.substring(0, rightNumber.length() - 1);
            return leftNumber + "." + rightNumber;
        }
        isDotSet = false;

        if (isMoreThanOneNumber()) {
            howManyNumbers--;
            return leftNumber.substring(0, leftNumber.length() - 1) + ".";
        }
        howManyNumbers = 0;
        return "0.";
    }

    private static boolean isRightNumber() {
        return !(rightNumber.equals(""));
    }

    private static boolean isMoreThanOneNumber() {
        return !(howManyNumbers <= 1);
    }

    public static void reset() {
        leftNumber = "";
        rightNumber = "";
        howManyNumbers = 0;
        isDotSet = false;

        firstNumber = 0;
        nextNumber = 0;
        numberText = "";
        operation = "";
        makeOperation = false;
        rememberNumber = true;
    }

    private static void makeCalculations(String currentOperation) {
        if (makeOperation) {
            switch (operation) {
                case "addition":
                    firstNumber = firstNumber + nextNumber;
                    break;
                case "subtraction":
                    firstNumber = firstNumber - nextNumber;
                    break;
                case "multiplication":
                    firstNumber = firstNumber * nextNumber;
                    break;
                case "division":
                    firstNumber = firstNumber / nextNumber;
                    break;
                default:
                    firstNumber = nextNumber;
            }
        }
        operation = currentOperation;
    }

    public static String makeCalculation(String currentOperation) {
        makeCalculations(currentOperation);
        splitOnLeftAndRightNumber(String.valueOf(firstNumber));
        deleteZeros();
        return leftNumber + "." + rightNumber;
    }

    private static void deleteZeros() {
        while (true) {
            int textLength = rightNumber.length();
            if (textLength == 0) {
                break;
            }
            if (rightNumber.substring(textLength - 1, textLength).equals("0")) {
                rightNumber = rightNumber.substring(0, textLength - 1);
            } else {
                break;
            }

        }
    }

    public static void incompleteReset() {
        leftNumber = "";
        rightNumber = "";
        howManyNumbers = 0;
        isDotSet = false;
        makeOperation = false;
    }
}
