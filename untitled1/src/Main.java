import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        company myCompany = new company();
        List<Employee> operators = new ArrayList<Employee>();

        for (int i = 0; i < 180; i++)
            operators.add(new Operator());
        List<Employee> managers = new ArrayList<>();

        for (int i = 0; i < 80; i++)
            managers.add(new Manager());

        myCompany.HireAll(operators);
        myCompany.HireAll(managers);

        for (int i = 0; i < 10; i++) {
            myCompany.Hire(new TopManager());
        }
        System.out.println("Максимальные зарплаты");
        for (var e : myCompany.GetTopSalaryStaff(15)) {
            System.out.println(e.GetSalary(myCompany.GetIncome()));
        }
        System.out.println("Минммальные зарплаты");
        for (var e : myCompany.GetLowestSalaryStaff(30)) {
            System.out.println(e.GetSalary(myCompany.GetIncome()));
        }

        myCompany.Fire((180 + 80 + 10) / 2);
        System.out.println("Максимальные зарплаты после увольнения");
        for (var e : myCompany.GetTopSalaryStaff(15)) {
            System.out.println(e.GetSalary(myCompany.GetIncome()));
        }
        System.out.println("Минммальные зарплаты после увольнения");
        for (var e : myCompany.GetLowestSalaryStaff(30)) {
            System.out.println(e.GetSalary(myCompany.GetIncome()));
        }
    }
}