import 'dart:io';

String emailCheck(String email){
  //Asumsi : Poin b - harus ada tanda titik '.' tepat setelah tanda '@'
  var validator = RegExp(r'^[A-Za-z0-9+_.-]{1,20}@[.][A-Za-z0-9.-]*[\\.co\\.id|\\.id]$');

  if(validator.hasMatch(email)){
    return 'Valid';
  }
  else{
    return 'Invalid';
  }
}

void main(List<String> arguments) {
  print('Masukkan Email : ');
  var email = stdin.readLineSync().toString();

  print(emailCheck(email));
}