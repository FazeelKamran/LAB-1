package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ScalarTest {

	@Test
	public void test() {
		 Scanner in = new Scanner(System.in);

         Scalar obj=new Scalar();
		int m[][] = {
			      { 6, 0 },
			      { 4, 12 }
			    };		
	      
			
	      assertArrayEquals(m ,obj.result );
	}

}
