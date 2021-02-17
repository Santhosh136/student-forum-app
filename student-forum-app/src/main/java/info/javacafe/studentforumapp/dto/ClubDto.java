package info.javacafe.studentforumapp.dto;

public class ClubDto {
    private int id;
    private String name;
    private String description;
    private String imageId;

    public ClubDto() {}

    public ClubDto(int id, String name, String description, String imageId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageId= imageId;
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

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
}
