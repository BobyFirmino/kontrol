import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class company {
    private long _income;
    private List<Employee> _employees;
    public company()
    {
        _income = 0;
        _employees = new ArrayList<>();
    }
    public long GetIncome() {
        return _income;
    }

    //найм сотрудника
    public void Hire(Employee employee) {
        _income += employee.GetPersonalIncome();
        _employees.add(employee);
    }

    //найм нескольких сотрудников
    public void HireAll(List<Employee> employeeList) {
        for(Employee e: employeeList)
        {
            _income +=e.GetPersonalIncome();
            _employees.add(e);
        }
    }

    //Увольнинение некоторого числа сотрудников
    public void Fire(int count) {
        if (_employees.size() < count)
            return;
        for (int i = 0; i < count; i++) {
            Employee e = _employees.get(new Random().nextInt(_employees.size()));
            _income -= e.GetPersonalIncome();
            _employees.remove(e);
        }
    }

    public List<Employee> GetTopSalaryStaff(int count) {
        _employees.sort((o1, o2) ->
        {
            int salary1 = o1.GetSalary(GetIncome());
            int salary2 = o2.GetSalary(GetIncome());
            return Integer.compare(salary2, salary1);
        } );
        return getEmployees(count);
    }
    public List<Employee> GetLowestSalaryStaff(int count) {
        _employees.sort((o1, o2) ->
        {
            int salary1 = o1.GetSalary(GetIncome());
            int salary2 = o2.GetSalary(GetIncome());
            return Integer.compare(salary1, salary2);
        } );
        return getEmployees(count);
    }
    private List<Employee> getEmployees(int count) {
        List<Employee> list = new ArrayList<>();
        for(int i = 0; i < count && i < _employees.size(); i++)
        {
            list.add(_employees.get(i));
        }
        return list;
    }
}

