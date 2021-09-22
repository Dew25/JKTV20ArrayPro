/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20arraypro;

import java.util.Arrays;
import java.util.Random;



/**
 *
 * @author Melnikov
 */
public class JKTV20ArrayPro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums;
        nums = new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        //--------- Вывод массива ---------
        System.out.print("nums = ");
        System.out.print("[");
        for(int i = 0; i<nums.length; i++){
            if(i<nums.length-1){
                System.out.printf("%d",nums[i]);
                System.out.print(", ");
            }else{
                System.out.printf("%d",nums[i]);
            }
        }
        System.out.println("]");
        //-----------------------------------
        //Можно использовать специальный инструмент, дающий тот же результат
        System.out.println("nums = "+Arrays.toString(nums));
        
        // Многомерный массив
        Random random = new Random();
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(10);
            }
        }
        System.out.println("matrix = ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("matrix = ");
        for(int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
        
        //Зубчатый массив
        int[][] matrixZ = new int[5][];
//        matrixZ[0] = new int[2];
//        matrixZ[1] = new int[3];
//        matrixZ[2] = new int[4];
//        matrixZ[3] = new int[5];
//        matrixZ[4] = new int[6];
        int j = 2;
        for(int i = 0; i < matrixZ.length; i++){
           matrixZ[i] = new int[j];
           j++;
        }
        for(int i = 0; i < matrixZ.length; i++){
            for(int k = 0; k < matrixZ[i].length; k++){
                matrixZ[i][k] = random.nextInt(10);
            }
        }
        System.out.println("matrixZ = ");
        for(int i = 0; i < matrixZ.length; i++){
            System.out.println(Arrays.toString(matrixZ[i]));
        }
    }
    
}
