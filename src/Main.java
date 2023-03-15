public class Main {
    public static void main(String[] args) {

          /*
Создать класс MyDate с полями day,month,year, конструктором,геттерами и сеттерами.
Создать несколько одинаковых обьектов этого класса и проверить их на равенство.
Затем переопределить методы equals и hashCode и вновь проверить обьекты на равенство.
     */


        MyDate date1 = new MyDate(1, 3, 2023);
        MyDate date2 = new MyDate(1, 3, 2023);
        MyDate date3 = new MyDate(2, 3, 2023);


        System.out.println(date1.equals(date2)); // false
        System.out.println(date1.equals(date3)); // false


        System.out.println(date1.equals(date2)); // true
        System.out.println(date1.equals(date3)); // false


    }
}