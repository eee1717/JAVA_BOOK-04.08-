package ch03;

public class C05Arithchange {

	public static void main(String[] args) {
	
		int num = 10, div = 4;
		
		double result1 =num/div;
		double result2 =(double)num/div;
		
		System.out.println("result1 :" + result1);   //  원래 2.5가 맞으나  num이 int형이기때문에 0.5.가 사라지기때문에(데이터손실) 2.0으로 인식되어 2가된다.
		System.out.println("result2 :" + result2);  //   num이 double형이기때문에 소수점을 잡아낼수있어서 정상적으로 2.5가 나온다.
		
		
		
		
		
		
		
		
		

	}

}
