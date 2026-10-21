public class TraceTable3
{
    public static void main(String[] args)
    {
        int num = 908172;
        int result = 0;
        while (num > 0)
        {
            int d = num % 10;
            if (d > 4)
            {
                if (d % 2 == 0)
                {
                    result += 10;
                }
                else
                {
                    result += 1;
                }
            }
            num /= 10;
        }
        System.out.println(result);
    }
}