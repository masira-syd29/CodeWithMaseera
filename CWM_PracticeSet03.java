public class CWM_PracticeSet03 {
    public static void main(String[] args) {
        //Problem 01
        String name = "Maseera Sayed";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 02
        String text = "To lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);

        //problem 04
        String myString = "This string contains double and triple  spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 05
        String myLetter = "Dear Maseera!\n\t This java course is really nice.\n\tThanks!";
        System.out.printf(myLetter);

    }
}
