package lab1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
	     Scanner in = new Scanner(System.in);

            Add obj=new Add();
		int m[][] = {
			      { 0, 2 },
			      { 0, 2 }
			    };		
	      
			
	      assertArrayEquals(m ,obj.result );
	}

	
	
	      


}
