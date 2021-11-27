import java.util.Random;
public class Operator extends Employee{
    public Operator()
    {
        salary = 50000;
        personalIncome = new Random().nextInt(50000)+70000;
    }
}
