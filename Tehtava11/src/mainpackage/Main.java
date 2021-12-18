package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        Table table = null;
        char select;
        do {
            System.out.println("\n\t\t\t1. Lisää.");
            System.out.println("\t\t\t2. Etsi.");
            System.out.println("\t\t\t3. Taulun sisältö.");
            System.out.println("\t\t\t4. Luo uusi taulu.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            int value;
            switch (select) {
                case '1':
                    if(table != null){
                        System.out.println("Anna arvo joka lisätään (int):");
                        value = Read.readInt();
                        table.insert(value);
                    }else
                        System.out.println("Taulua ei löytynyt");
                    break;
                case '2':
                    if(table != null) {
                        System.out.println("Anna arvo joka etsitään (int):");
                        value = Read.readInt();
                        table.binarySearch(value, 0, table.getTableLength());
                    }else
                        System.out.println("Taulua ei löytynyt");
                    break;
                case '3':
                    if(table != null)
                        table.printContent();
                    else
                        System.out.println("Taulua ei löytynyt");
                    break;
                case '4':
                    System.out.println("Anna taulun koko (int):");
                    value = Read.readInt();
                    table = new Table(value);
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
}
