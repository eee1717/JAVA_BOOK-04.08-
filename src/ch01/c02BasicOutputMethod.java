package ch01;

public class c02BasicOutputMethod {

	public static void main(String[] args) {
		
	
		// System.out 표준 출력 스트림(해석 :표준출력장치(모니터)에 데이터를 전달) 
	
	     // System.out.println() :콘솔 화면에 데이터 출력

	 //Escape 문자: 본래의 정보표시용으로 사용하는게 아닌 
		// 제어문자용으로 쓰기위해 지정된 문자
		
		// \n :개행(줄바꾸기)
		// \b :한문자 삭제 
		// \t :탭(8칸)만큼 커서이동 
		
	 System.out.println("hello world\n");
	 System.out.println("hello world\n");
	 System.out.println("저의이름은 홍길동 입니다.\n나이는 22세입니다.\n사는곳은 대구입니다.\n");
	 System.out.println("*\n***\n*****\n******* ");
	 // *
	 // ***
	 // *****
	 // *******
	
	 // System.out.printf() :서식문자를이용한 출력 
	 // 서식: 서류를 꾸미는 일정한 양식
	 // %d :10진 정수 서식
	 // %f :10진 실수 서식
	 // %c: 한문자 서식
	 // %s :문자열서식
	  System.out.printf("%d + %d = %d\n",10,20,10+20 );
	  System.out.printf("%f + %f %f\n", 10.1, 10.2, 10.1+20.2);
	  System.out.printf("%c %c %c \n",'a','b','c');
	  System.out.printf("%s %s %s \n","this is","String","test");
	  System.out.printf("%d [%c] %s\n",1,'A',"Java programming Basic");
	  
	  
	  // 문제 
	  // 다음 내용을 printf로 출력하세요
	  // 적절한 위치에 서식문자(%s)와 제어문자(\t,\n)을 사용하여 출력합니다.
	  // 이름    나이    주소
	  // 홍길동   20     대구
	  // 김철수   30     울산 
	  // 박영희   40     인천
//	  System.out.printf("이름   나이   주소 ");
//	  System.out.printf("\n%s\t%d\t%s" ,"홍길동",20, "대구" );
//	  System.out.printf("\n%s\t%d\t%s" ,"김철수",30, "울산" );
//	  System.out.printf("\n%s\t%d\t%s" ,"박영희",40, "인천" );
	
	  
	  //서식문자를 이용하여 다음과 같은 문장을 완성합니다.
	  // 나의 이름은 %s 살입니다.
	  // 나의 나이는 %d 살입니다.
	  
	  
	  System.out.printf("\n나의 이름은 %s입니다.","허준석" );
	  System.out.printf("\n나의 나이은 %s살입니다.",26 );
	  
	  
	  //System.out.println(); ---> /n포함한 ㅜ출력 
	  
	  
	  System.out.println("hello world");
	  System.out.println("hello world");
	  System.out.println("hello world");
	  System.out.println("hello world"); 
	  
	  
	  //주의 
	  
	  // " 의 문자그대로의 출력
	  System.out.println("나는 말한다 \"안녕이라고\" ");
	
	} 
	
	
	}


