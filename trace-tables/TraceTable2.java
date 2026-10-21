public class TraceTable2
{
    public static void main(String[] args)
    {
        for (int r = 1; r <= 4; r++)
        {
            for (int c = 1; c <= 4; c++)
            {
                if (c < r)
                {
                    System.out.print("-");
                }
                else if (c == r)
                {
                    System.out.print(r);
                }
                else
                {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }
}