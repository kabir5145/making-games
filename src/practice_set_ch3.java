public class practice_set_ch3 {
    public static void main(String[] args) {

        //q1

        String name = "KABIR";
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        //q2
        String text = "KAB R";
        text = text.replace(" ","I");
        System.out.println(text);

        //q3
        String letter = "Dear <|name|> , thanks a lot.";
        letter = letter.replace("<|name|>","Arun");
        System.out.println(letter);

        //q4
        String mystring = "this string contains double and triple  spaces ";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

        //q5
        String fun = "dear Harry ,\n\t this java course is nice.\n thanks ";
        System.out.println(fun);

    }
}
