package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void test() {
		 Scanner in = new Scanner(System.in);

		 Multiplication obj=new Multiplication();
		int m[][] = {             //multiplication of [1 2 3 4] and [1 2 3 4]
			      { 7,10 },
			      { 15, 22 }
			    };		
	      
			
	      assertArrayEquals(m ,obj.result );	}

}
