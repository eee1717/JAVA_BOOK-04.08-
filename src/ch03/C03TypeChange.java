package ch03;

public class C03TypeChange {

	public static void main(String[] args) {
		
		int num1 =129;         // 00000000 00000000 00000000 10000001
		int num2 =130;         // 00000000 00000000 00000000 10000010
		byte ch1 =(byte)num1;  // 1byte(8bit)                00000000
	                           // 1byte(8bit)                10000001 가되어버린다.
		
		
		byte ch2 =(byte)num2; 
	                       	  // 1byte(8bit)                10000010 가되어버린다.
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		

	}

}
