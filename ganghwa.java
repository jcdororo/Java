package ganhwa;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이템의 이름을 입력하세요 : ");
		String item = scanner.next();
		
		System.out.print("강화 성공 확률을 입력하세요 : ");
		double number = scanner.nextDouble(); 
		{
			if(number > 100)
			{
				System.out.println("100보다 클 수 없습니다 다시 입력해 주십시오");	
				return;
			}
			else if(number < 0)
			{
				System.out.println("0보다 작을 수 없습니다");
				return;
			}
			
			
		}
		
		System.out.println("실패 확률은 " + (100-number) + "입니다.");
		
		
			
		int i = ((int)(Math.random()*100)+1); //1부터 100의 랜덤 난수
		
		if(i < 100-number)
		{
			System.out.println("안타깝네요.. 실패입니다");
		}
		else
		{
			System.out.println("축하합니다 ! 성공입니다");
		}
	}

}
