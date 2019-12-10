public static int getWordValue(String word){
  int total=0;
  char[] letters = word.toCharArray();
  for(char letter: letters){
    total +=  (int)letter -96;
  }
  return total;
}

public static String high(String s) {
  int higherValue = 0;
  int startWord;
  int endWord;
  int aux;

  String selectedWord="";
  
  for (int i = 0, startWord=0, endWord=0, aux=0; i < s.length(); i++ ) {
    if(s.charAt(i) == ' ' || i == s.length()-1){
      if(aux> higherValue){
        higherValue=aux;
      }else{
        selectedWord ="";
      }
    }else{
      selectedWord += s.charAt(i);
      aux += ((int)s.charAt(i)) -96;
    }
  }
  
  return selectedWord;
}
