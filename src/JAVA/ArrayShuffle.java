package JAVA;

import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        
        //Print original array first
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        shuffleArray(array);
        
       //Print shuffled array first
        System.out.println("");        
        System.out.print("Shuffled Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i >=0 ; i--) {
            int j = rand.nextInt(array.length - 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

