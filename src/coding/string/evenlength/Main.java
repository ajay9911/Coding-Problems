package coding.string.evenlength;

public class Main {
    public static void main(String[] args) {
        String str = "ajay kumar is a good boy";
        printEvenLetter(str);
    }

    public static void printEvenLetter(String words) {
        for (String str : words.split(" ")) {
            if (str.length() % 2 == 0) {
                System.out.println(str);
            }
        }
    }
}
