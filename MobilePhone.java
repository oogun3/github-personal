public class MobilePhone implements ITelephone {
    private int myNumber = 123456;
    private boolean isRinging;
    private  boolean isOn = false;

    @Override
    public void powerOn(){
isOn = true;
        System.out.println("MobilePhone is powered on. ");
    }

    @Override
    public void  dial(int phoneNumber ){
        if(isOn){
            System.out.println(" now ringing");
        } else {
            System.out.println(" phone is swithed off ");
        }
    }
    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the MobilePhone");
            isRinging = false;
        }

    }
    @Override
    public boolean callPhone(int phoneNumber){
        if( phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println(" ring , ring");
        } else {
            isRinging = false;
            System.out.println("mobile phone not one");
        } return  isRinging;
    }

    @Override
    public boolean isRinging(){
        return  isRinging;
    }
}

