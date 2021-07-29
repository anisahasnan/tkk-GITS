import 'dart:io';

String timeCheck(String time){
  try {
    var stat = time.substring(9, 11).toUpperCase();

    var hour = time.substring(0, 2);

    if (stat == 'AM') {
      if (hour == '12') {
        time = time.replaceAll(hour, "00");
      }
      time = time.substring(0, time.length - 3);
    } else if (stat == 'PM') {
      if (hour != '12') {
        var newHour = int.parse(hour) + 12;
        time = time.replaceAll(hour, newHour.toString());
      }
      time = time.substring(0, time.length - 3);
    } else {
      time = 'Not in Valid Format';
    }

    return time;
  }
  on Exception{
    return 'Not in Valid Format';
  }
}

void main(List<String> arguments) {
  print('Masukkan Waktu dalam Format HH:MM:SS AM/PM : ');
  var time = stdin.readLineSync().toString();

  print(timeCheck(time));
}
