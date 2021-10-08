public class InsertionSort{
    public static void main(String[] args) {
        
        int[] arr = {2,3,1,5,4,6};

        for(int i = 1;i <  arr.length;i++){

            int j = i-1;

            int key = arr[i];

            /* At every Iteration arr[1 to i] is Sorted. */

            /* All the Elements greater then the key will be moved to the right and key will be placed there */

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        /* Printing the Array */

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("");

    }
}