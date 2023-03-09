import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] numbers = {1, 2, 3};
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};
        int[] bigNumbers = {45_768, 768_769, 6_768_745};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.
        int[] numbers = {1, 2, 3};
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};
        int[] bigNumbers = {45_768, 768_769, 6_768_745};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(fractionalNumbers));
//        System.out.println(Arrays.toString(bigNumbers));
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < fractionalNumbers.length; i++) {
            if (i == fractionalNumbers.length -1) {
                System.out.print(fractionalNumbers[i]);
                break;
            }
            System.out.print(fractionalNumbers[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < bigNumbers.length; i++) {
            if (i == bigNumbers.length - 1) {
                System.out.print(bigNumbers[i]);
                break;
            }
            System.out.print(bigNumbers[i]+", ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.
        int[] numbers = {1, 2, 3};
        float[] fractionalNumbers = {1.57f, 7.654f, 9.986f};
        int[] bigNumbers = {45_768, 768_769, 6_768_745};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
                break;
            }
            System.out.print(numbers[i]+", ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(fractionalNumbers[i]);
                break;
            }
            System.out.print(fractionalNumbers[i]+", ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(bigNumbers[i]);
                break;
            }
            System.out.print(bigNumbers[i]+", ");
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        int[] numbers = {1, 2, 3};
        int[] bigNumbers = {45_768, 768_769, 6_768_745};
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0){
                System.out.print(numbers[i]+1+" ");
            }
        }
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0){
                System.out.println(bigNumbers[i]+1);
                break;
            }
        }
    }
}

