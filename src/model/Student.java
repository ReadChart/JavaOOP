package model;

public class Student {
    private String name;
    private int age;
    private int gender;
    private String id_no;

    public Student(String name, int age, int gender, String id_no) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id_no = id_no;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getId_no() {
        return id_no;
    }

    public void setId_no(String id_no) {
        this.id_no = id_no;
    }
}
