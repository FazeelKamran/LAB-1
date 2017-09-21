package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TransposeTest {

	@Test
	public void test() {
		 Scanner in = new Scanner(System.in);

		 Transpose obj=new Transpose();
		int m[][] = {             //transpose of 1 2 3 4
			      { 1,3 },
			      { 2, 4 }
			    };		
	      
			
	      assertArrayEquals(m ,obj.result );
	}

}
