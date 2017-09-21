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
public class Subtract {
   static int a, b, c, d;
 static int[][] result= {{2,0},{1,6}};
    public static void SUBTRACT()
   {
      Scanner in = new Scanner(System.in);
 
     System.out.println("Enter number of rows for matrix 1");
      a = in.nextInt();
      System.out.println("Enter number columns for matrix 1");
      b = in.nextInt();
 
      int first[][] = new int[a][b];
      int second[][] = new int[a][b];
      int sub[][] = new int[a][b];
 
      System.out.println("Enter the elements for matrix 1");
 
      for (  c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the elements for matrix 2");
 
      for ( c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
            second[c][d] = in.nextInt();
 
      for ( c = 0 ; c < a ; c++ )
         for ( d = 0 ; d < b ; d++ )
             sub[c][d] = first[c][d] - second[c][d];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Sum is:");
 
      for ( c = 0 ; c < a ; c++ )
      {
         for ( d = 0 ; d < b ; d++ )
            System.out.print(sub[c][d]+"\t");
 
         System.out.println();
      }
   }
    
}
