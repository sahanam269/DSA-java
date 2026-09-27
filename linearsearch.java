import java.util.Scanner;

public class linearsearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] arr = {6, 7, 8, 4, 1};

        int result = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                result = i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}


