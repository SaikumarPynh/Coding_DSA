public class Strings_comparision {
    public static void main(String[] args) {
        String s1 = "sai";
        String s2 = "sai";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        String s3 = new String("sai");
        String s4 = new String("sai");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
