class SpeedConverter {
  public  static long toMilesPerHour ( double kilometersPerHour){
        if (kilometersPerHour < 0) {
            return -1;
        } else {
             long  milesPerHour = Math.round (kilometersPerHour * 0.621);
                System.out.println(kilometersPerHour + " kilometresPerHour = " + milesPerHour +"milesPerHour");
                return milesPerHour;
            }
        }
    }


