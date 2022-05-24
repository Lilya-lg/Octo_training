package uz.octo;

import java.util.Scanner;

public class ArrayJob {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        int[] prodNumbers = new int[3];
        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;
        int counter = 1;
        for(int i=0;i<products.length;i++){
            System.out.println(counter + "." + products[i] + " " + prices[i]);
            counter++;
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String inputString;
            inputString = scanner.nextLine();
            if(inputString.equals("end")){
                System.out.println("Ваша корзина: ");
                for(int i = 0; i< prodNumbers.length; i++){
                    if(prodNumbers[i]>0)
                    System.out.println(products[i] + " " + prices[i] + " " + prodNumbers[i]);
                }
                System.out.println("Итого: " + sumProducts);
                break;
            }
            else {
                productNumber= Integer.parseInt(inputString.substring(0,1));
                productCount = Integer.parseInt(inputString.substring(2,inputString.length()));
                sumProducts += prices[productNumber-1]*productCount;
                prodNumbers[productNumber-1] = productCount;
            }
            // scannerJob();
        }
    }

}
