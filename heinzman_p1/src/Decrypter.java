
public class Decrypter {
	public static String decrypt(String newNum) {
		int firstDigit=0, secondDigit=0, thirdDigit=0, fourthDigit=0;
		int newNumInt = (Integer.valueOf(newNum));
		
		firstDigit= (newNumInt/1000+3)%10;
        secondDigit= (newNumInt%1000/100+3)%10;
        thirdDigit= (newNumInt%100/10+3)%10;
        fourthDigit=(newNumInt%10+3)%10;	

	    String decryptedNumbers =  Integer.toString(thirdDigit)+ Integer.toString(fourthDigit)+ Integer.toString(firstDigit)+ Integer.toString(secondDigit);
	    
	    return decryptedNumbers;
		}
		
}
