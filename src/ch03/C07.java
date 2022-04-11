package ch03;

public class C07 {

	public static void main(String[] args) {
		
//		byte byteValue = 10;
//		float floatValue = 2.5;  //?????
//		double doubleValue = 2.5;
//		
//		int result = 5 + byteValue;
//	
//		
//		System.out.println(result);
		
//		short s1 = 1;   
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		short result = s1 + s2; // result는 int연산자이다. 그렇기때문에 short로 된 변수는 result에저장이안됨.
//		int result = i1 + i2;  // 위의함수에 result가 short으로저장되어있어서 안된다. 위의값이 없다면 정상적으로된다.
//		
//		System.out.println(result);
//		
		
//		알파벳a의 유니코드는 97 b의유니코드는 98이다
		
//		a의유니코드에 1을더하면 b의 유니코드가 되므로 b의유니코드가 생성되어야하는데 에러가발생했다.이유는?
//		
//		char c1 = 'a';
//		char c2 =(char) (c1 + 1);// c1은 char형   1은 int형이라서 b의유니코드를 생성시키기위해서는 c1과1을 둘다 char형으로 묶어줘야한다.
//	
//		System.out.println(c2);
		

////6. 자바에서 / 는 나눗셈 연산자 입니다 x/y 는 x 를 y 로 나누는 연산을 수행합니다
////빈칸에 들어갈 타입은 무엇이며 출력되는 결과와 그 이유를 설명해 보세요
//		
//		int x = 5;
//		int y = 2;
//	
//		int result = x/y ; //  int 인것까지는 알겠는데 (int)가 왜안되는지모르겠다.
//		
//		System.out.println(result);
//		
//		7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다 빈칸에 들어갈 코드를
//		작성하세요
//		
//		int x = 5;
//		int y = 2;
//		double result = (double)x/y ;
//		System.out.println(result);
//		
		
//		8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다
//		빈칸에 들어갈 코드를 작성해 보세요
//		
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result = (int)(var1+var2);   // 답은 맞는데 왜 실행이안되는지모르겟다.
//		
//		
//		9. var1 부터 var4까지 + 연산을 수행해서 int 타입 result변수에 9가 저장되도록
//		빈칸에 들어갈 코드를 작성해보세요
//		[예시]
//		----------------------------
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		double n4 =Double.parseDouble("3.9");
//		int result = (int)(var1+var2+var3+n4);
//		
//		System.out.println(result);
//		
		
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3; // 2 " "  + "3" 문자열
		String str3 = "" + 2 + 3; // "2"문자열 +"3"문자열
		System.out.println(str1); //
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
