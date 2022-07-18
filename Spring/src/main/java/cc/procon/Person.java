package cc.procon;

/**
 * <p></p>
 *
 * @author Procon
 * @version v1.0
 * @since 2022/7/14
 */
public class Person {
    private String age;
    private String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
