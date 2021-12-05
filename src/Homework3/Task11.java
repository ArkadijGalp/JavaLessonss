package Homework3;

import java.util.Arrays;


public class Task11 {
    public static void main(String[] args) {
                int[] array = new int[]{1,2,3,4,5,6};
                int[] array_new = new int[array.length-1];
                int j=4;
                for(int i=0, k=0;i<array.length;i++){
                    if(i!=j){
                        array_new[k]=array[i];
                        k++;
                    }
                }
                System.out.println("Before deletion :" + Arrays.toString(array));
                System.out.println("After deletion :" + Arrays.toString(array_new));

            }
        }
