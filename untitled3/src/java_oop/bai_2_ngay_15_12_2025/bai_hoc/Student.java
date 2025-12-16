package java_oop.bai_2_ngay_15_12_2025.bai_hoc;

public class Student {
    private String name;
    private int age;
    private String hobby;

//    cac constructer ben duoi dung de tao cac tham so truyen vao cho StudenManager
    public Student() {
        age = 18;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

//    getter va setter de lay va gan gia tri bien private
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
