import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));

        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей.");

        // task 2
        System.out.println("Задача 2");

        System.out.println(Arrays.toString(salaryArray));

        int minSpending = salaryArray[0];
        int maxSpending = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < minSpending) {
                minSpending = salary;
            }

            if (salary > maxSpending) {
                maxSpending = salary;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxSpending + " рублей");

        // task 3
        System.out.println("Задача 3");

        System.out.println(Arrays.toString(salaryArray));

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (double) salarySum / salaryArray.length + " рублей.");

        // task 4
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50_000) + 50_000;
        }
        return arr;
    }
}