package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        System.out.println("Склад №1");
        businessProcess(picker);
        System.out.println("Общий заработок сортировщика 1: " + picker.getSalary());
        Picker picker1 = new Picker(warehouse);
        businessProcess(picker1);
        System.out.println("Общий заработок сортировщика 2: " + picker1.getSalary());
        System.out.println("Всего собрано: "+warehouse.getCountPickedOrders());
        System.out.println();

        Courier courier = new Courier(warehouse);
        businessProcess(courier);
        System.out.println("Общий заработок курьера: " + courier.getSalary());
        System.out.println("Всего доставлено: "+warehouse.getCountDeliveredOrders());

        System.out.println();
        System.out.println("Склад №2");

        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        System.out.println("Общий заработок второго сборщика: "+picker2.getSalary()+" Собрано: "+warehouse2.getCountPickedOrders());
        courier2.doWork();
        System.out.println("Общий заработок второго курьера: "+courier2.getSalary()+" Доставлено: "+warehouse2.getCountDeliveredOrders());
        System.out.println();
        picker.info();
        courier.info();

    }

    public static void businessProcess(Worker worker) {
        for (int i = 1; i <= 6000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
