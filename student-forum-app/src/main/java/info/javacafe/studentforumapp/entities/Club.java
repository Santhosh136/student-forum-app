package info.javacafe.studentforumapp.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private String presidentName;
    private String presidentContact;
    private String imageId;

    @ManyToMany
    private List<Student> memberStudents;

    @OneToMany(mappedBy = "club")
    private List<ClubActivity> clubActivities;

    public Club() {}

    public Club(int id, String name, String description, String presidentName, String presidentContact, String imageId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.presidentName = presidentName;
        this.presidentContact = presidentContact;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public String getPresidentContact() {
        return presidentContact;
    }

    public void setPresidentContact(String presidentContact) {
        this.presidentContact = presidentContact;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
}
