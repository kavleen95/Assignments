//WAP to find the number of vowels and consonants in a string.

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String count = "Meditation";
        int vowel = 0;
        int consonants =0;

        for (int i = 0; i < count.length(); i++) {
          if (count.charAt(i)=='a' ||count.charAt(i)=='i'|| count.charAt(i)=='e'||count.charAt(i)=='o' ||count.charAt(i)=='u'){
              vowel++;

          } else if (count.charAt(i)>='a' && count.charAt(i)<='z' ) {
              consonants++;
          }
        }
        System.out.println("The number of vowels in a String are : " + vowel);
        System.out.println("The number of vowels in a String are : " + consonants);
    }
}
