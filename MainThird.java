package uz.octo;

import java.util.Scanner;

public class MainThird {
    public static void main(String[] args){
        ForYear();
    }
    public static void ForYear(){

        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Введите год в формате \"yyyy\"");
        year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println("Количество дней 366");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }

}
