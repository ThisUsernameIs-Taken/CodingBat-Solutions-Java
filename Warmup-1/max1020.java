public boolean in1020(int a) {
  return (a >= 10) && (a <= 20);
}

public int max1020(int a, int b) {
  if (in1020(a) && in1020(b)) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  } else if (in1020(a)) {
    return a;
  } else if (in1020(b)) {
    return b;
  } else {
    return 0;
  }
}
