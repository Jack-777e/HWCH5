public class Sample6_4 {
    public static void main(String[] args) {
        Car6_4 car = new Car6_4("1號車");
        car.start();

        for (int i=0; i<5; i++)
        {
            try {
                Thread.sleep(1000);
                System.out.println("正在進行main()的處理工作");
            }
            catch (InterruptedException e)
            {
            }
        }
    }
}

class Car6_4 extends Thread
{
    private String name;

    public Car6_4(String nm)
    {
        name = nm;
    }

    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}

