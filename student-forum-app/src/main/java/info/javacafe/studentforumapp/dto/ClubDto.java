package info.javacafe.studentforumapp.dto;

public class ClubDto {
    private String name;
    private String description;
    private String imageId;

    public ClubDto(String name, String description, String imageId) {
        this.name = name;
        this.description = description;
        this.imageId= imageId;
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
