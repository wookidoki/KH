package com.kh.run;
import com.kh.operator.*;

public class Run {
	
	public static void main (String[] args) {
		
		
		A_Arithmetic math = new A_Arithmetic() ;
		//math.method();
		//math.();
		
		B_InDe math1 = new B_InDe();
		//math1.postfix();
		
		//math1.prefix();
		
		C_Compund math2 = new C_Compund ();
		
		//math2.compund();
		//math2.method1();
		
		D_LogicalNagation math3 = new D_LogicalNagation ();
	
		//math3.method2();
		
		E_Comparison math4 = new E_Comparison ();
		//math4.method1();
		
		F_Logical math5 = new F_Logical ();
		//math5.logicMethod();
		///math5.logicMethod2();
		//math5.logicMethod3();
		
		G_Triple math6 = new G_Triple ();
		//math6.method1();
		math6.method2();
		
		
		
	}

}
