abstract class Task {
    public abstract void execute();
}

class PrintTask extends Task {
    @Override
    public void execute() {
        System.out.println("Task is being executed by: " + Thread.currentThread().getName());
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        Task task = new PrintTask();
        
        Thread thread1 = new Thread(task::execute);
        Thread thread2 = new Thread(task::execute);

        thread1.start();
        thread2.start();
    }
}
