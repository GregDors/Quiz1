import java.util.Scanner;

public class QBrating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many passing attempts does the QB have: ");
		double attempts = input.nextDouble();
		
		System.out.print("How many completions does the QB have: ");
		double completions = input.nextDouble();
		
		System.out.print("How many passing yards does the QB have: ");
		double yards = input.nextDouble();
		
		System.out.print("How many touchdowns does the QB have: ");
		double tds = input.nextDouble();
		
		System.out.print("How many doubleerceptions does the QB have: ");
		double interceptions = input.nextDouble();
		
		double a = (completions/attempts- 0.3)*5;
		double b = (yards/attempts - 3)*0.25;
		double c = tds/attempts*20;
		double d = 2.375 - interceptions/attempts*25;
		
		double Passer_Rating = (a + b + c + d) / 6 * 100;
		Passer_Rating = Math.round(10*Passer_Rating)/((double)10);
		
		
		System.out.print("The Quarterback's passer Rating is: " + Passer_Rating);

	}

}
