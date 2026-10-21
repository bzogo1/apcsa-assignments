public class TraceTable5
{
    public static void main(String[] args)
    {
        int n = 50;
        int count = 0;
        while (n > 0)
        {
            if (n % 3 == 0)
            {
                n -= 7;
            }
            else
            {
                n -= 4;
            }
            count++;
        }
        System.out.println(n + " " + count);
    }
}