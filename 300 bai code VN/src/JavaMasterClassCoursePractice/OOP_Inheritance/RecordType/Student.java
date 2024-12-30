package JavaMasterClassCoursePractice.OOP_Inheritance.RecordType;

public class Student {
    private String id;
    private String name;
    private String birth;
    private String classList;

    public Student(String id, String name, String birth, String classList) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.classList = classList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}
