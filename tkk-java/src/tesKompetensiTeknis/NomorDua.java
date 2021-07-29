package tesKompetensiTeknis;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NomorDua {
    public static String emailCheck(String email)
    {
        //Asumsi : Poin b - harus ada tanda titik '.' tepat setelah tanda '@'
        String validator = "^[A-Za-z0-9+_.-]{1,20}@[.][A-Za-z0-9.-]*[\\.co\\.id|\\.id]$";

        Pattern pattern = Pattern.compile(validator);

        Matcher matcher = pattern.matcher(email);

        int length = email.length();

        if(matcher.matches()){
            return "Valid";
        }
        else{
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Email : ");

        String email = scanner.nextLine();

        System.out.println(emailCheck(email));

    }
}

