package main;

class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        char select;
        Jono jono = new Jono();
        String data;
        do {
            System.out.println("\n\t\t\t1. Lisää jonoon.");
            System.out.println("\t\t\t2. Poista jonosta.");
            System.out.println("\t\t\t3. Jonon sisältö.");
            System.out.println("\t\t\t4. Jonon koko.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            switch (select) {
                case '1':
                    System.out.println("Kirjoita jonon sisältö:");
                    data = Read.row();
                    jono.push(data);
                    break;
                case '2':
                    ListItem item = jono.pop();
                    if (item == null)
                        System.out.println("Jono on tyhjä");
                    else
                        System.out.println("Poistettiin jonosta: " + item.getData());
                    break;
                case '3':
                    jono.printItems();
                    break;
                case '4':
                    System.out.println("Jonon koko = " + jono.size());
                    break;
                case '5':
                    break;
            }
        }
        while (select != '5');
    }
}
