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

        //задача 4
        int deliveryDistance = 630;
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if (deliveryDistance <= startInterval )
        {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil(deliveryDistance - startInterval) / interval + 1;
            System.out.println( "Потребуется дней " + deliveryDays);
            // очень сложно, так и не понял как делать эту задачу, помогло видел по разбору ЗД (пришлось подсматривать)
        }
    }
}
