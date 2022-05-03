package uz.octo;

import java.util.Scanner;

public class MainSecond {
    public static void main(String[] args){
        scannerJobforCircle();
    }
    public static void scannerJobforCircle(){
        Scanner scanner = new Scanner(System.in);
        int radius;
        System.out.println("Введите радиус окружности в сантиметрах");
        radius = scanner.nextInt();
        System.out.println("Площадь круга: "+calculateCircleArea(radius) +" см.кв.");
        System.out.println("Длина окружности: "+calculateCircleLength(radius) + " см.");
    }
    public static double calculateCircleArea(int radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double calculateCircleLength(int radius){
        return 2*Math.PI*radius;
    }

}
