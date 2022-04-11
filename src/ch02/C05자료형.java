package ch02;

public class C05자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');
		System.out.println((char)100);
		System.out.println((char)200);
		System.out.println((char)30000);
		System.out.println((char)12345);
	
        System.out.println((char)10);  // char는 문자열
		
        
        System.out.printf("%x\n",(int)'A');  //16진수변환 해서 출력 
		System.out.printf("%x\n",(int)'a');  
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
	
		   System.out.println('\u0041');  //유니코드값을 이용해서 문자를출력
			System.out.println('\u0061');  
			System.out.println('\uac00');
			System.out.println('\uac02');
			
		
		
		
	}
	
}
