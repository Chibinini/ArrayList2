public class Student {
    public String Name;
    public int Age;

    public Student(String name, int age){
        this.Name = name;
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
