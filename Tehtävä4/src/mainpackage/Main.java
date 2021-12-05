package mainpackage;

/**
 * @author Kimi Huhtala
 */

class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        char select;
        Stack stack = new Stack();
        String data;
        do {
            System.out.println("\n\t\t\t1. Lisää pinoon.");
            System.out.println("\t\t\t2. Poista pinosta.");
            System.out.println("\t\t\t3. Pinon sisältö.");
            System.out.println("\t\t\t4. Pinon sisältö iteraattorista.");
            System.out.println("\t\t\t5. Pinon koko.");
            System.out.println("\t\t\t6. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            switch (select) {
                case '1':
                    System.out.println("Kirjoita sisältö (String)");
                    data = Read.row();
                    stack.push(data);
                    break;
                case '2':
                    String item = stack.pop();
                    if (item == null)
                        System.out.println("Pino on tyhjä");
                    else
                        System.out.println("Poistettiin: " + item);
                    break;
                case '3':
                    stack.printItems();
                    break;
                case '4':
                    IIterator iterator = stack.iterator();
                    while (iterator.hasNext())
                        System.out.println(iterator.next());
                    break;
                case '5':
                    System.out.println("Pinon koko on  = " + stack.size());
                    break;
                case '6':
                    break;
            }
        }
        while (select != '6');
    }
}
