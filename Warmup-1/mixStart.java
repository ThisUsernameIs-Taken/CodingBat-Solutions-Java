public boolean mixStart(String str) {
  if (str.length() < 3) return false;
  String s = str.substring(1, 3);
  if (s.equals("ix")) return true;
  return false;
}
