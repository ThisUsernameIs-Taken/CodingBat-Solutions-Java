public boolean isTeen(int x) {
  return ((x >= 13) && (x <= 19));
}

public boolean hasTeen(int a, int b, int c) {
  return (isTeen(a) || isTeen(b) || isTeen(c));
}
