package component.Crochet;

/**
 * Junit test fixture for {@code Crochet}'s secondary methods.
 *
 * @author Sharvari Dhile
 */
public class CrochetTest {
    // Tests for first row

    /**
     * Tests for the first row from empty.
     */
    @Test
    public final void testFirstRowEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        int cNum = c.firstRow();
        int cCopyNum = cCopy.firstRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the first row with one.
     */
    @Test
    public final void testFirstRowOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        int cNum = c.firstRow();
        int cCopyNum = cCopy.firstRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the first row with multiple.
     */
    @Test
    public final void testFirstRowMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        c.addRow();
        cCopy.addRow();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addRow();
        int cNum = c.firstRow();
        int cCopyNum = cCopy.firstRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    // Tests for last row

    /**
     * Tests for the last row from empty.
     */
    @Test
    public final void testLastRowEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        int cNum = c.lastRow();
        int cCopyNum = cCopy.lastRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the last row with one.
     */
    @Test
    public final void testFirstRowOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        int cNum = c.lastRow();
        int cCopyNum = cCopy.lastRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the last row with multiple.
     */
    @Test
    public final void testLastRowMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        c.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        int cNum = c.firstRow();
        int cCopyNum = cCopy.firstRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    // Tests for total rows

    /**
     * Tests for the total rows from empty.
     */
    @Test
    public final void testTotalRowsEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        int cNum = c.totalRows();
        int cCopyNum = cCopy.totalRows();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the total rows with one.
     */
    @Test
    public final void testTotalRowsOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        int cNum = c.totalRows();
        int cCopyNum = cCopy.totalRows();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the totoal rows with multiple.
     */
    @Test
    public final void testTotalRowsMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addRow();
        c.addRow();
        cCopy.addRow();
        cCopy.addRow();
        cCopy.addRow();
        int cNum = c.totalRows();
        int cCopyNum = cCopy.totalRows();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    // Tests for stitchesInRow

    /**
     * Tests for the stitchesInRow from empty.
     */
    @Test
    public final void testSitchesInRowEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        int cNum = c.stitchesInRow();
        int cCopyNum = cCopy.stitchesInRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the stitchesInRow with one.
     */
    @Test
    public final void testStitchesInRowOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        int cNum = c.stitchesInRow();
        int cCopyNum = cCopy.stitchesInRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    /**
     * Tests for the stitchesInRow with multiple.
     */
    @Test
    public final void testStitchesInRowMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        int cNum = c.stitchesInRow();
        int cCopyNum = cCopy.stitchesInRow();

        assertEquals(cCopy, c);
        assertEquals(cCopyNum, cNum);
    }

    // Tests for append pattern

    /**
     * Tests for the append pattern with empty.
     */
    @Test
    public final void testAppendPatternEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        Crochet cAppend = new CrochetOnQueue();
        Crochet cCopyAppend = new CrochetOnQueue();
        c.appendPattern(cAppend);
        cCopy.appendPattern(cCopyAppend);

        assertEquals(cCopy, c);
    }

    /**
     * Tests for the append pattern with one.
     */
    @Test
    public final void testAppendPatternOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        Crochet cAppend = new CrochetOnQueue();
        Crochet cCopyAppend = new CrochetOnQueue();
        cAppend.addRow();
        cCopyAppend.addRow();
        c.appendPattern(cAppend);
        cCopy.appendPattern(cCopyAppend);

        assertEquals(cCopy, c);
    }

    /**
     * Tests for the append pattern with multiple.
     */
    @Test
    public final void testAppendPatternMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        Crochet cAppend = new CrochetOnQueue();
        Crochet cCopyAppend = new CrochetOnQueue();
        cAppend.addRow();
        cAppend.addRow();
        cAppend.addRow();
        cCopyAppend.addRow();
        cCopyAppend.addRow();
        cCopyAppend.addRow();
        c.appendPattern(cAppend);
        cCopy.appendPattern(cCopyAppend);

        assertEquals(cCopy, c);
    }

}
