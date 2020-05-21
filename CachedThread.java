import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

    class Task implements Runnable{

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
        public void run() {
            System.out.println("Thread from Thread Pool is used for Execution "+ " : "+name);
        }

    }
    public class CachedThread {

        public static void main(String[] args) {

            ThreadPoolExecutor exec=(ThreadPoolExecutor)Executors.newCachedThreadPool();

            for(int task=1;task<=10;task++)

            {
                Task taskObj=new Task("Task :"+task);

                System.out.println("number of thread "+taskObj.getName());
                exec.execute(taskObj);
            }
        }

    }
