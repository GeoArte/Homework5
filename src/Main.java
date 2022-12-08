public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        byte clientOS = 1;
        switch (clientOS)
        {
            case 0:
                System.out.println("    Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("    Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("    Некорректный ввод");
        }
    }

    public static void task2 ()
    {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 0)
        {
            System.out.println("    Установите версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear >= 2015 && clientOS == 1)
        {
            System.out.println("    Установите версию приложения для Android по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 0)
        {
            System.out.println("    Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear < 2015 && clientOS == 1)
        {
            System.out.println("    Установите облегченную версию приложения для Android по ссылке");
        }
        else
        {
            System.out.println("    Некорректный ввод");
        }
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        int year = 2022;
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("    Год високосный");
                }
                else
                {
                    System.out.println("    Год не високосный");
                }
            }
            else
            {
                System.out.println("    Год високосный");
            }
        }
        else
        {
            System.out.println("    Год не високосный");
        }
    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        byte delyvery = 1;
        if (deliveryDistance > 20)
        {
            delyvery = (byte)(delyvery + 1);
            if (deliveryDistance > 60)
            {
                delyvery = (byte)(delyvery + 1);
                if (deliveryDistance > 100)
                {
                    delyvery = (byte)(delyvery + 1);
                }
            }
        }
        if (delyvery < 4)
        {
            System.out.println("    Потребуется дней: " + delyvery);
        }
        else
        {
            System.out.println("    Доставки нет");
        }
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        int monthNumber = 6;
        if (monthNumber < 1 || monthNumber > 12)
        {
            System.out.println("    Некорректный ввод");
        }
        else
        {
            int season = monthNumber / 3;
            switch (season)
            {
                case 0:
                    System.out.println("    " + monthNumber + " месяц принадлежит к зиме");
                    break;
                case 1:
                    System.out.println("    " + monthNumber + " месяц принадлежит к весне");
                    break;
                case 2:
                    System.out.println("    " + monthNumber + " месяц принадлежит к лету");
                    break;
                case 3:
                    System.out.println("    " + monthNumber + " месяц принадлежит к осени");
                    break;
                default:
                    System.out.println("    " + monthNumber + " месяц принадлежит к зиме");
            }
        }
    }
}