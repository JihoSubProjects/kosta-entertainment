package kim.jiho.entertainment.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Short track;
    private String name;
    private Short title;
    private Date playTime;
    @ManyToOne
    @JoinColumn(name = "album_id", foreignKey = @ForeignKey(name = "FK_ALBUM_TB_MUSIC"))
    private Album album;

    public Music() {}

    public Music(Long id, Short track, String name, Short title, Date playTime, Album album) {
        this.id = id;
        this.track = track;
        this.name = name;
        this.title = title;
        this.playTime = playTime;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getTrack() {
        return track;
    }

    public void setTrack(Short track) {
        this.track = track;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getTitle() {
        return title;
    }

    public void setTitle(Short title) {
        this.title = title;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
