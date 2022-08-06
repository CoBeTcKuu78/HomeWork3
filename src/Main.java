public class Main {
    public static void main(String[] args) {
        // задание 2
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите приложение для Android");
        } else {
            System.out.println("Установите приложение для iOS");
        }
        int clientDeviceYear = 2017;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения");
        //}else{
            //System.out.println("Установите приложение для Android");
        }
    }
}
