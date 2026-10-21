public class TraceTable6
{
    public static void main(String[] args)
    {
        int k = 10;
        boolean found = false;
        while (k < 40 && !found)
        {
            if (k % 7 == 0 && k % 2 == 1)
            {
                found = true;
            }
            else
            {
                k += 3;
            }
        }
        System.out.println(k + " " + found);
    }
}