import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Zbior {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<> ( );
        Random random = new Random ();
        int suma = 0;
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt (1000);
            set.add (a);
            suma+=a;
        }
        System.out.println ("najmniejsza liczba "+set.first () );
        System.out.println ("najwieksza liczba "+set.last () );
        int srednia = suma/set.size ();
        System.out.println ("Srednia "+srednia );

        Iterator<Integer> iterator = set.iterator ( );
        while (iterator.hasNext ()){
            if (iterator.next () >srednia){
                int next = iterator.next ();
                System.out.println (next );
            }
        }

    }
}
