import java.util.Scanner;
public class activity2 {

    public static void main(String[] args) {

        System.out.print("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sen = input.nextLine();
	
	
        char[] charArray = sen.toCharArray();
        boolean x = true;

        for(int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if(Character.isLetter(charArray[i])) {

                // check space is present before the letter
                if(x) {

                    // change the letter into uppercase
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    x = false;
                }
            }

            else {
                // if the new character is not character
                x = true;
            }
        }

        // convert the char array to the string
        sen = String.valueOf(charArray);
        System.out.println("Message: " + sen);
    }
}