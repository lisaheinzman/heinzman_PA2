
public class Encrypter {

	public static String encrypt(int firstDigit, int secondDigit, int thirdDigit, int fourthDigit) {
		
		firstDigit= (firstDigit+7)%10;
		secondDigit= (secondDigit+7)%10;
		thirdDigit= (thirdDigit+7)%10;
		fourthDigit=(fourthDigit+7)%10;
		
        String encryptedNumber = Integer.toString(thirdDigit)+ Integer.toString(fourthDigit)+ Integer.toString(firstDigit)+ Integer.toString(secondDigit);

        return encryptedNumber;
	}
}
