package lesson8;

import lesson6.ScannerUtils;

import java.util.Scanner;

public class PrintUtils {

    public static void printQuestion(Question question) {
        System.out.println(question.getQuestion());
        Option[] options = question.getOptions();
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null){
                System.out.println("  " + (i + 1) + " - " + options[i].getOption());
            }
        }
    }

    public static int[] getAnswers(){
        System.out.println("Выберете варианты: ");
        Scanner scanner = new Scanner(System.in);
        String inputAnswer = scanner.nextLine(); // 1 3 5
        String[] nums = inputAnswer.split(" "); // [ "1", "3", "5"]
        int[] result = new int[nums.length];   // [ 0, 0, 0]

        for (int i = 0; i < nums.length; i++){
            result[i] = Integer.parseInt(nums[i]);
        }

        return result;
    }
}
