public class LoopPractice
{
    public static void main(String[] args)
    {
        System.out.println("Loop 1:");
        int c =4;
        int d =5;
        for(int p =c +d;p >1;p--)
        {
            System.out.println(p);
            if(p ==5)break;
            d =d +p;
        }
        System.out.println(d);

        System.out.println("Loop 2:");
        int x=15;while(x<22)
        {
            x++;
            if(x %2==0)continue;
            System.out.println("Bye!");
        }
        System.out.println(x);
        System.out.println("Loop 3:");
        int y =3;
        do
        {
            y =y -2;
            System.out.println("Hi Mom");
        } while(y>-3);System.out.println(y);
        System.out.println("Loop 4:");
        int a=3;
        while(a <10)
        {
            System.out.println(a);
            a=a+3;
        }
        System.out.println(a);

    }
}
