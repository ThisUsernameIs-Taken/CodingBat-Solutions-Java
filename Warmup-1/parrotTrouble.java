public boolean parrotTrouble(boolean talking, int hour) {
  if (talking) {
    if (hour < 7 || hour > 20) {
      return true;
      // YOU ARE AT THE MERCY OF THE PARROT. 
    } else {
      return false;
    }
  } else {
    return false;
  }
