package main;

/**
 * @author Kimi Huhtala
 */

public class BinaryTree {

    private Node root;

    public BinaryTree(int rootValue) {
        root = new Node(rootValue);
    }

    public BinaryTree(){
        root = null;
    }

    /**
     * Tehtävä 8:
     * Insert data into the tree with the following rules:
     *
     * 1. If the tree is empty, set the value as the root
     * 2. If the tree is not empty and the value is lower than the root, set it to the left side
     * 3. If the tree is not empty and the value is greater than the root, set it to the right side
     * 4. If a value that is already present in the tree, don't do anything
     */

    public void insert(int data){
        if(root == null){
            root = new Node(data);

        }else if(root.getData() > data){
            if(root.left() != null)
                root.left().insert(data);
            else
                root.setLeft(new BinaryTree(data));

        }else if(root.getData() < data){
            if(root.right() != null)
                root.right().insert(data);
            else
                root.setRight(new BinaryTree(data));

        }

        root.setHeight(heightOfANode(this));
    }

    /**
     * Tehtävä 10:
     * Palauta puun korkeus
     *"https://www.baeldung.com/cs/binary-tree-height"
     */

    private int heightOfANode(BinaryTree root) {
        if(root == null || isLeaf(root))
            return 0;
        return Math.max(heightOfANode(root.getLeft()), heightOfANode(root.getRight())) + 1;
    }

    /**
     * Tehtävä 10
     */

    private boolean isLeaf(BinaryTree root) {
        return root.getRight() == null && root.getLeft() == null;
    }

    /**
     * Tehtävä 8:
     * Etsi dataa puusta
     */

    public BinaryTree find(int data){
        if(root == null){
            return null;

        }else if(root.getData() == data){
            return this;

        }else if(root.getData() > data){
            if(root.left() != null)
                return root.left().find(data);

        }else if(root.getData() < data){
            if(root.right() != null)
                return root.right().find(data);

        }
        return null;
    }

    /**
     * Tehtävä 9:
     * Poista tietoa puusta ja muokkaa puuta niin, että se säilyy binäärimuodossaan
     * "https://www.java2novice.com/java-interview-programs/delete-node-binary-search-tree-bst/"
     */
    public BinaryTree delete(BinaryTree root, int data) {
        if(root == null)
            return root;

        if(root.getData() > data) {
            root.setLeft(delete(root.getLeft(), data));

        }else if(root.getData() < data) {
            root.setRight(delete(root.getRight(), data));

        }else{
            if(root.getLeft() == null && root.getRight() == null) {
                return null;

            }else if(root.getLeft() == null) {
                return root.getRight();

            }else if(root.getRight() == null){
                return root.getLeft();

            }else{
                int minValue = minValue(root.getRight());
                root.setData(minValue);
                root.setRight(delete(root.getRight(), minValue));
            }
        }
        return root;
    }

    /**
     * Tehtävä 9:
     * Etsi pienin arvo puusta
     */

    private int minValue(BinaryTree root) {
        if(root.getLeft() != null)
            return minValue(root.getLeft());
        return root.getData();
    }

    public void preOrder() {
        if (root != null) {
            System.out.print(root.getData() + ", ");
            if(root.left() != null)
                root.left().preOrder();
            if(root.right() != null)
                root.right().preOrder();
        }

    }

    public int getData(){
        return root.getData();
    }

    public void setData(int data){
        root.setData(data);
    }

    public BinaryTree getLeft(){
        return root.left();
    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public BinaryTree getRight(){
        return root.right();
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }

    public BinaryTree getParent(){
        return root.parent();
    }

    public void setParent(BinaryTree tree) {
        root.setParent(tree);
    }

    public int getHeight() {
        return root.getHeight();
    }

    @Override
    public String toString(){
        return String.valueOf(this.root);
    }
}
