import java.util.Scanner;

public class ifmoon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score;
		
		System.out.println("시험 점수를 입력하세요.");
		score = scan.nextInt();
		{
			if(score >= 90)
			{
				System.out.println("A+입니다.");
			}
			else if(score >= 80)
			{
				System.out.println("B+입니다.");
			}
			else if(score >= 70)
			{
				System.out.println("C+입니다.");
			}
			else if(score >= 60)
			{
				System.out.println("D+입니다.");
			}
			else
			{
				System.out.println("F입니다.");
			}
		}
	}

}
