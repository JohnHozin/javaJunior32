package lesson15;

public class MultiThread {
    public static void main(String[] args) {
//        MyThread thread1 = new MyThread("Мыть посуду");
//        MyThread thread2 = new MyThread("Пылесосить");
//        MyThread thread3 = new MyThread("Мыть полы");

//        Thread thread1 = new Thread(new MyRunnableClass("Мыть посуду"));
//        Thread thread2 = new Thread(new MyRunnableClass("Пылесосить"));
//        Thread thread3 = new Thread(new MyRunnableClass("Мыть полы"));

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 100;i++){
                    System.out.println("Задание Мыть посуду выполнено на " + i + "%");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 100;i++){
                    System.out.println("Задание Пылесосить выполнено на " + i + "%");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i< 100;i++){
                    System.out.println("Задание Мыть полы выполнено на " + i + "%");
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

    }
}

class MyRunnableClass implements Runnable{
    String task; // Название задания
    public MyRunnableClass(String task){this.task = task;}

    @Override
    public void run() {
        for (int i=0; i< 100;i++){
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}

class MyThread extends Thread{
    String task; // Название задания
    public MyThread(String task){this.task = task;}
    @Override
    public void run(){
        for (int i=0; i< 100;i++){
            System.out.println("Задание " + task + " выполнено на " + i + "%");
        }
    }
}
