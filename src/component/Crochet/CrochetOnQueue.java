package component.Crochet;
import components.queue.Queue;
import components.queue.Queue1L;

/**
 * Crochet represented as a Queue<Queue<Integer>>
 */

public class CrochetOnQueue extends CrochetSecondary {

  /*
   * Private members -----------------------------------------------------------
   */

  /**
   * Representation of {@code this}.
   */
  private Queue<Queue<Integer>> rep;

  /**
   * Total size of crochet.
   */
  private int size;

  /**
   * Creator of initital representation.
   */
  private void createNewRep() {
    this.rep = new Queue1L<>();
    this.size = 0;

  }
  /*
   * Constructors --------------------------------------------------------------
   */

  /**
   * No-argument constructor.
   */
  public CrochetOnQueue() {
    this.createNewRep();
  }

  /*
   * Standard methods ----------------------------------------------------------
   */

  @Override
  public final Crochet newInstance() {
    try {
      return this.getClass().getConstructor().newInstance();
    } catch (ReflectiveOperationException e) {
      throw new AssertionError(
          "Cannot construct object of type " + this.getClass());
    }
  }

  @Override
  public final void clear() {
    this.createNewRep();
  }

  @Override
  public final void transferFrom(Crochet source) {
    assert source != null : "Violation of: source is not null";
    assert source != this : "Violation of: source is not this";
    assert source instanceof CrochetOnQueue : "Violation of: source is of dynamic type CrochetOnQueue";

    CrochetOnQueue localSource = (CrochetOnQueue) source;
    this.rep = localSource.rep;
    localSource.createNewRep();
  }

  /*
   * Kernel methods
   */

  @Override
  public final void addRow() {
    Queue<Integer> newRow = new Queue1L<>();
    this.rep.enqueue(newRow);
    this.size++;
  }

  @Override
  public final int removeRow() {

    Queue<Integer> frontRow = this.rep.dequeue();
    int stitches = frontRow.length();
    this.size--;
    return stitches;
  }

  @Override
  public final boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public final void addStitch() {
    Queue<Queue<Integer>> temp = new Queue1L<>();

    while (this.rep.length() > 1) {
        temp.enqueue(this.rep.dequeue());
    }
    Queue<Integer> lastRow = this.rep.dequeue();
    lastRow.enqueue(1);

    temp.enqueue(lastRow);
    this.rep.transferFrom(temp);
  }

  @Override
  public final void removeStitch(int k) {
    Queue<Queue<Integer>> temp = new Queue1L<>();

    while (this.rep.length() > 1) {
        temp.enqueue(this.rep.dequeue());
    }

    Queue<Integer> lastRow = this.rep.dequeue();
    for (int i = 0; i < k; i++) {
        lastRow.dequeue();
    }

    temp.enqueue(lastRow);
    this.rep.transferFrom(temp);
}