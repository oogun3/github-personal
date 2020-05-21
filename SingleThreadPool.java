
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable

{
    private String name;



    public Task(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    @Override
    public  void run(){

        System.out.println("thread from pool is used" + name);
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();
        for (int task =1 ; task <= 5; task++ ){
            Task taskobj = new Task("task" + task);
            System.out.println("Created " + taskobj.getName());
            executor.execute(taskobj);
        }
        executor.shutdown();
    }

}

