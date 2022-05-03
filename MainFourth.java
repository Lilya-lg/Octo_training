package uz.octo;

import java.util.Scanner;

public class MainFourth {
    public static void main(String[] args){
        ForYearHard();
    }
    public static void ForYearHard(){
        Scanner scanner = new Scanner(System.in);
        int year,daysOfYear,countOfSuccess;
        countOfSuccess = 0;
        while(true) {
            System.out.println("Введите год и количество дней в формате \"yyyy\" число");
            year = scanner.nextInt();
            daysOfYear = scanner.nextInt();
            if(daysOfYear == daysNumber(year)){
                countOfSuccess ++;
            }
            else{
                System.out.println("Неправильно! В этом году" + daysNumber(year) +" дней!\n" +
                        "Набрано очков: " + countOfSuccess);
                break;
            }

        }
    }
    public static int daysNumber(int year){
        int daysNumber = 365;
        if (year % 400 == 0) {
            daysNumber = 366;
        } else if (year % 4 == 0 && year % 100 != 0) {
            daysNumber = 366;
        }
        else{

        }
        return daysNumber;
    }
}
