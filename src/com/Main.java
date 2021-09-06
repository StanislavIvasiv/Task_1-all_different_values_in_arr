package com;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[50];
        //перебір масиву
        for(int i = 0; i < arr.length; i++) {
            int number = rand.nextInt(51);
            while (arr[i] == 0) {
                int count = 0;
                //перебір чисел для пошуку повторюваного числа з лічильником
                for (int value : arr) {
                    if (value == number) {
                        count++;
                    }
                }
                //якщо лічильник не пустий, то генерація нового числа
                if (count > 0) {
                    number = rand.nextInt(51);
                }
                //якщо лічильник пустий, то запис числа в масив
                if (count == 0) {
                    arr[i] = number;
                }
            }
        }

        //виведення
        System.out.println("Виведення масиву з числами, що не повторюються: ");
        System.out.println("");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Елемент: " + i + " має значення: " + arr[i]);
        }

        //пошук найбільшого числа
        int maxValue = 0;
        int maxValueElement = 0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] > maxValue) {
                maxValue = arr[j];
                maxValueElement = j;
            }
        }
        System.out.println(" ");
        System.out.println("Максимальне значення масиву: " + maxValue + ", це елемент під номером: " + maxValueElement);

        // пошук найменшого числа
        int minValue = arr[0];
        int minValueVariable = 0;
        for(int n = 0; n < arr.length; n++) {
            if(minValue > arr[n]) {
                minValue = arr[n];
                minValueVariable = n;
            }
        }
        System.out.println(" ");
        System.out.println("Мінімальне значення масиву: " + minValue + ", це елемент під номером: " + minValueVariable);

        // пошук середнього значення масиву
        int averageValue = 0;
        int averageValueElement = 0;
        int internalVariable = 0;
        for(int m = 0; m < arr.length; m++) {
            internalVariable += arr[m];
        }
        averageValue = internalVariable / arr.length;
        for(int h = 0; h < arr.length; h++) {
            if(arr[h] == averageValue) {
                averageValueElement = h;
            }
        }
        System.out.println(" ");
        System.out.println("Середнє значення масиву: " + averageValue + " і воно знаходиться у елементі під номером: " + averageValueElement);
    }
}
