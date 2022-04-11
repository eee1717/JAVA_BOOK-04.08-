package ch03;

public class C06StringTypechange {

	public static void main(String[] args) {
		
	
		// 문자열 +문자열 
		
		System.out.println("String1" + "String2");//
		System.out.println("String1" + ',' + "String2");//
		System.out.println("String1" + 2); //문자열과 숫자의 덧셈  단순연결
		System.out.println(1 + 2 + "String");// 연산의 우선순위    왼쪽에서부터 오른쪽으로 연산된다. 1+2=3 3과 문자열을 단순연결
		
		
		
	    // 문자열 ---> 숫자형 
		//
	    // 
		
		System.out.println("10" + "20"); //문자열인 숫자 + 문자열인 숫자  
		
	int n1 =	Integer.parseInt("10"); //문자열에들어가있는 숫자를      interger int 10으로 해석한다  
	int n2 =	Integer.parseInt("10");
		
	System.out.println(n1+n2);
	
	System.out.println("10.5" + "20.7"); //문자열인 숫자 + 문자열인 숫자  
	
	double n3 = Double.parseDouble("10.5"); 
	double n4 =	Double.parseDouble("20.7"); 
		
	System.out.println(n3+n4);
	
	
	
	//Short.parseShort("");
	//Byte.parseByte("");
	//
	
	// 숫자형 ---> 문자형
	
	int ival = 10;
	double dval = 3.14;
	
	System.out.println(ival + dval);
	
	String str1 =String.valueOf(ival); // 위치값을 저장   valueof를통해서 문자열로바뀐다.
	String str2 =String.valueOf(dval); 

	System.out.println(str1+str2);     //10  3.14   '10'3.14 로된다.
	
	
	
	
	
	
	
	}

}
