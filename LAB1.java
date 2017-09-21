
package lab1;

import java.util.Scanner;
 
public class LAB1
{
	public static Scanner in = new Scanner(System.in);
    
   public static void main(String args[])
   {
      
		int optSelected;
                String operator;
                String equation;
                int count=0;
                String[] x = new String[10];
                int i=1;
                Add add_obj=new Add();
                Multiplication Multiplication_obj=new Multiplication();
                Inverse inverse_obj=new Inverse();
                  Subtract sub_obj=new Subtract();
                  Scalar scalar_obj=new Scalar();
                  Transpose transpose_obj=new Transpose();
                  System.out.println("Choose the operation(Enter s for scalar multiplication, + for addition, - for subtraction, ^ for transpose, * for multilpication, ! for inverse): \n");

                  System.out.println("Enter an Equation( e.g ! A + B):");
                  equation=in.nextLine();
                  String[] words=equation.split("\\s");//splits the string based on whitespace  
                //using java foreach loop to print elements of string array  
                for(String w:words){  
                System.out.println(w);
                x[i]=w;
                i++;
                count++;
                }  
                


           //       operator=in.nextLine();
                for(int j=1;j<=count;j++)
                {
		switch(x[j]){
		case "s":
			Scalar.SCALAR();
			break;
		case "+":
			Add.ADD();
			break;
		case "-":
			Subtract.SUBTRACT();
			break;
                case "^":
			Transpose.TRANSPOSE();
			break;
                case "*":
			Multiplication.MULTIPLICATION();
			break;
                case "!":
			Inverse.INVERSE();
			break;        
		default:
			
			break;
		}
		
   }
}
}