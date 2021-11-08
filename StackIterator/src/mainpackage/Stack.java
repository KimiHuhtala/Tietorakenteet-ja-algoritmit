package mainpackage;

public class Stack {

        ListItem top;
        private int size;

        public Stack() {
                top = null;
                size = 0;
        }

        public void push(String aData) {
                ListItem newItem = new ListItem();
                newItem.setData(aData);
                newItem.setLink(top);
                top = newItem;
                size++;
        }

        public ListItem pop() {
                ListItem takeAway;
                if (top == null) {
                        takeAway = null;
                }
                else
                {
                        size--;
                        takeAway = top;
                        top = top.getLink();
                }
                return takeAway;
        }

        public int getSize() {
                return size;
        }

        public void printItems() {
                ListItem lPointer = top;
                while (lPointer != null) {
                        System.out.print(lPointer.getData()+", ");
                        lPointer = lPointer.getLink();
                }

        }
}

