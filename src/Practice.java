
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import com.sun.xml.internal.ws.util.StringUtils;
import sun.security.util.ArrayUtil;

import java.util.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("rajkumar", 147991, 11);
        Employee1 e2 = new Employee1("pradeep", 147992, 2);
        Employee1 e3 = new Employee1("pradeep", 147992, 2);
        Employee1 e4 = new Employee1("sunil", 147990, 3);

        List<Employee1> list1 = new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(e3);
        list1.add(e4);

        //long sum=0;
        Optional<Integer> sum=list1.stream().map(a->a.getAge()).reduce((a, b)->a+b);
        System.out.println(sum);
        String result= list1.stream().map(x->x.getName()).reduce("",(a,b)->a+","+b);
        System.out.println(result);

        List<Integer>list= new ArrayList<>();
        list.add(100);
        list.add(24);
        list.add(13);
        list.add(44);
        list.add(114);
        list.add(200);
        list.add(40);
        list.add(112);

        OptionalDouble avg=list.stream().map(a->a*a).filter(a->a>10000).average();

        System.out.println(avg);
    }

}

class Employee1 {
    String name;
    int id;
    int age;

    public Employee1(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return id == employee1.id && age == employee1.age && Objects.equals(name, employee1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}