import java.util.Scanner;
import java.util.Random;

//Creating an 6 Digit OTP Code Generator
public class otpGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		//generating 6-digit otp code
		int[] otp = new int[10];
			otp[0] = rnd.nextInt(10);
			otp[1] = rnd.nextInt(10);
			otp[2] = rnd.nextInt(10);
			otp[3] = rnd.nextInt(10);
			otp[4] = rnd.nextInt(10);
			otp[5] = rnd.nextInt(10);
		
		//displaying the generated Code
		System.out.print("OTP Code: "+otp[0]);
		System.out.print(otp[1]);
		System.out.print(otp[2]);
		System.out.print(otp[3]);
		System.out.print(otp[4]);
		System.out.print(otp[5]);
		
		//Asking the user to input the Generated OTP Code
		System.out.print("\n\nEnter the OTP Code: ");
		String ver = sc.nextLine();
		
		//getting the input by seperating each digit
		int[] get = new int[10];
			get[0] = ver.charAt(0);
			get[1] = ver.charAt(1);
			get[2] = ver.charAt(2);
			get[3] = ver.charAt(3);
			get[4] = ver.charAt(4);
			get[5] = ver.charAt(5);
		
		//Getting the sum of the otp then the otp input by the user
		otp[6] = otp[0]+otp[1]+otp[2]+otp[3]+otp[4]+otp[5]+288;
		get[6] = get[0]+get[1]+get[2]+get[3]+get[4]+get[5];
		
		/* for checking if the sum of the otp and otp inputted by the user matches
		 * System.out.println("otp[6]: "+otp[6]);
		 * System.out.println("get[6]: "+get[6]);
		 */
		
		//if statements for matching otp and input by the user
		if (otp[6]==get[6]) {
			System.out.println("\nOTP Matches. Success!");
		} else {
			System.out.println("\nOTP Differs. Unsuccessful:(");
		}
		
		
		
	}

}
