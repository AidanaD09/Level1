package DZ3;
public class Main {
    public static void main(String[] args) {

        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i =0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 1) {
                System.out.println("0");
            }
            else {
                System.out.println(1);
            }
        }

        int[] hundred = new int[100];
        for (int i = 0; i < 100; i++) {
            hundred[i] += 1;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
        }

        int[] multiplieByTwo = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < multiplieByTwo.length; i++) {
            if (multiplieByTwo[i] < 6) {
                System.out.println(multiplieByTwo[i] *= 2);
            }
        }


    }

    public static int[] twoArgs(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }


}
