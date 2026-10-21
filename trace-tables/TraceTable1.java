public class TraceTable1
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        for (int k = 1; k <= 12; k++)
        {
            if (k % 2 == 0 && k % 3 == 0)
            {
                x += k;
            }
            else if (k % 3 == 0)
            {
                y++;
            }
        }
        System.out.println(x + " " + y);
    }
}