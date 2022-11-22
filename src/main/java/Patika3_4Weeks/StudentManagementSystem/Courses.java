package Patika3_4Weeks.StudentManagementSystem;
public class Courses {
    Teachers courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluMath;
    int sozluFizik;
    int sozluKimya;
    public Courses(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluMath = 0;
        this.sozluFizik = 0;
        this.sozluKimya = 0;
    }

    public void addTeacher(Teachers t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}