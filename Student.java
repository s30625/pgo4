import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname, lname, indexNumber, email, address;
    public List<Double> grades = new ArrayList<>();


    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void addGrade(double grade) {
        if (grades.size() < 21) {
            this.grades.add(grade);
        } else {
            System.out.println("Student ma maksymalna ilosc ocen");
        }

    }

    public double obliczSrednia() {
        double average = 0;
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Brakuje ocen");
        } else {
            double suma = 0;
            int size = grades.size();
            for (int i = 0; i < size; i++) {
                suma += grades.get(i);

            }
            average = suma / grades.size();
            return average;
        }

    }

}