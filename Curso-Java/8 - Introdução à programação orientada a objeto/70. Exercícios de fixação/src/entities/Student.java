package entities;

public class Student {
    public String name;
    public double note;

    public void addNone(double note) {
        this.note += note;
    }

    public String toString() {
        return note < 60 ? String.format("FAILED %nMISSING %.2f POINTS", 60 - note) : "PASS";
    }
}
