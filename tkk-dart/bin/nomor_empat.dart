import 'dart:io';

String reverseWords(String words){
  var reversedWord = '';

  var charArray = words.split('');

  for(var i=charArray.length-1; i>=0; i--){
    reversedWord += charArray[i];
  }

  return reversedWord;
}

void main(List<String> arguments) {
  print('Masukkan Kata/Kalimat : ');
  var words = stdin.readLineSync().toString();

  print(reverseWords(words));
}
