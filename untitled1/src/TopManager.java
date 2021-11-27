import java.util.Random;
public class TopManager extends Employee {
    public TopManager()
    {
        salary = 150000;
        personalIncome = new Random().nextInt(40000)+140000;
    }

    @Override
    public int GetSalary(long getIncome) {
        return (int) (salary * (getIncome>10000000? 1.5 : 1));
    }
}
