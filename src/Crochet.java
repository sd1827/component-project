/**
 *
 * @author Sharvari Dhile
 *
 */

/**
 * Crochet component enhanced with secondary methods.
 */
public interface Crochet extends CrochetKernel {
    /**
     * Returns the number of stitches in the first row in the project.
     *
     * @return number of stitches in first row
     * @requires this is not empty
     * @ensures firstRow = number of stitches in first row
     */
    int firstRow();

    /**
     * Returns the number of stitches in the last row in the project.
     *
     * @return number of stitches in last row
     * @requires this is not empty
     * @ensures lastRow = number of stitches in last row
     */
    int lastRow();

    /**
     * Appends two patterns together.
     *
     * @updates this
     * @ensures this is added to a new pattern
     */
    void appendPattern();

    /**
     * Returns the number of rows in project.
     *
     * @return number of rows in project
     * @requires this is not empty
     * @ensures totalRows = total rows in project
     */
    int totalRows();

    /**
     * Returns the number of stitches in current row.
     *
     * @return number of stitches in current row
     * @requires this is not empty
     * @ensures stitchesInRow = number of stitches in current row
     */
    int stitchesInRow();

}