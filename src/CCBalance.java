public class CCBalance
{
    static void main()
    {
        double balance =  5000;
        final double IRATE = 0.17;
        double interest = 0;

        // month 1
        interest = balance * IRATE;
        IO.println("Your interest due after 1 month is " + interest);
        balance = interest + balance;

        // month 2
        interest = balance * IRATE;
        IO.println("Your interest due after 2 months is " + interest);
        balance = interest + balance;
    }
}
