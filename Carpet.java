class Carpet {
        double Cost;

    public Carpet(double cost) {
            if (cost < 0) {
                Cost = 0;
            } else {
                Cost = cost;
            }
        }

        public double getCost() {
            return Cost;
        }
    }
