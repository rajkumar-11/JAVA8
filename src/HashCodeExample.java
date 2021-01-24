import java.util.Objects;

public class HashCodeExample
{
    public static void main(String[] args)
    {
      Student s1= new Student("rajkumar",11);
      Student s2= new Student("pradeep",12);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));




    }

}
class Student
{
    String name;
    int id;

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name,int id) {
        this.name = name;
        this.id=id;
    }
}