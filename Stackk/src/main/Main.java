package main;

/**
 * @author Kimi Huhtala
 */

class Main {
    public static void main(String[] args) {
        SortAlgorithms.selectSort();
        SortAlgorithms.resetCounter();

        SortAlgorithms.mergeSort();
        SortAlgorithms.resetCounter();

        SortAlgorithms.quickSortLoop();
        SortAlgorithms.printResults();
    }
}
