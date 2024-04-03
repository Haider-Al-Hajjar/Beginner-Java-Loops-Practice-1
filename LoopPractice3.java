public class LoopPractice3
{
    public static void main(String[] args) {

        for (int count = 2; count <= 12; count ++)
        {
            System.out.println(count + " "); // 2,3,4,5,6,7,8,9,10,11,12
        }
        int sum = 0;
        for (int count = 0; count <= 10; count++)
        {
            System.out.println(count + " "); // changed i  to count
            sum+=count;
        }
        System.out.println("The sum of 0 to 10 is " + sum);
        for (int count = 20; count >= 10; count--)
        {
            System.out.println(count); // this code doesn't run cuz 20 > 10
        }
        // question 4
        for (int x = 0; x<15; x++)
        {
            System.out.println(x);
        }
        for (int y = 10; y<=5; y--)
        {
            System.out.println(y);
        }
    }
}
