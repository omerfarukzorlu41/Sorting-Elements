import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int number = scanner.nextInt();

        int[] array = new int[number];

        for(int i =  0 ; i < array.length ; i++){
            System.out.print("Array "+i+". index: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("First version of the array : "+Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array in sorted form:: "+Arrays.toString(array));
    }
}
