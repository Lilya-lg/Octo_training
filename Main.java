package uz.octo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        scannerJob();
    }
    //first task
    public static void scannerJob(){
        Scanner scanner = new Scanner(System.in);
        int value1,value2,value3;
        System.out.println("Введите первое число");
        value1 = scanner.nextInt();
        System.out.println("Введите второе число");
        value2 = scanner.nextInt();
        System.out.println("Введите третье число");
        value3 = scanner.nextInt();
        System.out.println(getSum(value1,value2,value3));
    }
    public static int getSum(int val1,int val2,int val3){
        return val1+val2+val3;
    }
   //second task


    //third task



}
