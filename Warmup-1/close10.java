public int close10(int a, int b) {
  int aAbs = Math.abs(10 - a);
  int bAbs = Math.abs(10 - b);
  if (aAbs < bAbs) {
    return a;
  } else if (aAbs == bAbs) {
    return 0;
  } else {
    return b;
  }
}
