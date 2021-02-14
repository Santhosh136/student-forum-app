package info.javacafe.studentforumapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Student {
    @Id
    private String regNo;
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Activity> activities;

    @ManyToMany(mappedBy = "memberStudents")
    private List<Club> memberClubs;

    public Student() {}

    public Student(String regNo, String firstName, String lastName, String email, String department) {
        this.regNo = regNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return "Student [department=" + department + ", email=" + email + ", firstName=" + firstName + ", lastName="
                + lastName + ", regNo=" + regNo + "]";
    }

    // public List<Activity> getActivities() {
    //     return activities;
    // }
}
