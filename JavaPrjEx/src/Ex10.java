import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		a=scn.nextInt();

		System.out.println("+�� 1, -�� 2, *�� 3, /�� 4 �� �Է����ּ���");
		b=scn.nextInt();
		
		System.out.println("�ι�° ���ڸ� �Է����ּ���");
		c=scn.nextInt();
		
		switch (b) {
		case 1:
			d=a+c;
			System.out.printf("%d + %d = %d", a, c, d);
			break;
		case 2:
			d=a-c;
			System.out.printf("%d - %d = %d", a, c, d);
			break;
		case 3:
			d=a*c;
			System.out.printf("%d * %d = %d", a, c, d);
			break;
		case 4:
			d=a/c;
			System.out.printf("%d / %d = %d", a, c, d);
			break;
			
		default:System.out.println("�߸� �Է� �߽��ϴ�.");
			break;
		}
	}

}
