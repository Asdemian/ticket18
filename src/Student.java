import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private int age;



    private Map<String, Integer> map = new LinkedHashMap<>();

    public void add(String name, int age) {
        if (map.containsKey(name)) {
            throw new IllegalArgumentException("Такой студент уже учится");
        }
        map.put(name, age);
    }

    public void prinInfo() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Имя студента: "+entry.getKey()+" возраст: "+entry.getValue()+" годков.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
