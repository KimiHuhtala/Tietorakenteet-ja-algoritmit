package mainpackage;

/**
 * @author Veeti Pere
 */
public class HashTable {

    private final int[] hashTable;
    private final int realSize;
    private final int size;
    private int iterations;

    public HashTable(int num){
        hashTable = new int[num];
        size = num;
        realSize = num - 1;
    }

  
    public void insert(int num){
        iterations = 0;
        int index = num % size;
        System.out.println("Checking space on index: " + index);
        if(hashTable[index] == 0){
            System.out.println("Inserting into index: " + index);
            hashTable[index] = num;
        }else
            insert(num, index + 1);
    }

    private void insert(int num, int index){
        iterations++;
        if(index >= size)
            index = 0;
        System.out.println("Checking space on index: " + index);
        if(hashTable[index] == 0){
            System.out.println("Inserting into index: " + index);
            hashTable[index] = num;
        }else if(iterations != realSize)
            insert(num, index + 1);
        else
            System.out.println("No space");
    }

    public void find(int num){
        iterations = 0;
        int index = num % size;
        System.out.println("Searching index: " + index);
        if(hashTable[index] == num)
            System.out.println(hashTable[index] + " found at index " + index);
        else
            find(num, index + 1);
    }
    private void find(int num, int index){
        iterations++;
        if(index >= size)
            index = 0;
        System.out.println("Searching index: " + index);
        if(hashTable[index] == num)
            System.out.println(hashTable[index] + " found at index " + index);
        else if(iterations != realSize)
            find(num, index + 1);
        else
            System.out.println("Did not find any " + num);
    }
    public void print(){
        for(int num: hashTable)
            System.out.println(num);
    }

}
