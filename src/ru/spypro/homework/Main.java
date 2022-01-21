package ru.spypro.homework;


public class Main {

    public static void main(String[] args) {
        // write your code here


        excerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();

    }

    // решение первого задания
    public static void excerciseOne() { //выввод ответа
        System.out.println("Задание 1");
        int year = 2008;
        conditionYear(year);
    }

    public static void conditionYear(int year) { //проверка года на високосность
        if (isYearLeap(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static boolean isYearLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }


    // решение второрго задания
    public static void exerciseTwo() {
        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        int clientOS = 1;
        applicationDeffer(clientDeviceYear, clientOS);
    }

    public static int getDevice(int clientDeviceYear) { // инициализация года устройства
        return clientDeviceYear;
    }

    public static int getOS(int clientOS) { // инициализация ос устройств 1 и 0
        return clientOS;
    }
    public static void applicationDeffer(int clientDeviceYear, int clientOS) { // второй вариат объявления метода
        if (clientOS == 0) {
            checkIfDeviceOld(clientDeviceYear);
            System.out.println("iOS");
        } else if (clientOS == 1) {
            checkIfDeviceOld(clientDeviceYear);
            System.out.println("Android");
        }
    }

    private static void checkIfDeviceOld(int conditionApp) { //условие устройства для второго варианта метода
        if (conditionApp < 2015) {
            System.out.print("Установите облегченную версию приложения для ");
        } else {
            System.out.print("Установите версию приложения для ");
        }
    }
 /*   второй вариант объявления метода
        public static void applicationDeffer(int conditionApp, int clientOS) { //условие при котором отображаются сообщения
        if (clientOS == 0) {
            if (conditionApp) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }*/

    public static boolean conditionApp(int clientDeviceYear, int clientOS) { //условие для года устройства
        return (clientDeviceYear < 2015);
    }



    //решение третьего задания
    public static void exerciseThree() {
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        conditionDelivery(deliveryDistance, deliveryTime);
    }



    public static void conditionDelivery(int deliveryDistance, int deliveryTime) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        }
    }

    //решение четвертого задания
    public static void exerciseFour() {
        System.out.println("Задание 4");
        String signs = "aabccddefgghiijjkk";
        checkString(signs.toCharArray());
    }

    public static void checkString(char[] signs) {
        for (int i = 0; i < signs.length; i++) {
            for (int j = 0; j < signs.length - 1; j++) {
                if (signs[j] == signs[i]) {
                    System.out.println("Обнаружен дубль " + signs[i]);
                    break;
                }

            }
        }
    }

    //решение пятой задачи
    public static void exerciseFive() {
        System.out.println("Задача 5");
        char[] reverseArr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseMethod(reverseArr);
    }


    public static void reverseMethod(char[] reverseArr) {
        for (int i = reverseArr.length - 1; i >= 0; i--) {
            System.out.print(reverseArr[i]);
        }
    }


}
