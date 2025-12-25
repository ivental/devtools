package ru.mentee.power.devtools;

public class LiveCodingDemo {
    public static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        printFizzBuzz(15);
        LiveCodingDemo liveCodingDemo = new LiveCodingDemo();
        int sumEven = liveCodingDemo.sumEven(numbers);
        int findMax = liveCodingDemo.findMax(numbers);
        System.out.println();
        System.out.println("Сумма чётных чисел массива = " + sumEven);
        System.out.println();
        System.out.println("Максимальное число массива = " + findMax);
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public int sumEven(int[] numbers) {

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

