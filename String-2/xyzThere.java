public boolean xyzThere(String str) {
  if (str.equals("xyz")) {
    return true;
  }
  for (int i = 0; i <= (str.length() - 3); i++) {
    if (str.substring(i, i+3).equals("xyz")) {
      if (i >= 1) {
        if (str.substring(i - 1, i+3).equals(".xyz")) {
          int a = 0;
        } else {
          return true;
        }
      } else {
        return true;
      }
    }
  }
  return false;
}
