import java.util.Random;

public class QuickSort {
    // to sort char array, just parse the print statement --> System.out.print((char)value)
    // and pass char values to int[] arr, so int[] arr = {'a', 'c', 'b'};

    public static void main(String[] args) {
        int[] arr = {'g', 'c', 'b', 'a'};
        printarr(arr);
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
    }

    public static int partition(int[] arr, int low, int high) {
        // Random pivot variation
        Random rand = new Random();
        int randomIndex = rand.nextInt(high-low) + low;
        System.out.printf("Random pivot index: %d\n\n", randomIndex);
        int temp1 = arr[randomIndex];
        arr[randomIndex] = arr[high];
        arr[high] = temp1;

        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }

    public static void quicksort(int[] arr, int low, int high) {
        // tail optimized version
        while(low < high) {
            int pi = partition(arr, low, high);
            System.out.println("Low: " + low + " Partition: " + pi + " High: " + high);
            quicksort(arr, low, pi-1);
            low = pi+1;
            System.out.println("AFTER RECURSION: Low: " + low + " Partition: " + pi);
        }
//        while(low < high) {
//            int pi = partition(arr, low, high);
//            if(pi - low < high - pi) {
//                quicksort(arr, low, pi-1);
//                low = pi+1;
//            } else {
//                quicksort(arr, pi+1, high);
//                high = pi-1;
//            }
//        }
    }

    public static void printarr(int[] arr) {
        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print((char)value + ", ");
        }
        System.out.println();
    }
}
