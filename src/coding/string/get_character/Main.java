package coding.string.get_character;


/*
          Get the character at the given index within the String
 */
public class Main {
    public static void main(String[] args) {
        String str="hello java";
        System.out.println(str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointBefore(3));
//        System.out.println(str.codePoints());

        String s1=str.strip();
        System.out.println(s1);
//        System.out.println(str.isBlank());
        String str2="hello java";
        System.out.println(str.compareToIgnoreCase(str2));

    }
}
