/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
/**
 *
 * @author fkamran.bscs15seecs
 */
public class Multiplication {
    
	 static int[][] result= {{7,10},{15,22}};

    public static void MULTIPLICATION()
   {
        Scanner in = new Scanner(System.in);
      int a, b, c, d, add = 0, i, j, k;
 
     
      System.out.println("Enter number of rows for matrix 1");
      a = in.nextInt();
      System.out.println("Enter number columns for matrix 1");
      b = in.nextInt();
 
      int[][] matrix1 = new int[a][b];
 
      System.out.println("Enter the elements of first matrix");
 
      for ( i = 0 ; i < a ; i++ )
         for ( j = 0 ; j < b ; j++ )
            matrix1[i][j] = in.nextInt();
 
    System.out.println("Enter number of rows for matrix 2");
      c = in.nextInt();
      System.out.println("Enter number columns for matrix 2");
      d = in.nextInt();
 
      if ( b != c )
         System.out.println("Multiplication can't be possible due to wrong order!!!");
      else
      {
         int[][] matrix2 = new int[c][d];
         int multiply[][] = new int[a][d];
 
         System.out.println("Enter the elements of second matrix");
 
         for ( i = 0 ; i < c ; i++ )
            for ( j = 0 ; j < d ; j++ )
               matrix2[i][j] = in.nextInt();
 
         for ( i = 0 ; i < a ; i++ )
         {
            for ( j = 0 ; j < d ; j++ )
            {   
               for ( k = 0 ; k < c ; k++ )
               {
                  add = add + matrix1[i][k]*matrix2[k][j];
               }
 
               multiply[i][j] = add;
               add = 0;
            }
         }
 
         System.out.println("Product of entered matrices:-");
 
         for ( i = 0 ; i < a ; i++ )
         {
            for ( j = 0 ; j < d ; j++ )
               System.out.print(multiply[i][j]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}
