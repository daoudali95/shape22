package com.company;

import java.util.Scanner;

public class Arithmetic implements Test{
    public void Square(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of this square");
        int length = scan.nextInt();
        System.out.println("You have created square of area: "+ length*length);
    }

}
