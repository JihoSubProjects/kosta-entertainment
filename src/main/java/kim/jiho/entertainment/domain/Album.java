package kim.jiho.entertainment.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date releaseDate;
    @ManyToOne
    @JoinColumn(name = "artist_id", foreignKey = @ForeignKey(name = "FK_ARTIST_TB_ALBUM"))
    private Artist artist;
    @OneToMany(mappedBy = "album")
    private List<Music> musics;

    public Album() {}

    public Album(Long id, String name, Date releaseDate, Artist artist, List<Music> musics) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.artist = artist;
        this.musics = musics;
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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

}
