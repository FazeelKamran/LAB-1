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
public class Transpose {
	 static int[][] result= {{1,3},{2,4}};

     public static void TRANSPOSE()
   {
      int a, b, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter number of rows for matrix 1");
      a = in.nextInt();
      System.out.println("Enter number of columns for matrix 1");
      b = in.nextInt();
 
      int first[][] = new int[a][b];
      int second[][] = new int[a][b];

 
      System.out.println("Enter the elements for matrix");
 
      for (  c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
            first[c][d] = in.nextInt();
 
     for ( c = 0 ; c < a ; c++ )
      {
         for ( d = 0 ; d < b ; d++ )               
            second[d][c] = first[c][d];
      }
 
      System.out.println("Trasnspose is:-");
 
      for ( c = 0 ; c < a ; c++ )
      {
         for ( d = 0 ; d < b ; d++ )
            System.out.print(second[c][d]+"\t");
         System.out.println();
      }
   }
    
    
    
}
