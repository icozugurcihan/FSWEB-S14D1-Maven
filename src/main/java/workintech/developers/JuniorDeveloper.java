package workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is coding basic tasks");
        setSalary(getSalary() + 1000);
    }
}