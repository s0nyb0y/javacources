package day11.task1;

public class Picker implements Worker {
    private int salary;
    private static final int TASK_SALARY = 80;
    private static final int BONUS = 70000;
    private boolean isPayed;
    private Warehouse w;
    private static int pickers;
    private int sum;

    public Picker(Warehouse w) {
        this.w = w;
        if (pickers < 10) {
            pickers++;
        }
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
            if (w.getCountPickedOrders() > 10000) {
                System.out.println("Бонус пока не доступен");
            }
            if (isPayed) {
                System.out.println("Бонус был выплачен");
                return;
            }
            salary += 70000;
            isPayed = true;
        }

    @Override
    public void info() {
        System.out.println("Общие количество сотрудников: " + pickers);
    }
}