package tesKompetensiTeknis;

import java.util.Scanner;

public class NomorTiga {
    public static String timeConvert(String time)
    {
        try {
            String stat = time.substring(9, 11).toUpperCase();

            String hour = time.substring(0, 2);

            if (stat.equals("AM")) {
                if (hour.equals("12")) {
                    time = time.replace(hour, "00");
                }
                time = time.substring(0, time.length() - 3);
            } else if (stat.equals("PM")) {
                if (!hour.equals("12")) {
                    int newHour = Integer.parseInt(hour) + 12;
                    time = time.replace(hour, newHour + "");
                }
                time = time.substring(0, time.length() - 3);
            } else {
                time = "Not in Valid Format";
            }

            return time;
        }
        catch (Exception e){
            return "Not in Valid Format";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Waktu dalam Format HH:MM:SS AM/PM : ");

        String time = scanner.nextLine();

        System.out.println(timeConvert(time));
    }
}

