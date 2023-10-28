//Задача 3.
//Написать функцию, возвращающую истину,
//если в переданном массиве есть два соседних элемента, с нулевым значением.


public class Task3 {
    public static boolean hasZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 2, 3};
        System.out.println("Has zero neighbors: " + hasZeroNeighbors(arr1));

        int[] arr2 = {1, 2, 3, 4};
        System.out.println("Has zero neighbors: " + hasZeroNeighbors(arr2));
    }
}
