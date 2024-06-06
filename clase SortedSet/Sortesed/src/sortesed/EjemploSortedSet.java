import java.util.SortedSet;
import java.util.TreeSet;

public class EjemploSortedSet {
    public static void main(String[] args) {
       
        SortedSet<Integer> numeros = new TreeSet<>();
        
       
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);
        
     
        System.out.println("Elementos en el conjunto ordenado: " + numeros);
        
       
        System.out.println("Primer elemento en el conjunto: " + numeros.first());
        
     
        System.out.println("Último elemento en el conjunto: " + numeros.last());
        
      
        SortedSet<Integer> subConjunto = numeros.subSet(5, 16);
        System.out.println("Subconjunto de elementos entre 5 y 15: " + subConjunto);
        
       
        SortedSet<Integer> tailSet = numeros.tailSet(10);
        System.out.println("Subconjunto de elementos mayores o iguales a 10: " + tailSet);
    }
}
