package info.javacafe.studentforumapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class ClubActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String activity;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Club club;

    public ClubActivity() {}

    public ClubActivity(String activity) {
        this.activity = activity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
}
