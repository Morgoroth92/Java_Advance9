import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashSet demo = creaHashSet(10);
        Integer objDaDistruggere = 5;

        Iterator<Integer> iterator = demo.iterator();
        while (iterator.hasNext()) {
            Integer elemento = iterator.next();
            if (elemento.equals(objDaDistruggere)) {
                iterator.remove();
            }
        }
        System.out.println(demo);
    }

    public static HashSet creaHashSet(int dimensione) {
        HashSet set = new HashSet();
        int aggiungere = 1;
        for (int i = 0; i < dimensione; i++) {
            set.add(aggiungere);
            aggiungere++;
        }
        return set;
    }
}