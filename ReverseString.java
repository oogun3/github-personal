public class ReverseString {
    static String  S = "Olamide";

    public static void stringReversal(){
        for (int i = S.length() - 1; i >= 0; i--)
            System.out.print(S.charAt(i));
    }

    public static void main(String[] args) {
        stringReversal();

    }
}
