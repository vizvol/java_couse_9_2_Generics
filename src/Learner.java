import java.util.Objects;

public class Learner<T> implements Cloneable, Printable <Learner> {
    String name;
    T learnId;

    public Learner(String name, T learnId) {
        this.name = name;
        this.learnId = learnId;
    }

    @Override
    public String toString(){
        return "Learner[name=" + name + ";" + "learnId=" + learnId + "]";

    }
    @Override
    public boolean equals (Object obj ) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass() ) return false;
        Learner learner = (Learner) obj;
        return this.learnId.equals(learner.learnId);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(name) + Objects.hashCode(learnId) + 11 * 19;
    }

    @Override
    public Learner clone() throws CloneNotSupportedException {
        return (Learner) super.clone();
    }

    @Override
    public Learner getObject() {
        return this;
    }
}
