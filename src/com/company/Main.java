package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Стороны:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a < b + c) & (b < a + c) & (c < a + b)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.print("Треугольник не существует");
        }

        System.out.println("Радиус:");
        int r = scanner.nextInt();
        if (r <= Math.sqrt(3) * b / 6) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }}