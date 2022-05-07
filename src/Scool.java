public class Scool implements Cloneable, Printable<Scool> {
    String name;
    Learner learner;

    public Scool(String name, Learner learner) {
        this.name = name;
        this.learner = learner;
    }

    @Override
    public Scool clone() throws CloneNotSupportedException{
        Scool scool = (Scool) super.clone();
        scool.learner = scool.learner.clone();
        return scool;
    }

    @Override
    public String toString() {
        return "Scool{" +
                "name='" + name + '\'' +
                ", learner=" + learner +
                '}';
    }

    @Override
    public Scool getObject() {
        return this;
    }
}
