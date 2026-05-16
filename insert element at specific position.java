class Main {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int position = 2;   // index where element will be inserted
        int element = 25;

        int newArr[] = new int[arr.length + 1];

        // Copy elements before position
        for(int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert new element
        newArr[position] = element;

        // Copy remaining elements
        for(int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print updated array
        System.out.println("Array after insertion:");

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
