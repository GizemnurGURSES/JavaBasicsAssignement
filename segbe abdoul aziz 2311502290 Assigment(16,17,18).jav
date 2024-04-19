//Segbe Abdoul Aziz Diomande
//Assigment16
import java.util.Scanner;
public class Assigment16 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
        public static boolean isArmstrong(int number) {
            int originalNumber = number;
            int numDigits = String.valueOf(number).length();
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numDigits);
                number /= 10;
            }
            return sum == originalNumber;
        }
}
//Assigment17
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Assigment17 {
        public static void main(String[] args) {
            String inputFile = "input.txt";
            String outputFile = "output.txt";
            try{
                FileReader fileReader = new FileReader(inputFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(outputFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    try {
                        int number = Integer.parseInt(line);
                        int square = number * number;
                        bufferedWriter.write("The square of " + number + " is " + square + "\n");
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format: " + line);
                    }
                }
                bufferedReader.close();
                bufferedWriter.close();
                System.out.println("Results written to " + outputFile);
            } catch (IOException e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
        }
}

//Assigment18
import java.util.Scanner;
public class Assigment18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Enter the dividend: ");
                int dividend = scanner.nextInt();
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                int result = divide(dividend, divisor);
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.err.println("Error: Division by zero.");
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
        public static int divide(int dividend, int divisor) {
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return dividend / divisor;
        }
}

