package day11.task1;

public class Courier implements Worker {
    private int salary;
    private Warehouse w;
    private static final int TASK_SALARY = 100;
    private boolean isPayed;
    private static int couriers;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(Warehouse w) {
        this.w = w;
        couriers++;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += TASK_SALARY;
        w.incrementDeliveredOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус выплачен");
            return;
        }
        salary += 50000;
        isPayed = true;
    }

    @Override
    public void info() {
        System.out.println("Общие количество курьеров: " + couriers);
    }
}
