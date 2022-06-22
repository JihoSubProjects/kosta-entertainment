package kim.jiho.entertainment.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date debutDate;
    private String img;
    private String description;
    @ManyToOne
    @JoinColumn(name = "agency_id", foreignKey = @ForeignKey(name = "FK_AGENCY_TB_ARTIST"))
    private Agency agency;
    @OneToMany(mappedBy = "artist")
    private List<Member> members;
    @OneToMany(mappedBy = "artist")
    private List<Album> albums;

    public Artist() {}

    public Artist(Long id, String name, Date debutDate, String img, String description, Agency agency, List<Member> members, List<Album> albums) {
        this.id = id;
        this.name = name;
        this.debutDate = debutDate;
        this.img = img;
        this.description = description;
        this.agency = agency;
        this.members = members;
        this.albums = albums;
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

    public Date getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(Date debutDate) {
        this.debutDate = debutDate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

}
