
public boolean in3040 (int a) {
  return (a >= 30) && (a <= 40);
}

public boolean in4050 (int a) {
  return (a >= 40) && (a <= 50);
}


public boolean in3050(int a, int b) {
  return ((in3040(a) && in3040(b)) || (in4050(a) && in4050(b)));
}
