public String endUp(String str) {
  if (str.length() < 3) return str.toUpperCase();
  String s = str.substring(str.length() - 3, str.length());
  String rest = str.substring(0, str.length() - 3);
  return rest + s.toUpperCase();
}
