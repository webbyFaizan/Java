package Array;

public class CharVowelArray {
    public static void main(String[] args) {
        char[] x = {'p','r','o','g','r','a','m','i','n','g'};

        int countVowel = 0;
        int countConsonant = 0;
        for(int i=0;i<x.length;i++){
            char c = x[i];
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                System.out.println(c + " is a vowel");
                countVowel ++;
            }
            else{
                System.out.println(c + " is a consonant");
                countConsonant ++;
            }
        }
        System.out.println("Total number of vowels are: " + countVowel);
        System.out.println("Total number of consona are: " + countConsonant);
    }   
}
