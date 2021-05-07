public String middleThree(String str) {
  int pt = (str.length() - 1)/2;
  return str.substring(pt - 1, pt + 2);
}
