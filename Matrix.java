package uz.octo;

import java.util.Random;

public class Matrix {
    static int SIZE = 8;
    static int[][] colors = new int[SIZE][SIZE];
    static int[][] rotatedColors = new int[SIZE][SIZE];
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                colors[i][j] = random.nextInt(256);
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                // для случайных значений воспользуемся готовым решением из библиотеки java.util.Random
                rotatedColors [i][j] = colors[SIZE-1-j][i];
            }
        }
        printMatrix();
    }
    public static void printMatrix(){
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
        System.out.println("_______________________");
        for (int i = 0; i< SIZE; i++) {
            for (int j = 0; j< SIZE; j++) {
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", rotatedColors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
