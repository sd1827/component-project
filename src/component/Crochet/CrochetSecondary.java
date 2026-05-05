package component.Crochet;

/**
 * Layered implementations of secondary methods for Crochet.
 */

public abstract class CrochetSecondary implements Crochet {

    @Override
    public final String toString() {
        StringBuilder result = new StringBuilder("(");
        result.append(this.isEmpty());
        result.append(",\"");
        result.append("Crochet");
        result.append(",\"");
        result.append("[");

        Crochet temp = this.newInstance();
        boolean first = true;

        while (!this.isEmpty()) {
            int current = this.removeRow();
            if (!first) {
                result.append(", ");
            }
            result.append(current);
            first = false;

            temp.addRow();
            for (int i = 0; i < current; i++) {
                temp.addStitch();
            }
        }
        this.transferFrom(temp);
        result.append("]");
        result.append(")");
        return result.toString();
    }

    @Override
    public final boolean equals(Crochet p) {
        boolean equal = true;
        Crochet thisTemp = this.newInstance();
        Crochet pTemp = p.newInstance();

        while (!this.isEmpty() && !p.isEmpty()) {
            int s1 = this.removeRow();
            int s2 = p.removeRow();

            if (s1 != s2) {
                equal = false;
            }

            thisTemp.addRow();
            for (int i = 0; i < s1; i++) {
                thisTemp.addStitch();
            }

            pTemp.addRow();
            for (int i = 0; i < s2; i++) {
                pTemp.addStitch();
            }
        }

        if (!this.isEmpty() || !p.isEmpty()) {
            equal = false;
        }

        this.transferFrom(thisTemp);
        p.transferFrom(pTemp);

        return equal;
    }

    @Override
    public final int firstRow() {
        Crochet temp = this.newInstance();
        int first = this.removeRow();
        temp.addRow();

        for (int i = 0; i < first; i++) {
            temp.addStitch();
        }

        while (!this.isEmpty()) {
            int current = this.removeRow();
            temp.addRow();
            for (int i = 0; i < current; i++) {
                temp.addStitch();
            }
        }

        this.transferFrom(temp);
        return first;
    }

    @Override
    public final int lastRow() {
        Crochet temp = this.newInstance();
        int last = 0;

        while (!this.isEmpty()) {
            int current = this.removeRow();
            last = current;

            temp.addRow();
            for (int i = 0; i < current; i++) {
                temp.addStitch();
            }
        }

        this.transferFrom(temp);
        return last;
    }

    @Override
    public final void appendPattern(Crochet p) {
        Crochet temp = p.newInstance();

        while (!p.isEmpty()) {
            int s = p.removeRow();

            this.addRow();
            temp.addRow();

            for (int i = 0; i < s; i++) {
                this.addStitch();
                temp.addStitch();
            }
        }

        p.transferFrom(temp);
    }

    @Override
    public final int totalRows() {
        Crochet temp = this.newInstance();
        int first = 0;
        int counter = 0;

        while (!this.isEmpty()) {
            first = this.removeRow();
            temp.addRow();
            for (int i = 0; i < first; i++) {
                temp.addStitch();
            }
            counter++;
        }

        this.transferFrom(temp);
        return counter;
    }

    @Override
    public final int stitchesInRow() {
        Crochet temp = this.newInstance();
        int last = 0;
        int counter = 0;
        last = this.removeRow();

        temp.addRow();
        for (int i = 0; i < last; i++) {
            temp.addStitch();
            counter++;
        }

        this.transferFrom(temp);
        return counter;
    }
}