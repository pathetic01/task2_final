package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    double side_a,side_b,side_c,y = 0,radius;
        System.out.println("Сторона 'а':");
    side_a = read(y);
        System.out.println("Сторона 'b':");
    side_b = read(y);
        System.out.println("Сторона 'c':");
    side_c = read(y);
        System.out.println("Радиус:");
    radius = read(y);
    checkPossibility(side_a, side_b, side_c);
    checkCircleInside(side_b, radius);
    }

    private static double read(double x){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        return x;
    }

    private static void checkPossibility(double side_a, double side_b, double side_c){
        if ((side_a < side_b + side_c) & (side_b < side_a + side_c) & (side_c < side_a + side_b)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }

    private static void checkCircleInside(double side_b,double radius){

        if (radius <= Math.sqrt(3) * side_b / 6) { // эту формалу нашел на сайте cyberforum. ссылку в ReadMe оставлю
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }
}