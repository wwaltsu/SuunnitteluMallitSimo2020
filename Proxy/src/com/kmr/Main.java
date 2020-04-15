package com.kmr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Image> images = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        int valinta = 6;
        images.add(image1);
        images.add(image2);
        int i = 0;

        while (valinta != 0) {
            System.out.println("Choose one of the following three:\n" +
                    "1: Print image details\n" +
                    "2: Look through picture names\n" +
                    "3: Quit\n");
            valinta = scanner.nextInt();
            switch (valinta) {
                case 1:
                    while(i < images.size()) {
                        System.out.println("Photo " + i + 1 + "name: " + images.get(i).showData());
                        i++;
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    image1.displayImage(); // loading necessary
                    image1.displayImage(); // loading unnecessary
                    image2.displayImage(); // loading necessary
                    image2.displayImage(); // loading unnecessary
                    image1.displayImage(); // loading unnecessary
                    System.out.print("\n");
                    break;

                case 3:
                    System.out.println("Stopped.....");
                    System.exit(0);

            }
        }


    }
}
