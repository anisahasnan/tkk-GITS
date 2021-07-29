package tesKompetensiTeknis;

import java.util.Scanner;

public class NomorEmpat {
    public static String reverseWords(String words)
    {
        String reversedWord = "";

        char[] charArray = words.toCharArray();

        for(int i=charArray.length-1; i>=0; i--){
            reversedWord += charArray[i];
        }

        return reversedWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata/Kalimat : ");

        String words = scanner.nextLine();

        System.out.println(reverseWords(words));
    }
}
