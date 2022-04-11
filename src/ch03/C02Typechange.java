package ch03;

public class C02Typechange {

	public static void main(String[] args) {
		// 강제형변환
        // 프로그래머에의한 형변환
        // 좁은공간에 큰공간의값을 대입하려는 경우 
		// 데이터 손실이 일어날 가능성이 크다. 
		// 
		
		int ival = 44032;  // ival에 44032라는 값이들어감 int형으로
		char cval = (char)ival;  // ival은 int형이기때문에 char 자료형의cval에 들어가지지않는다 그래서 ival을 char형으로 바꾸어주어야한다.
		System.out.println(cval);
		
		long lval = 500;  
		ival = (int)lval;         //
		System.out.println(lval);
		
		double dval = 3.14 ;
		ival = (int)dval;
		System.out.println(ival);
		
		
		
		
	}

}
