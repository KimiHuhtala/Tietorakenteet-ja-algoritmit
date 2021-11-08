package main;

public class ListItem {
    private String data;
    private ListItem next;

    public ListItem(){
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return this.data + " ,seuraava: " + this.next;
    }
}
