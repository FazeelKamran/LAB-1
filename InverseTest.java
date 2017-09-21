package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class InverseTest {

	@Test
	public void test() {
		 Scanner in = new Scanner(System.in);

		 Inverse obj=new Inverse();
		int m[][] = {             //inverse of [1 2 3 4]
			      { -1,0 },
			      { 1, 0 }
			    };		
	      assertArrayEquals(m ,obj.result );
	}

}
