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
public class Scalar {
	 static int[][] result= {{6,0},{4,12}};
    
    public static void SCALAR()
   {
      int a, b, c, d;
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter number of rows for matrix 1");
      a = in.nextInt();
      System.out.println("Enter number columns for matrix 1");
      b = in.nextInt();
 
      int first[][] = new int[a][b];
      int second[][] = new int[a][b];
      int Scalar[][] = new int[a][b];
 
      System.out.println("Enter the elements for matrix");
 
      for (  c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the Scalar value");
 
      
            int scalar = in.nextInt();
 
      for ( c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
             Scalar[c][d] = first[c][d] * scalar;  //replace '+' with '-' to subtract matrices
 
      System.out.println("Scalar Multiplication is:-");
 
      for ( c = 0 ; c < a ; c++ )
      {
         for ( d = 0 ; d < b ; d++ )
            System.out.print(Scalar[c][d]+"\t");
         System.out.println();
      }
   }
    
    
    
}
