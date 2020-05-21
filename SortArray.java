import java.util.Scanner;

public class SortArray {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(10);
        printArray();
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

        }


    }

    public static int[] getIntegers(int number) {
        System.out.println("enter " + number + "integer values \r");
        int[] myIntegers = new int[number];
        for (int i = 0; i < myIntegers.length; i++) {
            myIntegers[i] = sc.nextInt();
        }
        return myIntegers;
    }

    public static int[] sortIntegers(int[] myArray) {

        for (int i = 0; i < myArray.length; i ++){
            if (myArray[i] > myArray[i] + 1) {
                System.out.println(myArray[i]);
            } else {
                System.out.println(myArray[i] + 1);
            }

        }
        return ;
    }
}