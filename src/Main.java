import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /// task 1
        int[] bug = new int[3];
        bug[0] = 1;
        bug[1] = 2;
        bug[2] = 3;
        double[] worm = {1.57, 7.654, 9.986};
        int[] fly = {4, 40, 44};
        /// task 2
        for (int i = 0; i < bug.length; i++) {
            if (i < bug.length - 1) {
                System.out.print(bug[i] + ", ");
            } else {
                System.out.print(bug[i]);
                System.out.println();
            }
        }
        ///

        for (int i1 = 0; i1 < worm.length; i1++) {
            if (i1 < worm.length - 1) {
                System.out.print(worm[i1] + ", ");
            } else {
                System.out.print(worm[i1]);
                System.out.println();
            }
        }
        ///
        for (int i2 = 0; i2 < fly.length; i2++) {
            if (i2 < fly.length - 1) {
                System.out.print(fly[i2] + ", ");
            } else {
                System.out.print(fly[i2]);
            }
        }
        System.out.println();
        for (int r = bug.length - 1; r >= 0; r--) {
            System.out.print(bug[r]);
            if (r != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int q = worm.length - 1; q >= 0; q--) {
            System.out.print(worm[q]);
            if (q != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int z = fly.length - 1; z >= 0; z--) {
            System.out.print(fly[z]);
            if (z != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < bug.length; i++) {
            if (bug[i] % 2 != 0) {
                bug[i] += 1;
            }
        }
        System.out.println(Arrays.toString(bug));
    }
}
