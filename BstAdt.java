package bstadt;
public class BstAdt {

    public static void main(String[] args) {

        bstBuild tree1 = new bstBuild();

        for (int i = 1; i <= 15; i++) {
            tree1.insert(i);
        }
        tree1.inOrder(tree1.root);
        System.out.println();

        tree1.remove(tree1.root, 5);
        tree1.inOrder(tree1.root);
        System.out.println();
        tree1.remove(tree1.root, 15);
        tree1.inOrder(tree1.root);
        System.out.println();
        tree1.root = tree1.remove(tree1.root, 1);
        tree1.inOrder(tree1.root);
        System.out.println();
        tree1.insert(2);
        tree1.inOrder(tree1.root);
        System.out.println();

        bstBuild tree2 = new bstBuild();
        int[] arrVals = { 8, 4, 12, 2, 6, 10, 14, 1, 3, 5, 7, 9, 11, 13, 15 };

        for (int i = 0; i < arrVals.length; i++) {
            tree2.insert(arrVals[i]);
        }
        tree2.inOrder(tree2.root);
        System.out.println();
        tree2.root = tree2.remove(tree2.root, 8);
        tree2.inOrder(tree2.root);

        

        
        double total=0;
        for (int i = 0; i < 10000; i++) {
            long start = System.nanoTime(); // start timer
            tree1.search(tree1.root, 1);
            long end = System.nanoTime(); // end timer

            double seconds = (double) (end - start) / 1000000000; // find time taken
            //System.out.println("The " + i + "th iteration of search(1) on the first tree took " + seconds + " seconds.");
            total = total+seconds;
        }
        
        double total2 = 0;
        for (int i = 0; i < 10000; i++) {
            long start = System.nanoTime(); // start timer
            tree1.search(tree1.root, 15);
            long end = System.nanoTime(); // end timer

            double seconds = (double) (end - start) / 1000000000; // find time taken
            //System.out.println("The " + i + "th iteration of search(15) on the first tree took " + seconds + " seconds.");
            total2 = total2+seconds;
        }

        double total3 = 0;
        for (int i = 0; i < 10000; i++) {
            long start = System.nanoTime(); // start timer
            tree2.search(tree2.root, 1);
            long end = System.nanoTime(); // end timer

            double seconds = (double) (end - start) / 1000000000; // find time taken
            //System.out.println("The " + i + "th iteration of search(1) on the second tree took " + seconds + " seconds.");
            total3 = total3 + seconds;
        }

        double total4 = 0;
        for (int i = 0; i < 10000; i++) {
            long start = System.nanoTime(); // start timer
            tree1.search(tree2.root, 15);
            long end = System.nanoTime(); // end timer

            double seconds = (double) (end - start) / 1000000000; // find time taken
            //System.out.println("The " + i + "th iteration of search(15) on the second tree took " + seconds + " seconds.");
            total4 = total4 + seconds;
        }
        System.out.println("\n Total time for search 1 on first tree took: "+total);
        System.out.println("Total time for search 15 on first tree took: " + total2);
        System.out.println("Total time for search 1 on second tree took: " + total3);
        System.out.println("Total time for search 15 on second tree took: " + total4);
        /*
         * The cpu times of 5 and 8 differ, because the trees are structured differently
         * in q5, search(1) was O(1) as 1 was the root, but in q8, search(1) was
         * 
         * Similarily, search(15) was O(n) as it went through all elements, but
         * search(15) in q8
         * was O(logn)
         */
    }
}