public String minCat(String a, String b) {
  if (a.length() > b.length()) {
    a = a.substring(a.length() - b.length());
    return a + b;
  } else if (b.length() > a.length()) {
    b = b.substring(b.length() - a.length());
    return a + b;
  }
  return a + b;
}
