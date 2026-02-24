import components.queue.Queue;
import components.queue.Queue2;

/**
 *
 * @author Sharvari Dhile
 *
 */
public final class ProofOfConcept extends Queue2<Queue<Integer>> {
    /**
     * Private constructor.
     */
    public ProofOfConcept() {
    }

    /**
     * Adds row to this.
     */
    public void addRow() {
        this.enqueue(new Queue2<Integer>());
    }

    /**
     * Removes row from this and reports number of stitches in row.
     *
     * @return int number of stitches in row
     */
    public int removeRow() {
        Queue<Integer> temp = this.dequeue();
        int removed = temp.length();
        return removed;
    }

    /**
     * Removes row from this and reports number of stitches in row.
     *
     * @return boolean if this is empty
     */
    public boolean isEmpty() {
        return this.length() == 0;
    }

    /**
     * Adds stitch to row.
     */
    public void addStitch() {
        if (this.length() > 0) {
            Queue<Integer> temp = this.dequeue();
            temp.enqueue(1);
            this.enqueue(temp);
        }

    }

    /**
     * Removes stitch from row.
     *
     * @param k
     *            number of stitches to remove
     */
    public void removeStitch(int k) {
        if (this.length() > 0) {

            Queue<Integer> temp = this.dequeue();

            int counter = 0;
            while (counter < k && temp.length() > 0) {
                temp.dequeue();
                counter++;
            }

            this.enqueue(temp);
        }

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        ProofOfConcept crochet = new ProofOfConcept();
        crochet.addRow();
        crochet.addStitch();
        crochet.addRow();
        crochet.addStitch();
        System.out.println(crochet);

        crochet.removeStitch(1);
        int remove = crochet.removeRow();
        boolean empty = crochet.isEmpty();
        System.out.println("Stitches removed: " + remove);
        System.out.println("Crochet Pattern is empty: " + empty);
    }
}
