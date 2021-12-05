package Homework_Lesson4.Task1;

import java.util.Arrays;

public class ArrayNumber {

        private int[] array;

        ArrayNumber(int[] array){
            this.array = array;
        }

        public int[] sortArrays() {
            int [] copyArray;
            Arrays.sort(array);
            copyArray = Arrays.copyOf(array, array.length);
            return copyArray;
        }

        public int maxNumb() {
            int maxNumber = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i-1]){
                    maxNumber = array[i];
                }
            }
            return maxNumber;
        }

        public int minNumb() {
            int minNumber = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]){
                    minNumber = array[i];
                }
            }
            return minNumber;
        }

        public int sumNumb() {
            int sumNumber = 0;
            for (int i = 0; i < array.length; i++) {
                sumNumber += array[i];
            }
            return sumNumber;
        }
    }
