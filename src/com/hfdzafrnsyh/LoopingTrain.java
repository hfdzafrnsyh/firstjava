package com.hfdzafrnsyh;

public class LoopingTrain {

    public static void main(String[] args) {

        triangleLeft();
        System.out.println("\n");

        boxx();
        System.out.println("\n");

        triangleRight();
        System.out.println("\n");

        twoTriangle();
        System.out.println("\n");

        triangle();
        System.out.println("\n");

        triangleTight();
        System.out.println("\n");

        ladder();
        System.out.println("\n");

        ladderBackwards();
        System.out.println("\n");

        ketupat();
        System.out.println("\n");

        flag();
        System.out.println("\n");

        arrowRight();
        System.out.println("\n");

        arrowLeft();

    }


    public static void triangleRight() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i + j) == 4) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public static void boxx() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }


    public static void triangleLeft() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == i) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


    public static void twoTriangle() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    break;
                } else if ((i + j) == 8) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void triangle() {

        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 1; k--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }


    public static void triangleTight() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i - 1; l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }


    public static void ladder() {
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    public static void ladderBackwards() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 8; j >= i; j--) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void ketupat() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - i; k++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }

    public static void flag() {
        for (int i = 1; i <= 9; i++) {
            for (int j=1; j<=9 - 1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i = 1; i <= 9; i++) {
            for (int j=1; j<=9 - 1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }


    public static void arrowRight(){
        for (int i = 1; i <= 9; i++) {
            for (int j=1; j<=i - 1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=9; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 9; i++) {
            for (int j=1; j<=9 - i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=9; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }


    public static void arrowLeft(){
        for ( int i=1; i<=9; i++){
            for (int j=1; j<=9 - i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=9; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i=1; i<=9; i++){
            for (int j=1; j<=i - 1; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=9; k++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }

}
