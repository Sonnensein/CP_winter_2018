public class Play_with_Text {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";

        String s3 = s + s2;
        System.out.println(s +s2);

        System.out.println(s + s2);

        int slen = s.length();
        System.out.println(s.indexOf("ab"));
        System.out.println(s.charAt(2));

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1,4));
    }

}
