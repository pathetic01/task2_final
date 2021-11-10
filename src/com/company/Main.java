package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double triangleSideA,triangleSideB,triangleSideC, y = 0,radius,p = 0,S = 0, radiusCalculated;

        AppealToUser();
        triangleSideA = read(y);
        triangleSideB = read(y);
        triangleSideC = read(y);
        radius = read(y);

        p = calcHalfOfPerimeter(triangleSideA,triangleSideB,triangleSideC);
        radiusCalculated = calcArea(triangleSideA,triangleSideB,triangleSideC,p); //
        checkPossibility(triangleSideA,triangleSideB,triangleSideC);
        checkCircleInside(radius, radiusCalculated);
    }

    private static void AppealToUser(){
        System.out.println("Введите стороны A,B,C и радиус вписанной окружности:");
    }

    private static double calcHalfOfPerimeter(double triangleSideA, double triangleSideB, double triangleSideC){
        double p;         // p = (a + b + c) : 2
        p = (triangleSideA+triangleSideB+triangleSideC)/2;
        return(p);
    }

    private static double calcArea(double triangleSideA, double triangleSideB, double triangleSideC, double p){
        double S;         // S = √ p * (p − a) * (p − b) * (p − c)
        double radiusCalculated;
        S = Math.sqrt(p*(p-triangleSideA)*(p-triangleSideB)*(p-triangleSideC));
        radiusCalculated=S/p;
        return(radiusCalculated);
    }

    private static void checkPossibility(double triangleSideA, double triangleSideB, double triangleSideC){
        if (((triangleSideA < triangleSideB + triangleSideC) & (triangleSideB < triangleSideA + triangleSideC) & (triangleSideC < triangleSideA + triangleSideB))) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }

    private static void checkCircleInside(double radius, double radiusCalculated){

        if (radius == radiusCalculated) {
            System.out.println("Вписать круг можно");
        } else {
            System.out.println("Вписать круг нельзя");
        }
    }

    private static double read(double x){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        return x;
    }
}