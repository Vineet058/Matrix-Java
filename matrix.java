import java.util.*;

class matrix {
    public static void main() {
        Scanner in = new Scanner(System.in);
        // In new int [3][3] --> ( How many block matrix you want )
        int a[][] = new int[3][3], i, j;
        System.out.print("Enter 9 Number : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Result");
    }
}