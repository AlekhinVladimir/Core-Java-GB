//Задача 2.
//Написать функцию, возвращающую разницу между самым
//большим и самым маленьким элементами переданного не пустого массива.


public class Task2 {
    public static int findDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int difference = findDifference(arr);
        System.out.println("Difference: " + difference);
    }
}
