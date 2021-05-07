public String deFront(String str) {    
  String s = str.substring(2);
  if (str.charAt(1) == 'b') {
    s = "b" + s;
  }
  if (str.charAt(0) == 'a') {
    s = "a" + s;
  }
  return s;
}
