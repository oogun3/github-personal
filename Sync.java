import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



class Account
{
    private int accno;
    private long balance;

    private Lock myLock=new ReentrantLock();

    public Account() {
    }

    public Account(int accno, long balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }


    public int getAccno() {
        return accno;
    }



    public synchronized void deposite(int amt)
    {
        try
        {
            balance=balance+amt;

            System.out.println("Deposite Completed "+ balance);

            this.notify();
        }
        catch(Exception e) { e.printStackTrace();}
        finally
        {
            myLock.unlock();}

    }

    public synchronized void withdraw(int amt)
    {
        long temp,flag=1;

        myLock.lock();
        try {

            while(flag!=0)
            {
                temp=balance;

                if(temp-amt>=2000)
                {
                    temp=temp-amt;
                    balance=temp;
                    flag=0;
                }
                else
                {
                    System.out.println("Balance is not sufficent" );

                   wait();

                }
            }

        }
        catch(Exception e) {e.printStackTrace();}

        finally
        {
            myLock.unlock();
        }

    }
}
class AccountUser extends Thread
{
    Account acc;
    boolean transtype;

    public AccountUser(Account acc,boolean transtype) {
        this.acc = acc;
        this.transtype=transtype;
    }

    public void run()
    {
        if(transtype==true)
        {
            acc.deposite(9000);
        }
        else
        {
            acc.withdraw(5000);
        }
    }
}
public class Sync {



    public static void main(String[] args) {
        boolean credit=true;
        boolean debit=false;
        Account acc=new Account(101,1000);

        AccountUser Mom=new AccountUser(acc,debit);

        AccountUser dad=new AccountUser(acc,credit);

        Mom.start();

        try {
            Mom.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        dad.start();
    }

}