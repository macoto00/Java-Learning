package printableinterface;

import java.util.ArrayList;
import java.util.List;

public class Domino implements Printable, Comparable<Domino> {
    private int aSide;
    private int bSide;

    public Domino(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public void printAllFields() {
        // should look like: A side: 3, B side: 2
        System.out.println("A side: " + getaSide() + ", B side: " + getbSide());
    }

    public String toString() {
        return ("[" + getaSide() + ", " + getbSide() + "]");
    }

    @Override
    public int compareTo(Domino o) {
        if (this.getaSide() < o.getaSide()) {
            return -1;
        } else if (this.getaSide() == o.getaSide()) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

}
