class Main {
    public static void main(String[] args)
    {
        Pay myPay = new Pay(100.0);
        myPay.calculatePayWithOvertime();
        System.out.println(myPay.getPay());
    }
}

/*******************
*    PAY CLASS
*******************/
class Pay
{
    private double pay;

    public Pay(double p)
    {
        pay = p;
    }

    public double getPay()
    {
        return pay;
    }

    public void calculatePayWithOvertime()
    {
        // this Pay object is passed to the Overtime constructor
        Overtime ot = new Overtime(this);
        pay = ot.getOvertimePay();
    }
}

/*******************
*    OVERTIME CLASS
*******************/
class Overtime
{
    private double payWithOvertime;

    public Overtime(Pay p)
    {
        payWithOvertime = p.getPay() * 1.5;
    }

    public double getOvertimePay()
    {
        return payWithOvertime;
    }
}

