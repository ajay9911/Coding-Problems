package coding.problems.stringReverse;

public class Solution {
    public static String reverseWords(String str){
        String[] words=str.split(" ");

        for (int i=0;i<words.length;i++){
            words[i]=new StringBuilder(words[i]).reverse().toString();
        }

        return String.join(" ",words);
    }

    public static void main(String[] args) {
        String str="my name is Ajay Kumar";
        String s= reverseWords(str);
        System.out.println(s);
    }
}
