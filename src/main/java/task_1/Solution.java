package task_1;

import java.util.Scanner;

public class Solution {

    public void run(Scanner scanner) {
        System.out.println("Welcome to the Checker!\n"
                + "Please entered the desired function:\n"
                + "1.Number\n"
                + "2.Name matcher\n"
                + "3.Numeric array");

        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("1") | choice.equals("number")) checkNumber(scanner);
        else if (choice.equals("2") | choice.equals("name matcher")) checkName(scanner);
        else if (choice.equals("3") | choice.equals("numeric array")) checkNumericArray(scanner);
        else System.out.println("Wrong Choose!");
    }

    private void checkNumber(Scanner scanner) {
        System.out.println("Enter the number:");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > 7) System.out.println("Hello");
        } else System.out.println("Wrong data!");
    }

    private void checkName(Scanner scanner) {
        System.out.println("Enter the name:");
        if (scanner.hasNextLine()) {
            String name = scanner.nextLine().toLowerCase();
            if (name.equals("john")) System.out.println("Hello John");
            else System.out.println("There is no such name");
        } else System.out.println("Wrong data!");
    }

    private void checkNumericArray(Scanner scanner) {
        System.out.println("Enter the numeric array:");
        String[] numbers = scanner.nextLine().replaceAll("\\D", " ").split(" ");
        for (String num : numbers) {
            try {
                if (Integer.parseInt(num) % 3 == 0) System.out.println(num);
            }catch (NumberFormatException ex){
                System.out.println("You have entered wrong data!");
            }
        }
    }
}


