import component.Crochet.Crochet;
import component.Crochet.CrochetOnQueue;

/**
 * Demo of the crochet component
 */

public class CrochetDemo {
    private CrochetDemo();

    public static void main(String[] args) {
        Crochet project1 = new CrochetOnQueue();
        Crochet project2 = new CrochetOnQueue();

        project1.addRow();
        project1.addStitch();
        project1.addStitch();
        project1.addStitch();

        project1.addRow();
        project1.addStitch();
        project1.addStitch();

        project2.addRow();
        project2.addStitch();
        project2.addStitch();

        project2.addRow();
        project2.addStitch();

        System.out.println("Project 1:");
        System.out.println("First row stitches: " + project1.firstRow());
        System.out.println("Last row stitches: " + project1.lastRow());
        System.out.println("Total rows: " + project1.totalRows());
        System.out.println("Current row stitches: " + project1.stitchesInRow());

        System.out.println("\nProject 2:");
        System.out.println("First row stitches: " + project2.firstRow());
        System.out.println("Last row stitches: " + project2.lastRow());
        System.out.println("Total rows: " + project2.totalRows());

        project1.appendPattern(project2);

        System.out.println("\nAfter appending Project 2 to Project 1:");
        System.out.println("Total rows: " + project1.totalRows());
        System.out.println("Last row stitches: " + project1.lastRow());

        System.out.println("\nAre Project 1 and Project 2 equal?");
        System.out.println(project1.equals(project2));

        int removed = project1.removeRow();
        System.out.println("\nRemoved last row with stitches: " + removed);
        System.out.println("New total rows: " + project1.totalRows());
    }
}
