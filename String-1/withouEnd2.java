public String withouEnd2(String str) { // the exercise name is withouEnd2, not withoutEnd2
  if (str.length() < 2) {
    return "";
  } else {
    return str.substring(1, str.length() - 1);
  }
}
