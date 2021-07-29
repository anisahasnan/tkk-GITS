package tesKompetensiTeknis;

import java.util.Scanner;

public class NomorSatu {
    public static String numberCheck(Long bilangan)
    {
        if(bilangan % 3 == 0 && bilangan % 5 == 0){
            return "Hello World";
        }
        else if(bilangan % 3 == 0){
            return "Hello";
        }
        else if(bilangan % 5 == 0){
            return "World";
        }
        else{
            return "";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");

        long bilangan = scanner.nextLong();

        System.out.println(numberCheck(bilangan));
    }
}

