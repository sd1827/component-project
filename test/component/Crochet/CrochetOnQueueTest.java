package component.Crochet;

/**
 * Junit test fixture for {@code Crochet}'s constructor and kernel methods.
 *
 * @author Sharvari Dhile
 */
public class CrochetOnQueueTest {

    // Tests for constructor

    /**
     * Tests for the constructor.
     */
    @Test
    public final void testConstructor() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();

        assertEquals(cCopy, c);
    }

    // Tests for addRow

    /**
     * Tests for addRow with empty.
     */
    @Test
    public final void testAddRowEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        assertEquals(cCopy, c);
    }

    /**
     * Tests for addRow with multiple.
     */
    @Test
    public final void testAddRowMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addRow();
        cCopy.addRow();
        cCopy.addRow();
        assertEquals(cCopy, c);
    }

    // Tests for removeRow

    /**
     * Tests for removeRow to an empty row.
     */
    @Test
    public final void testRemoveRowEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        int stitches = c.removeRow();

        assertEquals(cCopy, c);
        assertEquals(0, stitches);
    }

    /**
     * Tests for removeRow to one with one row.
     */
    @Test
    public final void testRemoveRowOne() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addRow();
        cCopy.addRow();
        int stitches = c.removeRow();

        assertEquals(cCopy, c);
        assertEquals(0, stitches);
    }

    // Tests for isEmpty

    /**
     * Tests for empty isEmpty.
     */
    @Test
    public final void testIsEmptyZero() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        assertEquals(true, c.isEmpty());
        assertEquals(cCopy, c);
    }

    /**
     * Tests for non empty isEmpty.
     */
    @Test
    public final void testIsEmptyNonEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        assertEquals(false, c.isEmpty());
        assertEquals(cCopy, c);
    }

    // Tests for addStitch

    /**
     * Tests for addStitch to empty.
     */
    @Test
    public final void testAddStitchEmpty() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch();
        cCopy.addRow();
        cCopy.addStitch();
        assertEquals(cCopy, c);
    }

    /**
     * Tests for addStitch multiple.
     */
    @Test
    public final void testAddStitchMultiple() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addRow();
        c.addStitch();
        c.addStitch();
        cCopy.addRow();
        cCopy.addRow();
        cCopy.addStitch();
        cCopy.addStitch();
        assertEquals(cCopy, c);
    }

    // Tests for removeStitch

    /**
     * Tests for removeStitch one.
     */
    @Test
    public final void testRemoveStitch() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        c.addStitch;
        cCopy.addRow();
        cCopy.addStitch();
        c.removeStitch(1);
        cCopy.removeStitch(1);
        assertEquals(cCopy, c);
    }

    /**
     * Tests for removeStitch from end.
     */
    @Test
    public final void testRemoveStitchBeginning() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        c.removeStitch(1);
        cCopy.removeStitch(1);
        assertEquals(cCopy, c);
    }

    /**
     * Tests for removeStitch all.
     */
    @Test
    public final void testRemoveStitchAll() {
        Crochet c = new CrochetOnQueue();
        Crochet cCopy = new CrochetOnQueue();
        c.addRow();
        cCopy.addRow();
        c.addStitch();
        c.addStitch();
        c.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        cCopy.addStitch();
        c.removeStitch(3);
        cCopy.removeStitch(3);
        assertEquals(cCopy, c);
    }

}
