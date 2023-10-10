import java.util.*;
public class shuffle {
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = array.length;
        random (array, n);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    static void random( int arr[], int n)
    {
        Random rand = new Random();
        for (int i = n-1; i > 0; i--) {
            int j = rand.nextInt(i+1);
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

    }


}
