public class TraceTable4
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 1; i <= 6; i++)
        {
            for (int j = i; j <= 6; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}