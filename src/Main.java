public class Main {
    public static <string> void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("123");
//        int a = 7;
//        float b = 3.14f;
//        int e = 1234567899;
//        long c = 1234567899L;
//        String text = "Hello \nword";
//        System.out.println("Hello \nword");







//        вывести значения от 0 до 100 в консосль
//        for (int i = 0; i <= 100; i++) {
//            System.out.println(i);
//        }
//
// вывести значения от 100 до 0
//        for (int i = 100; i >= 0; i--) {
//            System.out.println(i);
//        }
//
// вывести в консоль только четные числа
//        int i = 100;
//        while (i >= 0) {
//            if(i % 2 == 0) {
//                System.out.println(i);
//            }
//            else{
//                System.out.println();
//            }
//            i--;
//
//        }
//
//
//
//        объявить массива типа int размером 7
//        заполнить массив в цикле значениями от 0 до 6
//        в другому цикле вывести значения массива
//        объялвить 2 массива типа int . первый заполнить в цикле, а второй заполнить значениями из первого массива используя отдельный цикл
//
//
//        int[] numbers = new int[7];
//        for (int i = 0; i <= 6; i++) {
//            numbers[i] = i;
//            System.out.println(numbers[i]);
//        }
//
//
//        int [] array_1 = new int[7];
//        for (int i = 0; i <= 6; i++) {
//            array_1[i] = i;
//            System.out.println(array_1[i]);
//        }
//
//        int [] array_2 = new int[7];
//        for (int i = 0; i <= 6; i++) {
//            array_2[i] = array_1[i];
//            System.out.println(array_2[i]);
//        }
//
//
//
//
//
//
//
//
//
//
//
//


        int month = 11;
        String season = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
        }
        System.out.println( month + "-" +  season + ".");
    }
}








        //* используя switch -  написать прогармму, которая по строке с названием месяца выводит какое время года, например "декабрь" - зима
        //* изучить ввод от пользователя с клавиатуры


