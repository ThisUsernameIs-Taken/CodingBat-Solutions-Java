public String doubleChar(String str) {
  String a = "";
  for (int i = 0; i < str.length(); i++) {
    char e = str.charAt(i);
    a += e;
    a += e;
  }
  return a;
}
