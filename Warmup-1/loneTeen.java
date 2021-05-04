public boolean isTeen(int x) {
  return ((x >= 13) && (x <= 19));
}


public boolean loneTeen(int a, int b) {
  return (isTeen(a) != isTeen(b));
}
