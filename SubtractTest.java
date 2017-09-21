package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class SubtractTest {

	@Test
	public void test() {
		 Scanner in = new Scanner(System.in);

         Subtract obj=new Subtract();
		int m[][] = {
			      { 2, 0 },
			      { 1, 6 }
			    };		
	      
			
	      assertArrayEquals(m ,obj.result);
	}

}
