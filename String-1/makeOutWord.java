public String makeOutWord(String out, String word) {
  String firstHalf = out.substring(0, 2);
  String secondHalf = out.substring(2, 4);
  return firstHalf + word + secondHalf;
}
