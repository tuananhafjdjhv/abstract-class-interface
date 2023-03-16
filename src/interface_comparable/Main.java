package interface_comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------SQuare--------------");
        Square sq = new Square();
        System.out.println(sq);
        Square sq1 = new Square(2.3);
        System.out.println(sq1);
        Square sq2 = new Square(5.8,"yelow",true);
        System.out.println(sq2);
        System.out.println("----------ComparableCircle---------");
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5,"indigo",false);
        System.out.println("pre-sorted");
        for (ComparableCircle abc: circles) {
            System.out.println(abc);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted");
        for (ComparableCircle abc:circles) {
            System.out.println(abc);
        }
    }

}
