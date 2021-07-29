import 'dart:io';

String palindromeCheck(String words){
  var reversedWord = '';

  var charArray = words.split('');

  for(var i=charArray.length-1; i>=0; i--){
    reversedWord += charArray[i];
  }

  if(reversedWord.toLowerCase() == words.toLowerCase()){
    return 'True';
  }
  else{
    return 'False';
  }
}

void main(List<String> arguments) {
  print('Cek apakah kata bersifat palindrom. Masukkan Kata/Kalimat : ');
  var words = stdin.readLineSync().toString();

  print(palindromeCheck(words));
}
