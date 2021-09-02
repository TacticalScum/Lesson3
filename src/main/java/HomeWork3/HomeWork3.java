package HomeWork3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //region Задача 1
        int[][] crossArray = new int[6][6];
        for (int i = 0; i < crossArray.length; i++) {
            for (int j = 0; j < crossArray[i].length; j++) {
                if (i == j || j == crossArray.length - 1 - i) {
                    crossArray[i][j] = 1;
                }
                System.out.print(crossArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        // endregion

        //region Задача 2
        Scanner scanner = new Scanner(System.in);
        int userValue;

        int randomValue;

        int restartQuestion;

        do {
            randomValue = (int) (Math.random() * 10);
            System.out.println(randomValue);
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9");
                userValue = scanner.nextInt();
                if (userValue == randomValue) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (userValue > randomValue) {
                    System.out.println("Загаданное число меньше");
                } else if (userValue < randomValue) {
                    System.out.println("Загаданное число больше");
                }
                if (i == 2) {
                    System.out.println("Вы проиграли!");
                    break;
                }
            }
            System.out.println("0 or 1");
            restartQuestion = scanner.nextInt();
        } while (restartQuestion == 1);
        //endregion

        //region Задача 3
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int randomIndex = random.nextInt(words.length);
        String randomWord = words[randomIndex];

        Scanner scan = new Scanner(System.in);
        String userWord;

        do {
            System.out.println("Введите ваше слово: ");
            userWord = scan.nextLine();
            String num = "###############";
            char[] b = num.toCharArray();
            if (userWord.equals(randomWord)) {
                break;
            }
            for (int i = 0; i < wordLength(randomWord, userWord).length(); i++) {
                if (userWord.charAt(i) == randomWord.charAt(i)) {
                    b[i] = randomWord.charAt(i);
                }
            }
            System.out.println(b);
        } while (userWord != randomWord);
        System.out.println("Вы угадали! загаданное слово - " + randomWord);
        // endregion

    }

    public static void printCrossArray(int[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    } // метод для задачи 1

    public static String wordLength(String randomWord, String userWord) {
        if (randomWord.length() > userWord.length()) {
            return userWord;
        } else {
            return randomWord;
        }
    } // метод для задачи 3
}



