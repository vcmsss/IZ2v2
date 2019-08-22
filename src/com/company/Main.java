package com.company;



import java.util.Scanner;



public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Необходимо ввести размер массива: ");

        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.println("Необходимо ввести элементы массива:");



        for (int i = 0; i < size; i++) {

            array[i] = scanner.nextInt();

        }



        System.out.println("Введенный массив:");

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");

        }




        int temp, j;
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j>0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        System.out.println("\nМассив, полученный после сортировки:");

        for (int i = 0; i < size; i++) {

            System.out.print(array[i] + " ");

        }
    }

}

