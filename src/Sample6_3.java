public class Sample6_3 {
    public static void main(String[] args) {
        Car6_3 car = new Car6_3("1號車");
        car.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Car6_3 extends Thread
{
    private String name;

    public Car6_3(String nm)
    {
        name = nm;
    }

    public void run()
    {
        for(int i=0; i<5; i++)
        {
            try {
                sleep(1000);
                System.out.println("正在進行" + name + "的處理工作");
            }
            catch (InterruptedException e)
            {
            }

        }
    }
}

