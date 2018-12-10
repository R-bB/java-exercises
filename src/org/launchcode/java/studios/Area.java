package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        do {
            System.out.print("Enter the radius of the circle: ");
            Scanner sn = new Scanner(System.in);
            radius = sn.nextDouble();
        } while (radius <= 0);


        Double area = Math.PI * radius * radius;
        System.out.println("Area of the circle= "+area);
    }
}
