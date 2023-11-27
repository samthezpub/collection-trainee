import java.util.Objects;

public class User {
    private String name;
    private Integer age;
    private Integer salary;

    public User(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if (this.hashCode() == obj.hashCode())
        {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17 ;
        result += 31 * age;
        result += 31 * salary;
        result += 31 * Objects.hashCode(name);

        return result;
    }
}
