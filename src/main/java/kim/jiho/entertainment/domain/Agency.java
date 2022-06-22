package kim.jiho.entertainment.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ceo;
    private String address;
    private String img;
    @OneToMany(mappedBy = "agency")
    private List<Artist> artists;

    public Agency() {}

    public Agency(Long id, String name, String ceo, String address, String img, List<Artist> artists) {
        this.id = id;
        this.name = name;
        this.ceo = ceo;
        this.address = address;
        this.img = img;
        this.artists = artists;
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

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
