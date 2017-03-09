import java.util.Calendar;
import java.util.Scanner;
import java.util.ArrayList;

public class first {

	public static void main(String[] args) {
		ArrayList<Object> listUsers = new ArrayList<Object>();
		
		String name = new String();
		String first_name = new String();
		int birthYear ;
		boolean carryOn = true;
		String question = new String();
		
		Scanner input = new Scanner(System.in);
		
		while(carryOn){
			
			ArrayList<Object> temp = new ArrayList<Object>();
			
			System.out.println("Renseigner votre nom : ");
			name = input.nextLine();
			
			System.out.println("Renseigner votre prénom : ");
			first_name = input.nextLine();
			
			System.out.println("Renseigner votre année de naissance : ");
			birthYear = input.nextInt();
			
			int year = Calendar.getInstance().get(Calendar.YEAR);
			System.out.println("Tu t'appelles " + first_name + ' ' + name + " et tu as " + (year - birthYear) + "ans");
			
			System.out.println("Un autre utilisateur?(Y/N)");
			input.nextLine();
			question = input.nextLine();
			
			temp.add(first_name);
			temp.add(name);
			temp.add(birthYear);
			
			carryOn = (question.equals("Y"))?true:false;
			
			listUsers.add(temp);
			
		}
		System.out.println(listUsers);
		input.close();
	}

}
