public class ObjectAsLinTaskLesson {


    public static void main(String[] args) {

        int a = 7;

        String string = "123";

        Object object = new Object();
        int b = 7;
        Coordinates coordinates = new Coordinates();

        coordinates.x =80;
        coordinates.y =80;

        coordinates.x = 6;
        coordinates.y = 5;

        System.out.println(coordinates.x);
        System.out.println(coordinates.y);

        Coordinates.system = "decart";

        coordinates.x =990;
        coordinates.y =890;

        Coordinates coordinates2 = new Coordinates();
        Coordinates coordinates3 = null;

        coordinates2.x = 8;
        coordinates2.y = 4;

        coordinates.x = 10;
        coordinates.y = 50;

        System.out.println(coordinates2.x);
        System.out.println(coordinates2.y);

        Coordinates.system = "not decart";


    }


}
