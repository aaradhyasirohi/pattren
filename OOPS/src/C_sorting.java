import java.util.Arrays;
import java.util.Comparator;

public class C_sorting {
    public static void main(String[] args) {
        cars[] car = new cars[5];
        car[0] = new cars(200, 10, "white");
        car[1] = new cars(300, 1, "black");
        car[2] = new cars(400, 8, "grren");
        car[3] = new cars(500, 80, "grey");
        car[4] = new cars(600, 9, "white");
        display(car);
        Arrays.sort(car, new Comparator<cars>() {
            @Override
            public int compare(cars o1, cars o2) {
                return o1.speed-o2.speed;
            }
        });
        System.out.println();
        //sort(car,new C_carcomparator_speed() );
        display(car);

    }

    public static void display(cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

//    public static <T extends Comparable<T>> void sort(T[] arr) {
//        for (int turn = 1; turn < arr.length; turn++) {
//            for (int i = 0; i < arr.length - turn; i++) {
//                if (arr[i].compareTo(arr[i + 1]) > 0) {
//                    T t = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = t;
//                }
//            }
//        }
//
//    }

    // Comparator
//    public static <T> void sort(T[] arr, Comparator<T> camp) {
//        for (int turn = 1; turn < arr.length; turn++) {
//            for (int i = 0; i < arr.length - turn; i++) {
//                if (camp.compare(arr[i],arr[i + 1]) > 0) {
//                    T t = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = t;
//                }
//            }
//        }
//
//    }
}