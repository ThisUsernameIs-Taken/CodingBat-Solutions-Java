public String missingChar(String str, int n) {
  String left = str.substring(0, n);
  String right = str.substring(n+1, str.length()); 
  return left + right;
}
