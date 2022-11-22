package Patika3_4Weeks.StudentManagementSystem;

import static java.lang.System.*;

public class Students {
    String name,stuNo;
    int classes;
    Courses mat;
    Courses fizik;
    Courses kimya;
    double avarage;
    boolean isPass;


    Students(String name, int classes, String stuNo, Courses mat,Courses fizik,Courses kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int mathSözlü,int fizikSözlü,int kimyaSözlü) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (mathSözlü >= 0 && mathSözlü <= 100) {
            this.mat.sozluMath = mathSözlü;
        }
        if (fizikSözlü >= 0 && fizikSözlü <= 100) {
            this.fizik.sozluFizik = fizikSözlü;
        }
        if (kimyaSözlü >= 0 && kimyaSözlü <= 100) {
            this.kimya.sozluKimya =kimyaSözlü;
        }
    }
//
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||
                this.mat.sozluMath == 0 || this.fizik.sozluFizik == 0 || this.kimya.sozluKimya == 0) {
            out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                out.println("Sınıfı Geçti. ");
            } else {
                out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
//math sözlü 0.3,fizik 0.4,kimya 0.2
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3*0.8+(this.mat.sozluMath*0.3+this.fizik.sozluFizik*0.4+this.kimya.sozluKimya*0.2)/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        out.println("=========================");
        out.println("Öğrenci : " + this.name);
        out.println("Matematik Notu : " + this.mat.note);
        out.println("Fizik Notu : " + this.fizik.note);
        out.println("Kimya Notu : " + this.kimya.note);
        out.println("Math Sözlü : " + this.mat.sozluMath);
        out.println("Fizik Sözlü : " + this.fizik.sozluFizik);
        out.println("kimya Sözlü : " + this.kimya.sozluKimya);

    }

}
