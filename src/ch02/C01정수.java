package ch02;

public class C01정수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//00000000
		//%d :10진 출력 서식문자
	    System.out.printf("십진: %ㅇn" ,0b11111); //2진수
		System.out.printf("십진: %d\n" ,173); //10진수
	    System.out.printf("십진: %d\n" ,173);// 8진수
	    System.out.printf("십진: %d\n" ,173);// 16진수
		
	
	//%o :8진 서식문자
	
	    System.out.printf("팔진서식: %o\n" ,173);
	    System.out.printf("팔진서식: %o\n" ,0255);
	    System.out.printf("팔진서식: %o\n" ,0xAD);
	
		//16진서식문자
	    System.out.printf("16진서식: %x\n" ,173);
	    System.out.printf("16진서식: %x\n" ,0255);
	    System.out.printf("16진서식: %x\n" ,0xAD);
	    

	    
	}

}
