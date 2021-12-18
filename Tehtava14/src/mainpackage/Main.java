package mainpackage;

public class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        char select;
        Stack stack = new Stack();
        String data;
        do {
            System.out.println("\n\t\t\t1. Luo postifx lasku");
            System.out.println("\t\t\t2. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            switch (select) {
                case '1':
                    System.out.println("(Esimerkki: \"(3 + 4) * (5 / 2)\" on postfixinä \"3 4 + 5 2 / *\")");
                    System.out.println("Kirjoita laskusi: ");
                    data = Read.row();
                    stack.receiveData(data.split(" "));
                    break;
                case '2':
                    break;
            }
        }
        while (select != '2');
    }
}
