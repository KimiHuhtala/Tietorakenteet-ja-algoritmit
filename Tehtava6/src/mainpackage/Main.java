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
            System.out.println("\t\t\t4. Pinon koko.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            switch (select) {
                case '1':
                    System.out.println("Kirjoita sisältö (string)");
                    data = Read.row();
                    stack.push(data);
                    break;
                case '2':
                    String item = stack.pop();
                    if (item == null)
                        System.out.println("Pino on tyhjä");
                    else
                        System.out.println("Poistettiin pinosta: " + item);
                    break;
                case '3':
                    stack.printItems();
                    break;
                case '4':
                    System.out.println("Pinon koko " + stack.size());
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
}