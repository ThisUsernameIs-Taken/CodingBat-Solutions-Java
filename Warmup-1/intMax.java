public int intMax(int a, int b, int c) {
  int maxm = -9099;
  if (a > maxm) {
    maxm = a;
  }
  if (b > maxm) {
    maxm = b;
  }
  if (c > maxm) {
    maxm = c;
  }
  return maxm;
}
