package ganhwa;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� �̸��� �Է��ϼ��� : ");
		String item = scanner.next();
		
		System.out.print("��ȭ ���� Ȯ���� �Է��ϼ��� : ");
		double number = scanner.nextDouble(); 
		{
			if(number > 100)
			{
				System.out.println("100���� Ŭ �� �����ϴ� �ٽ� �Է��� �ֽʽÿ�");	
				return;
			}
			else if(number < 0)
			{
				System.out.println("0���� ���� �� �����ϴ�");
				return;
			}
			
			
		}
		
		System.out.println("���� Ȯ���� " + (100-number) + "�Դϴ�.");
		
		
			
		int i = ((int)(Math.random()*100)+1); //1���� 100�� ���� ����
		
		if(i < 100-number)
		{
			System.out.println("��Ÿ���׿�.. �����Դϴ�");
		}
		else
		{
			System.out.println("�����մϴ� ! �����Դϴ�");
		}
	}

}
