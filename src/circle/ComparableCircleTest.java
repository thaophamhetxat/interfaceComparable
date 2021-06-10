package circle;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircle = new ComparableCircle[3];
        comparableCircle[0] = new ComparableCircle(3.2, "blu");
        comparableCircle[1] = new ComparableCircle(3.4, "black");
        comparableCircle[2] = new ComparableCircle(3.1, "red");
        System.out.println("pre-sorted:");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }
        Arrays.sort(comparableCircle);
        System.out.println("after_sorted: ");
        for (ComparableCircle circle : comparableCircle) {
            System.out.println(circle);
        }
    }
}
