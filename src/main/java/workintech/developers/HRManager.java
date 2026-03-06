package workintech.developers;

public class HRManager extends Employee {

    private static final int juniorSize = 10;
    private static final int midSize = 10;
    private static final int seniorSize = 10;

    private final JuniorDeveloper[] juniorDevelopers;
    private final MidDeveloper[] midDevelopers;
    private final SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);

        juniorDevelopers = new JuniorDeveloper[juniorSize];
        midDevelopers = new MidDeveloper[midSize];
        seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees");
        setSalary(getSalary() + 4000);
    }

    // Overloaded Methods

    public void addEmployee(int index, JuniorDeveloper dev) {
        addToArray(juniorDevelopers, index, dev);
    }

    public void addEmployee(int index, MidDeveloper dev) {
        addToArray(midDevelopers, index, dev);
    }

    public void addEmployee(int index, SeniorDeveloper dev) {
        addToArray(seniorDevelopers, index, dev);
    }

    private <T> void addToArray(T[] array, int index, T employee) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (array[index] == null) {
            array[index] = employee;
        } else {
            System.out.println("Index " + index + " already occupied!");
        }
    }
}