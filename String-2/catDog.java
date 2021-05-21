public boolean catDog(String str) {
  int catCount = 0;
  for (int i = 0; i <= (str.length() - 3); i++) {
    if (str.substring(i, i+3).equals("cat")) {
      catCount++;
    }
  }
  int dogCount = 0;
  for (int i = 0; i <= (str.length() - 3); i++) {
    if (str.substring(i, i+3).equals("dog")) {
      dogCount++;
    }
  }
  return (catCount == dogCount);
}


