public class Telecomprovider {
    int amountpd;
    int amountpm;


     Telecomprovider(int amountPerday, int amountPerMonth ) {
        this.amountpd = amountPerday;
        this.amountpm = amountPerMonth;
    }

    public int getAmountPerday() {
        return amountpd;
    }

    public int getAmountPerMonth() {
        return amountpm;
    }
}

class prepaidcustomer {
    int amountpd;
    Telecomprovider tel;

    public void customer(int amountpd) {
        this.amountpd = amountpd;
    }
    public void perday(int amountpd){
        amountpd = 500;
        int noOfDays = 30;

        int amountperday = amountpd / noOfDays;
        System.out.println("the amount per day is " + amountperday);
}

}

class postpaidcustomer {
    int amountpm;
    Telecomprovider tel;

    public void customer(int amountpm) {
        this.amountpm = amountpm;
    }

    public void perMonth(int amountpm) {
        amountpm = 10;
        int noOfDays = 30;

        int amountperday = amountpm * noOfDays;
        System.out.println("the amount per month is " + amountperday);
    }

}
     class Main {

        public static void main(String[] args) {
Telecomprovider mtn = new Telecomprovider(10,500);
postpaidcustomer ola = new postpaidcustomer();
prepaidcustomer geli = new prepaidcustomer();
ola.perMonth(10);
geli.perday(500);

        }
    }


