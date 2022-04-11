package ch02;

public class C04자료형 {

	public static void main(String[] args) {
		
	  // int   자료형(기본자료형)
	//	int var1 = 0b1111;  //  2진수  비트의값을 보여준다
	//	int var2 = 0206;   //   8진수  비트의값보여줌
	//	int var3 = 365 ;   //   10진수
	//	int var4 = 0xb3;   //   16진수
		
	
		
		
	//	System.out.println("var1: " +var1);
	//	System.out.println("var2: " +var2);
	//	System.out.println("var3: " +var3);
	//	System.out.println("var4: " +var4);
	
	 // byte 자료형(1byte)
//     	
//		byte var1 =-128  ;
//        byte var2 =-30   ;
//        byte var3 = 30   ;
//        byte var4 = 127  ;
//	
//     	System.out.println("var1: " +var1);
//    	System.out.println("var2: " +var2);
//    	System.out.println("var3: " +var3);
//    	System.out.println("var4: " +var4);
//	
//	
//	각각 4 byte 공간(int(숫자들)의공간)에  -128, 30, 30 ,127이 저장됨        byte의  8byte공간에  var4의 128은 8byte공간에 자리가 부족하기때문에 자
	
		
//		 char 자료형 (2byte -음수값 x)   16bit ---> 0-65535
		
//		char var1 = 65535;
//		char var2 = 5000;
//		char var3 = 400;
//		char var4 = 30;
//	
//	 	System.out.println("var1: " +(int)var1);
//    	System.out.println("var2: " +(int)var2);
// 	    System.out.println("var3: " +(int)var3);
//  	    System.out.println("var4: " +(int)var4);
//	
  	    // char라는 자료형은 문자를 기록하기위해서 만들어진 자료형                          문자에도 숫자형태(bit)로저장되어있다. ( ex)a = 97로되어있다.)
  	    
  	    
//  	    short 자료형 (2byte -음수값 o)    약 -32768 ~ +32767
  	    
//		short var1 =-32768;
//		short var2 = 32767;
//		short var3 =  1234;
//		short var4 =  4567;
//  	    
//		
//		char ch1 = var2;  // 자료형이다르면 에러가난다 자료형이다르면 자료형을같도록 해야지 정상적으로 작동한다.
//		
//		
//		
//		
//		
//		
//		System.out.println("var1: " +var1);
//    	System.out.println("var2: " +var2);
//    	System.out.println("var3: " +var3);
//    	System.out.println("var4: " +var4);
	
		// long 자료형 (8byte - 음수값 o)
		// int자료형(최대값 -21억 +21억)
		// long자료형(최대값
		
	//	long var1 =20000000000;   // long은 괜찮으나 int자료형이 부족해서 담을수없기때문에 오류가난다.
//		long var1 =2000000000L;   
//		long var2 =100;
//		
//		long var3 =100;
//		long var4 =100;
  	
//		double 자료형 (8byte) - 기본자료형(15-18자리)
//		float 자료형 (4byte)	- (5-9자리) 
	
		double var1 = 10.77777777777777777777; //소수점부터 7가 20개 double은 8byte라서 문제없다.
//		float  var2 = 10.77777777777777777777; //소수점부터 7가 20개 float은 4byte라서 문제오류가생김
		float  var2 = 10.77777777777777777777F;
		double var3 = 30.5;
		double var4 = 40.15;
		

	
		System.out.println("var1: " +var1);
    	System.out.println("var2: " +var2);
    	System.out.println("var3: " +var3);
    	System.out.println("var4: " +var4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
