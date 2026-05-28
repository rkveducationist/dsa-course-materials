public class AnagramFrequency {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        int[] count = new int[26];
        System.out.println("count: " + count.length);

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'c']++;
            System.out.println("str1.charAt(i): " + str1.charAt(i));
            count[str2.charAt(i) - 'c']--;
            System.out.println("str2.charAt(i): " + str2.charAt(i));
        }

        boolean isAnagram = true;

        for (int num: count) {
            if (num != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}