import java.util.Arrays;

class ArrayOperations {
    private int[] arr;
    private int size;

    public ArrayOperations(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Insert element at end
    public void insert(int value) {
        ensureCapacity();
        arr[size++] = value;
    }

    // Insert at a specific index
    public void insertAt(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("Index out of range!");
            return;
        }
        ensureCapacity();
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = value;
        size++;
    }

    // Delete element at index
    public void deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    // Search element in array
    public int search(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    // Update value
    public void update(int index, int newValue) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }
        arr[index] = newValue;
    }

    // Display array
    public void display() {
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Double array size when full
    private void ensureCapacity() {
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
    }

    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations(5);

        array.insert(10);
        array.insert(20);
        array.insert(30);

        array.insertAt(1, 15);

        array.display(); // Array: 10 15 20 30

        array.deleteAt(2);

        array.display(); // Array: 10 15 30

        System.out.println("Index of 30: " + array.search(30));

        array.update(1, 99);
        array.display(); // Array: 10 99 30
    }
}
