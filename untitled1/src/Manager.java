import java.util.Random;
public class Manager extends Employee{
    public Manager()
    {
        salary = 80000;
        personalIncome = new Random().nextInt(25000)+115000;
    }

    @Override
    public int GetSalary(long getIncome) {
        return (int) (salary + personalIncome * 0.05);
    }
}
