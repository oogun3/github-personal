public class DeskPhone implements ITelephone {
    private int myNumber = 123456;
    private boolean isRinging;

    @Override
    public void powerOn(){
        System.out.println("No action taken, deskphone does not have a power ");
    }

    @Override
    public void  dial(int phoneNumber ){
System.out.println("Now ringing");
    }
    @Override
    public void answer(){
        if(isRinging){
            System.out.println("Answering the callphone");
            isRinging = false;
        }

    }
    @Override
    public boolean callPhone(int phoneNumber){
    if( phoneNumber == myNumber){
    isRinging = true;
        System.out.println(" ring , ring");
    } else {
        isRinging = false;
    } return  isRinging;
    }

@Override
    public boolean isRinging(){
        return  isRinging;
}
}
