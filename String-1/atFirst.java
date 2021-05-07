public String atFirst(String str) {
  if (str.length() < 2) {
    String x = str;
    for (int i = 0; i < (2 - str.length()); i++) {
      x += "@";
    }
    return x;
  } else {
    return str.substring(0, 2);
  }
}
