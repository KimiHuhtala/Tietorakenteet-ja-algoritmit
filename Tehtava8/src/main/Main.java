package main;

/**
 * @author Kimi Huhtala
 */

class Main {
    public static void main(String[] args) {
        printMenu();
    }

    private static void printMenu() {
        BinaryTree tree = new BinaryTree();
        char select;
        do {
            System.out.println("\n\t\t\t1. Lisää.");
            System.out.println("\t\t\t2. Poista.");
            System.out.println("\t\t\t3. Puun sisältö.");
            System.out.println("\t\t\t4. Etsi puusta.");
            System.out.println("\t\t\t5. Sulje ");
            System.out.print("\n\n");
            select = Read.character();
            int value;
            switch (select) {
                case '1':
                    System.out.println("Anna arvo joka lisätään (int):");
                    value = Read.readInt();
                    tree.insert(value);
                    break;
                case '2':
                    System.out.println("Anna arvo joka poistetaan (int):");
                    value = Read.readInt();
                    tree.delete(tree, value);
                    break;
                case '3':
                    tree.preOrder();
                    break;
                case '4':
                    System.out.println("Anna arvo joka etsitään (int):");
                    value = Read.readInt();
                    BinaryTree found = tree.find(value);
                    if(found != null){
                        System.out.println("Löydettiin: " + found.getData() + " korkeudelta " + found.getHeight() +
                                           ", vasen: " + found.getLeft() +
                                           ", oikea: " + found.getRight());
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