import java.io.Serializable;

class Car implements Serializable {

        private String color;
        private int maxSpeed;
        public void carInfo(){
            System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
    }

class Maruti extends Car{
    //Maruti extends Car and thus inherits all methods from Car (except final and static)
    //Maruti can also define all its specific functionality
    public void MarutiStartDemo(){
        Engine MarutiEngine = new Engine();
        MarutiEngine.start();
    }
}
