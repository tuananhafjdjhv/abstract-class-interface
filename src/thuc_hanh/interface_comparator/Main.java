package thuc_hanh.interface_comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------COmparator------------------");
        Circle[] circles = new  Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo",false,3.6);
        System.out.println("Pre-sorted");
        for (Circle circle:circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("After-sorted");
        for (Circle circle:circles) {
            System.out.println(circle);
        }
    }
}
