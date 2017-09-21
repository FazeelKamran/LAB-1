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
public class Add {
	 
	static int result[][] = {{0,2},{0,2}};
     public static void ADD()
   {
     int t,u,c,d;
     Scanner in = new Scanner(System.in);
// Scanner inn=new Scanner(System.in);
      System.out.println("Enter number of rows for matrix 1");
      
	t = in.nextInt();
      System.out.println("Enter number columns for matrix 1");
      u = in.nextInt();
        int first[][] = new int[t][u];
   	 int second[][] = new int[t][u];

      
     
      int sum[][] = new int[t][u];
 
      System.out.println("Enter the elements of first matrix");
 
      for (  c = 0 ; c < t ; c++ )
         for ( d = 0 ; d < u ; d++ )
            first[c][d] = in.nextInt();
 
      System.out.println("Enter the elements of second matrix");
 
      for ( c = 0 ; c < t ; c++ )
         for ( d = 0 ; d < u ; d++ )
            second[c][d] = in.nextInt();
 
      for ( c = 0 ; c < t ; c++ )
         for ( d = 0 ; d < u ; d++ )
             sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
 
      System.out.println("Sum of entered matrices:-");
 
      for ( c = 0 ; c < t ; c++ )
      {
         for ( d = 0 ; d < u ; d++ )
            System.out.print(sum[c][d]+"\t");
         System.out.println();
      }
   }
    
    
}
