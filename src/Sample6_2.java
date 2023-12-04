public class Sample6_2 {
    public static void main(String[] args) {
        Car6_1 car = new Car6_1("1號車");
        car.start();

        Car6_1 car2 = new Car6_1("2號車");
        car2.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class Car6_2 extends Thread
{
    private String name;

    public Car6_2(String nm)
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
