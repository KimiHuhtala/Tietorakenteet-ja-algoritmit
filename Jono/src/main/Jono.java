package main;

public class Jono {
    private ListItem head, tail;
    private int size;

    public Jono() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(String data){
        ListItem item = new ListItem();
        item.setData(data);
        item.setNext(null);
        if(size == 0){
            head = tail = item;
        }else if(size == 1){
            tail = item;
            head.setNext(tail);
        }else{
            tail.setNext(item);
            tail = item;
        }
        this.size++;
    }

    public ListItem pop(){
        if(this.head == null)
            return null;
        ListItem poppedItem = this.head;
        this.head = head.getNext();
        this.size--;
        return poppedItem;
    }

    public void printItems(){
        if(this.head == null){
            System.out.println("Jono on tyhjä");
            return;
        }
        ListItem item = this.head;
        while(item != null) {
            System.out.print(item.getData()+", ");
            item = item.getNext();
        }
    }


    public int size(){
        return this.size;
    }
}
