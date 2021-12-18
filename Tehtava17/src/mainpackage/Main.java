package mainpackage;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

/**
 * @author Kimi Huhtala
 */

public class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        char select;
        do {
            System.out.println("\n\t\t\t1. Lisää.");
            System.out.println("\t\t\t2. Poista.");
            System.out.println("\t\t\t3. TreeSetin sisältö järjestyksessä.");
            System.out.println("\t\t\t4. Etsi.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            int value;
            switch (select) {
                case '1':
                    System.out.println("Anna arvo joka lisätään (int):");
                    value = Read.readInt();
                    tree.add(value);
                    break;
                case '2':
                    System.out.println("Anna arvo joka poistetaan (int):");
                    value = Read.readInt();
                    boolean removed = tree.remove(value);
                    if(removed)
                        System.out.println("Poistettiin " + value);
                    else
                        System.out.println(value + " ei löytynyt");
                    break;
                case '3':
                    Iterator<Integer> iterator = tree.iterator();
                    while (iterator.hasNext())
                        System.out.println(iterator.next());
                    break;
                case '4':
                    System.out.println("Anna arvo joka etsitään (int):");
                    value = Read.readInt();
                    boolean found = tree.contains(value);
                    if(found){
                        System.out.println("Löydettiin: " + value);
                    }else{
                        System.out.println("Mitään ei löytynyt.");
                    }
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
}
