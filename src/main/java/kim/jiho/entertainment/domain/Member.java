package kim.jiho.entertainment.domain;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String name;
    private Integer age;
    @Column(length = 10)
    private String gender;
    private String position;
    private String img;
    @ManyToOne
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_ARTIST_TB_MEMBER"))
    private Artist artist;

    public Member() {}

    public Member(Long id, String name, Integer age, String gender, String position, String img, Artist artist) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.img = img;
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
