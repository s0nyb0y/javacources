package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(" Mersedes Maybach", "Чёрный", 2032);
        Motorbike motorbike = new Motorbike(" Harley Davidson", "Синий", 2019);

        car.info();
        System.out.println(car.getModel() + ", цвет " + car.getColor() + " и ему " + car.yearDifference(2022) + " года");

        motorbike.info();
        System.out.println(motorbike.getModel() + ", цвет " + motorbike.getColor() + " и ему " + motorbike.yearDifference(2022) + " года");

    }
}
//    В классах Автомобиль и Мотоцикл реализуйте два метода:
//        void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//        int yearDifference(int inputYear) - принимает в качестве аргумента целое число (год)
//        и возвращает разницу между переданным годом и годом выпуска транспортного средства
//        (возвращаться должно всегда положительное число).
//        Пример: inputYear передан как 2020, поле класса year инициализировано числом 2010 или наоборот,
//        должно быть возвращено одно и тоже положительное число 10. Такого понятия как “некорректный ввод”
//        или любое другое сигнализирующее об ошибке, здесь быть не может
//
//        В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла, проверьте работу каждого метода.
