package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        BinaryHeap heap = new BinaryHeap();
        char select;
        do {
            System.out.println("\n\t\t\t1. Lisää.");
            System.out.println("\t\t\t2. Poista.");
            System.out.println("\t\t\t3. Kasan pää.");
            System.out.println("\t\t\t4. Kasan sisältö.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = mainpackage.Read.character();

            int value;
            switch (select) {
                case '1':
                    System.out.println("Anna arvo joka lisätään kasaan (int): ");
                    value = Read.readInt();
                    heap.insert(value);
                    break;
                case '2':
                    System.out.println("Poistettiin: " + heap.deleteMin());
                    break;
                case '3':
                    System.out.println("Kasan pää: " + heap.head());
                    break;
                case '4':
                    heap.print();
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
}
