import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main{
    static int num1;
    static int num2;
    static int resultToInt;
    static String resultToString;
    static String userInput;
    static String[] userElements;
    static Scanner scanner = new Scanner(System.in);
    static String[] romanNumbers = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII","LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static void main(String[] args) throws Exception {
        calc(userInput = scanner.nextLine());
        System.out.println(resultToString);
    }

    public static String calc(String input) throws Exception {
        userElements = userInput.split(" ");
        if(userElements.length > 3){
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
        }else if(userElements.length < 3){
            throw new Exception("т.к. строка не является математической операцией");
        }
        if(
                (userElements[0].equals("I")||userElements[0].equals("II")||
                userElements[0].equals("III")||userElements[0].equals("IV")||
                userElements[0].equals("V")||userElements[0].equals("VI")||
                userElements[0].equals("VII")||userElements[0].equals("VIII")||
                userElements[0].equals("IX")||userElements[0].equals("X"))&&
                (userElements[2].equals("1")||userElements[2].equals("2")||
                userElements[2].equals("3")||userElements[2].equals("4")||
                userElements[2].equals("5")||userElements[2].equals("6")||
                userElements[2].equals("7")||userElements[2].equals("8")||
                userElements[2].equals("9")||userElements[2].equals("10"))
        ){
            throw new Exception("т.к. используются одновременно разные системы счисления");
        }else if(
                (userElements[0].equals("1")||userElements[0].equals("2")||
                userElements[0].equals("3")||userElements[0].equals("4")||
                userElements[0].equals("5")||userElements[0].equals("6")||
                userElements[0].equals("7")||userElements[0].equals("8")||
                userElements[0].equals("9")||userElements[0].equals("10"))&&
                (userElements[2].equals("I")||userElements[2].equals("II")||
                userElements[2].equals("III")||userElements[2].equals("IV")||
                userElements[2].equals("V")||userElements[2].equals("VI")||
                userElements[2].equals("VII")||userElements[2].equals("VIII")||
                userElements[2].equals("IX")||userElements[2].equals("X"))
        ){
            throw new Exception("т.к. используются одновременно разные системы счисления");
        }
        if(
                (userElements[0].contains("1")||userElements[0].contains("2")||
                userElements[0].contains("3")||userElements[0].contains("4")||
                userElements[0].contains("5")||userElements[0].contains("6")||
                userElements[0].contains("7")||userElements[0].contains("8")||
                userElements[0].contains("9")||userElements[0].contains("10"))&&
                (userElements[2].contains("1")||userElements[2].contains("2")||
                userElements[2].contains("3")||userElements[2].contains("4")||
                userElements[2].contains("5")||userElements[2].contains("6")||
                userElements[2].contains("7")||userElements[2].contains("8")||
                userElements[2].contains("9")||userElements[2].contains("10"))
        ){
            num1 = Integer.parseInt(userElements[0]);
            num2 = Integer.parseInt(userElements[2]);
            if((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)){
                throw new Exception("т.к. введенные данные не соответствуют заданию.");
            }
            switch (userElements[1]) {
                case "+" -> resultToInt = num1 + num2;
                case "-" -> resultToInt = num1 - num2;
                case "*" -> resultToInt = num1 * num2;
                case "/" -> resultToInt = num1 / num2;
                default -> throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
            }
            resultToString = String.valueOf(resultToInt);
        }else if(
                (userElements[0].contains("I")||userElements[0].contains("II")||
                userElements[0].contains("III")||userElements[0].contains("IV")||
                userElements[0].contains("V")||userElements[0].contains("VI")||
                userElements[0].contains("VII")||userElements[0].contains("VIII")||
                userElements[0].contains("XI")||userElements[0].contains("X"))&&
                (userElements[2].contains("I")||userElements[2].contains("II")||
                userElements[2].contains("III")||userElements[2].contains("IV")||
                userElements[2].contains("V")||userElements[2].contains("VI")||
                userElements[2].contains("VII")||userElements[2].contains("VIII")||
                userElements[2].contains("IX")||userElements[2].contains("X"))
        ){
            switch (userElements[0]) {
                case "I" -> num1 = 1;
                case "II" -> num1 = 2;
                case "III" -> num1 = 3;
                case "IV" -> num1 = 4;
                case "V" -> num1 = 5;
                case "VI" -> num1 = 6;
                case "VII" -> num1 = 7;
                case "VIII" -> num1 = 8;
                case "IX" -> num1 = 9;
                case "X" -> num1 = 10;
                default -> throw new Exception("т.к. введенные данные не соответствуют заданию.");
            }
            switch (userElements[2]) {
                case "I" -> num2 = 1;
                case "II" -> num2 = 2;
                case "III" -> num2 = 3;
                case "IV" -> num2 = 4;
                case "V" -> num2 = 5;
                case "VI" -> num2 = 6;
                case "VII" -> num2 = 7;
                case "VIII" -> num2 = 8;
                case "IX" -> num2 = 9;
                case "X" -> num2 = 10;
                default -> throw new Exception("т.к. введенные данные не соответствуют заданию.");
            }
            switch (userElements[1]) {
                case "+" -> resultToInt = num1 + num2;
                case "-" -> resultToInt = num1 - num2;
                case "*" -> resultToInt = num1 * num2;
                case "/" -> resultToInt = num1 / num2;
                default -> throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *).");
            }
            if(resultToInt <= 0) {
                throw new Exception("т.к. в римской системе нет отрицательных чисел, чисел меньше единицы и нуля");
            }
            resultToString = romanNumbers[resultToInt];
        }
        return resultToString;
    }
}