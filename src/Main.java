public class Main {
    public static void main(String[] args) {
        // задание 2
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите приложение для Android");
        } else {
            System.out.println("Установите приложение для iOS");
        }
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения");
        //}else{
            //System.out.println("Установите приложение для Android");
        }
        // задача 3

        int year = 2080;

        if ((year % 4 == 0) && year % 100 != 0){
            System.out.println(year + " год високосный");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
      {
     System.out.println(year + " год високосный");
       } else {
     System.out.println(year + " год не високосный");
        }
    }
}
