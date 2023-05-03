import java.util.Comparator;

public class C_carcomparator_speed implements Comparator<cars> {
   public int compare(cars o1,cars o2){
       return o1.speed-o2.speed;
   }
}
