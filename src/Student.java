public class Student extends Person {
    private int id;
    public Student(){
    super();
    }

    public Student (String name, int id, int age) {
        super(name, age);
        this.id = id;

    }

    @Override
    public String toString() {
        return super.toString() + ", Student{id=" + id + "}";
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
