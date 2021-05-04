public boolean stringE(String str) {
  int ez = 0;
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'e') {
      ez++;
    }
  }
  if ((ez >= 1) && (ez <= 3)) {
    return true;
  }
  return false;
}
