public String withoutX2(String str) {

  if (str.length() < 2) {
    return "";
  }
  if (str.charAt(0) == 'x') {
    str = str.substring(1);
    if (str.charAt(0) == 'x') {
      str = str.substring(1);
    }
    return str;
  }
  if (str.charAt(1) == 'x') {
    str = str.charAt(0) + str.substring(2);
  }
  return str;


}
