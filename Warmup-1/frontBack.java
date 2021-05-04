public String frontBack(String str) {
  if (str.length() <= 1) {
    return str;
  } else {
    char f = str.charAt(0);
    char l = str.charAt(str.length() - 1);
    String sub = str.substring(1, str.length() - 1);
    return Character.toString(l) + sub + Character.toString(f);
  }
}
