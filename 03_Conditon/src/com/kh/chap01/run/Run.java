package com.kh.chap01.run;
import com.kh.chap01.condition.*;

public class Run {
	
	public static void main (String[]args) {
		
		A_If classA_If = new A_If() ;
		
		//classA_If.method1 ();
		//classA_If.lunchMenu ();
		
		B_Else b = new B_Else() ;
		//b.method1();
		//b.method2();
		//b.checkAge();
		
		C_Switch c = new C_Switch() ;
		//c.method0();
		//c.method1();
		c.login();
	}

	
	

}
