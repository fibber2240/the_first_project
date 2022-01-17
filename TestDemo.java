public class TestDemo {
    private String name;
    private int age;

    public TestDemo(String name,int age){
        this.name = name;
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

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "TestDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
