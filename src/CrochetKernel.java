import components.standard.Standard;

/**
 *
 * @author Sharvari Dhile
 *
 */
public interface CrochetKernel extends Standard<Crochet> {

    /**
     * Adds a new row to this.
     *
     * @updates this
     * @ensures a new empty row is added to this
     */
    void addRow();

    /**
     * Removes recently added row from this and reports number of stitches in
     * row.
     *
     * @return int number of stitches in row
     * @requires |this| > 0
     * @updates this
     * @ensures removes row from this
     */
    int removeRow();

    /**
     * Removes row from this and reports number of stitches in row.
     *
     * @return true is this is empty and false is this is not empty
     * @ensures isEmpty is equal to if this has rows or not
     */
    boolean isEmpty();

    /**
     * Adds stitch to row.
     *
     * @requires this contains a row
     * @updates this
     * @ensures number of stitches in row increases by 1
     */
    void addStitch();

    /**
     * Removes stitch from row.
     *
     * @param k
     *            number of stitches to remove
     * @requires this is not empty and k <= number of stitches in row
     * @updates this
     * @ensures number of stitches is decreased by k
     */
    void removeStitch(int k);

}