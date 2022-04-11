package ch04;

import java.util.Scanner;

public class C01Scanner {

	public static void main(String[] args) {
		
		// System.in :표준입력 스트림 요청 (ex:키보드)
		// System.out:표준출력 스트림 요청 (ex:모니터)
		
		// new Scaner(System.in): 표준 입력 스트림과 연결될 객체생성 
		// Scanner sc : 스캐너 장치의 위치정보를 저장할 용도의 참조변수
		
		Scanner sc = new Scanner(System.in);  //완벽하게 배우지못해도 정확히이해하지못한다.  키보드랑 연결해서 키보드의 명령을 받는 변수를 만들어낸다. 스트림을 만들어내는명령어				
		
		//new Scanner(System.in)
		//--> 키보드와 연결될 스캐너 객체 생성
		
		// Scanner sc
		// -> 키보드와 연결되는 스캐너 객체 만들어 sc참조변수에 연결시킨다.
		
		
		
		
		System.out.print("정수 3개 입력 :" );
		int num1 = sc.nextInt();	 // 정상적으로 작동시키면 키보드랑 연결시킬수있다. 중요하다 파일에연결하는방식으로사용할수있다. 키보드로부터 정수값을받아서 num1에연결
		int num2 = sc.nextInt();     // 키보드로부터 정수값을받아서 num2에연결 띄어쓰기나 enter로 다음에 입력할 변수로 이동한다.
		int num3 = sc.nextInt();     // 키보드로부터 정수값을받아서 num3에연결
		int sum = num1 + num2 + num3;
		
		System.out.println("Sum :" + sum);
	
	
	 sc.close();
	
	
	 // 스트림(stream): 시냇물,물줄기 (특징: 단방향성)  
	 // 스트림은 데이터가 이동되는 가상채널(주변장치-프로그램,저장공간-프로그램)을 말한다.
	 
//	 
//	 모니터 (표준출력)
//	 키보드 (표준입력)
//	 os               
//	 
//	 예를 들어 키보드를통해서 os안의 app에 명령이나부탁을 보내는 것을 svstem.in이라고한다. 
//	 그리고  os를통해서 모니터에 화면을 보여주는 행동같은것을 sysyem.out이라고한다.
//	 그리고 명령이나 보여주는 행동을 stream이라고한다.
	
	}

}
