
public class Exercise2_SortArray {

    public static void main(String[] args) {

        System.out.print("Enter size of array: ");
        int size = ConsoleInput.getInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = ConsoleInput.getInt();
        }

        // Sorting
        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
