public String front22 (String str) {
  if (str.length() < 2) {
    return str + str + str;
  } else {
    String sub = str.substring(0, 2);
    return sub + str + sub;
  }
}
