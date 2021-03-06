package mainpackage;

/**
 * @author Kimi Huhtala
 */

public class Table {

    private final int[] table;

    public Table(int size) {
        table = new int[size];
    }

    public void insert(int value) {
        if(table[0] != 0){
            System.out.println("Taulukossa ei ole tilaa");
        }else{
            table[0] = value;
            selectSort(table);
        }
    }

    public int binarySearch(int value, int low, int high) {
        int mid = (int) Math.floor(low + (high - low) / 2);                             
        if (value >= table[0] && value <= table[table.length - 1] && high >= low) {     
            System.out.println("Keski index on nyt: " + mid);
            if (table[mid] == value) {                                                 
                System.out.println("Oikea arvo löydettiin: " + table[mid]);
                return table[mid];                                                      
            } else if (table[mid] > value) {                                         
                System.out.println(value + " on pienempi kuin " + table[mid] + " arvo");
                return binarySearch(value, low, mid - 1);                          
            } else {                                                                   
                System.out.println(value + " on suurempi kuin " + table[mid] + " arvo");
                return binarySearch(value, mid + 1, high);                          
            }
        }
        System.out.println("Arvo ei ole taulussa");
        return -1;                                                                     
    }

  
    public void printContent(){
        for (int i = 0; i < table.length; i++){
            if(i % 10 == 0 && i != 0)
                System.out.println();
            System.out.printf("Index %3d - %3d, ", i, table[i]);
        }
    }

    public int getTableLength() {
        return table.length;
    }

    
    public static void selectSort(int[] table) {
        int i, j, help, smallest;

        for (i = 0; i < table.length; i++) {
            smallest = i;
            for (j = i + 1; j < table.length; j++) {
                if (table[j] < table[smallest]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                help = table[smallest];
                table[smallest] = table[i];
                table[i] = help;
            }
        }
    }
}
