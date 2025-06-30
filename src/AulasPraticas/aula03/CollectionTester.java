package aula03;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class CollectionTester {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000, 20000, 40000, 100000};
        Collection<Integer>[] collections = new Collection[] {new ArrayList<>(), new LinkedList<>()};

        System.out.println("Collection\tSize\tAdd (ms)\tSearch (ms)\tRemove (ms)");
        for (Collection<Integer> col : collections) {
            for (int size : sizes) {
                double[] results = checkPerformance(col, size);
                System.out.printf("%s\t%d\t%.2f\t%.2f\t%.2f%n", col.getClass().getSimpleName(), size, results[0], results[1], results[2]);
            }
        }
    }

    private static double[] checkPerformance(Collection<Integer> col, int DIM) {
        double[] results = new double[3];
        double start, stop, delta;

        // Add
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) {
            col.add(i);
        }
        stop = System.nanoTime();
        results[0] = (stop - start) / 1e6;

        // Search
        start = System.nanoTime();
        for (int i = 0; i < DIM; i++) {
            int n = (int) (Math.random() * DIM);
            col.contains(n);
        }
        stop = System.nanoTime();
        results[1] = (stop - start) / 1e6;

        // Remove
        start = System.nanoTime();
        Iterator<Integer> iterator = col.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        stop = System.nanoTime();
        results[2] = (stop - start) / 1e6;

        return results;
    }
}