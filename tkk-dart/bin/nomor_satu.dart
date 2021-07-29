import 'dart:io';

String numberCheck(int bilangan){
  if(bilangan % 3 == 0 && bilangan % 5 == 0){
    return 'Hello World';
  }
  else if(bilangan % 3 == 0){
    return 'Hello';
  }
  else if(bilangan % 5 == 0){
    return 'World';
  }
  else{
    return '';
  }
}

void main(List<String> arguments) {
  print('Masukkan Bilangan : ');
  int? bilangan = int.parse(stdin.readLineSync()!);

  print(numberCheck(bilangan));
}