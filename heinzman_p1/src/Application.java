import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter any four digit number: ");

        int number = scan.nextInt();
       System.out.println("you entered: "+number);
        scan.close();
		int firstDigit=0, secondDigit=0, thirdDigit=0, fourthDigit=0;
		int lastDigit, counter = 0;
		int newNumber = number;
		while(newNumber > 0) {
			lastDigit = newNumber % 10;      
			newNumber = newNumber / 10;
			counter++;
			if (counter == 1){
				fourthDigit = lastDigit;
			}
			if (counter == 2){
				thirdDigit = lastDigit;
			}
			if (counter == 3){
				secondDigit = lastDigit;
			}
			if (counter == 4){
				firstDigit = lastDigit;
			}
		}
		
		String newNum = Encrypter.encrypt(firstDigit, secondDigit, thirdDigit, fourthDigit); 
		System.out.println("encrypted number: "+newNum);
		System.out.println("decrypted number: "+Decrypter.decrypt(newNum));
	}
}
