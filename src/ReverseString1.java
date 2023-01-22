public class ReverseString1 {
    public static void main(String[] args) {
        String string1 = "This is a text test";
        System.out.println("Original string: "+ string1);

        //This part declares Stringbuilder library.
        StringBuilder reverseString = new StringBuilder(string1);

        reverseString.reverse();

        //Converting the Stringbuilder to a String
        String result = reverseString.toString();

        System.out.println("The reverse string is: "+result);
    }
}
