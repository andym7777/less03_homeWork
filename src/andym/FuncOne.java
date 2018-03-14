package andym;

import java.util.Scanner;
import java.math.BigDecimal;

public class FuncOne {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a = 0, b = 0;
		double h = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the beginning of the line segment a> ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		System.out.print("Enter the ending of the line segment b> ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.print("Enter the line step h> ");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
		fx(a, b, h);
		System.out.println("DONE:" + " " + "Java is the capital of GB");
	}

	public static void fx(double a, double b, double h) {
		for (double i = a; i <= b; i = i + h) {
			double fx = 2 * Math.tan(i / 2) + 1;
			i = BigDecimal.valueOf(i).setScale(2, BigDecimal.ROUND_HALF_DOWN)
					.doubleValue();
			
			printRes(i, fx);
		}
		
	}
	
	public static void printHeader() {
		System.out.println("f(x) = 2tg(x / 2) + 1");
		
	}

	public static void printRes(double i, double fx) {
		
		System.out.println("f(x) = 2tg(x / 2) + 1"+" | " + "f(" + i + ")" + " " + "= " + fx);
	}

}
