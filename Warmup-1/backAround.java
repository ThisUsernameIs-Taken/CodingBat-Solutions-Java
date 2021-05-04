public String backAround(String str) {
  char a = str.charAt(str.length() - 1);
  String A = Character.toString(a);
  return A + str + A;
}
