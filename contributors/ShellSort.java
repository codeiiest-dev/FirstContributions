import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements : ");
        for(int i = 0 ; i<n ; i++){
            array[i] = in.nextInt();
        }

        int h = 1;

        while(h<(n/3)){
            h = (int)(Math.pow(3,h)) + 1 ;
        }
        while(h>=1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && (array[j] < array[j - h]); j = j - h) {
                    int temp = array[j - h];
                    array[j - h] = array[j];
                    array[j] = temp;
                }
            }
            h = h/3;
        }
        for(int i = 0; i<n ; i++){
            System.out.println(array[i]);
        }
    }
}
