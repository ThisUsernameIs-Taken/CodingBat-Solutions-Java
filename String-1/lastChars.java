public String lastChars(String a, String b) {
  String af = "";
  if (a.length() == 0) {
    af = "@";
  } else {
    af = a.substring(0, 1);
  }
  String bf = "";
  if (b.length() == 0) {
    bf = "@";
  } else {
    bf = b.substring(b.length() - 1);
  }
  return af + bf;
}
