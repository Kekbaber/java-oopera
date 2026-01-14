import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Double.compare(height, actor.height) == 0 && super.getGender() == actor.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getGender(), height);
    }

    @Override
    public String toString() {
        return super.toString() + "(" + super.getGender().getGender() + ", " + height + ')';
    }

}
