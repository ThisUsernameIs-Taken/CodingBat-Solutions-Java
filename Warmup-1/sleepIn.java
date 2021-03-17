public boolean sleepIn(boolean weekday, boolean vacation) {
  if (vacation) {
    return true;
  } else {
    if (weekday) {
      return false;
    } else {
      return true;
    }
  }
}
