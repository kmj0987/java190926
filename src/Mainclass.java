
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열
		String a = "문자열"; // 선언과 동시에 문자열이라는 데이터 담음
		// 숫자
		int b = 1;	
		//논리형 참, 거짓
		boolean flg = false; // true 
		System.out.println("a =" +a);
		a = "나는 에이";
		System.out.println("a =" +a);
		
		// 숫자 변수 b를 출력
		System.out.println("b =" +b);
		b = 2;
		System.out.println("b =" +b);
		
		// 논리 변수 flg 를 사용 해봄
		// 만약에 참이면 a를 출력 만약에 거짓이면 b를 출력
		
		flg = false;
		if (flg) {
			 //flg가 참이면 여기 실행
			System.out.println("flg:a =" +a);
			
		}
		
		if (flg == false) {
			System.out.println("flg:b =" +b);
		}
		if (flg) {
			System.out.println("모");
		} else {
			System.out.println("도");
		}
		
		//돈이 있으면 밥을 먹고 없으면 집에 간다.
		 int don = 0;
		 System.out.println("내가 가진 돈은??" + don);
		 System.out.println("길을 가다가 돈 100원을 주었다 (그지새끼;)");
		 don = don = 100;
		 if (don > 0) {
			 System.out.println("밥 먹고하자");
		 } else {
			 System.out.println("집가라 그지년아");
		 }
		 
		//교통카드가 있으면 차타고 가고 없으면 걸어간다.
		
	}

}
